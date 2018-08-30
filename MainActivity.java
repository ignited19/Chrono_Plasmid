package com.example.jo_industries.chrono_plasmid;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    Handler handler = new Handler();
    Button btnSet;
    EditText etTime;
    static int minutes;
    Alarm am = new Alarm();
    Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSet= (Button) findViewById(R.id.btnSet);
        etTime =(EditText) findViewById(R.id.etAlarm);

        btnSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int time = Integer.parseInt(etTime.getText().toString());

                handler.postDelayed(runnableCode,60000*time);



            }
        });

    }
    Runnable runnableCode = new Runnable() {
        @Override
        public void run() {

            final MediaPlayer intro = MediaPlayer.create(getBaseContext(), R.raw.min);
            intro.start();
        }
    };

}




