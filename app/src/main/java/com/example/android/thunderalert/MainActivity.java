package com.example.android.thunderalert;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    DrawerLayout mDrawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_nav_activity);
        String msg[]=new String[3];
        if(getIntent().getExtras()!=null  ){
            Log.d("aa","in");
            for (String key: getIntent().getExtras().keySet()){
                if(key.equals("location")) {

                    msg[0] = getIntent().getExtras().getString(key);
                    Log.d("aa",msg[0]+"1");
                }
                else if(key.equals("time")) {
                    msg[1] = getIntent().getExtras().getString(key);
                    Log.d("aa",msg[1]+"2");
                }
                else if(key.equals("priority")){
                    msg[2]=getIntent().getExtras().getString(key);
                    Log.d("aa",msg[2]+"3");
                }

            }
            Intent i=new Intent(this,ListAlerts.class);
            i.putExtra("abc",msg);
            startActivity(i);
        }
        else{

            Log.d("aa","main in");
            setContentView(R.layout.main_nav_activity);}
        //getSupportActionBar().hide();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp);
        mDrawerLayout = findViewById(R.id.drawer_layout);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);


    }

    public void nextPage(View view){
        Intent i= new Intent(this,AlertMessage.class);
        startActivity(i);
    }

}
