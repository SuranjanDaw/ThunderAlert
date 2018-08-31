package com.example.android.thunderalert;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.TextView;

public class ListAlerts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle b1){
        super.onCreate(b1);

        setContentView(R.layout.list);

        setSupportActionBar((Toolbar) findViewById(R.id.toolbar3));
        Toolbar tool= (Toolbar) findViewById(R.id.toolbar3);

        if(getIntent().getExtras() != null) {
            Log.d("aa","inList");

            Intent intent = getIntent();

            String msg[] = intent.getStringArrayExtra("abc");

            TextView textHighLocation = (TextView) findViewById(R.id.highDanger);
            TextView textHighTime = (TextView) findViewById(R.id.highDangerTime);
            TextView textHighIntensity = (TextView) findViewById(R.id.highDangerIntensity);
            TextView textMediumLocation = (TextView) findViewById(R.id.mediumDanger);
            TextView textMediumTime = (TextView) findViewById(R.id.mediumDangerTime);
            TextView textMediumIntensity = (TextView) findViewById(R.id.mediumDangerIntensity);
            textHighLocation.setText(msg[0]);
            textHighTime.setText(msg[1]);
            textHighIntensity.setText(msg[2]);
            /*textMediumLocation.setText(msg[3]);
            textMediumTime.setText(msg[4]);
            textMediumIntensity.setText(msg[5]);*/
        }
        else {
            TextView textHighLocation = (TextView) findViewById(R.id.highDanger);
            textHighLocation.setText("NO THUNDER STRIKE DANGER NOW!");
            textHighLocation.setTextColor(Color.YELLOW);
        }

    }
}
