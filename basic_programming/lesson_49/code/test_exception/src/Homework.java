import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class Homework {

    /*
    Написать метод, принимающий не пустой лист целых чисел , в котором все числа кроме одного имеют пару и
    возвращающий это не парное число. При решении использовать мапу
Примеры:
1,3,1 -> 3
3,3,3 -> 3
1,1,15,1,1 -> 15
1,8,8,8,8,8,1,2,2 -> 8
     */

    public int findSingleNumber(List<Integer> numbers){
        Map<Integer,Integer>qtyByNumber = new HashMap<>();
        int res = 0;

        for(int number : numbers){
            if(qtyByNumber.containsKey(number)){
                int oldValue = qtyByNumber.get(number);
                qtyByNumber.put(number,oldValue + 1);
            } else {
                qtyByNumber.put(number,1);
            }
        }

        for(int number : qtyByNumber.keySet()){
            if(qtyByNumber.get(number) % 2 != 0)
                res = number;
        }

        return res;
    }

    public int findSingleNumberMerge(List<Integer>numbers){
        Map<Integer,Integer>qtyByNumber = new HashMap<>();
        int res = 0;

        for(int number : numbers){
            qtyByNumber.merge(number,1,(oldValue,newValue)->oldValue + newValue);
        }

        for(int number : qtyByNumber.keySet()){
            if(qtyByNumber.get(number) % 2 != 0)
                return number;
        }

      //  return res;
        throw new NoSuchElementException();
    }
}
