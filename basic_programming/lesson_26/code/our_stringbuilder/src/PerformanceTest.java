public class PerformanceTest {

    public static String concatString(){

        String str = "Hello";

        for( int i = 0; i < 10000; i++){
            str = str + "Java";
        }
        return str;
    }


    public static String concatStringBuilder(){
        StringBuilder stringBuilder = new StringBuilder("Hello");

        for( int i = 0; i < 10000; i++){
            stringBuilder.append("Java");
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        concatString();

        System.out.println("Time required for String concatenation "+ (System.currentTimeMillis() - start) + " ms");


        start = System.currentTimeMillis();
        concatStringBuilder();

        System.out.println("Time required for StringBuilder concatenation "+ (System.currentTimeMillis() - start) + " ms");
    }
}
