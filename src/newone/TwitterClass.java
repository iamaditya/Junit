package newone;

import org.junit.*;
import static org.junit.Assert.*;

public class TwitterClass {
    static boolean tweet = false;
    static int total_tweet = 6;

    @Test
    public void tweeted(){
        assertFalse(tweet);
    }
    @Test
    public void tweet_count(){
        assertEquals(6, total_tweet);
    }



    @Test
    public void newTweet(){
        TwitterClass.tweet = true;
        assertTrue(tweet);
    }
}
