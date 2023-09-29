import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

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

    public static String findLongestLine(File fileName) {
        String longest = "";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String current;

            while ((current = br.readLine()) != null) {
                if (current.length() > longest.length()) {
                    longest = current;
                }
            }

        } catch (IOException e) {
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

    public static List<Person> composeList(String fileName) {
        List<Person> persons = new ArrayList<>();
        List<String> temp = new ArrayList<>();

        String line;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            while ((line = bufferedReader.readLine()) != null) {
                temp.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String s : temp) {
            String[] nameAge = s.split(",");
            int age = Integer.parseInt(nameAge[1].trim());
            if (age > 18) {
                persons.add(new Person(nameAge[0].trim(), age));
            }
        }
        Collections.sort(persons);
        return persons;
    }

    /*

    4. Пусть есть класс Person c полями name  и age. Нужно написать метод, записывающий в файл обьекты
      класса Person в виде строк и одновременно выводящий их на экран

     */
}
