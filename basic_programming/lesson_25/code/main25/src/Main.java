import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      String str =  "Hello";
      String str3 = "Hello";
      String str4 = "Hell";
      String str1 = new String("Hello");
      String str2 = new String("Hello");
        System.out.println(str1 == str2);
        System.out.println(str == str3);
        System.out.println(str == str4);
        System.out.println(str == str1);


        // создается пустая строка
        String str5 = new String();

        // массив символов
        char[] array = {'h','e','l','l','o'};

        // строка из массива символов
        String strArr = new String(array);
        System.out.println(strArr);

        String  strStr = new String("Hello");
        System.out.println(strStr);

        // методы строк
        // charAt(int index)-  возвращает символ  на позиции index в строке

        String string = "Hello Java";
        System.out.println(string.charAt(0));
        System.out.println(string.charAt(1));
        System.out.println(string.charAt(2));
        System.out.println(string.charAt(3));
        System.out.println(string.charAt(4));
        System.out.println(string.charAt(5));
        System.out.println(string.charAt(6));
        System.out.println(string.charAt(7));
        System.out.println(string.charAt(8));
        System.out.println(string.charAt(9));

        String strHello = "Hello";
        System.out.println(strHello.charAt(0));
        System.out.println(strHello.charAt(4));

        System.out.println(strStr.length());
        System.out.println(strStr.charAt(str.length()-1));
     //   System.out.println(strStr.charAt(8));


        //boolean equals (String str) -  сравнивает значения строк а не ссылки
        String string1 = new String("Hello");
        String string2 = new String("Hello");
        System.out.println(string1 == string2);// false
        System.out.println(string1.equals(string2));//true
      System.out.println(string1.equals("Hello"));

      String hello = new String("hello");
      System.out.println(string1.equals(hello));

      // equalsIgnoreCase -  сравнивает строки без учета регистра
      System.out.println(string1.equalsIgnoreCase(hello));

      // сравнивать строки нужно всегда с помощью метода equals() или equalsIgnoreCase() !


      // int compareTo( String string) -  метод сравнивает две строки в соостветствии со значением каждого символа
      // в таблице Unicode
      // т.е. строки сравниваются в алфавитном порядке. Если они равны метод возвращает ноль. Если одна строка больше
      // то положительное значение, если меньше то отрицательное.

      System.out.println("hello".compareTo("hello"));
      System.out.println("ahello".compareTo("chello"));
      System.out.println("chello".compareTo("ahello"));


      //  так можно тоже определить длину строки
      String empty ="";

      System.out.println("hello".compareTo(empty));

      // compareToIgnoreCase() - работает также как и compare  но игнорирует регистр

      String str10 = "begin";
      String str11 = "Begin";
      System.out.println(str11.compareTo(str10));
      System.out.println(str11.compareToIgnoreCase(str10));


      //1. int indexOf(int ch) - возвращает индекс позиции в строке на которой первый раз
      // встречается символ ch
      /*
      Hello
      2.  int indexOf( char, int fromIndex) - возвращает индекс позиции в строке на котрой первый раз встречается символ
       ch после индекса fromIndex

       3. int indexOf(String  str) - возвращает индекс строки str  в той строке на которой он вызывается

       4. int indexOf( String str, int fromIndex)- возвращает индекс строки str  в той строке на которой он вызывается после
        индекса fromIndex

        метод возвращает -1 если символ/ строка не найдены


       */

      String stringJava = "Java";

      int positionOfJ = stringJava.indexOf('J');
      int positionOfA = stringJava.indexOf('a');
      int positionOfA2 = stringJava.indexOf('a',2);

      System.out.println("position of J is "+positionOfJ);
      System.out.println("position of a is "+positionOfA);
      System.out.println("position of a is "+positionOfA2);

      int positionOfAV = stringJava.indexOf("av");
      System.out.println("position of av is "+positionOfAV);

      int positionOfVA = stringJava.indexOf("va");
      System.out.println("position of va is "+positionOfVA);


      // lastIndexOf ( char) -  возвращает индекс последнего вхождения символа в строку

      //аналогично методы indexOf  этот метод имеет четыре модификации
      /*
      lastIndexOf( char, fromIndex)
      lastIndexOf( String str)
      lastIndexOf(String string, fromIndex)


       */

      stringJava = "JJava";

      int lastPosOfA =stringJava.lastIndexOf('a');
      System.out.println("last index of a is "+lastPosOfA);
      int lastPosOfJ = stringJava.lastIndexOf('J');
      System.out.println("last index of J is "+lastPosOfJ);

      //  метод substring( int beginIndex) - возвращает подстроку данной строки начиная с символа на позиции beginIndex
      System.out.println( stringJava.substring(1));
      System.out.println( stringJava.substring(0));

      // substring( int beginIndex, int endIndex) - возвращает подстроку с beginIndex  и до символа на позиции endIndex
      // не включая его
      System.out.println( stringJava.substring(1,4));

      //boolean startsWith(String str) - проверяет начинается ли строка со строки str
      // boolean startsWith( String str, index fromIndex)

      String string25 = "Hello world";
      System.out.println(string25.startsWith("Hello"));
      System.out.println(string25.startsWith("He"));
      System.out.println(string25.startsWith("world"));
      System.out.println(string25.startsWith("world",6));

      string25 = "Hello world";
      System.out.println(string25.startsWith(""));
      System.out.println(string25.startsWith("H"));

      // boolean метод endsWith(String suffix) -  проверяет заканчивается ли строка строкой suffix

      String stringABC = "helloABC";
      System.out.println("stringABC ends with ABC ? "+stringABC.endsWith("abc"));

      // toLowerCase, toUpperCase methods

      System.out.println("HELLO".toLowerCase());
      String strToUpperCase = "hello";

      System.out.println("hello to upperCase "+strToUpperCase.toUpperCase());

      // соединение строк метод concat()
      String hello1 = "Hello";
      String java = "Java";

      System.out.println(hello1.concat(" ").concat("Java").concat(" !"));

      // join() -  соединяет строки
      String message = String.join("-","Hello","Java","Tra","la","la");
      System.out.println(message);

      // split()
      String sentence = "Hello java and world";
      String[] words = sentence.split(" ");
      System.out.println(Arrays.toString(words));

      words[1] = "javascript";


     String result = String.join(" ",words);
      System.out.println(result);

      // toCharArray() -  возвращает массив символов из данной строки
      String strA = new String("Java");
      char[] chars = strA.toCharArray();

      for( char c : chars)
        System.out.print(c + " ");

      // static String valueOf() -  возвращает строчное представление int, long, float, double, char

      String value23 = String.valueOf(23);
      System.out.println(value23 + 2);












    }
}
