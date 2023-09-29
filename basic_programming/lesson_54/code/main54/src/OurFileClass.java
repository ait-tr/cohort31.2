import java.io.File;
import java.io.IOException;

public class OurFileClass {

    //  класс File - работает с файлами и каталогами и управляет информацией о них.

    /*
    конструкторы:
    File( String  путь к  файлу/каталогу)
    File( File dir, String fileName)

    File dir1 = new File( "C://dirName)

    основные методы :
    boolean createNewFile() - создаст новый файл соответствующий переданному в конструктор  пути к нему
    boolean delete() -  удаляет файл
    boolean exists() - проверяет существует ли такой файл
    String getAbsolutePath()-  возвращает абсолютный путь к файлу
    String getName() - возвращает имя файла или каталога
    boolean isDirectory() -  true  если это это каатлог
    boolean isFile() -  true  если это файл
    long length() - размер в байтах
    String[] list() - массив файлов и подкаталогов, находящихся в определенном каталоге
     */

    public static void main(String[] args)throws IOException {

        File file = new File("example.txt");
        System.out.println("File name: " + file.getName());
        System.out.println("does file exist? " + file.exists());
        System.out.println("File size: " + file.length());
        System.out.println(file.createNewFile());
        System.out.println("does file exist? " + file.exists());
        System.out.println("File size: " + file.length());
        System.out.println(file.delete());
        System.out.println("does file exist? " + file.exists());

    }




}
