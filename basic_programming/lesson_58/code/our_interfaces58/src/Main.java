import java.util.function.*;

public class Main {

    /*
    Используя наши интерфейсы написать такие лямбда- выражения:
    1. Конкатинировть числа  a  и  b
           пример  1 и 2 -> 12

     2. Если длина строки  = 3  вернуть true  иначе false
     3. Если длина строки четная  вернуть true  иначе false
     4. Вернуть строку в верхнем регистре
     5. Если длина строки = 4 вернуть четыре звездочки **** иначе вернуть строку без изменений
     6. Распечатать строку в виде !строка!
     7. возвращает  "Hello World"

     */
    public static void main(String[] args) {
        /*
         1. Конкатинировть числа  a  и  b
           пример  1 и 2 -> 12
           Integer.toString(a + b)
         */

        Concatable concatable = (a,b) ->Integer.toString(a) + b;
        String result = concatable.concat(1,2);
        System.out.println(result);

        BiFunction<Integer,Integer,String> biFunction = (a,b) ->Integer.toString(a) + b;
        System.out.println(biFunction.apply(3,4));

        /*
        2. Если длина строки  = 3  вернуть true  иначе false

         */
        Checkable checkable = str -> str.length() == 3;
        System.out.println(checkable.check("abc"));// true
        System.out.println(checkable.check("abcd"));// false

        Predicate<String> predicate =str -> str.length() == 3;
        System.out.println("predicate");
        System.out.println(predicate.test("abc"));
        System.out.println(predicate.test("abcd"));

        /*
         3. Если длина строки четная  вернуть true  иначе false

         */
        checkable = s ->s.length() % 2 == 0;
        System.out.println(checkable.check("abc"));// false
        System.out.println(checkable.check("abcd"));// true

        Predicate<String> predicate1 = s ->s.length() % 2 == 0;
        System.out.println("predicate even");
        System.out.println(predicate1.test("abc"));
        System.out.println(predicate1.test("abcd"));

        // 4. Вернуть строку в верхнем регистре
        Transformable transformable = String::toUpperCase;
        System.out.println(transformable.modify("abcdE"));
        Function<String,String> function =  String::toUpperCase;
        System.out.println("function");
        System.out.println(function.apply("abcdE"));

        //5. Если длина строки = 4 вернуть четыре звездочки **** иначе вернуть строку без изменений
        transformable = str -> str.length() == 4 ? "****":str;
        System.out.println(transformable.modify("ab"));
        System.out.println(transformable.modify("abcd"));

        function = str -> str.length() == 4 ? "****":str;
        System.out.println("function 2");
        System.out.println(function.apply("ab"));
        System.out.println(function.apply("abcd"));

        // 6. Распечатать строку в виде !строка!
        Printable printable = str -> System.out.println("!" + str + "!");
       // Transformable transformable1 = str -> "!" + str + "!";
        printable.print("abc");

        Consumer<String> consumer = str -> System.out.println("!" + str + "!");
        System.out.println("consumer");
        consumer.accept("abc");

        //возвращает  "Hello World"
        Producable producable = () -> "Hello World";
        String res = producable.produce();
       // System.out.println(producable.produce());
        System.out.println(res);

        Supplier<String> supplier = () -> "Hello World";
        System.out.println(supplier.get());

    }
}
