package animals;

public class Cat extends Animal {

    @Override
    public void voice() {
        System.out.println("Meow!");
    }

    public void eat() {
        System.out.println("I am eating");
    }
}
