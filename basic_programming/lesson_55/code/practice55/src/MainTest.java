import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testSum(){
        assertEquals(15,Main.findSum("inputInt.txt"));
    }

    @Test
    public void testLongest(){
        File fileName = new File("input.txt");
        assertEquals("bbbbbbbbbb",Main.findLongestLine(fileName));
    }

}