package example.codeclan.com.wordcounterapp;

import java.util.HashMap;

/**
 * Created by alisonwood29 on 22/01/2018.
 */

public class WordCounter {

    private String text;
    private HashMap<String, Integer> wordCounts;

    public WordCounter(String word){
        this.text = word;
        this.wordCounts = new HashMap<>();
    }


    public String getWord() {
        return this.text;
    }

    public String wordSize() {
        return "Number of letters: " + this.text.length();
    }

    public HashMap<String, Integer> getWordMap(){
        return this.wordCounts;
    }

    public void splitText(String text){
        String[] words = text.split("\\s");
    }

//    public void incrementWordCount(String text){
//        String word = text.split();
//        Integer wordCount = wordCounts.get(word);
//    }
}
