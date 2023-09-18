import java.util.HashMap;

public class Main1 {
    // метод merge()
    /*
    Map hashmap = new HashMap()

    hashmap.merge(key,value,remappingFunction)

    параметры:
    key -  ключ, по которому нужно положить значение value
    value - значение, связанное с ключом key
    remapping function -  третий параметр будет использован если ключ key  уже существует

    Метод просто добавляет значение value  по ключу key  если такого ключа в мапе еще нет. А если есть , то в третьем
    параметре ( remapping function )  определяется какое будет   новое значение value
     */
    public static void main(String[] args) {
        HashMap<String,Integer> prices = new HashMap<>();

        prices.put("Laptop",1000);
        prices.put("TV",500);
        prices.put("Mouse",20);

        System.out.println(prices);

        prices.merge("Mobile",300,(oldValue,newValue)->oldValue+newValue);

        System.out.println(prices);

        prices.merge("Laptop",500,(oldValue,newValue)->oldValue+newValue);
        System.out.println(prices);

        HashMap<String,String> cities = new HashMap<>();
        cities.put("Berlin","Germany");
        cities.put("London","England");
        cities.put("Paris","France");
        System.out.println("Capitals: ");
        System.out.println(cities);

        cities.merge("London","GreatBritain",(oldValue,newValue)->oldValue + "/" + newValue);
        cities.merge("Rome","Italy",(oldValue,newValue)->oldValue + "/" + newValue);

        System.out.println("cities changed:");
        System.out.println(cities);

        HashMap<String,Integer> prices1 = new HashMap<>();
        prices1.put("Notebook",500);
        prices1.put("Scanner",350);

        HashMap<String,Integer>prices2 = new HashMap<>();
        prices2.put("TV",700);
        prices2.put("Scanner",310);

        prices2.forEach((key,value)->prices1.merge(key,value,(oldValue,newValue)->{

            if(oldValue < newValue){
                return oldValue;
            }
            else {
                return newValue;
            }
        }));

        System.out.println("Merged map");
        prices1.forEach((key,value)-> System.out.println("key: " + key + " value: " + value));


    }


}
