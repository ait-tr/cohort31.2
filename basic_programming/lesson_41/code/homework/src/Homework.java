import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Homework {

    /*
   1. Написать метод, который принимает лист имен, в котором имена могут повторяться и возвращает лист без повторяющихся
    элементов. Использовать множества в решении

   2. Написать метод, который принимает лист имен, в котором имена могут повторяться и возвращает лист повторяющихся
        элементов
        "John","Peter","Mary","Ann","John","Peter","John","John","John" -> John, Peter
        List<String> getDuplicates( List<String> input)
     */

    public List<String> removeDuplicates( List<String>input){
        Set<String> res = new HashSet<>(input);

        return new ArrayList<>(res);

    }

    List<String> getDuplicates( List<String> input){
        Set<String>set = new HashSet<>();
        List<String>duplicates = new ArrayList<>();

        for( String s : input){
            if(!set.add(s) && !duplicates.contains(s))
                duplicates.add(s);
        }
        return duplicates;
    }
}
