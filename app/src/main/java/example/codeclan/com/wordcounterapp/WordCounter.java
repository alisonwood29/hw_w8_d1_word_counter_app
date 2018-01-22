package example.codeclan.com.wordcounterapp;

import java.util.HashMap;

/**
 * Created by alisonwood29 on 22/01/2018.
 */

public class WordCounter {

    private String text;
    private HashMap<String, Integer> wordCounts;

    public WordCounter(String text){
        this.text = text;
        this.wordCounts = new HashMap<>();
    }


    public String getText() {
        return this.text;
    }

    public String wordSize() {
        return "Number of letters: " + this.text.length();
    }

    public HashMap<String, Integer> getWordMap(){
        incrementWordCount();
        return this.wordCounts;
    }

    public String[] splitText(){
        String[] words = this.text.split("\\s");
        return words;
    }

    public void incrementWordCount(){
        for(String word: splitText()){
            Integer wordCount = wordCounts.get(word);
            if (wordCount == null) {
                wordCount = 0;
            }
                wordCounts.put(word, wordCount + 1);

        }

    }
}
