import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {

    /*
    1. Используя стримы, написать метод, принимающий лист стрингов в формате "13 Oct 2023"
    и возвращающий  упорядоченный по возрастанию дат лист стрингов в формате  "Fri, 13 Oct 2023"
    */
    public static void main(String[] args) {
        List<String>stringDates = new LinkedList<>();
        Collections.addAll(stringDates,"13 Oct 2023","09 Jul 2018","21 Dec 2010");

        System.out.println(getFormattedStrings(stringDates));
        System.out.println(numberOfWords("aaaaaaaa fffffffffff ab bbbbbb a bbb aaa ttttttttttt","a"));
    }

    public static List<String> getFormattedStrings(List<String>dates){
        return dates
                .stream()
                .map(Practice::createLocalDateFromString)
                .sorted()
                .map(Practice::createStringFromLocalDate)
                .collect(Collectors.toList());
    }

    private static LocalDate createLocalDateFromString(String s){
        return LocalDate.parse(s, DateTimeFormatter.ofPattern("dd MMM yyyy"));
    }

    private static String createStringFromLocalDate( LocalDate d){
        return d.format(DateTimeFormatter.ofPattern("EEE, dd MMM yyyy",new Locale("en")));
    }


/*
    2. Написать метод, принимающий строку и возвращающий  количество слов, начинающихся в этой строке
    с определенной буквы.  Между словами  только пробел. Слова состоят из маленьких букв латинского алфавита
    В решении использовать стримы
    Пример: "aaaaaaaa fffffffffff ab bbbbbb a bbb aaa ttttttttttt", "a" -> 4
    */
    public static long numberOfWords( String input, String w){
        long count = Stream.of(input.split(" "))
                .filter(s -> s.startsWith(w))
                .count();
        return count;
    }



/*
    3. Пусть есть класс BankAccount  с полем  String IBAN   и класс Person c  полями name и List<BankAccount>.
        Нужно написать метод, который вернет список IBANs  с номерами замененными звездочкой после 3 третьего символа
     Решить через стримы !!
     */
}
