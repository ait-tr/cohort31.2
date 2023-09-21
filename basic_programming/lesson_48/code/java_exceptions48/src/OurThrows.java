import java.io.IOException;

public class OurThrows {
    // throws

    public static void main(String[] args) throws IOException,ClassNotFoundException {
        try{
            example();
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        example1(1);

    }


    public static void example() throws ArithmeticException,NullPointerException{

        System.out.println(2/0);

        String nullStr = null;
        nullStr.length();
    }

    public static void example1(int number) throws IOException,ClassNotFoundException{
        if(number == 1)
            throw new IOException("IOException occured");
        else
            throw new ClassNotFoundException("Class not found");
    }
}
