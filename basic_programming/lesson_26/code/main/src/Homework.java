import java.util.Arrays;

public class Homework {

    public static void main(String[] args) {
        String str1 = "Hello Java";
        String str2 = "rt";
        System.out.println(strEndsWithAnotherStr(str1,str2));

        String strToArray = "Hello";
        System.out.println(Arrays.toString(createsCharArray("Hello")));

        String duplicates ="abbccccaadb";
        System.out.println(removeDuplicateChars(duplicates));


    }

    /*
    Задача 1
Написать метод, проверяющий заканчивается ли строка содержимым другой строки.
public boolean strEndsWithAnotherStr ( String str1, str2)
     */
public static boolean strEndsWithAnotherStr( String str1, String str2){
    return str1.endsWith(str2);
}

/*
Задача2
Написать метод, создающий массив символов из содержимого строки
public char[] createsCharArray( String str)
 */
public static char[] createsCharArray( String str){
    return str.toCharArray();
}

/*
Задача 3*
Написать метод, удаляющий из строки повторяющиеся символы
String removeDuplicateChars( String string)
пример: "abbccccaadb" -> "abcd"
 */

    public static String removeDuplicateChars( String string){
        char[] chars = string.toCharArray();
        String result = "";

        for( int i = 0; i < chars.length; i++){
            if(result.indexOf(chars[i]) == -1)
            {
                result += chars[i]; // abcd
            }
        }
        return result;
    }

}
