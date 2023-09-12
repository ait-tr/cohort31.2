import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    /*
     Интерфейс Map
      4 класса :
      Hashtable
      HashMap
      LinkedHashMap
      TreeMap

       мапа представляет собой набор пар ключ-значение
       В качестве ключей могут быть разные типы данных.
       Ключи в мапе уникальны. Значения могут повторяться
     */

    public static void main(String[] args) {
        Map<Integer,String> ourMap = new HashMap<>();
        ourMap.put(1200,"Notebook");
        ourMap.put(10,"Mouse");
        ourMap.put(500,"TV");
        ourMap.put(130,"Printer");

        System.out.println(ourMap);

        // добавить элт put
        ourMap.put(10,"Clock");

        System.out.println(ourMap);

        // удалить remove()
        ourMap.remove(10);

        System.out.println(ourMap);

        // получить get()
        System.out.println(ourMap.get(130));

        // размер
        System.out.println(ourMap.size());

        // содержит ли ключ мапа boolean containsKey()
        System.out.println(ourMap.containsKey(1200));
        System.out.println(ourMap.containsKey(1250));

        System.out.println(ourMap.containsValue("Notebook"));
        System.out.println(ourMap.containsValue("TV1"));

        System.out.println(ourMap.keySet());

        Set<Integer> mapKeySet = ourMap.keySet();


    }




}
