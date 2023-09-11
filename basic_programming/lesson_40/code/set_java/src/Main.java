import java.util.*;

public class Main {
    //Set
    /*
     Set  это коллекция, которая не может содержать дубликатов.

     HashSet
     1.  HashSet  использует в основе HashTable
     2.   не гарантирует порядка , в котором хранятся и возвращаются элементы
     3. Не допускает дубликатов
     4. Можно поместить null
     */
    public static void main(String[] args) {
        Set<String> hSet = new HashSet<>();
        HashSet<String> hashSet = new HashSet<>();

        // добавление элемента
        System.out.println(hashSet.add("aa"));
        hashSet.add("bb");
        hashSet.add("cc");
        hashSet.add("dd");

        System.out.println(hashSet);

        for (String s : hashSet) {
            System.out.println(s);
        }

        System.out.println(hashSet.add("aa"));
        System.out.println(hashSet.add("bb"));
        System.out.println(hashSet);

        // удалить элемент remove()
        hashSet.remove("bb");
        System.out.println(hashSet);

        System.out.println(hashSet.size());

        System.out.println(hashSet.contains("aa"));

        System.out.println(hashSet.isEmpty());

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //LinkedHashSet - поддерживает порядок ввода элементов

        Set<String> namesSet = new HashSet<>();
        namesSet.add("John");
        namesSet.add("Jack");
        namesSet.add("Ann");
        namesSet.add("Bill");
        System.out.println(namesSet);

        System.out.println("LinkedHashSet");
        Set<String> linkeNamesSet = new LinkedHashSet<>();
        linkeNamesSet.add("John");
        linkeNamesSet.add("Jack");
        linkeNamesSet.add("Ann");
        linkeNamesSet.add("Bill");
        System.out.println(linkeNamesSet);


        // TreeSet -  сортирует элементы

        System.out.println("with TreeSet");
        Set<String> treeNamesSet = new TreeSet<>();

        treeNamesSet.add("John");
        treeNamesSet.add("Jack");
        treeNamesSet.add("Ann");
        treeNamesSet.add("Bill");

        System.out.println(treeNamesSet);

        Set<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        System.out.println(setA);


        Set<Integer> setB = new HashSet<>();
        setB.add(2);
        setB.add(4);
        setB.add(6);
        setB.add(8);
        System.out.println(setB);

        //intersection
        Set<Integer> intersectSet = new HashSet<>(setA);
        intersectSet.retainAll(setB);
        System.out.println(intersectSet);

        // union
        Set<Integer> unionSet = new HashSet<>(setA);
        unionSet.addAll(setB);
        System.out.println(unionSet);

        //relative compliment
        Set<Integer> differenceSet = new HashSet<>(setA);
        differenceSet.removeAll(setB);
        System.out.println(differenceSet);

        /*
         С помощью множеств реализовать метод, который принимает лист имен и возвращает лист без повторяющихся элементов
         */


    }
}
