public class Dog extends Animal{

    // дочерние классы должны обязательно реализовывать абстрактные методы родительского класса

    public void sound(){
        System.out.println(" a dog woofs");
    }

    public void move(){
        System.out.println("a dog can run");
    }
}
