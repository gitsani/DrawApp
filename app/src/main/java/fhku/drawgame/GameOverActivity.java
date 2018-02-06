package fhku.drawgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Melanie on 23.01.2018.
 */

public class GameOverActivity extends AppCompatActivity implements View.OnClickListener {

    private boolean guess;
    TextView wonlost;
    EditText text;
    private Button restart, redo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameover);

        wonlost = findViewById(R.id.wonlost);
        text = findViewById(R.id.edittext);

        restart = findViewById(R.id.restart);
        restart.setOnClickListener(this);
        redo = findViewById(R.id.redo);
        redo.setOnClickListener(this);


        guess = getIntent().getBooleanExtra("guess", false);
        Log.i("GAME OVER", "result: " + guess);

        if (guess == true) {
            Intent intent = getIntent();
            String str = intent.getStringExtra("word");
            str = str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
            wonlost.setText("You guessed the word: "+ str);

        }else {
            wonlost.setText("You guessed wrong!");
            redo.setVisibility(View.VISIBLE);

        }

    }


    public void onClick(View view) {

        if (view.getId() == R.id.restart) {
            Intent i = new Intent(this,ChooseActivity.class);
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            finish();
            startActivity(i);

        }else if (view.getId() == R.id.redo) {
            Intent j = new Intent(this,MainActivity.class);
            j.addFlags(Intent.FLAG_ACTIVITY_PREVIOUS_IS_TOP);
            j.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            finish();

        }

    }

}
