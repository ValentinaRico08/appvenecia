package com.example.venecia;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Acercade extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acercade);

        ActionBar barra2= getSupportActionBar();

        ColorDrawable colorBarra2 = new ColorDrawable(Color.parseColor("#e4b14a"));
        barra2.setBackgroundDrawable(colorBarra2);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu2,menu);
        return true;
    }
    public boolean onOptionsItemSelected (MenuItem item) {

        int itemSeleccionado = item.getItemId();

        switch (itemSeleccionado) {
            case (R.id.atras):
                Intent intent = new Intent(Acercade.this, MainActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}