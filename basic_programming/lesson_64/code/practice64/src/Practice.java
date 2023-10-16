import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
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

      //  System.out.println(getFormattedStrings(stringDates));
      //  System.out.println(numberOfWords("aaaaaaaa fffffffffff ab bbbbbb a bbb aaa ttttttttttt","a"));

        BankAccount account1 = new BankAccount("DE12345678905656565");
        BankAccount account2 = new BankAccount("DE22345678905656565");
        BankAccount account3 = new BankAccount("DE42345678905656565");
        BankAccount account4 = new BankAccount("DE62345678905656565");
        BankAccount account5 = new BankAccount("DE92345678905656565");

        List<BankAccount> ba1 = Arrays.asList(account1,account2);
        List<BankAccount> ba2 = Arrays.asList(account3,account4);
        List<BankAccount> ba3 = Arrays.asList(account5);

        Person personA = new Person("A",ba1);
        Person personB = new Person("B",ba2);
        Person personC = new Person("C",ba3);

        List<Person>persons = Arrays.asList(personA,personB,personC);

        System.out.println("IBANs with stars");
        System.out.println(getIBANsWithStars(persons));

        Person1 person1 = new Person1("John",16);
        Person1 person2 = new Person1("Ann",35);
        Person1 person3 = new Person1("Peter",46);
        Person1 person4 = new Person1("Jack",6);
        Person1 person5 = new Person1("Mary",26);

        List<Person1> person1List = Arrays.asList(person1,person2,person3,person4,person5);
        System.out.println("Total age of those older than is " + ageAllOlder17(person1List));
        System.out.println("Total age of those older than is " + ageAllOlder17Int(person1List));

        System.out.println(stringOfAllOlder17(person1List));

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
    public static List<String> getIBANsWithStars(List<Person>persons){
        return persons
                .stream()
                .flatMap(ba -> ba.getBankAccounts().stream())
                .map(BankAccount::getIBAN)
                .map(Practice::replaceWithStars)
                .collect(Collectors.toList());
    }

    public static String replaceWithStars(String str){
        char[]chars = str.toCharArray();

        for(int i = 3; i< str.length();i++){
            chars[i] = '*';
        }

        return new String(chars);
    }

    /*
    Пусть есть класс Person с полями String name и int age.

Написать метод, принимающий лист Persons и возвращающий суммарный возраст тех, кто старше 17 лет
Написать метод, принимающий лист Persons и возвращающий имена тех, кто старше 17 лет в виде строки.
Должна быть возвращена строка примерно такого вида: In
this list John and Peter and Ann are older than 17 (В этом списке Джон и Питер и Анн старше 17 лет)
     */

    public static int ageAllOlder17(List<Person1>input){

        return input
                .stream()
                .filter(p -> p.getAge() > 17)
                .map(Person1::getAge)
                .reduce(0,Integer::sum);
    }

    public static int ageAllOlder17Int(List<Person1>input){

        return input
                .stream()
                .filter(p -> p.getAge() > 17)
                .mapToInt(Person1::getAge)
                .sum();
    }


    public static String stringOfAllOlder17(List<Person1>input){
        return input
                .stream()
                .filter(p -> p.getAge() > 17)
                .map(Person1::getName)
                .collect(Collectors.joining(" and ","In this list "," are older than 17"));


    }
}
