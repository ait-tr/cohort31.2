import java.util.Arrays;

public class Homework {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "acb";

        System.out.println(isAnagram1(str1,str2));
      //  System.out.println(isAnagram(str1,str2));
    }

    public static boolean isAnagram(String str1, String str2){

        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++){
            if (str1.indexOf(str2.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagram1( String str1, String str2){
        if( str1.length() != str2.length())
            return false;

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1,chars2);

    /*    for(int i = 0; i < chars1.length; i++){
            if( chars1[i] != chars2[i])
                return false;
        }
        return true; */

       // return  chars1 == chars2;
    }
}
