import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(composeList("classPerson.txt"));

        Person person1 = new Person("Peter",35);
        Person person2 = new Person("Simon",9);
        Person person3 = new Person("John",90);

        List<Person> personList = Arrays.asList(person1,person2,person3);

        writeToFile("outputPersons.txt",personList);

        String inFile = "inputList.csv";
        String outFile = "outputList.csv";
        writeToModifiedListInFile(inFile,outFile);
    }

    /*
    1.Пусть есть текстовый файл такого вида:
    1
    2
    3
    4
    5
    Нужно написать метод, принимающий файл и возвращающий
    сумму всех значений
    */
    public static int findSum(String fileName) {
        int sum = 0;
        String nextInt;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            while ((nextInt = br.readLine()) != null) {
                sum = sum + Integer.parseInt(nextInt);
            }

        } catch (IOException e) {
            e.getMessage();
        }
        return sum;
    }

    /*
    2. Написать метод, принимающий текстовый файл, состоящий из нескольких строчек
        разной длины и возвращающий самую длинную строчку
        Пример:
        файл
        aaa
        bbbbbbbbbb
        cc
        вернет метод  bbbbbbbbbb

        */

    public static String findLongestLine(File fileName){
        String longest = "";

        try( BufferedReader br = new BufferedReader(new FileReader(fileName))){

            String current;

            while((current = br.readLine()) != null){
                if( current.length() > longest.length()){
                    longest = current;
                }
            }

        }
        catch (IOException e){
            e.getMessage();
        }
        return longest;
    }

    /*

     3. Пусть есть текстовый файл такого вида:
        Peter,35
        Simon,5
        John,90
        Нужно написать метод, читающий этот файл и возвращающий список людей старше 18 лет,
        отсортированный по возрасту. Известно, что файл не пустой
        public static List<Person> composeList( String fileName)
        */

    public static List<Person> composeList(String fileName){
        List<Person>persons = new ArrayList<>();
        List<String> temp = new ArrayList<>();

        String line;
        try( BufferedReader bufferedReader = new BufferedReader( new FileReader(fileName))){
            while((line = bufferedReader.readLine()) != null){
                temp.add(line);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        for(String s : temp){
            String[] nameAge = s.split(",");
            int age = Integer.parseInt(nameAge[1].trim());
            if( age > 18){
                persons.add(new Person(nameAge[0].trim(),age));
            }
        }
        Collections.sort(persons);
        return persons;
    }

    /*

    4. Пусть есть класс Person c полями name  и age. Нужно написать метод, записывающий в файл обьекты
      класса Person в виде строк и одновременно выводящий их на экран

     */
    public static void writeToFile(String fileName, List<Person>persons){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName,true));
            BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(System.out))){

            for(Person person : persons){
                bw.write("\"" + person.name +"\""+","+person.age);
                bw1.write("\"" + person.name +"\""+","+person.age);
                bw.newLine();
                bw1.newLine();

            }

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    /*
     Пусть есть файл содержащий следующую информацию:
     name,surname (  могут повторяться),equipment,price.
     Нужно написать метод, который принимает в качестве параметра имя этого файла и записывает информацию в другой
     файл в таком виде :
     name surname sumPrice

     Eugene,Black,Notebook,1000
     Peter,White,Mac,800
     Eugene,Black,Keybord,25
     John,Green,Mouspad,5
     Peter,White,Mobile,600

     Eugene Black 1025
     Peter White 1400
     John Green 5

     public static void writeToModifiedListInFile( String inFile, String outFile)
     */
    public static void writeToModifiedListInFile( String inFile, String outFile){
        try(BufferedReader br = new BufferedReader(new FileReader(inFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outFile,false))){

            String line;
            Map<String,Integer>result = new HashMap<>();

            while((line = br.readLine()) != null){
                System.out.println(line);

                String[] entry = line.split(",");
                String name = entry[0].trim().concat(" ").concat(entry[1].trim());
                int price = Integer.parseInt(entry[3].trim());

                int currentValue = result.getOrDefault(name,0);
                int newValue = currentValue + price;
                result.put(name,newValue);

             /*   if( result.containsKey(name))
                    result.put(name,price + result.get(name));
                else
                    result.put(name,price);

              */

            }

            for(Map.Entry<String,Integer>me : result.entrySet()){
                bw.write(me.getKey() +' '+ me.getValue());
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
