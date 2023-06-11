package aditya;

import org.junit.*;
import static org.junit.Assert.*;

public class MathTest {
    int a,b;
    public MathTest(){
        a = 2;
        b = 3;
    }

    @Test
    public void checkAdd(){
        int result = a+b;
        assertEquals(5,result);
    }
    @Test
    public void checkMulti(){
        int result = a* b;
        assertEquals(6,result);
    }
}
