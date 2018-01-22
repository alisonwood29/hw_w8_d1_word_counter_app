package example.codeclan.com.wordcounterapp;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

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
        assertEquals("hello", wordCounter.getText());
    }

    @Test
    public void canGetWordSize(){
        assertEquals("Number of letters: 5", wordCounter.wordSize());
    }

    @Test
    public void canSplitString(){
        wordCounter = new WordCounter("Hello world");
        String[] words = wordCounter.splitText();
        assertEquals(2, words.length);
    }

    @Test
    public void canIncrementWordCount(){
        wordCounter = new WordCounter("Hello world");
        wordCounter.incrementWordCount();
        HashMap<String, Integer> result = wordCounter.getWordMap();
       int count = result.get("Hello");
        assertEquals(1, count);
    }

    @Test
    public void canIncrementWordCountMoreWords(){
        wordCounter = new WordCounter("Hello Hello Hello");
        wordCounter.incrementWordCount();
        HashMap<String, Integer> result = wordCounter.getWordMap();
        int count = result.get("Hello");
        assertEquals(3, count);
    }
}
