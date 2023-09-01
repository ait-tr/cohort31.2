import java.util.Arrays;

public class AnimalMain {
    /*
    Создать класс Animal c полями name, weight, color.
    Используя компараторы вывести на экран список животных, упорядоченный по:
    1. имени
    2. по весу
    3. список имен животных, упорядоченный по возрастанию последней буквы имени

    Wolf, Bear, Fox, Elephant, Anakonda

    для 1 пункта:
    name Anakonda , weight 500, color yellow
    ---------
    -------

    для 3 пункта:
    Anakonda
    Wolf
    Bear
    Elephant
    Fox

    Протестировать правильность работы компараторов
     */
    public static void main(String[] args) {
        Animal animal1 =new Animal ("Wolf",100, "grey");
        Animal animal2 =new Animal ("Elephant",1000, "white");
        Animal animal3 =new Animal ("Bear",500, "brown");
        Animal animal4 =new Animal ("Fox",20, "red");
        Animal animal5 =new Animal ("Anakonda",200, "yellow");

        Animal[] animals = {animal1,animal2,animal3,animal4,animal5};

        for(Animal animal: animals){
            System.out.println(animal);
        }

        System.out.println("----------------By name----------------------------");
        Arrays.sort(animals, new ComparatorByName());
        for(Animal animal: animals){
            System.out.println(animal);
        }

        System.out.println("------------------By weight------------------------");
        Arrays.sort(animals,new ComparatorByWeight());
        for(Animal animal: animals){
            System.out.println(animal);
        }

        System.out.println("-------------------- Names by las letter------------------");
        Arrays.sort(animals, new ComparatorByLastLetter());
        for(Animal animal: animals){
            System.out.println(animal.getName());
        }
    }
}
