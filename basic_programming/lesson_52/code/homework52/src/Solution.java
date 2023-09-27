import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
/*
Написать программу, сравнивающую 2 файла, программа должна считывать файлы
и затем сравнивать содержимое.Если найдено отличие значит файлы не равны и
программа будет выводить на экран соответствующее сообщение.
Если конец обоих файлов достигается одновременно и отличий не найдено, значит
файлы одинаковые и выводим соответствущее сообщение.
Предварительно создать файл в корневой директории first.txt, second.txt
 */
public static void main(String[] args) {
    compareFiles("first.txt","second.txt");
}


    public static void compareFiles(String file1, String file2){

        int i,j;
        try (FileInputStream f1 = new FileInputStream(file1);
             FileInputStream f2 = new FileInputStream(file2))
        {
            do {
                i = f1.read();
                j = f2.read();
                if( i != j) break;
            }while (i != -1 && j != -1);

            if( i != j){
                System.out.println("Files differ");
            }
            else {
                System.out.println("Files are equal");
            }


        }catch (IOException e){
            System.out.println("I/O exception occured");
        }
    }
}
