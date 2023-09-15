import java.util.*;

public class MapExercises {

     /*
    Дан массив строк (не пустой). Написать метод, возвращающий мапу Map<String, Boolean>
    где каждая строка является ключом , а значения являются true если строка в массиве встречается больше одного
    раза и false только один раз

    Примеры:
    ["a", "b", "a","c", "b"] - a: true  b : true  c: false
    ["a", "b", "c"] - a: false  b : false  c: false
    ["c", "c", "c"] - c: true
     */

    public Map<String, Boolean> findTrueFalse1(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();

        for (String string : strings) {
            map.put(string, map.containsKey(string));

        }

        return map;
    }


    public Map<String, Boolean> findTrueFalse2(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();

        for (String string : strings) {
            if (map.containsKey(string)) {
                map.put(string, true);
            } else map.put(string, false);

        }

        return map;
    }

    /*
    Пусть есть лист имен, где некоторые имена повторяются. Написать метод, принимающий этот лист и имя и
    возвращающий сколько раз встречается это имя в листе. В решении использовать мапу
    Пример: [John,John, Bill, Ann, Ann] -> 2
     */


    public int nameToNumberOccurence(List<String> names, String name) {
        Map<String, Integer> nameByNumber = new HashMap<>();

        for (String s : names) {
            if (nameByNumber.containsKey(s)) {
                nameByNumber.put(s, nameByNumber.get(s) + 1);
            } else {
                nameByNumber.put(s, 1);
            }
        }
        //  if(nameByNumber.containsKey(name))
        //      return nameByNumber.get(name);

        return nameByNumber.getOrDefault(name, 0);

    }

    /*
    3.Пусть есть лист имен и их анаграмм. Написать метод, принимающий этот лист  и имя, по которому он возвращает список
    всех его анаграмм, включая само имя
    [john, ann, bill, nan, nna, llbi, ohnj],ann -> [ann,nan,nna]
    List<String> findAnagrams( String str, List<String>strings).
    Решение с помощью мапы.

     */

    List<String> findAnagrams(String str, List<String> strings) {

        Map<String, List<String>> anagrams = new HashMap<>();

        for (String s : strings) {
            String sortedKey = sortAnagram(s);

            if (anagrams.containsKey(sortedKey)) {
                List<String> value = anagrams.get(sortedKey);
                value.add(s);
                anagrams.put(sortedKey, value);
            } else {
                List<String> value = new ArrayList<>();
                value.add(s);
                anagrams.put(sortedKey, value);
            }
        }
        return anagrams.getOrDefault(sortAnagram(str), List.of());
    }

    private String sortAnagram(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
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


}
