## Ссылки

- [сетевые порты](https://vc.ru/u/1193668-fenixhost/473172-setevye-porty-chto-eto-takoe)
- [git checkout](https://www.atlassian.com/git/tutorials/using-branches/git-checkout)

## Базовые компоненты любого проекта

- `DB` хранилище
- `FE` интерфейс
- `BE` бизнес-логика
- `Deployment` развертывание (напр., с помощью **Docker**)

## Что такое Docker

- прикладное ПО  (приложение) - появилось в 2013
- представляет собой платформу для контейнеризации приложений

## Установка Docker

[Get Docker](https://docs.docker.com/get-docker/)

## Регистрация на Docker Hub

[Docker Hub Container Image Library | App Containerization](https://hub.docker.com/)

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/95d3eea4-bdd9-4866-805a-55b03d066b78/80cf1e94-f9fb-44dc-b651-7b41cffa3398/Untitled.png)

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/95d3eea4-bdd9-4866-805a-55b03d066b78/d0eb580d-0716-4aaa-a48e-69f89da2185c/Untitled.png)

## Основные термины

- **Docker Hub** - самый распространенный реестр образов
    - позволяет делиться собственными образами и хранит базовые (стандартные) образы
- **Docker CLI** - командный интерфейс работы с Docker
- **Docker Desktop** - GUI-интерфейс работы с Docker
- **Образ (image)** - выполняемый пакет, который включает все необходимое для запуска приложения, включая код приложения, среду выполнения и зависимости
- **Контейнер (container)** - экземпляр образа (процесс), который выполняется в изолированной среде
    - обеспечивает уровень изоляции от других приложений и основной системы
- **`Dockerfile`** - текстовый файл, содержащий инструкции для построения **Docker-образа**

## Основные команды

- `docker version` просмотр версии
- `docker login` авторизация на **Docker Hub** (и проверка)
- `docker run hello-world` запуск тестовый контейнер на основе стандартного образа
    - `docker run test-app` запуск на основе образа `test-app`
    - `CTRL + C` оставить
- `docker run -it ubuntu bash` запуск оболочки `bash` в режиме песочницы
    - `exit` - для выхода
- `docker run -p host_port:container_port image_name`
- `docker run -p 5000:5000 test-app` с пробросом портов
    - `docker run -p 5000:5000 test-app:2.0` с пробросом портов
- `docker build -t test-app .` создать (создать) образ на основе **Dockerfile** из текущего каталога
    - `docker build -t test-app:1.1 .`
- `docker images --filter=reference=test-app` просмотр списка образов по конкретному приложению
- `docker tag image_name docker_hub_username/repo_name` привязка к **DockerHub**
    - `docker tag image_name:2.0 docker_hub_username/repo_name:2.0`
    - `docker push docker_hub_username/repo_name` выгрузка на **DockerHub**
    - `docker push docker_hub_username/repo_name:2.0`

## Выгрузка на `DockerHub` конкретной версии приложения

```bash
docker tag test-app:1.2 andreibakhtinov/test-app:1.2
docker push andreibakhtinov/test-app:1.2
```

## Базовый порядок работы с Docker

1. Открыть имеющийся проект (или создать новый)
2. Создать `Dockerfile`
3. Создать образ (на основе `Dockerfile`)

## Тестовый проект #1 (на Python)

```sql
## файл app.py

from flask import Flask

app = Flask(__name__)

@app.route('/')
def hello():
    return 'Hello, ANDREI!'

if __name__ == '__main__':
    app.run(debug=True, host='0.0.0.0')
```

```sql
## Dockerfile

# Указываем базовый образ
FROM python:3.8-slim

# Устанавливаем зависимости
RUN pip install --no-cache-dir flask

# Копируем файлы в рабочую директорию контейнера
COPY . /app
WORKDIR /app

# Указываем команду, которая будет выполняться при запуске контейнера
CMD ["python", "app.py"]
```

## Тестовый проект #2 (на Java)

```bash
https://github.com/spring-projects/spring-petclinic.git
```

```docker
## Dockerfile

FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:resolve

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]
```

**Запуск проекта #2**

`docker run -p 8080:8080 pclinic` запуск проекта (название `pclinic` необх. изменить на свое)

```docker
http://127.0.0.1:8080/
```