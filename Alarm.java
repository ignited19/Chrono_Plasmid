package com.example.jo_industries.chrono_plasmid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.widget.Toast;

public class Alarm extends BroadcastReceiver {
SplashScreen n = new SplashScreen();



    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Your Decision...",Toast.LENGTH_LONG).show();
        final MediaPlayer intro = MediaPlayer.create(context,R.raw.min);
        intro.start();
    }
}
