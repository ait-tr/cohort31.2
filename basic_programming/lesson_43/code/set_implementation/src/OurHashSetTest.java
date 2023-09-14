import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OurHashSetTest {

    @Test
    public void size_returnsNumberOfElementsInSet(){
        OurSet<Integer> ourSet = new OurHashSet<>();
        ourSet.add(1);
        ourSet.add(6);
        ourSet.add(1);
        ourSet.add(6);
        ourSet.add(4);

        assertEquals(3, ourSet.size());
    }

    @Test
    public void add_returnsTrueForNewElt(){
        OurSet<Integer> set = new OurHashSet<>();
        boolean result = set.add(1);
        assertTrue(result);
    }

    @Test
    public void add_returnsFalseForExistingElt(){
        OurSet<Integer> set = new OurHashSet<>();
        set.add(1);
        boolean result = set.add(1);
        assertFalse(result);
    }


    @Test
    public void remove_returnsTrueForExistingElt(){
        OurSet<Integer> set = new OurHashSet<>();
        set.add(1);
        boolean result = set.remove(1);
        assertTrue(result);
    }


    @Test
    public void remove_returnsFalseForNonExistingElt(){
        OurSet<Integer> set = new OurHashSet<>();
        set.add(1);
        boolean result = set.remove(2);
        assertFalse(result);
    }




    @Test
    public void contains_returnsTrueForExistingElt(){
        OurSet<Integer> set = new OurHashSet<>();
        set.add(1);
        boolean contains = set.contains(1);
        assertTrue(contains);
    }


    @Test
    public void contains_returnsFalseForNonExistingElt(){
        OurSet<Integer> set = new OurHashSet<>();
        set.add(1);
        boolean contains = set.contains(2);
        assertFalse(contains);
    }

}