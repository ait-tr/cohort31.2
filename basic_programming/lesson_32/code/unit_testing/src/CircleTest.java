import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    // given____ when___then___
    // givenRadius_whenFindArea_thenReturnArea

    @Test
    public void givenRadius1_whenFindArea_thenReturnArea3_14(){
        double actualArea = Circle.findArea(1d);
       // double expectedArea = 3.14;
        double expectedArea = Math.PI;

        assertEquals(expectedArea,actualArea);
       // assertEquals(actualArea,expectedArea);
    }

    @Test
    public void givenAandB_whenCompare_thenReturnBoolean(){
        assertTrue( Circle.compareNumbers(5,3));
    }

    @Test
    public void givenThreeAndZero_whenCompare_thenReturnTrue(){
        assertTrue(Circle.compareNumbers(0,3));
    }

    @Test
    public void givenThreeLessThanZero_whenResultFalse_thenReturnTrue(){
        assertFalse( 3 < 0);
        assertFalse(Circle.compareNumbers(0,3));
    }



}