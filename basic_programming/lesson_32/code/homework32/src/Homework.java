public class Homework {

    // "Hello world" , "l" -> 3

    public static void main(String[] args) {
        System.out.println(countOccurences("Hello world","l"));
        System.out.println(countOccurences("lHelol worlldl","l"));
        System.out.println(countOccurences("Hello lena","le"));
    }

    public static int countOccurences( String str, String pattern){
        int count = 0;
        int lastIndex = str.lastIndexOf(pattern);

        for( int i = 0; i < str.length(); i++){
            if(lastIndex != -1){
                count++;
                lastIndex = str.lastIndexOf(pattern,lastIndex - pattern.length());
            }
        }

        return count;
    }
}
