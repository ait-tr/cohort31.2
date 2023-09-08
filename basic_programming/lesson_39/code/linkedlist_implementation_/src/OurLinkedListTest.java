import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OurLinkedListTest {

    private OurLinkedList<Integer> list;

    @BeforeEach
    public void init(){
        list = new OurLinkedList<>();
    }

    @Test
    public void testAppendGet_emptyList_addsOneElement(){
        list.append(5);

        assertEquals(5,list.get(0));
    }


    @Test
    public void testAppendGet_emptyList_addsSeveralElement(){

        Integer[] expected = {2,3,-1,4,23,1,3,4,5,6,-17,22,26,65,15,21};
        for( int i = 0; i < expected.length; i++) {
            list.append(expected[i]);
        }

        for( int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], list.get(i));
        }
    }

    @Test
    public void testSize_emptyList_appendsOneElement(){
        list.append(5);

        assertEquals(1, list.size());
    }


    @Test
    public void testSize_emptyList_addsSeveralElement(){

        Integer[] expected = {2,3,-1,4,23,1,3,4,5,6,-17,22,26,65,15,21};
        for( int i = 0; i < expected.length; i++) {
            list.append(expected[i]);
        }

        assertEquals(expected.length, list.size());

    }


    @Test
    public void testSet_oneElement_swapsElement(){
        list.append(0);
        list.set(10,0);

        assertEquals(10,list.get(0));
    }

    @Test
    public void testSet_severalElements_swapsFirstLastMiddleElts(){
        Integer[] source = {1,4,-17,18,6};

        for( int i = 0; i < source.length; i++){
            list.append(source[i]);
        }

        list.set(10,0);
        list.set(100,4);
        list.set(-1000,2);

        Integer[] expected = {10,4,-1000,18,100};

        for( int i = 0; i < expected.length; i++){
            assertEquals(expected[i],list.get(i));
        }
    }

    @Test
    public void testRemoveById_nonEmptyList_removesFirstElt(){
        list.append(5);
        list.append(15);
        list.append(2);
        list.append(17);
        list.append(23);

        Integer val = list.removeById(0);
        assertEquals(5, val);

        Integer[] expected = {15,2,17,23};
        for( int i = 0; i < expected.length; i++){
            assertEquals(expected[i],list.get(i));
        }

        assertEquals(4,list.size());
    }

    @Test
    public void testRemoveById_nonEmptyList_removesMiddleElt(){
        list.append(5);
        list.append(15);
        list.append(2);
        list.append(17);
        list.append(23);

        Integer val = list.removeById(2);
        assertEquals(2, val);

        Integer[] expected = {5,15,17,23};
        for( int i = 0; i < expected.length; i++){
            assertEquals(expected[i],list.get(i));
        }

        assertEquals(4,list.size());
    }



    @Test
    public void testRemoveById_nonEmptyList_removesLastElt(){
        list.append(5);
        list.append(15);
        list.append(2);
        list.append(17);
        list.append(23);

        Integer val = list.removeById(4);
        assertEquals(23, val);

        Integer[] expected = {5,15,2,17};
        for( int i = 0; i < expected.length; i++){
            assertEquals(expected[i],list.get(i));
        }

        assertEquals(4,list.size());
    }


    @Test
    public void testRemove_nonEmptyList_removesLastElt(){
        list.append(5);
        list.append(15);
        list.append(2);
        list.append(17);
        list.append(23);

        boolean removed = list.remove(23);
        assertTrue(removed);

        Integer[] expected = {5,15,2,17};
        for( int i = 0; i < expected.length; i++){
            assertEquals(expected[i],list.get(i));
        }

        assertEquals(4,list.size());
    }


    @Test
    public void testRemove_nonEmptyList_removesMiddleElt(){
        list.append(5);
        list.append(15);
        list.append(2);
        list.append(17);
        list.append(23);

        boolean removed = list.remove(2);
        assertTrue(removed);

        Integer[] expected = {5,15,17,23};
        for( int i = 0; i < expected.length; i++){
            assertEquals(expected[i],list.get(i));
        }

        assertEquals(4,list.size());
    }


    @Test
    public void testContains_nonEmptyList_containsElts(){
        list.append(5);
        list.append(15);
        list.append(2);
        list.append(17);
        list.append(23);

       assertTrue(list.contains(5));
       assertTrue(list.contains(17));
       assertTrue(list.contains(23));
    }


    @Test
    public void testContains_nonEmptyList_notContainsElts(){
        list.append(5);
        list.append(15);
        list.append(2);
        list.append(17);
        list.append(23);

        assertFalse(list.contains(1));
        assertFalse(list.contains(16));
        assertFalse(list.contains(22));
    }





}