import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class HomeworkTest {

    Homework homework = new Homework();

    @Test
    public void testFindSingleNumber_3numbers2different(){
        List<Integer> ints = Arrays.asList(1,3,1);
        assertEquals(3,homework.findSingleNumber(ints));
        assertEquals(3,homework.findSingleNumberMerge(ints));
    }


    @Test
    public void testFindSingleNumber_3numbers3different(){
        List<Integer> ints = Arrays.asList(3,3,3);
        assertEquals(3,homework.findSingleNumber(ints));
        assertEquals(3,homework.findSingleNumberMerge(ints));
    }


    @Test
    public void testFindSingleNumber_5numbers(){
        List<Integer> ints = Arrays.asList(1,1,15,1,1);
        assertEquals(15,homework.findSingleNumber(ints));
        assertEquals(15,homework.findSingleNumberMerge(ints));
    }


    @Test
    public void testFindSingleNumber_9numbers(){
        List<Integer> ints = Arrays.asList(1,8,8,8,8,8,1,2,2);
        assertEquals(8,homework.findSingleNumber(ints));
        assertEquals(8,homework.findSingleNumberMerge(ints));
    }


    @Test
    public void testFindSingleNumber_throwsNoSuchElementException(){
        List<Integer> ints = Arrays.asList(1,8,8,8,8,1,2,2);
        assertThrows(NoSuchElementException.class,() ->
                homework.findSingleNumberMerge(ints));
    }





}