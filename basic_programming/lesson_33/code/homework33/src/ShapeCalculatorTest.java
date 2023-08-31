import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeCalculatorTest {

    private ShapeCalculator shapeCalculator = new ShapeCalculator();


    @Test
    public void zeroShape_test(){
        Shape[] shapes = {};

        assertEquals(0, shapeCalculator.totalSquare(shapes));
    }


    @Test
    public void oneShape_test(){
        Shape[] shapes = {new Rectangle(5,10)};

        assertEquals(50, shapeCalculator.totalSquare(shapes));
    }


    @Test
    public void twoShapes_test(){
        Shape[] shapes = {new Rectangle(5,10), new Circle(10)};

        assertEquals(364, shapeCalculator.totalSquare(shapes));
    }



}