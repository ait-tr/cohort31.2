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

        /*
        2. Если длина строки  = 3  вернуть true  иначе false

         */
        Checkable checkable = str -> str.length() == 3;
        System.out.println(checkable.check("abc"));// true
        System.out.println(checkable.check("abcd"));// false
    }
}
