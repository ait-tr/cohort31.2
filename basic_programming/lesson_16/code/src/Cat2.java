public class Cat2 {
    String name;
    String color;
    int age;

    public Cat2(int age) {
        this.age = age;
    }

    public Cat2(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Cat2(int catAge, String catName, String catColor){
        this.age = catAge;
        this.name = catName;
        this.color = catColor;
    }

    public Cat2() {
    }

    void sayMeow() {
        System.out.println("Meow!!!");
    }

    void sleep() {
        System.out.println("I am sleeping");
    }

    void running() {
        System.out.println("I am running!!");
    }
}
