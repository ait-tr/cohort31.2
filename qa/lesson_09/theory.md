## Combinatorics(Комбинирование данных)

Основные методы комбинирования:

**Полный перебор значений**

• Тестирование всех возможных комбинаций всех значений всех параметров

• Максимальное покрытие

• Максимум тестов

**Метод минимальных проверок**

• По одному значению каждого параметра использовано хотя бы в одном тест-кейсе

• Минимальное покрытие

• Минимум тестов

**Атомарная проверка**

• Тест-кейсы строятся на основе выбора всех базовых значений, кроме одного, которое изменяется

• Легко локализуемое покрытие

**Pairwise**

• Вместо проверки всех комбинаций - выбираем уникальные пары всех параметров

• Согласно исследованиям компании IBM 97% ошибок в ПО возникает при взаимодействии всего двух значений

Pairwise online https://pairwise.teremokgames.com/

Allpairs download https://www.satisfice.com/download/allpairs

**Алгоритм применения техники**

- Определить переменные
- Определить их значения
- Оптимизировать значения
- Описать условия и зависимости
- Построить тестовую таблицу

[Презентация](https://docs.google.com/presentation/d/1GhpqeK3QIi6w3Bvju3ToKG8E1LTRzS9M/edit?usp=share_link&ouid=116447005932578256378&rtpof=true&sd=true)

[Examples](https://docs.google.com/spreadsheets/d/1z_ZctJn34yPow8iSk7nLXSAgbm7pBpff/edit?usp=sharing&ouid=116447005932578256378&rtpof=true&sd=true)

[TestNG](https://docs.google.com/presentation/d/1MaYUXf4wIXKPgdOq1cG9s8yl4pYZvg4B/edit?usp=sharing&ouid=116447005932578256378&rtpof=true&sd=true)

[TestNG documentation](https://testng.org/#_testng_documentation)

_gradle clean qa -Psuite1_

_gradle clean qa -Psuite2_

_gradle -Pbrowser=firefox clean qa -Psuite1_

_gradle -Pbrowser=firefox clean qa -Psuite2_

## Jenkins

ведущий инструмент непрерывной интеграции с открытым исходным кодом, разработанный Hudson lab

Он кроссплатформенный и может использоваться в средах Windows, Linux, Mac OS и Solaris. Дженкинс написан на Java

Непрерывная интеграция (CI, англ. Continuous Integration) — практика разработки программного обеспечения, которая заключается в постоянном слиянии рабочих копий в общую основную ветвь разработки (до нескольких раз в день) и выполнении частых автоматизированных сборок проекта для скорейшего выявления потенциальных дефектов и решения интеграционных проблем

Поддерживает инструменты системы управления версиями, включая AccuRev, CVS, Subversion, Git, Mercurial, Perforce, Clearcase и RTC. Может собирать проекты с использованием Apache Ant и Apache Maven

Сборка может быть запущена разными способами, например, по событию фиксации изменений в системе управления версиями, по расписанию, по запросу на определённый URL, после завершения другой сборки в очереди


[Настройка Jenkins](https://docs.google.com/presentation/d/1VC2QYUCiHkzPsQtLmJ_k-zn8T13MrgXY/edit?usp=sharing&ouid=116447005932578256378&rtpof=true&sd=true)

[jenkins.exe download](https://www.jenkins.io/download/)




