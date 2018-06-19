package com.example.android.thunderalert;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class AlertMessage  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.alert);
        /*TextView t1= (TextView) findViewById(R.id.South24locationId);
        TextView t2= (TextView) findViewById(R.id.South24timeId);
        TextView t3= (TextView) findViewById(R.id.South24intensityId);
        String s="Thunder Strike likely to happen around "+t2.getText()+"in "+t1.getText()+"." +
                " People are are requested to remain at "+t3.getText()+"alert.";
        TextView alertText= (TextView)findViewById(R.id.alertmsg);
        alertText.setText(s);*/
    }
    public void showList(View v){
        Intent i= new Intent(this, ListAlerts.class);
        startActivity(i);
    }
}
