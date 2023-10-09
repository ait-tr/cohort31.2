import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Transformer1Test {


    String input = "aaa BBBB deF vbghR bbb";

    @Test
    public void test_transformNullLength(){
        String zero = "";
        assertEquals(zero,Transformer1.transformString1(zero,new WordsTransformerUpperCase()));
    }


    @Test
    public void test_transformLowerCase(){
        String expected = "aaa bbbb deF vbghR bbb";
        assertEquals(expected,Transformer1.transformString1(input,new WordsTransformerLowerCase()));
    }


    @Test
    public void test_transformUpperCase(){
        String expected = "AAA BBBB DEF vbghR BBB";
        assertEquals(expected,Transformer1.transformString1(input,new WordsTransformerUpperCase()));
    }

    @Test
    public void test_transformStar(){
        String expected = "aaa BBBB deF ***** bbb";
        assertEquals(expected,Transformer1.transformString1(input,new WordTransformerStar()));

    }


    @Test
    public void test_transformNoChange(){
        String expected = "aaa BBBB deF vbghRfghh bbb";
        assertEquals(expected,Transformer1.transformString1(expected,new WordTransformerStar()));
    }

}