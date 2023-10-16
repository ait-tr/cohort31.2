import java.util.Arrays;

public class Main {
    /*
    Multidimensional arrays -  многомерные массивы
    Two-dimensional arrays -  двумерные массивы
         */
    public static void main(String[] args) {
        int[][] table = new int[10][20];

        int[]ints = {1,2,3,4};
       // System.out.println(ints[0]);
        System.out.println(ints.length);

        int[][] arr = {
                //0  1  2
                {11,22,33}, //arr[0]
                {44,55,66}, //arr[1]
                {77,88,99}  // arr[2]
        };
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);

        int[] arrZero = arr[0];


        System.out.println("zero elt of arr " + Arrays.toString(arr[0]));
        System.out.println("zero elt of arr " + Arrays.toString(arr[1]));
        System.out.println("zero elt of arr " + Arrays.toString(arr[2]));
       // System.out.println("zero elt of arr " + Arrays.toString(arrZero));

        System.out.println("print in cycle");

        // внешний цикл от 0 до количества строк/массивов двумерного массива
        for(int i = 0; i < 3;i++){

        // внутренний цикл от 0 до количества столбцов/элементов массива
            for (int j = 0; j < 3;j++){

                System.out.print(arr[i][j] + "\t");
            }
            //  печать с новой строки после каждого массива
            System.out.println();

        }

        int[][] num = new int[3][];
        num[0] = new int[4];
        num[1] = new int[3];
        num[2] = new int[100];

        int[][] arr1 = {
                //0  1  2
                {11,22,33}, //arr[0]
                {44,55}, //arr[1]
                {77,88,99,45,67,8,9}  // arr[2]
        };

        System.out.println(arr1.length);
        System.out.println(arr1[0].length);
        System.out.println(arr1[1].length);
        System.out.println(arr1[2].length);

        System.out.println("print arr1");
        print2Dim(arr1);

    }

    public static void print2Dim(int[][]array){
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        //  альтернативное обьявление массива
        int[][] array1;
        int [][] array2;
        int arr3[][];
        int []arr4[];
    }
}
