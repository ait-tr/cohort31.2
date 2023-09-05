import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    /*
    Collections

    List and ArrayList -  список, в основе своей имеющий массив и количество элементов
    в листе не фиксировано.

     Конструкторы ArrayList:
     ArrayList() -  создает пустой лист
     ArrayList( Collection collection) - создается лист, в который добавляются
                                        все элемннты коллекции collection
     ArrayList( int capacity) -  список с начальным размером  capacity
     */
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
      //  List<String> names = new ArrayList<>();
        List<Integer> ints = new ArrayList<>();

        // добавление элемента  в конец листа , метод add() возвращает true  в случае если удалось добавить элт
        names.add("John");
        names.add(null);
        System.out.println(names);
        names.add("Bill");
        System.out.println(names);

        // добавление элемента по индексу
        names.add(1,"Mary");
        System.out.println(names);

        names.add(3,"Jack");
        System.out.println(names);

        System.out.println("printing listCapacity");
        List<String> listCapacity = new ArrayList<>(20);
        System.out.println(listCapacity);

        // метод для определения размера листа size()
        System.out.println("names list size is " + names.size());
        System.out.println("listCapacity size is " + listCapacity.size());

        //[John, Mary, Bill, Jack]
        //  изменить элемент - метод set()
        names.set(2,"Ann");
        System.out.println(names);



        List<Integer> numbers = new ArrayList<>(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(12);
        numbers.add(17);
        System.out.println("numbers capacity size "+ numbers);



        // получение элемента по индексу- метод get()
        System.out.println(names.add("Kate"));
        System.out.println("names 0 pos is " + names.get(0));
        System.out.println("names 1 pos is " + names.get(1));
        System.out.println("names 2 pos is " + names.get(2));
        System.out.println("names 3 pos is " + names.get(3));
        System.out.println("at the last position " + names.get(names.size() -1));
        System.out.println(names);

        //  удаление элемента метод remove(Object o) - удаление по названию
        names.remove("Bill");
        System.out.println("Bill removed");
        System.out.println(names);

        // удаление по индексу Object remove ( int index)  удаление по индексу
        System.out.println("who is removed? " +  names.remove(0));
        System.out.println(names);

        System.out.println(numbers);
        numbers.remove(1);
       // System.out.println(numbers);
        numbers.remove(Integer.valueOf(1));
        System.out.println(numbers);

        //int  indexOf(Object o) -  возвращает индекс элемента
        int position = names.indexOf("Ann");
        System.out.println(position);

        // boolean contains(Object o) - проверяет содержит ли лист данный элемент
        System.out.println(names.contains("Jack"));
        System.out.println(names.contains("Bill"));

        System.out.println(names);

        //  сортировка коллекций
        Collections.sort(names);
        System.out.println(names);


        System.out.println("For Loop");
        for( int i = 0; i< names.size(); i++){
            System.out.println(names.get(i));
        }

        System.out.println("Enhanced For");
        for( String name : names){
            System.out.println(name);

           // names.remove(0);
          //  names.remove("Ann");
        }

        // Итератор
        /*
        Iterator - один из методов интерфейса Collection.  Он возвращает обьект, реализующий интерфейс Iterator
         методы интерфейса итератор:
        E next() - возращает следующий элемент коллекции
        boolean hasNext() -  проверяет не достигнут ли конец коллекции
        remove() -  удаляет текущий элемент ( полученный последним вызовом next()
         */
        System.out.println("With iterator");
      Iterator<String> ourIterator = names.iterator();

      while (ourIterator.hasNext()){
         if(ourIterator.next().equals("Ann"))
             ourIterator.remove();
         // System.out.println(ourIterator.next());
      }
        System.out.println(names);

    }

}
