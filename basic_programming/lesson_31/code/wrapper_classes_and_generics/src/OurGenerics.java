public class OurGenerics {

    /*
    Обобщения, Дженерики Generics

    Дженерики позволяют не указывать конкретный тип, который будет использоваться.
    Поэтому мы можем указать что класс является обобщенным с помощью т.н. универсального параметра в угловых скрбках
    после имени класса. Вместо этого параметра впоследствии можно подставить любой тип

     */
    public static void main(String[] args) {
        Person<Integer> john = new Person<>("John",35);
        System.out.println(john.getName());
        System.out.println(john.getAge());


        Person<String> bill = new Person<>("Bill","forty years");
        System.out.println(bill.getName());
        System.out.println(bill.getAge());


     //   Person<Integer> peter = new Person<>("Peter","twenty years");

        // обобщенные методы

        Printer printer = new Printer();

        Integer[] ints = {1,2,3,4,5};
        String[] strings = {"a","b","c"};

        printer.<Integer>printArray(ints);
        System.out.println();
        printer.<String>printArray(strings);

        // обобщенные интерфейсы

        // несколько универсальных параметров
        Person2<Integer,String> ann = new Person2<>("Ann",23);
        System.out.println(ann.getName());
        System.out.println(ann.getAge());

        // обобщенные конструкторы
        // - в этом случае перед конструктором также указывают в угловых скобках универсальные параметры
    }
}
