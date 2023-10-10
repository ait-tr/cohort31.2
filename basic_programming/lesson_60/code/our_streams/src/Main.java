import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // flatMap()

        String[] strings = {"Hello","Java"};

        Arrays.stream(strings)
                .map(str -> str.split(""))
                .map(Arrays::stream)
                .forEach(System.out::println);


        Arrays.stream(strings)
                .map(str -> str.split(""))
                .flatMap(Arrays::stream)
                .forEach(System.out::println);

        // distinct() - возвращает только уникальные элементы

        Stream.of("one","two","three","one","two")
                .distinct()
                .forEach(System.out::println);


        // skip( long n) - пропускает  первые n  элементов
        // limit(long n) -  возвращает поток в котором не более n  первых элементов

        System.out.println();
        System.out.println("skip and limit");
        System.out.println();
        List<String> arr = Arrays.asList("one","two","three","four","five");
        arr.stream()
              //  .skip(10)
                .limit(30)
                .forEach(System.out::println);

        // terminal operators   Операции сведения ( терминальные)-
        /*
        операции, возвращающие результат

        count() -  возвращает количество элементов в потоке

         */
        System.out.println(arr.stream()
                .filter(s ->s.length()>3)
                .count());

        // findFirst(), findAny()
      Optional<String> first = arr.stream().findFirst();
        System.out.println(first.get());

        Optional<String> any = arr.stream().findAny();
        System.out.println(any.get());;

        // boolean allMatch(),anyMatch(), noneMatch()
        /*
        allMatch(predicate) - true , если все элементы удовлетворяют условию предикаты
        anyMatch(predicate) - true , если хотя бы один лемент удовлетворяет условию предикаты
        noneMatch(predicate) - true , если ни один  элемент не  удовлетворяет условию предикаты
         */

        List<String> names = Arrays.asList("Jack","John","Ann","Benjamin");
       boolean allElements = names.stream().allMatch(s -> s.length() > 2);
        System.out.println(allElements);

        boolean anyElement = names.stream().anyMatch(s -> s.length() >6);
        System.out.println(anyElement);

        boolean noneElt = names.stream().noneMatch(s -> s.equals("Kate"));
        System.out.println(noneElt);


        // min()  и max() -  возвращают минимальное или макс. значение
        /*
        Optional<T> min (T comparator)
         */

        List<Integer> ints = Arrays.asList(1,2,34,5,60,21);

      Optional<Integer> minElt =  ints.stream().min(Integer::compare);
        System.out.println(minElt.get());

      Optional<Integer> maxElt = ints.stream().max(Integer::compare);
        System.out.println(maxElt.get());

      // reduce()
      Optional<Integer> res =  Stream.of(1,2,3,4,5).reduce((a,b)->a * b);
        System.out.println(res.get());

      Optional<String> strRes = Stream.of("Hello","Java","!").reduce((str1,str2) ->str1 +" "+str2);
        System.out.println(strRes.get());
        // el1 * el2 * el3 * el4


        // reduce() -2

        int result =Stream.of(1,2,3,4,5).reduce(2,(a,b)-> a * b);
        System.out.println(result);


        List<Integer>emptyList = new ArrayList<>();
      Optional<Integer>minElement =  emptyList.stream().min(Integer::compare);
      if(minElement.isPresent())
          minElement.get();

        System.out.println(minElement.orElse(-1));

        Random random = new Random();

        System.out.println(minElement.orElseGet(()->random.nextInt(10)));

        minElement.ifPresent(System.out::println);
        minElement.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Empty!")
        );

        //  метод collect(collector)
       // Collector<T,A,R> collector

        //  некоторые методы класса Collectors
        /*
        toList() -  собирает в лист
        toSet()
        toMap()
         */

        List<String> cars = new ArrayList<>();
        cars.add("Mercedes");
        cars.add("Volvo");
        cars.add("Opel");
        cars.add("Ford");
        cars.add("BMW");

      List<String> carsFiltered =  cars.stream()
              .filter(car -> car.length() > 3)
              .collect(Collectors.toList());

        System.out.println(carsFiltered);

        Set<String> carsSet = cars.stream()
                .filter(car -> car.length() > 3)
                .collect(Collectors.toSet());


        Car car1 = new Car("Mercedes",100000);
        Car car2 = new Car("BMW",150000);
        Car car3 = new Car("Ford",30000);

        List<Car> carList = Arrays.asList(car1,car2,car3);

        Map<String,Integer> carMap = carList.stream()
                .collect(Collectors.toMap(Car::getBrand,Car::getPrice));

        System.out.println(carMap);

        carMap.forEach((key,value)-> System.out.println("key: " +key +" ,value: "+ value));


      ArrayList<Car> resCars = carList.stream().collect(Collectors.toCollection(ArrayList::new));

        System.out.println("----groupingBy------");
        List<String> namesList = Arrays.asList("John","Jack","Ann","Bill","Peter","Eugen");
        System.out.println(namesByLength(namesList));

        System.out.println("----partitioningBy-----");
        System.out.println(partitioningList(namesList));
    }

    // groupingBy collector -  используется для группировки обьектов по заданному свойству и сохранения
    // результата  в мапе. Например:
    /*
    написать метод , группирующий элементы  листа строк в зависимости от длины строки и сохраняющий  результаты
    в сетах. Метод возвращает мапу

     */
    public  static Map<Integer,Set<String>>  namesByLength(List<String>list){
        return list.stream()
                .collect(Collectors.groupingBy(String::length,Collectors.toSet()));
    }

    /*
    partitioningBy -  особый случай метода groupingBy,  принимающий предикату и собирающий элементы стрима в мапу
    в которой в качестве ключей будут булеановские значения а в качестве значений - коллекции элементов.
    ключ true -  коллекция элементов, удовлетворяющих условию предикаты,
    false -  не удовлетворяющих

    Пример: написать метод, разделяющий элементы листа стрингов  по длине строки > 4  и возвращающий
     мапу с ключами true false   и листами соответствующих элементов
     */
    public  static Map<Boolean,List<String>> partitioningList( List<String>list){
        return list.stream().
                collect(Collectors.partitioningBy(s -> s.length() > 4));
    }




}
