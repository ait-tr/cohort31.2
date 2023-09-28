import java.io.PrintWriter;

public class OurPrintWriterClass {

    /*
     класс PrintWriter - как правило используется в коммерческих, не учебных проектах в случае если необходимо средствами
     Джава вывести информацию в консоль.
     Т.к. это класс, работающий с символьными потоками

     PrintWriter( OutputStream outputStream, boolean flashingOn)
     outputStream - обьект типа OutputStream
     flashingOn -   сброс  потока при каждом вызове метода например println()

     методы:
     print()
     println()
     */
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out,true);

        int i = 100;
        double d = 123.45;

        pw.println("We use printWriter here");
        pw.println(i);
        pw.println(d);

    }
}
