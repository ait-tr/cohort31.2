import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    // Lambda - expressions
    /*
    Лямбда выражения используются для реализации метода функционального интерфейса.
    Функциональным является интерфейс, имеющий один абстрактный метод

    ( argument list) -> {body}
    () -> { body}
   ( (par) -> {body})
    (par1,par2) -> {body}
     */
    public static void main(String[] args) {
        int height = 1000;

        //  реализация через анонимный класс
        Flyable f = new Flyable() {
            public void fly() {
                System.out.println("Flying at " + height);
            }
        };

        f.fly();

        //  реализация через лямбда выражение

        Flyable fLambda = () -> {

            System.out.println("We are flying at " + height);
        };

        fLambda.fly();


        Walkable w = () -> {
            return "I can walk";
        };

        System.out.println(w.walk());


        Eatable eatable = (food) -> {

            return "A man can eat " + food;
        };

        System.out.println(eatable.eat("apple"));




        Summable s = (x, y) -> {
            return x + y;
        };

        System.out.println(s.sum(1,2));

        //  короткая форма записи - lambda-expression

        Summable s1 = (x,y) -> x + y;
        System.out.println(s1.sum(2,3));

        Eatable eShort = food -> "A man can eat "+food;

        Summable sMinus = (x,y)-> x -y;
        System.out.println("for sMinus the result is " + sMinus.sum(2,3));

        List<String> fruits = new ArrayList<>();
        fruits.add("lemon");
        fruits.add("orange");
        fruits.add("apple");
        fruits.add("kiwi");

        fruits.forEach(
                fruit -> System.out.println(fruit)
        );

        List<Product> items = new ArrayList<>();
        items.add(new Product("mouse",25));
        items.add(new Product("laptop",1000));
        items.add(new Product("keyboard",75));

        Collections.sort(items,(p1,p2)->p1.name.compareTo(p2.name));
        System.out.println(items);

        Collections.sort(items,(p1,p2) ->p1.price -p2.price);
        System.out.println(items);


        Operationable<Integer> op1 = (a,b)->a+b;
        System.out.println(op1.calc(1,2));

        Operationable<String>op2 = (a,b) -> a +b;
        System.out.println(op2.calc("1","2"));

        //  Лямбда  в качестве параметра метода

        /*
        Лямбда выражение можно передавать в качестве параметра в метод
         */

        int[] numbers = {1,2,3,4,5,6,7};

        IsMoreThan isMoreThan = num -> num > 3;
        System.out.println(isMoreThan.isMore(2));
        System.out.println(isMoreThan.isMore(5));


     //    isMoreThan = num -> num > 10;

     //   System.out.println(isMoreThan.isMore(9));
     //   System.out.println(isMoreThan.isMore(50));

        System.out.println(sumIfCondition(numbers,isMoreThan));

        isMoreThan = num -> num > 6;
        System.out.println(sumIfCondition(numbers,isMoreThan));
    }

    public static int sumIfCondition( int[] ints, IsMoreThan expression){
        int sum = 0;

        for(int elt : ints){
            if(expression.isMore(elt)) {
                sum += elt;
            }
        }

        return sum;
    }



}
