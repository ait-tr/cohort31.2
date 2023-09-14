import java.util.Map;

public class MapExercises {

    /*
    1.Дана Map<String,String> map. Написать метод, который вернет мапу, такую что если в исходной мапе есть ключи
    "a"  и "b" , то нужно создать новый ключ "ab"  и в качестве значения для него должна быть сумм значений ключей
    "a"  и  "b".
    Если нет, ничего в мапе не менять

    Примеры:
    mapAB { "a": "Hi", "b" : "There"} ->  { "a": "Hi",    "ab": "HiThere",    "b" : "There"}
    mapAB { "a": "Hi"} -> { "a": "Hi"}
    mapAB { "b": "THere"} -> { "b": "There"}
     */
    public Map<String,String> ab( Map<String,String>mapAB){

        if(mapAB.containsKey("a") && mapAB.containsKey("b")){
            String abValue = mapAB.get("a").concat(mapAB.get("b"));
            mapAB.put("ab",abValue);
        }
        return mapAB;
    }
    /*
    2* - Дан массив строк ( не пустой). Написать метод, возвращающий мапу Map<String,Boolean>  где
    каждая строка является ключом, а значением является true  если строка в массиве встечается
    больше одного раза и false  если только один раз
    Примеры:
    [a,b,a,c,b]-   a:true  b:true c:false
    [a,b,c]-   a:false  b:false c:false
    [c,c,c]-   c:true
     */
}
