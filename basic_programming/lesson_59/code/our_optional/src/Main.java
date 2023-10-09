import java.util.Optional;

public class Main {
    /*
    Класс Optional -  предоставляет дополнительные возможности обработки  null

    Создание обьекта  класса
         */
    public static void main(String[] args) {
        //  пустой "контейнер"

        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent());

        //  создание не пустого обьекта
        String name = "John";
        Optional<String> optName = Optional.of(name);
        System.out.println(optName.isPresent());

        String nullString = null;
     //   Optional<String> optNull = Optional.of(nullString); // exception
     //   System.out.println(optNull.isPresent());

        Optional<String> optNull2 = Optional.ofNullable(nullString); // false
        System.out.println(optNull2.isPresent());

     //  метод isPresent()  используется для проверки наличия внутри обьекта Optional  значения.
     // если есть - то возвращается true  и false  если null

     //    метод ifPresent()

        if( name != null){
            System.out.println(name.length());
        }

        Optional<String> optional = Optional.of("java");
        optional.ifPresent(str -> System.out.println(str.length()));

        //  методы получения значения из Optional
        // orElse()

        String nullName  = null;
        nullName = "John";
       String kate = Optional.ofNullable(nullName).orElse("Kate");
        System.out.println(kate);

        // orElseGet()
        nullName = null;
        String anotherName = Optional.ofNullable(nullName).orElseGet(()->"Kate");
        System.out.println(anotherName);

        // orElseThrow -  кидает exception  если null
      //  String nameEx  = Optional.ofNullable(nullName).orElseThrow(IllegalArgumentException :: new);
       // String nameEx  = Optional.ofNullable(nullName).orElseThrow();

        // get()
        Optional<String> newWord = Optional.of("Hello");
        String hello = newWord.get();
        System.out.println(hello);

        Optional<String> newWordNull = Optional.ofNullable(null);
       // newWordNull.get();



    }
}
