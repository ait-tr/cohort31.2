import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String,Product> productsByName = new HashMap<>();

        Product computer = new Product("Computer"," Computer can calculate fast");
        Product tv = new Product("TV","TV can show shows");
        Product printer = new Product("Printer","a printer can print something");

        productsByName.put(computer.getName(), computer);
        productsByName.put(tv.getName(),tv);
        productsByName.put(printer.getName(),printer);

        System.out.println(productsByName);

        Product product = productsByName.get("Printer");
        System.out.println(product);
        System.out.println(productsByName.get("Mouse"));

        Product mouse = new Product("Mouse","This is a mouse");
        productsByName.put("Printer",mouse);

        System.out.println(productsByName);

        productsByName.remove("Printer");
        System.out.println(productsByName);

        System.out.println(productsByName.containsKey("Printer"));
        System.out.println(productsByName.containsValue(computer));


        System.out.println(productsByName.keySet());


        System.out.println("Print by keySet");
        // Перебор элементов  в мапе
            for( String key : productsByName.keySet()){
                Product p = productsByName.get(key);
                System.out.println(key+":"+p);
            }

        System.out.println("Print with entrySet");
            for( Map.Entry<String,Product> entry : productsByName.entrySet()){
                String key = entry.getKey();
                Product p = entry.getValue();
                System.out.println(key+":"+p);

            //  получить список значений  метод values()
           List<Product> products = new ArrayList<>(productsByName.values());
                System.out.println(products);

            }

            //  print with forEach()
        System.out.println("Print with forEach method");
            productsByName.forEach((key,value) -> System.out.println(key + ":"+value));


            // getOrDefault() - если ключ есть, возвращается значение а если нет то возвращается дефолтное значение

            Product car = new Product("Car","can drive");

            // with get method
        System.out.println(productsByName.containsKey("Computer1") ? productsByName.get("Computer"): car);

        // with getOrDefault()
        System.out.println("With getOrDefault()");
        System.out.println(productsByName.getOrDefault("Car",car));

        // using Product as key

        Map<Product,Integer> priceByProduct = new HashMap<>();
        priceByProduct.put(computer,1000);
        priceByProduct.put(tv,600);
        priceByProduct.put(printer,200);

        System.out.println(priceByProduct);




    }
}
