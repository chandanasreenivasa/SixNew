package com.example.chandanasrinivas.sixnew;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button notify;
    private static final String CHANNEL_ID="channel1";
    private NotificationManagerCompat nm;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nm=NotificationManagerCompat.from(this);
        //title=(EditText) findViewById(R.id.title);
        //message=(EditText) findViewById(R.id.message);

    }
    public void sendOnChannel(View v)
    {
        Notification not = new NotificationCompat.Builder(this,CHANNEL_ID)
                .setSmallIcon(R.drawable.icon)
                .setContentTitle("Chandana Notification")
                .setContentText("A video has just arrived!")
                .build();
        nm.notify(1,not);

        // Creates the intent needed to show the notification
        /*Intent notificationIntent = new Intent(this, MainActivity.class);
        PendingIntent contentIntent = PendingIntent.getActivity(this, 0, notificationIntent, PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(contentIntent);

        // Add as notification
        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(0, builder.build());
        Notification.Builder not=new Notification.Builder(this,CHANNEL_ID)
                .setSmallIcon(R.drawable.icon)
                .setContentTitle("Chandana Notification")
                .setContentText("SSUP")
                .build();
        nm.notify(1,not);*/

    }

}
