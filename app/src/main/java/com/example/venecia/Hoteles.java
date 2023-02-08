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

public class Hoteles extends AppCompatActivity {

    ArrayList<Hotel> lista = new ArrayList<>();
    RecyclerView listaLogica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles);

        ActionBar barra2 = getSupportActionBar();

        ColorDrawable colorBarra2 = new ColorDrawable(Color.parseColor("#e4b14a"));
        barra2.setBackgroundDrawable(colorBarra2);

        listaLogica=findViewById(R.id.recycler);
        listaLogica.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL,false));

        crearListaHoteles();
        Adaptador adaptador=new Adaptador(lista);
        listaLogica.setAdapter(adaptador);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu2, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {

        int itemSeleccionado = item.getItemId();

        switch (itemSeleccionado) {
            case (R.id.atras):
                Intent intent = new Intent(Hoteles.this, MainActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }


    private void crearListaHoteles() {
        lista.add(new Hotel(R.drawable.springs,Integer.toString(R.string.springs),Integer.toString(R.string.servicios),R.drawable.ic_baseline_wifi_24,Integer.toString(R.string.wifi),R.drawable.ic_baseline_restaurant_24,Integer.toString(R.string.restaurante),R.drawable.ic_baseline_water_24,Integer.toString(R.string.piscina),
                R.drawable.ic_baseline_local_parking_24,Integer.toString(R.string.parking),Integer.toString(R.string.precio)));
        lista.add(new Hotel(R.drawable.cafetera,Integer.toString(R.string.granja),Integer.toString(R.string.servicios),R.drawable.ic_baseline_wifi_24,Integer.toString(R.string.wifi),R.drawable.ic_baseline_restaurant_24,Integer.toString(R.string.restaurante),R.drawable.ic_baseline_water_24,Integer.toString(R.string.piscina),
                R.drawable.ic_baseline_local_parking_24,Integer.toString(R.string.parking),Integer.toString(R.string.precio2)));
        lista.add(new Hotel(R.drawable.manigua,Integer.toString(R.string.manigua),Integer.toString(R.string.servicios),R.drawable.ic_baseline_wifi_24,Integer.toString(R.string.wifi),R.drawable.ic_baseline_restaurant_24,Integer.toString(R.string.restaurante),R.drawable.ic_baseline_water_24,Integer.toString(R.string.piscina),
                R.drawable.ic_baseline_local_parking_24,Integer.toString(R.string.parking),Integer.toString(R.string.precio3)));
        lista.add(new Hotel(R.drawable.cabanas,Integer.toString(R.string.houst),Integer.toString(R.string.servicios),R.drawable.ic_baseline_wifi_24,Integer.toString(R.string.wifi),R.drawable.ic_baseline_restaurant_24,Integer.toString(R.string.restaurante),R.drawable.ic_baseline_water_24,Integer.toString(R.string.piscina),
                R.drawable.ic_baseline_local_parking_24,Integer.toString(R.string.parking),Integer.toString(R.string.precio4)));
    }
}