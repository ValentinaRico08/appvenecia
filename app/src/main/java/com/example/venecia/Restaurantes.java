package com.example.venecia;


import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class Restaurantes extends AppCompatActivity {

    ArrayList<Restaurante> lista2 = new ArrayList<>();
    RecyclerView listaLogica2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);

        ActionBar barra2 = getSupportActionBar();

        ColorDrawable colorBarra2 = new ColorDrawable(Color.parseColor("#e4b14a"));
        barra2.setBackgroundDrawable(colorBarra2);

        listaLogica2=findViewById(R.id.recyclerRestaurante);
        listaLogica2.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL,false));

        crearListaRestaurantes();
        Adaptador2 adaptador2=new Adaptador2 (lista2);
        listaLogica2.setAdapter(adaptador2);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu2, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {

        int itemSeleccionado = item.getItemId();

        switch (itemSeleccionado) {
            case (R.id.atras):
                Intent intent = new Intent(Restaurantes.this, MainActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }


    private void crearListaRestaurantes() {
        lista2.add(new Restaurante(R.drawable.lagraciela,Integer.toString(R.string.resGraciela),Integer.toString(R.string.tiposcomida),Integer.toString(R.string.comida)));
        lista2.add(new Restaurante(R.drawable.balcon, Integer.toString(R.string.restaurantebalcon),Integer.toString(R.string.tiposcomida),Integer.toString(R.string.comida2)));
        lista2.add(new Restaurante(R.drawable.crisalida,Integer.toString(R.string.restaurantecrisalida),Integer.toString(R.string.tiposcomida),Integer.toString(R.string.comida3)));

    }

}