package com.example.android.thunderalert;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class AlertMessage  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.alert);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar2));
        Toolbar tool =(Toolbar)findViewById(R.id.toolbar2);

    }
    public void showList(View v){
        Intent i= new Intent(this, ListAlerts.class);
        startActivity(i);
    }
}
