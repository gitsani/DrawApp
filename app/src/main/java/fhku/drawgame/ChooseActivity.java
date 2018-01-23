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
        //findViewById(R.id.ketchup).setOnClickListener(this);
        findViewById(R.id.toothbrush).setOnClickListener(this);
        findViewById(R.id.clown).setOnClickListener(this);
        findViewById(R.id.golf).setOnClickListener(this);
        findViewById(R.id.alien).setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.cat:
                Intent i = new Intent(this,MainActivity.class);
                startActivity(i);
                break;

            case R.id.dog:
                Intent j = new Intent(this,MainActivity.class);
                startActivity(j);
                break;
            case R.id.car:
                Intent k = new Intent(this,MainActivity.class);
                startActivity(k);
                break;

            case R.id.mouse:
                Intent l = new Intent(this,MainActivity.class);
                startActivity(l);
                break;

            case R.id.plane:
                Intent m = new Intent(this,MainActivity.class);
                startActivity(m);
                break;

            case R.id.bird:
                Intent n = new Intent(this,MainActivity.class);
                startActivity(n);
                break;

            case R.id.moon:
                Intent o = new Intent(this,MainActivity.class);
                startActivity(o);
                break;

            case R.id.burger:
                Intent p = new Intent(this,MainActivity.class);
                startActivity(p);
                break;

            case R.id.crown:
                Intent q = new Intent(this,MainActivity.class);
                startActivity(q);
                break;

            case R.id.pineapple:
                Intent r = new Intent(this,MainActivity.class);
                startActivity(r);
                break;

            case R.id.laptop:
                Intent s = new Intent(this,MainActivity.class);
                startActivity(s);
                break;

           /* case R.id.ketchup:
                Intent t = new Intent(this,MainActivity.class);
                startActivity(t);
                break;*/

            case R.id.toothbrush:
                Intent u = new Intent(this,MainActivity.class);
                startActivity(u);
                break;

            case R.id.clown:
                Intent v = new Intent(this,MainActivity.class);
                startActivity(v);
                break;

            case R.id.golf:
                Intent w = new Intent(this,MainActivity.class);
                startActivity(w);
                break;

            case R.id.alien:
                Intent x = new Intent(this,MainActivity.class);
                startActivity(x);
                break;
        }

        }
}
