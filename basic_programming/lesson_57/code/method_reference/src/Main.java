public class Main {
    /*
    Method References ( ссылки на методы)
    ссылка на метод - это способ сослаться на метод не выполняя его .
    Ссылки на методы связаны с лямбда-выражениями  и им также требуется  совместимый функциональный интерфейс

    1.Ссылки на статические методы ( Method references to static methods)
    ClassName :: methodName
     */
    public static void main(String[] args) {
     boolean res = numTest(OurPredicateClass ::isNegative,-1);
     if(res)
         System.out.println("-1 is negative");

     res = numTest(OurPredicateClass ::isEven,4);
     if(res)
         System.out.println("4 is even");

     res = numTest(OurPredicateClass::isPositive,1);
     if(res)
         System.out.println("1 is positive");

     //  вариант 2 - instance method reference
        System.out.println("----Instance method reference----");
        OurIntegerNumber ourIntegerNumber = new OurIntegerNumber(9);
        OurIntegerNumber ourIntegerNumber1 = new OurIntegerNumber(10);

        IntPredicate intPredicate = ourIntegerNumber :: isFactor;
       res = intPredicate.test(3);
        System.out.println(res);

        intPredicate = ourIntegerNumber1 ::isFactor;
       res =  intPredicate.test(3);
        System.out.println(res);

        //  вариант 3 -  ClassName :: instanceMethodName
        IntPredicate2 intPredicate2 = OurIntegerNumber :: isFactor;
       res = intPredicate2.test(ourIntegerNumber,3);
        System.out.println(res);

        res = intPredicate2.test(ourIntegerNumber1,3);
        System.out.println(res);

        // generic example
        SomeGenericInterface<Integer> someRef = SomeGenericClass ::<Integer>genMethod;




        // constructor example
       OurInterfaceForConstructor forConstructor = OurClassForConstructor::new;
       OurClassForConstructor objectClass = forConstructor.method("Java");
        System.out.println("String in the new object is "+ objectClass.str);


       // intPredicate = OurIntegerNumber :: isFactor;
    }
    public static  boolean numTest(IntPredicate p,int n){
        return p.test(n);
    }

    // 2.ссылки на методы - Method references to instance methods
    /*
    objectRef :: methodName

     3. Создание ссылки на любой обьект класса через ссылку на обычный метод
        ClassName :: instanceMethodName


     4.  ссылки на конструктор ( Constructor references)
     className :: new  -
     для создания ссылки на конструктор можно использовать функциональный интерфейс, метод которого совместим
      с конструктором



     */
}
