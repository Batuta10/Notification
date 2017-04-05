package br.com.fiap.rm78792.notification;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this);

        notificationBuilder.setContentTitle("Titulo da notification");
        notificationBuilder.setContentText("Texto da notificação");
        notificationBuilder.setSmallIcon(R.drawable.ok);
        notificationBuilder.setVibrate(new long[]{100, 500, 100, 250, 100, 500});
        notificationBuilder.setOngoing(true);
        notificationBuilder.setContentIntent(PendingIntent.getActivity(this,100,new Intent(this, MainActivity.class),PendingIntent.FLAG_UPDATE_CURRENT));

        notificationManager.notify(100, notificationBuilder.build());


    }//OnCreate

}//Main Class