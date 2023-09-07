import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HomeworkTest {


    Homework homework;

    @BeforeEach
    public void setUp() {
        homework = new Homework();
    }

    @Test
    public void shortestOrLongestTest_oneElement() {
        assertEquals("a", homework.findShortesrOrLongest(Arrays.asList("a")));
    }


    @Test
    public void shortestOrLongestTest_shortFirst() {
        assertEquals("a", homework.findShortesrOrLongest(Arrays.asList("bb", "a", "ddd")));
    }

    @Test
    public void shortestOrLongestTest_longFirst() {
        assertEquals("aaa", homework.findShortesrOrLongest(Arrays.asList("bb", "aaa", "d")));
    }

}