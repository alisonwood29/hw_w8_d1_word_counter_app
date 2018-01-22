package example.codeclan.com.wordcounterapp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alisonwood29 on 22/01/2018.
 */

public class WordCounterTest {

    WordCounter wordCounter;

    @Before
    public void before(){
        wordCounter = new WordCounter("hello");
    }

    @Test
    public void canGetWord(){
        assertEquals("hello", wordCounter.getWord());
    }

    @Test
    public void canGetWordSize(){
        assertEquals("Number of letters: 5", wordCounter.wordSize());
    }
}
