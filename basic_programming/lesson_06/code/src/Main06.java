import java.util.Random;
import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) {
        int x = 10;

        {
            int y = 15; // переменная y объявлена в блоке
            x = x + y;
        }

        System.out.println(x); // x => 25
//        x = x + y; // ошибка компиляции

        // сравнение строк
        {
            int a = 10;
            int b = 5;
            System.out.println(a == b);

            String str1 = "Java 9";
            String str2 = "Java 9";
            String str3 = new String("JAVA 9");

            boolean b1 = str1 == str2;
            System.out.println(b1);

            System.out.println(str1);
            System.out.println(str3);

            boolean b2 = str1 == str3;
            System.out.println("str1 == str3 " + b2);

            boolean b3 = str1.equals(str3);
            System.out.println("str1.equals(str3) " + b3);
            boolean b4 = str1.equalsIgnoreCase(str3);
            System.out.println("str1.equalsIgnoreCase(str3) " + b4);

        }

        {
//todo Разобраться с ошибкой
//        if (x <= 10) System.out.println("Привет всем!");

//        System.out.println("x before if: " + x);
//        if (x == 10) {
//            x = x - 1;
//            System.out.println("x in if: " + x);
//        }
//
//        System.out.println("x after if: " + x);

        /*
        Необходимо написать программу,
        где бы пользователю предлагалось
        ввести число 1.
        Если ввёл число 1, программа должна вывести сообщение: "Вы ввели число 1"
        Если введено число 3, программа должна выдать "Вы же ввели 3, а не 1"
        В остальных случаях - вывести "Вы ввели что-то непонятное"
        */

            Scanner scanner = new Scanner(System.in);

//        int temp = 3;
//        System.out.println("Введите что-нибудь");
//        String stringInput = scanner.nextLine();
//        System.out.println("string -> " + (stringInput + 1000)); // "1234"
//
//        int parseInt = Integer.parseInt(stringInput);
//        System.out.println("int -> " + (parseInt + 1000));
//
//        System.out.println("Введите число 1: ");
//        int userInputInt = scanner.nextInt();
//        if (userInputInt == 1) {
//            System.out.println("Вы ввели число 1");
//        }
//        else if (userInputInt == 3 && temp != 3){
//            System.out.println("Вы же ввели 3, а не 1");
//        }
//        else if (userInputInt == 3 && temp == 3){
//            System.out.println("Вы же ввели 3, и temp = 3");
//        }
//        else if (userInputInt == 5) {
//            System.out.println("Вы ввели число 5");
//        }
//        else {
//            System.out.println("Вы ввели что-то непонятное");
//        }
//
//
//        System.out.println("Вышли из оператора if");

            {
            /*
            Ребенок получил оценку в школе. от 1 до 5.
            У ребенка есть карманные деньги
            за хорошие оценки получает деньги, за плохие отбирают
            5 -> + 20
            4 -> 10
            3 -> 0;
            2 -> - 20
            1 -> все
             */
                Random random = new Random();
                int money = 100;
                int note = random.nextInt(5);
                note = 3;

                System.out.println("Оценка: " + note);

                if (note == 5) {
                    money += 20;
                }
                else if (note == 4) {
                    money += 10;
                }
                else if (note == 3) {

                }
                else if (note == 2) {
                    money -= 20; // money = money - 20;
                }
                else if (note == 1) {
                    money = 0;
                }
                else {
                    System.out.println("Получена некорректная оценка!");
                }

                System.out.println("У ребенка осталось: " + money + " монет");
            }


            int var1 = 10;
            int var2 = (var1 == 10) ? 20 : var1 - 4;
            System.out.println((var1 == 0) ? "равно 0" : "не равно 0");
//        System.out.println("var2 " + var2);

            if (var1 > 10) {
                var2 = 20;
            } else {
                var2 = 0;
            }



        }


    }
}
