import java.util.function.*;

public class Main {

    //  Встроенные функциональные интерфейсы
    // 1. Predicate ( предиката) - проверяет соблюдение некоторого условия. Возвращает true либо false  соответственно

    /* методом предикаты является метод
     public interface Predicate<T>{
            boolean test( T t)
    }

     */
    public static void main(String[] args) {
        Predicate<Integer> isPositive = num -> num > 0;
        System.out.println(isPositive.test(10));
        System.out.println(isPositive.test(-10));

        // UnaryOperator<T> -  принимает обьект типа Т , что-то с ним делает  и возвращает обьект типа типа Т
        /*
        public interface UnaryOperator<T>{
               T apply( T obj)
        }
         */
        UnaryOperator<Integer> unaryOperator = num -> num/2;
        System.out.println(unaryOperator.apply(4));

        // Function<T,R> -  преобразует обьект типа T  в обьект типа R
        /*
        Function<T,R>{
            R apply( T obj)
        }
         */
        Function<Integer,String> function = String::valueOf;
        System.out.println(function.apply(10));

        Function<Integer,String> function1 = num -> num +" times";
        System.out.println(function1.apply(10));

        // BinaryOperator<T> -  принимает два параметра типа T  , выполняет с ними операции и возвращает результат
        // типа T
        /*
         T apply ( T obj1, T obj2)
         */

        BinaryOperator<Integer>sum = Integer::sum;
        System.out.println(sum.apply(1,2));

        /*
        Consumer<T> -  что-то делает с обьектом типа T , ничего не возвращает
         его метод accept( T t)
         */
        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello");

        // Supplier<T> -  не принимает ничего, возвращает обьект типа T
        //   его метод T get()
        // Todo:  пример придумать самостоятельно

        /*
        BiFunction<T,U,R> -  принимает параметры  типа T, U  , возвращает обьект типа R
          метод apply
         */
       // BiFunction<Integer,Integer,String> biFunction = Integer::sum;
        // Todo:  пример придумать самостоятельно

        //  дефолтные методы предикаты
        // and
        Predicate<Integer> age18 = num -> num > 18;
        Predicate<Integer> age80 = num -> num < 80;
        System.out.println("Predicate and");
        System.out.println(age18.and(age80).test(12));
        System.out.println(age18.and(age80).test(40));
        System.out.println(age18.and(age80).test(90));

        // or
        Predicate<String> containsJava = str -> str.contains("java");
        Predicate<String> containsHello = str -> str.contains("hello");
        System.out.println("Test or");
        System.out.println(containsJava.or(containsHello).test("hello java"));
        System.out.println(containsJava.or(containsHello).test("java"));
        System.out.println(containsJava.or(containsHello).test("hello world "));
        System.out.println(containsJava.or(containsHello).test("world"));

        // negate
        Predicate<Integer> age1 = num -> num > 18;
        System.out.println(age1.negate().test(19));
    }
}
