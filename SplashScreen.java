package com.example.jo_industries.chrono_plasmid;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        final MediaPlayer intro = MediaPlayer.create(this,R.raw.introd);
        intro.start();
        Vibrator v = (Vibrator)this.getSystemService(this.VIBRATOR_SERVICE);
       // v.vibrate(1000);



        Thread myThread = new Thread(){

        @Override
        public void run() {
            try {
                sleep(5000);
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                startActivity(intent);
                finish();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    };
        myThread.start();
    }
}
