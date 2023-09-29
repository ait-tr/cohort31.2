import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args)throws IOException {
        String fileName = "input.txt";
        System.out.println(readIntoString(fileName));
    }

    public static String readIntoString(String fileName)throws IOException {
        StringBuilder sb = new StringBuilder();

       try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
           String line;

           while((line = br.readLine()) != null){
               sb.append(line);
               sb.append(System.lineSeparator());
           }
       }
       return new String(sb);
    }
}
