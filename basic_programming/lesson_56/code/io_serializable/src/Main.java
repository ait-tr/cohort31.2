import java.io.*;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("John",20,201,"Street1, Berlin",
                            "Engineer");

        try{
            ObjectOutputStream outputStream = new ObjectOutputStream( new FileOutputStream("student.ser"));

            outputStream.writeObject(student);
            outputStream.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        Student johnDecerialized = null;

        try{
            ObjectInputStream inputStream = new ObjectInputStream( new FileInputStream("student.ser"));
          johnDecerialized =(Student) inputStream.readObject();
          inputStream.close();
        }
        catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
            return;
        }
   //     catch (ClassNotFoundException e){
   //         System.out.println(e.getMessage());
   //         return;
   //     }
        System.out.println("name: " + johnDecerialized.getName());
        System.out.println("age: " + johnDecerialized.getAge());
        System.out.println("regNum: " + johnDecerialized.getRegNumber());
        System.out.println("address: " + johnDecerialized.getAddress());
        System.out.println("education: " + johnDecerialized.getPreviousEducation());


    }
}

// NIO.2
