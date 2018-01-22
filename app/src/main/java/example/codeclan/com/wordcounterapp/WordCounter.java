package example.codeclan.com.wordcounterapp;

/**
 * Created by alisonwood29 on 22/01/2018.
 */

public class WordCounter {

    private String word;

    public WordCounter(String word){
        this.word = word;
    }


    public String getWord() {
        return this.word;
    }

    public String wordSize() {
        return "Number of letters: " + this.word.length();
    }
}
