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
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    ImageButton botonHotel;
    ImageButton botonRestaurante;
    ImageButton botonSitiosTuristicos;
    ImageButton botonhistoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar barra = getSupportActionBar();

        ColorDrawable colorBarra = new ColorDrawable(Color.parseColor("#e4b14a"));
        barra.setBackgroundDrawable(colorBarra);

        botonHotel = findViewById(R.id.botones);
        botonRestaurante = findViewById(R.id.restaurantes);
        botonSitiosTuristicos = findViewById(R.id.turistico);
        botonhistoria = findViewById(R.id.imagenHistoria);

        botonSitiosTuristicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentActividades = new Intent(MainActivity.this,Actividades.class);
                startActivity(intentActividades);
            }
        });

        botonRestaurante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenRestaurantes = new Intent(MainActivity.this,Restaurantes.class);
                startActivity(intenRestaurantes);
            }
        });

        botonHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentHoteles = new Intent(MainActivity.this,Hoteles.class);
                startActivity(intentHoteles);
            }
        });

        botonhistoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentHistoria = new Intent(MainActivity.this, Historia.class);
                startActivity(intentHistoria);
            }
        });

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
                Intent intent = new Intent(MainActivity.this,Acercade.class);
                startActivity(intent);
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