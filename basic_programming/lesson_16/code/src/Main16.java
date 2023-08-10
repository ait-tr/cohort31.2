public class Main16 {

    public static void main(String[] args) {


        Cat2 cat = new Cat2();


        cat.sayMeow();
        System.out.println(cat.age);
        cat.running();

        Cat2 cat1 = new Cat2(5);
        System.out.println(cat1.age);
        System.out.println(cat1.name);

        System.out.println("==================");

        Cat2 cat2 = new Cat2(3, "Max");
        cat2.sayMeow();
        cat2.running();
        System.out.println("Cat name: " + cat2.name);
        System.out.println("Cat age: " + cat2.age);

        System.out.println("===================");

        Cat2 catBoris = new Cat2(5, "Boris", "red");

        catBoris.sleep();
        System.out.println("Cat name: " + catBoris.name);
        System.out.println("Cat age: " + catBoris.age);
        System.out.println("Cat color: " + catBoris.color);

    }
}
