package newone;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstagramClass {
    static String username, password;
    static boolean running = false;
    public InstagramClass(){
            username = "iamaditya.jpeg";
            password = "randomtext";
    }

    public static void start(){
        running = true;
    }


    @Test
    public void firstTimeRun(){
        assertFalse(running);
    }

    @Test
    public void secondTimeRun(){
        InstagramClass.start();
        assertTrue(running);
    }


    @Test
    public void checkUsername(){
        assertEquals("iamaditya.jpeg",username);
        assertEquals("randomtext",password);
    }
    @Test
    public void checkUsernameWrong(){
        InstagramClass.username = "wrong username";
        InstagramClass.password = "wrong username";
        boolean checkusr = false;
        if(InstagramClass.username == "iamaditya.jpeg" && InstagramClass.password == "randomtext"){
            checkusr = true;
        }

        assertFalse(checkusr);
    }
}
