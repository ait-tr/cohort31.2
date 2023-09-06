import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Homework {
    public static void main(String[] args) {
        List<Integer>list1 = Arrays.asList(1,2,128,4);
        List<Integer>list2 = List.of(5,2,128,8);

        Homework homework = new Homework();
        System.out.println(homework.yesOrNo(list1,list2));

      //  list1.add(5);
      //  System.out.println(list1);
    }

    /*
    Задача 1
Написать метод, принимающий два листа целых чисел одинаковой длины и возвращающий лист, содержащий элементы Yes или No, где значения на i-м месте зависит от того, равны ли элементы этих двух листов под номером i.
Например, {1,2,3,4} и {5,2,3,8} вернет {No, Yes, Yes, No}
Протестировать
     */
    public List<String> yesOrNo( List<Integer>list1, List<Integer>list2){
        List<String> resultYesNo = new ArrayList<>();

        for( int i = 0; i < list1.size(); i++){
            if( list1.get(i).equals(list2.get(i))) {
                resultYesNo.add("Yes");
            }
            else{ resultYesNo.add("No");}
        }

        return resultYesNo;
    }

    /*
    Задача 2
Написать метод, принимающий лист целых чисел и целое число и возвращающий лист без элементов больших этого числа.
Протестировать.
     */

    public List<Integer> withoutEltsMoreThanN( List<Integer> input, int n){
        List<Integer> withoutMoreThan = new ArrayList<>();

        for( Integer i : input){
            if( i <= n){
                withoutMoreThan.add(i);
            }
        }
        return withoutMoreThan;
    }

    public List<Integer> withoutEltsMoteThanNIterator( List<Integer>input, int n){
        Iterator<Integer> iterator = input.iterator();

        while( iterator.hasNext()){
            if(iterator.next() >= n){
                iterator.remove();
            }
        }
        return input;
    }
}
