package fhku.drawgame;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Melanie on 23.01.2018.
 */

public class GameOverActivity extends AppCompatActivity implements View.OnClickListener {

    private boolean guess;
    TextView wonlost;
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameover);

        wonlost = findViewById(R.id.wonlost);
        text = findViewById(R.id.edittext);


        guess = getIntent().getBooleanExtra("guess", false);
        Log.i("GAME OVER", "result: " + guess);

        if (guess == true) {
            wonlost.setText("You guessed the word: "+ text);
        }else {
            wonlost.setText("You guessed wrong!");
        }
    }



    public void onClick(View view) {

        restart();

    }

    public void restart() {

        Intent i = new Intent(this, MainActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        finish();
        startActivity(i);

    }

    public void redo() {
        Intent i = new Intent(this, MainActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_PREVIOUS_IS_TOP);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        finish();
        startActivity(i);

    }

//    @Override
//    public void onClick(View view) {
//
//         if (view.getId() == R.id.restart) {
//             Intent i = new Intent(this, StartActivity.class);
//             i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//             i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//             finish();
//             startActivity(i);
//            }
//
//            else if (view.getId() == R.id.redo) {
//             Intent i = new Intent(this, MainActivity.class);
//             i.addFlags(Intent.FLAG_ACTIVITY_PREVIOUS_IS_TOP);
//             i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//             finish();
//             startActivity(i);
//
//        }
//
//    }
}
