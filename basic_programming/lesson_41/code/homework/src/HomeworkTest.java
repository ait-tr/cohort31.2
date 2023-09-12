import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HomeworkTest {

    private Homework homework;

    @BeforeEach
    public void setUp(){
        homework = new Homework();
    }

    @Test
    public void removeDuplicatesOneElement(){
        List<String> actual = Arrays.asList("John");
        List<String> expected = Arrays.asList("John");

        assertEquals(expected,homework.removeDuplicates(actual));
    }

//[Ann, John, Peter, Mary]
    @Test
    public void removeDuplicatesNoDuplicates(){
        List<String> actual = Arrays.asList("John","Peter","Mary","Ann");
        List<String> expected = Arrays.asList("Ann","John","Peter","Mary");


        assertEquals(expected,homework.removeDuplicates(actual));
    }


    @Test
    public void removeDuplicates(){
        List<String> actual = Arrays.asList("John","Peter","Mary","Ann","John","Peter");
        List<String> expected =  Arrays.asList("Ann","John","Peter","Mary");


        assertEquals(expected,homework.removeDuplicates(actual));
    }


    @Test
    public void getDuplicatesOneElement(){
        List<String> actual = Arrays.asList("John");
        List<String> expected = Arrays.asList();

        assertEquals(expected,homework.getDuplicates(actual));
    }


    @Test
    public void getDuplicatesNoDuplicates(){
        List<String> actual = Arrays.asList("John","Ann","Bill");
        List<String> expected = Arrays.asList();

        assertEquals(expected,homework.getDuplicates(actual));
    }


    @Test
    public void getDuplicatesOneDuplicates(){
        List<String> actual = Arrays.asList("John","Ann","Bill","Ann","Bill");
        List<String> expected = Arrays.asList("Ann","Bill");

        assertEquals(expected,homework.getDuplicates(actual));
    }


    @Test
    public void getDuplicatesManyDuplicates(){
        List<String> actual = Arrays.asList("John","Ann","Bill","Ann","Bill","Ann","Ann","Bill");
        List<String> expected = Arrays.asList("Ann","Bill");

        assertEquals(expected,homework.getDuplicates(actual));
    }



}