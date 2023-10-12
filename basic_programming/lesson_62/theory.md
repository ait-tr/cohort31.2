***Working with Dates and Times***

The `LocalDate` class from the `java.time` package is designed for working with dates. The functionality of this class allows you to create dates and modify them by adding or subtracting the necessary number of days, months, or years.

Key methods of `LocalDate`:

- `static LocalDate now()`: returns an object representing the current date.
- `static LocalDate of(int year, int month, int day)`: returns an object representing a date with a specified year, month, and day.
- `int getYear()`: returns the year of the date.
- `int getMonthValue()`: returns the month.
- `int getDayOfMonth()`: returns the day of the month (value ranging from 1 to 31).
- `int getDayOfYear()`: returns the day of the year (value ranging from 1 to 365).
- `DayOfWeek getDayOfWeek()`: returns the day of the week as a `DayOfWeek` enumeration value.
- `LocalDate plusDays(int n)`: adds a certain number of days to the date.
- `LocalDate plusWeeks(int n)`: adds a certain number of weeks to the date.
- `LocalDate plusMonths(int n)`: adds a certain number of months to the date.
- `LocalDate plusYears(int n)`: adds a certain number of years to the date.
- `LocalDate minusDays(int n)`: subtracts a certain number of days from the date.
- `LocalDate minusMonths(int n)`: subtracts a certain number of months from the date.
- `LocalDate minusWeeks(int n)`: subtracts a certain number of weeks from the date.
- `LocalDate minusYears(int n)`: subtracts a certain number of years from the date.




***Работа с датами и временем***

Класс LocalDate из пакета java.time предназначен для работы с датами. Функционал этого класса позволяет создавать даты и изменять их, добавляя и отнимая необходимое количество дней/месяцев/лет.

Основные методы LocalDate:

static LocalDate now(): возвращает объект, который представляет текущую дату

static LocalDate of(int year, int month, int day): возвращает объект, который представляет дату с определенными годом, месяцем и днем

int getYear(): возвращает год даты

int getMonthValue(): возвращает месяц

int getDayOfMonth(): возвращает день месяца (значение от 1 до 31)

int getDayOfYear(): возвращает номер дня года (значение от 1 до 365)

DayOfWeek getDayOfWeek(): возвращает день недели в виде значения перечисления DayOfWeek

LocalDate plusDays(int n): добавляет к дате некоторое количество дней

LocalDate plusWeeks(int n): добавляет к дате некоторое количество недель

LocalDate plusMonths(int n): добавляет к дате некоторое количество месяцев

LocalDate plusYears(int n): добавляет к дате некоторое количество лет

LocalDate minusDays(int n): отнимает от даты некоторое количество дней

LocalDate minusMonths(int n): отнимает от даты некоторое количество месяцев

LocalDate minusWeeks(int n): отнимает от даты некоторое количество недель

LocalDate minusYears(int n): отнимает от даты некоторое количество лет


