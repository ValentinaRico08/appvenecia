package com.example.venecia;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;


import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ActionBar barra = getSupportActionBar();
        barra.hide();


        TimerTask inicioapp = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this,MainActivity.class);
                startActivity(intent);
            }
        };

        Timer tiempo = new Timer();
        tiempo.schedule(inicioapp,10000);

    }
}