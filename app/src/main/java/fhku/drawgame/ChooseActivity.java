package fhku.drawgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Melanie on 23.01.2018.
 */

public class ChooseActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        button = (Button) findViewById(R.id.cat);
        button.setOnClickListener(this);
        findViewById(R.id.dog).setOnClickListener(this);
        findViewById(R.id.car).setOnClickListener(this);
        findViewById(R.id.mouse).setOnClickListener(this);
        findViewById(R.id.plane).setOnClickListener(this);
        findViewById(R.id.bird).setOnClickListener(this);
        findViewById(R.id.moon).setOnClickListener(this);
        findViewById(R.id.burger).setOnClickListener(this);
        findViewById(R.id.crown).setOnClickListener(this);
        findViewById(R.id.pineapple).setOnClickListener(this);
        findViewById(R.id.laptop).setOnClickListener(this);
        findViewById(R.id.ketchup).setOnClickListener(this);
        findViewById(R.id.toothbrush).setOnClickListener(this);
        findViewById(R.id.clown).setOnClickListener(this);
        findViewById(R.id.golf).setOnClickListener(this);
        findViewById(R.id.alien).setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(this,MainActivity.class);

        switch (view.getId()) {
            case R.id.cat:
                i.putExtra("drawing", "cat");
                break;

            case R.id.dog:
                i.putExtra("drawing", "dog");
                break;

            case R.id.car:
                i.putExtra("drawing", "car");
                break;

            case R.id.mouse:
                i.putExtra("drawing", "mouse");
                break;

            case R.id.plane:
                i.putExtra("drawing", "plane");
                break;

            case R.id.bird:
                i.putExtra("drawing", "bird");
                break;

            case R.id.moon:
                i.putExtra("drawing", "moon");
                break;

            case R.id.burger:
                i.putExtra("drawing", "burger");
                break;

            case R.id.crown:
                i.putExtra("drawing", "crown");
                break;

            case R.id.pineapple:
                i.putExtra("drawing", "pineapple");
                break;

            case R.id.laptop:
                i.putExtra("drawing", "laptop");
                break;

            case R.id.ketchup:
                i.putExtra("drawing", "ketchup");
                break;

            case R.id.toothbrush:
                i.putExtra("drawing", "toothbrush");
                break;

            case R.id.clown:
                i.putExtra("drawing", "clown");
                break;

            case R.id.golf:
                i.putExtra("drawing", "golf");
                break;

            case R.id.alien:
                i.putExtra("drawing", "alien");
                break;
        }
        startActivity(i);

        }
}
