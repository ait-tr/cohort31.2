import java.io.*;

public class Main {

    /*
    ByteArrayInputStream
    ByteArrayOutputStream
    - это классы, которые используются при работе с массивами байтов


    ByteArrayInputStream - источник данных массив байтов

    конструкторы:
    ByteArrayInputStream( byte[] array)
    ByteArrayInputStream( byte[] array, int index, int number)

     */

    public static void main(String[] args) {
        byte[] bytes = new byte[]{1,2,3,4};

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);

        int by;

        while ((by = byteArrayInputStream.read()) != -1){
            System.out.println(by);
        }


        // ByteArrayOutputStream -  массив байтов в данном случае используется как приемник данных
        /*
         ByteArrayOutputStream()
         ByteArrayOutputStream(int size)
         */

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String str = "Hello java";
        byte[] strBytes = str.getBytes();

        try {
            byteArrayOutputStream.write(strBytes);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println(byteArrayOutputStream.toString());

       byte[] ourArr = byteArrayOutputStream.toByteArray();
       for( byte b : ourArr ){
           System.out.print((char)b);
       }

       // writeTo   с помощью этого метода можно вывести данные в другой поток

        ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
       String hello = "hello!";
       byte[] helloBytes = hello.getBytes();
       try {
           byteArrayOutputStream1.write(helloBytes);
       }
       catch (Exception e){
           System.out.println(e.getMessage());
       }
       try( FileOutputStream fos = new FileOutputStream("test.txt")){

           byteArrayOutputStream1.writeTo(fos);

       }
       catch (IOException e){
           System.out.println(e.getMessage());
       }

    }
}
