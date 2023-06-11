package aditya;

import org.junit.*;
import static org.junit.Assert.*;

public class StringTest {
    String name;
    public StringTest(){
    name = "aditya";
    }

    @Test
    public void checkName(){
    assertEquals("aditya",name);
    }

    @Test
    public void checkGreet(){
        String result = "Hi! "+ name;
        assertEquals("Hi! aditya", result);
    }
}
