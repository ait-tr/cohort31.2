import java.io.*;

public class Main {
    /*
    IO Streams  Ввод-вывод

    потоки ввода-вывода

    Понятие потока ( абстракция) является в данном случае ключевым.
    Обьект, из которого считываются данные - это поток ввода, а обьект в который записываются данные - поток вывода.

    Все классы, работающие с вводом-выводом делятся на две большие группы - классы, работающие с байтами и классы, работающие
    с символами.
    В основе всех классов, работающих с байтами лежат два абстрактных класса - InputStream  и OutputStream,
    а классов, которые работают с символами - Reader, Writer


    Потоки байтов

    InputStream - это базовый класс для всех классов, работающих с байтовыми потоками ввода.

    Главные методы:

    void close() -  закрывает поток

    int read() - возвращает текущий байт из потока ( целочисленное представление)
                 Когда байтов в потоке не остается, метод вернет -1

    int read( byte[] buffer) - считывает байты из потока в буферный массив.
                               Возвращает число считанных байтов. Если ничего не считано, то он вернет -1


    int read( byte[]buffer, int index, number) -
            buffer -  массив байтов, в который записываются считанные байты
            index -  индекс этого массива buffer[index], начиная с которого записываются байты
            number - количество байтов, которые нужно считать

      skip( long number )   - пропускает при чтении количество байтов равное number
      available() -  возвращает количество байтов, доступных для чтения в потоке


      OutputStream  - базовый класс для всех классов, которые работают с байтовыми потоками записи.

      Методы:

      void close()  - закрывает поток
      void flush() - сбрасывает содержимое  буфера вывода в поток

      void write(int b) - записывает в выходной поток один байт
      void write(byte[] buffer) - записывает в выходной поток массив buffer
      void write(byte[]buffer, int index, number)

      buffer -  массив байтов
      index -  индекс этого массива buffer[index], начиная с которого записываются байты
      number - количество байтов, которые нужно записать


      FileOutputStream - используется для записи байтов в файл. Наследует класс OutputStream.

      Конструкторы:
      FileOutputStream(String fileName)
      FileOutputStream( File file)
      FileOutputStream( String fileName, boolean append)
      FileOutputStream( File fileName, boolean append)
        если append = true,  данные добавляются в конец файла
        если false - файл перезаписывается полностью


     */
    //File newFile = new File("text.txt");

    public static void main(String[] args) {
        String str = "Hello Java";

        try (FileOutputStream fileOutputStream = new FileOutputStream("output.txt")) {
            byte[] buffer = str.getBytes();

            fileOutputStream.write(buffer, 0, buffer.length);
            System.out.println("We have done it !");
            // fileOutputStream.write(buffer[0]);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // FileInputStream -   для чтения файлов
        // FileInputStream( String fileName)

        try (FileInputStream fileInputStream = new FileInputStream("output.txt")) {
            int i;
            while ((i = fileInputStream.read()) != -1) {
        //        System.out.print((char) i);
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // чтение в буферный массив
        System.out.println("Reading in buffer array");
        try (FileInputStream fin = new FileInputStream("output.txt")) {

            byte[] buffer = new byte[512];

            int counter;
            while ((counter = fin.read(buffer)) != -1) {

                for (int i = 0; i < counter; i++) {
                    System.out.print((char) buffer[i]);
                }

            }

        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }


        //  чтение и запись

        try( FileInputStream fileInputStream = new FileInputStream("output.txt");
             FileOutputStream fileOutputStream = new FileOutputStream("newOutput.txt"))
        {
            byte[] buffer = new byte[512];

            int counter;

            while ((counter = fileInputStream.read(buffer)) != -1){

                fileOutputStream.write(buffer,0,counter);
            }


        }
        catch (IOException e){
            e.getMessage();
        }
    }

    /* Написать программу, сравнивающую два файла . Программа должна считывать файлы и затем сравнивать содержимое.
       Если найдено отличие, значит файлы не равны и программа выводит на экрае соответствующее сообщение.
       Если конец обоих файлов достигается одновременно и отличий не найдено - значит файлы одинаковые и программа
       также выводит на экран соответствующее сообщение.
       Предварительно создать файлы в корневой директории first.txt, second.txt
     */
}
