## Ссылки

- [git stash](https://www.atlassian.com/git/tutorials/saving-changes/git-stash)
- [git rebase](https://www.atlassian.com/git/tutorials/rewriting-history/git-rebase)
- [git commit amend](https://docs.github.com/en/pull-requests/committing-changes-to-your-project/creating-and-editing-commits/changing-a-commit-message)
- [git log](https://www.atlassian.com/git/tutorials/git-log)
- [.gitignore](https://www.atlassian.com/git/tutorials/saving-changes/gitignore)

## Базовые термины

- **рефакторинг** - перевыпуск (переработка) кода
- **алгоритм** - идея (способ) решения задачи (проблемы)
- **программа** - реализация алгоритма

## Сохранение незакомиченных изменений

```bash
# создать заначку
git stash 

# применить заначку
git stash pop
```

**Задача. Предложите названия веток для след/задач (в рамках произвольного приложения)**

```markdown
1. реализовать систему платежей
- `feature/payments`

2. реализовать авторизацию пользователя
- `feature/login`

3. исправить баг (задача #22)
- `bugfix/issue22`

4. сделать правки в файле `README.md`
- `docs/update-readme-file`

5. исправить баги в системе платежей
- `bugfix/payments`

6. сделать рефакторинг в модуле "интернет-магазин"
- `refactor/webshop`

7. оптимизировать производительность поиска в модуле "заказы"
- `perf/orders`

8. дописать сss-стили для страницы "пользователи"
- `styles/users`
```

## Семантические коммиты (комментарии к комитам)

- один из вариантов подхода к написанию сообщения коммита
- `<type>(<scope>): <subject>`

**type / характер правки**

- `feat` новый функционал
- `fix` исправления багов
- `refactor` рефакторинг
- `style`
- `docs`
- `build`
- `test`
- `perf`
- `chore`

**Примеры**

```bash
feat(login): добавить ...
fix: исправил ...

git commit -m 'fix(payments): исправил оплату через Apple Pay'
```

## Перезапись последнего коммита

применять только для НЕПУБЛИЧНЫХ ВЕТОК (КОММИТОВ)

```bash
# новый комментарий
git commit --amend -m 'update'

# не редактировать комментарий
git commit --amend --no-edit
```

## Просмотр содержимого коммита

```bash
git show # последнего
git show commit_id # указанного
```

## Просмотр журнала коммитов

```bash
git log --name-status
```