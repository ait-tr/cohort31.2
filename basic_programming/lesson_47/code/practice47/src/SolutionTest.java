import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution sol = new Solution();

    @Test
    public void test1(){
        char[] brackets = { '{','}','(','[',']',')'};
        assertTrue(sol.areBracketsCorrect(brackets));
    }

//{}([]{()})
    @Test
    public void test2(){
        char[] brackets = { '{','}','(','[',']','{','(',')','}',')'}; // {}([]{()})
        assertTrue(sol.areBracketsCorrect(brackets));
    }


    @Test
    public void test3(){
        char[] brackets = { '{','(',']'}; // {(]
        assertFalse(sol.areBracketsCorrect(brackets));
    }

    @Test
    public void test4(){
        char[] brackets = { '{','}','(','[',']',')','}'};// {}([])}
        assertFalse(sol.areBracketsCorrect(brackets));
    }


    @Test
    public void test5(){
        char[] brackets = { '{','}','(','[',']',')','('};// {}([])}
        assertFalse(sol.areBracketsCorrect(brackets));
    }


    @Test
    public void test6(){
        char[] brackets = { '{','(','}',')'};//  {(})
        assertFalse(sol.areBracketsCorrect(brackets));
    }

    @Test
    public void test7(){
        char[] brackets = {'}','}'};//  {(})
        assertFalse(sol.areBracketsCorrect(brackets));
    }

    @Test
    public void test8(){
        char[] brackets = {'{','}','}',')'};//  {(})
        assertFalse(sol.areBracketsCorrect(brackets));
    }

    @Test
    public void test9(){
        char[] brackets = {'{','{'};//  {(})
        assertFalse(sol.areBracketsCorrect(brackets));
    }




}