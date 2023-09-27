import java.io.*;

public class Main1 {

    /*
    BufferedInputStream
    BufferedOutputStream
    -  буферизованные потоки

    BufferedInputStream -   накапливает данные в дополнительном специальном буфере, что позволяет реже обращаться
    к устройству ввода

    Конструкторы :
       BufferedInputStream( InputStream input)
       BufferedInputStream( InputStream input, int bufferSize)

     */
    public static void main(String[] args) {


        String string = "Hello java!";
        byte[] stringBytes = string.getBytes();

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(stringBytes);

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(byteArrayInputStream)) {

            int i;
            while ((i = bufferedInputStream.read()) != -1) {
           //     System.out.print((char) i);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        //BufferedOutputStream
        //BufferedOutputStream( OutputStream output)
        //BufferedOutputStream( OutputStream output,int size)

        String hello = "Hello123";
        byte[] helloBytes = hello.getBytes();

        //  FileOutputStream fos = new FileOutputStream("test.txt");
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("test.txt"))) {

            bos.write(helloBytes);

        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }


        // DataOutputStream
        // DataInputStream  -
        // для работы с данными примитивных типов

        // DataOutputStream
        /*
        writeBoolean()
        writeByte
        writeChar
        writeInt
        writeDouble
        writeShort
        writeFloat
        writeUTF(String string) - записывает строку в кодировке UTF-8

        //DataInputStream
         те же методы - read

         */

        Employee jack = new Employee("Jack",45,2000.5,true);

        // записываем обьект
        try(DataOutputStream dos = new DataOutputStream( new FileOutputStream("employee.txt"))){
            dos.writeUTF(jack.name);
            dos.writeInt(jack.age);
            dos.writeDouble(jack.salary);
            dos.writeBoolean(jack.isManager);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        // считывание обьекта

        try(DataInputStream dis = new DataInputStream(new FileInputStream("employee.txt")) ){

            String name = dis.readUTF();
            int age = dis.readInt();
            double salary = dis.readDouble();
            boolean isManager = dis.readBoolean();
            System.out.println("name: " + name + ", age: " + age + ", salary: " + salary + ", isManager " + true);


        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }


    }

}
