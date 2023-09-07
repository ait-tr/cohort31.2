import java.util.LinkedList;
import java.util.List;

public class Main {
    // LinkedList methods  методы отличающиеся от ArrayList
    /*
    addFirst() / offerFirst() -  добавляет элт в начало листа
    addLast() / offerLast()   добавляет последний
    removeFirst() / pollFirst() - удаляет первый элт из начала
    removeLast()  / pollLast() - удаляет полследний
    getFirst() /  peekFirst() -  получить первый
    getLast() /  peekLast() -  получить последний
     */
    public static void main(String[] args) {
        List<String> strings = new LinkedList<>();
        LinkedList<String> names = new LinkedList<>();

        names.add("Jack");
        names.add("John");
        names.add("Bill");

        System.out.println(names);

        names.addFirst("Ann");

        System.out.println(names);

        names.removeFirst();
        System.out.println(names);
        System.out.println(names.peekFirst());

    }


}
