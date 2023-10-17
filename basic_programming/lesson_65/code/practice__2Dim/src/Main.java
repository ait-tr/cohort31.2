public class Main {

    /*
      1.Написать метод, находящий сумму всех значений заданного подмассива n двумерного массива целых чисел.
      public int findSumOfNsubArray( int[][]ints, int n)

      2. Написать метод, принимающий двумерный массив целых чисел и  выводящий на экран номер строки (подмассива),
        сумма всех элементов которого рана нулю
        int[][] table = { {1,4,-5},{-1,-1,-1,2,1},{-1,10}} -> 0,1

     3.  Написать метод, принимающий двумерный массив целых чисел и возвращающий количество строк( подмассивов), в которых
     нет отрицательных элементов
     int[][] table = { {1,4,5},{-1,-1,-1,2,1},{-1,10}} -> 1

     4. Написать метод, принимающий двумерный массив целых чисел и возвращающий количество четных чисел в нем
            int[][] table = { {3,4,5},{6,7},{3,10}} -> 3



     */
    public static void main(String[] args) {
        //1.Написать метод, находящий сумму всех значений заданного подмассива n двумерного массива целых чисел.

        int[][] table = {{1, 4, -5}, {-1, -1, -1, 2, 1}, {-1, 10}};
        System.out.println("sum of 2 subarray " + findSumOfNsubArray(table, 2));

        System.out.println("zero sum subarrays are:");
        printZeroSubArrays(table);
        int[][] table1 = {{1, 4, 5}, {-1, -1, -1, 2, 1}, {1, 10}};

        System.out.println("\nNumber of positive subarrays is " + findNumberOfPositiveSubarrays(table1));
        System.out.println("\nNumber of positive subarrays with metka is " + findNumberOfPositiveSubarraysMetka(table1));

        int[][] table2 = { {3,4,5},{6,7},{3,10}};
        System.out.println("number of even is " + countEvenNumbers(table2));
    }

    public static int findSumOfNsubArray(int[][] ints, int n) {

        int sum = 0;

        for (int i = 0; i < ints[n].length; i++) {

            sum += ints[n][i];
        }
        return sum;
    }

    // 2. Написать метод, принимающий двумерный массив целых чисел и  выводящий на экран номер строки (подмассива),
    //        сумма всех элементов которого рана нулю
    //        int[][] table = { {1,4,-5},{-1,-1,-1,2,1},{-1,10}} -> 0,1

    public static void printZeroSubArrays(int[][] table) {

        for (int i = 0; i < table.length; i++) {
            int sumSubArray = 0;

            for (int j = 0; j < table[i].length; j++)
                sumSubArray += table[i][j];

            if (sumSubArray == 0)
                System.out.print(i + "\t");
        }
    }

    // 3.  Написать метод, принимающий двумерный массив целых чисел и возвращающий количество строк( подмассивов), в которых
    //     нет отрицательных элементов
    //     int[][] table = { {1,4,5},{-1,-1,-1,2,1},{-1,10}} -> 1

    public static int findNumberOfPositiveSubarrays(int[][] arr) {
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < 0) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                counter++;
        }
        return counter;
    }

    public static int findNumberOfPositiveSubarraysMetka(int[][] arr){
        int counter = 0;

        outerFor:
        for( int i = 0; i < arr.length; i++)
        {
            for( int j = 0; j < arr[i].length; j++)
            {
                if( arr[i][j] < 0)
                    continue outerFor;
            }
            counter++;
        }
        return counter;
    }

    //4. Написать метод, принимающий двумерный массив целых чисел и возвращающий количество четных чисел в нем
    //            int[][] table = { {3,4,5},{6,7},{3,10}} -> 3

    public static int countEvenNumbers( int[][] numbers){
        int counter = 0;

        for( int i = 0; i < numbers.length;i++)
        {
            for( int j = 0; j<numbers[i].length;j++)
            {
                if(numbers[i][j] % 2 == 0)
                    counter++;
            }
        }
        return counter;
    }



}
