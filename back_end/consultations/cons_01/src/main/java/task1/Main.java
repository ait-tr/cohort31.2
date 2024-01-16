package task1;

//        Дан массив из N целых чисел и целое число  K , найдите количество пар элементов в массиве, сумма которых равна K.
//
//        Пример 1:
//
//        Вход:
//        N = 4, K = 6
//        arr[] = {1, 5, 7, 1}
//        Вывод: 2
//        Объяснение:
//        arr[0] + arr[1] = 1 + 5 = 6
//        arr[1] + arr[3] = 5 + 1 = 6.

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println("Старт");

        Main1.test();

        Random random = new Random();
        int[] array = new int[30];

        for (int i = 0; i < array.length; i++) {
            // число в диапазоне от 0 до 30 включительно
//            System.out.println((int) (Math.random() * 31));
//            System.out.println(random.nextInt(31));

            // число в диапазоне от 10 до 30 включительно
            // 0-20 -> 10-30 (за счёт +10)
//            System.out.println((int) (Math.random() * 21) + 10);
            array[i] = random.nextInt(10, 31);
        }

        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(array));

        int sum = random.nextInt(30, 51);
        System.out.println("Ищем пары элементов, сумма которых " + sum);
        solution(array, sum);

        System.out.println("Завершение работы");
    }

    private static void solution(int[] array, int sum) {
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int second = array[j];
                if (current + second == sum) {
                    counter++;
                    System.out.printf("%d + %d = %d%n", current, second, sum);
                }
            }
        }
        System.out.println("Количество найденных пар - " + counter);
    }
}