import java.util.*;

public class TreeMapExample {

    /*
    TreeMap
    - хранит элементы в т.н. красно-черно дереве, упорядоченными по возрастанию
     */
    public static void main(String[] args) {
        Map<Integer,String> ourTreeMap = new TreeMap<>();
        ourTreeMap.put(23,"bbb");
        ourTreeMap.put(2,"aaa");
        ourTreeMap.put(1,"dd");
        ourTreeMap.put(118,"bbbrrr");
        ourTreeMap.put(100,"aaaaaaaaaaa");

        System.out.println(ourTreeMap);

        System.out.println("Map with iterator");
        // перебор мапы с помощью итератора:

        //  получить набор ключ-значение с помощью метода entrySet()
        Set<Map.Entry<Integer,String>> set = ourTreeMap.entrySet();

        // получить итератор для нашего сета пар
        Iterator<Map.Entry<Integer,String>> it = set.iterator();

        // перебор в цикле с помощью методов hasNext и  next
        while (it.hasNext()){
            Map.Entry<Integer,String> me = it.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }


        // в treemap   можно изменить порядок сортировки передав в ее конструктор соответствующий компаратор

        Map<String,String> mapReverse = new TreeMap<>(Collections.reverseOrder());
        mapReverse.put("k1","Jack");
        mapReverse.put("k2","John");
        mapReverse.put("k3","Ann");
        mapReverse.put("k4","Bill");
        mapReverse.put("k5","Jill");

        System.out.println(mapReverse);


    }
}
