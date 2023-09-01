import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalMainTest {

    Animal animal1 =new Animal ("Wolf",100, "grey");
    Animal animal2 =new Animal ("Elephant",1000, "white");
    Animal animal3 =new Animal ("Bear",500, "brown");
    Animal animal4 =new Animal ("Fox",20, "red");
    Animal animal5 =new Animal ("Anakonda",200, "yellow");

    Animal[] animals = {animal1,animal2,animal3,animal4,animal5};

    @Test
    void testComparatorName(){
        ComparatorByName comparatorByName = new ComparatorByName();

        assertTrue(comparatorByName.compare(animal1,animal2) > 0);
    }

    @Test
    void testComparatorWeight(){
        ComparatorByWeight comparatorByWeight = new ComparatorByWeight();

        assertFalse(comparatorByWeight.compare(animal1,animal2) > 0);
    }

    @Test
    void testComparatorLastLetter(){
        ComparatorByLastLetter comparatorByLastLetter = new ComparatorByLastLetter();

        assertFalse(comparatorByLastLetter.compare(animal1,animal2) > 0);
    }

}