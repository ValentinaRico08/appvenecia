package com.example.venecia;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class InscripcionGuia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscripcion_guia);

        ActionBar barra = getSupportActionBar();

        ColorDrawable colorBarra = new ColorDrawable(Color.parseColor("#e4b14a"));
        barra.setBackgroundDrawable(colorBarra);
    }
}