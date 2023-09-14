import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapExample {

    // сохраняет порядок ввода элементов
    public static void main(String[] args) {
        Map<Integer,String> ourLinkedMap = new LinkedHashMap<>();
        ourLinkedMap.put(23,"bbb");
        ourLinkedMap.put(2,"q");
        ourLinkedMap.put(15,"bb");
        ourLinkedMap.put(7,"bbbggggg");

        System.out.println(ourLinkedMap);

        System.out.println("Put will return");
        System.out.println(ourLinkedMap.put(125,"ttt"));// когда ключа не было, вернет null
        System.out.println(ourLinkedMap.put(23,"ff"));

        System.out.println(ourLinkedMap);

    }


}
