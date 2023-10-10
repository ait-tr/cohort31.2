import java.util.Arrays;
import java.util.List;

public class Homework {

      /*
        Есть класс Address с полями String street и int houseNumber и класс Person
с полями String name, int age , Address address.
Написать метод,принимающий лист Persons и печатающий адреса тех из них, кто старше 17 лет
         */
      public static void main(String[] args) {
          Address address1 = new Address("Street1",1);
          Address address2 = new Address("Street2",2);
          Address address3 = new Address("Street3",3);
          Address address4 = new Address("Street4",4);

          Person person1 = new Person("Person1",16,address1);
          Person person2 = new Person("Person2",35,address2);
          Person person3 = new Person("Person3",46,address3);
          Person person4 = new Person("Person4",6,address4);

          List<Person> list = Arrays.asList(person1,person2,person3,person4);

          printAddresses(list);

      }

    public static void printAddresses(List<Person> input){
        input.stream()
                .filter(person -> person.getAge() > 17)
                .map(Person::getAddress)
                .forEach(System.out::println);
    }


}
