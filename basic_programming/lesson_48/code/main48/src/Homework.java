public class Homework {
    public static void main(String[] args) {
        try {
            int x = 50 / 0;
        } catch (ArithmeticException e){
            System.out.println("Division by zero is forbidden");
        }
        try {
            String strNull = null;
            strNull.toLowerCase();
        }
        catch (NullPointerException e){
            System.out.println("Method can't be called on null");
        }
        try {
            int[] ints = new int[2];
            ints[10] = 90;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
