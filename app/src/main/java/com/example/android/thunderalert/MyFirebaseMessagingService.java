package com.example.android.thunderalert;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {

        //Log.d(TAG, "From: " + remoteMessage.getFrom());

        // Check if message contains a data payload.
        if (remoteMessage.getData().size() > 0) {
            String msg[] = new String[3];
            msg[0]= remoteMessage.getData().get("location");
            msg[1]= remoteMessage.getData().get("time");
            msg[2]= remoteMessage.getData().get("priority");
            Intent i=new Intent(this,ListAlerts.class);
            i.putExtra("abc",msg);
            startActivity(i);



        //if (/* Check if data needs to be processed by long running job */ true) {
        // For long-running tasks (10 seconds or more) use Firebase Job Dispatcher.
        //    scheduleJob();
        //} else {
        // Handle message within 10 seconds
        //  handleNow();
        }


        // Check if message contains a notification payload.
        /*if (remoteMessage.getNotification() != null) {
                Log.d("aa","Message Notification Body: " + remoteMessage.getNotification().getBody());
                String message = remoteMessage.getNotification().getBody();
                String msgAr[] = message.split(" ");
                Intent i = new Intent(this, ListAlerts.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                i.putExtra(Intent.EXTRA_TEXT, msgAr);
                PendingIntent p = PendingIntent.getActivity(this, 0, i, PendingIntent.FLAG_ONE_SHOT);
                NotificationCompat.Builder notify = new NotificationCompat.Builder(this);
                notify.setAutoCancel(true);
                notify.setContentTitle("West Bengal Thunder Shield System");
                notify.setContentText("Thunder Strike likely to happen in " + msgAr[0] + " at " + msgAr[1] + ". Danger level:" + msgAr[2]);
                notify.setSmallIcon(R.drawable.th123);
                notify.setContentIntent(p);

                NotificationManager notifyM = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                notifyM.notify(0, notify.build());

            // Also if you intend on generating your own notifications as a result of a received FCM
            // message, here is where that should be initiated. See sendNotification method below.
            //}
        }*/
    }
}

