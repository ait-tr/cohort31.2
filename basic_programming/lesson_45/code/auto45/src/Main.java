import java.util.*;

public class Main {

     public static void main(String[] args) {

          Auto auto1 = new Auto("Volvo","c60",10);
          Auto auto2 = new Auto("Mercedes","amers",40000);
          Auto auto3 = new Auto("Volvo","a60",5000);
          Auto auto4 = new Auto("Volvo","a60",1000);
          Auto auto5 = new Auto("Mercedes","bmers",39000);
          Auto auto6 = new Auto("Mercedes","bmers",1000000);
          Auto auto7 = new Auto("BMW","X5",100000);

          List<Auto>autos = new ArrayList<>();
          autos.add(auto1);
          autos.add(auto2);
          autos.add(auto3);
          autos.add(auto4);
          autos.add(auto5);
          autos.add(auto6);
          autos.add(auto7);

          Main m = new Main();
          System.out.println(m.arrangeAutoByMake(autos));
     }
     /*
    Есть класс автомобиль, в котором есть три поля: Марка, Модель, Цена. Написать метод, который принимает
    лист автомобилей, а возвращает TreeMap,  ключами которого являются марки автомобилей, а значениями TreeSet
    автомобилей, в котором автомобили расположены в лексикографическом порядке относительно модели, причем дешевые вперед если
    модели одинаковые.
    public Map<String, Set<Auto>> autoByMake( List<Auto> autos)


    BMW
    make BMW
    model BMWModel1
    price 100 000

    make BMW
    model BMWModel2
    price 150 000

    BMW = [ {make = BMW, model = BMWModel1, price 100000},{make = BMW, model = BMWModel2, price 100000}]

    Map<

     */
     public Map<String, Set<Auto>> arrangeAutoByMake(List<Auto> autos){
          Map<String,Set<Auto>>autoByMake = new TreeMap<>();

          for(Auto auto : autos){
               if( autoByMake.containsKey(auto.make)){
               Set<Auto> value = autoByMake.get(auto.make);
               value.add(auto);
               autoByMake.put(auto.make,value);

               }
               else {
                    Set<Auto>value = new TreeSet<>();
                    value.add(auto);
                    autoByMake.put(auto.make, value);
               }
          }
          return autoByMake;
     }
}
