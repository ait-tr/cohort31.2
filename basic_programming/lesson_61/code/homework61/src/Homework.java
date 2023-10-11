import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

public class Homework {


      public static void main(String[] args) {
          Address address1 = new Address("Street1",1);
          Address address2 = new Address("Street2",2);
          Address address3 = new Address("Street3",3);
          Address address4 = new Address("Street4",4);

          Person person1 = new Person("Person1",16,address1);
          Person person01 = new Person("Person01",16,address1);
          Person person2 = new Person("Person2",35,address2);
          Person person3 = new Person("Person3",46,address3);
          Person person03 = new Person("Person03",46,address3);
          Person person4 = new Person("Person4",6,address4);
          Person person04 = new Person("Person04",6,address4);

          List<Person> list = Arrays.asList(person1,person2,person3,person4,person01,person03,person04);

       //   System.out.println(getAddresses(list));

          List<String> names = List.of("John","John","Bill","Bill","Mary");
      //    System.out.println(withoutDuplicates(names));
      //    System.out.println(withoutDuplicates2(names));

          System.out.println(groupByAge(list));
          groupByAge(list).forEach((k,v) -> System.out.println(k + "->"+v.stream()
                  .map(Person::getName).collect(Collectors.toList())));

      }
    /*
            1.Есть класс Address с полями String street и int houseNumber и класс Person
            с полями String name, int age , Address address. Написать метод,принимающий лист Persons и
            возвращающий лист адресов тех из них, кто старше 17 лет
             */
    public static List<Address> getAddresses(List<Person> input){
       return   input.stream()
                .filter(person -> person.getAge() > 17)
                .map(Person::getAddress)
                .collect(Collectors.toList());
    }

    /*
    2.Написать метод, принимающий лист имен и возвращающий лист этих имен без повторений
     */
    public static List<String> withoutDuplicates( List<String> names){
        return names.stream()
                    .distinct()
                    .collect(Collectors.toList());
    }

    public static List<String> withoutDuplicates2(List<String>names){
        return names.stream()
                    .collect(Collectors.collectingAndThen(toSet(), ArrayList::new));

    }

    //Написать метод, принимающий список Person ( Person - класс из задачи 1)
    // и возвращающий мапу, где возраст является ключом, а лист людей этого возраста значением

    public static Map<Integer,List<Person>> groupByAge(List<Person>personList){
        return personList.stream()
                         .collect(Collectors.groupingBy(Person::getAge));
    }


}
