package example.codeclan.com.wordcounterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounterActivity extends AppCompatActivity {

    EditText enteredWord;
    Button getCountButton;
    TextView answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);
//        Log.d(getClass().toString(), "onCreate called");

        enteredWord = findViewById(R.id.word);
        getCountButton = findViewById(R.id.count_button);
        answer = findViewById(R.id.answer);
    }

    public void onCountButtonClick(View button){
        String wordEntered = enteredWord.getText().toString();
        Log.d(getClass().toString(), "The word entered was: " + wordEntered);
        WordCounter wordCounter = new WordCounter(wordEntered);
        answer.setText(wordCounter.wordSize());
    }

    public void onCountWordButtonClick(View button){
        String textEntered = enteredWord.getText().toString();
        Log.d(getClass().toString(), "The word entered was: " + textEntered);
        WordCounter wordCounter = new WordCounter(textEntered);
        answer.setText(wordCounter.getWordMap().toString());

    }
}
