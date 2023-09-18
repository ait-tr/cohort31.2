import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class MapExercisesTest {

    private MapExercises mapExercises;
    List<String> actual;

    @BeforeEach
    public void init(){

        mapExercises = new MapExercises();
        actual = new ArrayList<>();
        actual.add("mary");
        actual.add("john");
        actual.add("mayr");
        actual.add("ohjn");
        actual.add("njoh");
        actual.add("mike");

    }

    @Test
    public void stringBooleanTestSeveral(){
        String[] words = new String[]{"a", "b", "a","c", "b"};
        Map<String,Boolean> expected = new HashMap<>();
        expected.put("a",true);
        expected.put("b",true);
        expected.put("c",false);

        assertEquals(expected,mapExercises.findTrueFalse1(words));
        assertEquals(expected,mapExercises.findTrueFalse2(words));
    }

    @Test
    public void stringBooleanTestSame(){
        String[] words = new String[]{"c", "c", "c","c"};
        Map<String,Boolean> expected = new HashMap<>();

        expected.put("c",true);

        assertEquals(expected,mapExercises.findTrueFalse1(words));
        assertEquals(expected,mapExercises.findTrueFalse2(words));
    }


    @Test
    public void stringBooleanTestAllFalse(){
        String[] words = new String[]{"a", "b", "c"};
        Map<String,Boolean> expected = new HashMap<>();
        expected.put("a",false);
        expected.put("b",false);
        expected.put("c",false);

        assertEquals(expected,mapExercises.findTrueFalse1(words));
        assertEquals(expected,mapExercises.findTrueFalse2(words));
    }

    @Test
    public void nameToNumberTest_2(){
        List<String> input = Arrays.asList("John","Mary","Peter","John");

        assertEquals(2,mapExercises.nameToNumberOccurence(input,"John"));
    }


    @Test
    public void nameToNumberTest_1(){
        List<String> input = Arrays.asList("John","Mary","Peter","John");

        assertEquals(1,mapExercises.nameToNumberOccurence(input,"Peter"));
    }


    @Test
    public void nameToNumberTest_0(){
        List<String> input = Arrays.asList("John","Mary","Peter","John");

        assertEquals(0,mapExercises.nameToNumberOccurence(input,"Bill"));
    }

    @Test
    public void nameToNumberTest_onlyTwoJohns(){
        List<String> input = Arrays.asList("John","John");

        assertEquals(2,mapExercises.nameToNumberOccurence(input,"John"));
    }

    @Test
    public void testAnagram_noSushAnagram(){
        assertEquals(List.of(), mapExercises.findAnagrams("rob",actual));
    }

    @Test
    public void testAnagram_findJohn(){
        List<String> expected = new ArrayList<>();
        expected.add("john");
        expected.add("ohjn");
        expected.add("njoh");

        assertEquals(expected, mapExercises.findAnagrams("john",actual));

    }

    @Test
    public void testAnagram_onlyName(){
        List<String> expected = new ArrayList<>();
        expected.add("mike");


        assertEquals(expected, mapExercises.findAnagrams("mike",actual));

    }



}