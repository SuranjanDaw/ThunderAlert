package com.example.android.thunderalert;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    int NOTIFICATION_ID=03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void nextPage(View view){
        Intent i= new Intent(this,AlertMessage.class);
        startActivity(i);
    }
    public void notify(View v){
        Intent i2= new Intent(this,ListAlerts.class);
        PendingIntent p= PendingIntent.getActivity(this, 0, i2, PendingIntent.FLAG_UPDATE_CURRENT);
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this, "abc");
        mBuilder.addAction(R.drawable.th123,"See Details",p);
        mBuilder.setSmallIcon(R.drawable.th123);
        mBuilder.setContentTitle("West Bengal Thunder Shield System");
        mBuilder.setContentText("Warning:Danger of Thunder Strike.");
        mBuilder.setPriority(NotificationCompat.PRIORITY_DEFAULT);
        mBuilder.setAutoCancel(true);
        mBuilder.setDefaults(Notification.DEFAULT_SOUND);
        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);
        notificationManager.notify(NOTIFICATION_ID, mBuilder.build());

    }
}
