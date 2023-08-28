public class Practice {

    /*1. написать свою реализацию метода substring, который работает также как
    метод substring  класса String , принимающий два аргумента - индекс начала
    и индекс конца. Метод substring  класса String  не использовать :)
    Метод принимает три параметра - строку, индекс начала и индекс конца)
    public static String mySubstring( String string, int begin, int end)



    2. Написать метод, проверяющий являются ли две строки анаграммами
    abc - cba  rosa - asor - анаграмма
    abc - dba  - не анаграмма
    boolean isAnagram( String str1, String str2)
     */
    public static void main(String[] args) {
     //   System.out.println("Hello".substring(1,30));
        System.out.println(mySubstring("Hello",1,30));
    }

    public static String mySubstring( String string, int begin, int end){
        //доп. проверки

        StringBuilder sb = new StringBuilder();

        for( int i = begin; i < string.length()&& i < end; i++){
            sb = sb.append(string.charAt(i));
        }
        return new String(sb);
    }
}
