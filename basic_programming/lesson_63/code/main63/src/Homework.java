import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Homework {
    /*
    Получить и вывести на экран:
-текущую дату
-текущий год, месяц и день

Создать дату , например день рождения и вывести на экран

Создать две даты и проверить на равенство

Получить и вывести на экран текущее время

текущее время + 3 часа

Создать дату на неделю позже сегодняшней

Создать дату, которая была на год раньше сегодняшней используя метод minus

Создать дату на год позже сегодняшней используя plus метод

Создать даты tomorrow и yesterday и проверить находятся ли они до или после сегодняшней

Написать метод, принимающий лист из нескольких дат типа LocalDate и возвращающий количество дней между самой ранней и поздней датами
     */

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();

        LocalDate date = LocalDate.of(1977,11,7);

        today.equals(date);

        LocalTime time = LocalTime.now();
        time.plusHours(3);
        today.plusWeeks(1);
        today.plus(1, ChronoUnit.WEEKS);

        today.minusYears(1);
        today.minus(1,ChronoUnit.YEARS);

        LocalDate yesterday = today.minus(1,ChronoUnit.DAYS);
        System.out.println(yesterday.isBefore(today));

        LocalDate tomorrow = today.plus(1,ChronoUnit.DAYS);
        tomorrow.isAfter(today);

        List<LocalDate> dates = new LinkedList<>();
        Collections.addAll(dates,
                LocalDate.now(),
                         LocalDate.now().plusDays(20),
                         LocalDate.now().plusDays(10),
                         LocalDate.now().plusDays(6));

        System.out.println(countDaysInBetween(dates));

    }

    //Написать метод, принимающий лист из нескольких дат типа LocalDate и
    // возвращающий количество дней между самой ранней и поздней датами

    public static long countDaysInBetween(List<LocalDate>dates){
       List<LocalDate> sortedList = dates.stream().sorted().collect(Collectors.toList());

       return ChronoUnit.DAYS.between(sortedList.get(0),
                                        sortedList.get(sortedList.size()-1));
    }


}
