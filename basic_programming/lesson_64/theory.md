***Multidimensional Arrays***

Earlier, we discussed one-dimensional arrays, which can be thought of as a chain or a single line of homogeneous values. However, in addition to one-dimensional arrays, there are also multidimensional arrays. The most well-known multidimensional array is a table, representing a two-dimensional array:

```java
int[][] nums2 = { { 0, 1, 2 }, { 3, 4, 5 } };
```

Since `nums2` is a two-dimensional array, it represents a simple table. You could also create it like this: `int[][] nums2 = new int[2][3];`. The number of square brackets indicates the dimension of the array. The numbers inside the brackets indicate the number of rows and columns. You can use array elements in your program by using indices as well:

```java
// Set the element in the first column of the second row to 44
nums2[1][0] = 44;
System.out.println(nums2[1][0]);
```

In this code, we're setting the element at the first column of the second row (index 1,0) to 44 and then printing it.



***Многомерные массивы***

Ранее мы рассматривали одномерные массивы, которые можно представить как цепочку или строку однотипных значений. Но кроме одномерных массивов также бывают и многомерными. Наиболее известный многомерный массив - таблица, представляющая двухмерный массив:

int[][] nums2 = { { 0, 1, 2 }, { 3, 4, 5 } };

Поскольку массив nums2 двухмерный, он представляет собой простую таблицу. Его также можно было создать следующим образом: int[][] nums2 = new int[2][3];. Количество квадратных скобок указывает на размерность массива. А числа в скобках - на количество строк и столбцов. И также, используя индексы, мы можем использовать элементы массива в программе:

// установим элемент первого столбца второй строки  
nums2[1][0]=44;  
System.out.println(nums2[1][0]);  



