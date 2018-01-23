package fhku.drawgame;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * Created by Melanie on 23.01.2018.
 */

public class StartActivity extends AppCompatActivity implements View.OnClickListener{

   // public Button start;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        findViewById(R.id.startbutton).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(this,ChooseActivity.class);
        i.putExtra("mode",R.id.startbutton == view.getId());
        startActivity(i);

    }
}
