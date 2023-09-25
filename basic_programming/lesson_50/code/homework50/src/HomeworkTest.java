import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HomeworkTest {

    public Homework homework;
    List<Integer> test;

    @BeforeEach
    public void setUp(){
        homework = new Homework();
        test = Arrays.asList(1,2,3,5);
    }

    @Test
    public void simpleTest_true(){
        assertTrue(homework.findProduct(test,6));
        assertTrue(homework.findProductDeque(test,6));
    }


    @Test
    public void simpleTest_false(){
        assertFalse(homework.findProduct(test,7));
        assertFalse(homework.findProductDeque(test,7));
    }


    @Test
    public void simpleTest_one(){
        assertFalse(homework.findProduct(Arrays.asList(3),7));
        assertFalse(homework.findProductDeque(Arrays.asList(3),7));
    }


    @Test
    public void simpleTest_less(){
        assertFalse(homework.findProduct(Arrays.asList(9,10,29),7));
        assertFalse(homework.findProductDeque(Arrays.asList(9,10,29),7));
    }

    // {2,5,18,70}, 36 -> true


    @Test
    public void simpleTest_trueOtherList(){
        test = Arrays.asList(2,5,18,70);
        assertTrue(homework.findProduct(test,36));
        assertTrue(homework.findProductDeque(test,36));
    }

    @Test
    public void simpleTest_falseOtherList(){
        test = Arrays.asList(2,5,18,70);
        assertFalse(homework.findProduct(test,40));
        assertFalse(homework.findProductDeque(test,40));
    }



}