package com.example.venecia;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar barra = getSupportActionBar();

        ColorDrawable colorBarra = new ColorDrawable(Color.parseColor("#e4b14a"));
        barra.setBackgroundDrawable(colorBarra);
    }

    public void cambiarIdioma(String idioma) {

        Locale lenguaje = new Locale(idioma);
        Locale.setDefault(lenguaje);

        Configuration configuracionTelefono = getResources().getConfiguration();
        configuracionTelefono.locale=lenguaje;

        getBaseContext().getResources().updateConfiguration(configuracionTelefono,getBaseContext().getResources().getDisplayMetrics());
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected (MenuItem item){

        int itemSeleccionado = item.getItemId();

        switch (itemSeleccionado){

            case(R.id.opcion1):
                Toast.makeText(this,"Seleccionaste opción 1",Toast.LENGTH_SHORT);
                break;

            case(R.id.opcion2):
                this.cambiarIdioma("es");
                Intent intent1 = new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent1);
                break;

            case(R.id.opcion3):
                this.cambiarIdioma("en");
                Intent intent2= new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent2);
                break;

            case(R.id.opcion4):
                this.cambiarIdioma("pt");
                Intent intent3=new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent3);
                break;
        }
        return super.onOptionsItemSelected(item);
    }










}