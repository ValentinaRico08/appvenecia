package com.example.venecia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Hoteles extends AppCompatActivity {

    ArrayList<Hotel> lista = new ArrayList<>();
    RecyclerView listaLogica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles);

        listaLogica=findViewById(R.id.recycler);
        listaLogica.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL,false));

        crearListaHoteles();
        Adaptador adaptador=new Adaptador(lista);
        listaLogica.setAdapter(adaptador);
    }

    private void crearListaHoteles() {
        lista.add(new Hotel(R.drawable.springs,"Cerro Tusa Springs","Servicios",R.drawable.ic_baseline_wifi_24,"WiFi gratis",R.drawable.ic_baseline_restaurant_24,"Restaurante",R.drawable.ic_baseline_water_24,"Piscina al aire libre",
                R.drawable.ic_baseline_local_parking_24,"Parking gratis","$350.000"));
        lista.add(new Hotel(R.drawable.cafetera,"Granja del Cafe","",R.drawable.ic_baseline_wifi_24,"",R.drawable.ic_baseline_restaurant_24,"",R.drawable.ic_baseline_water_24,"",
                R.drawable.ic_baseline_local_parking_24,"","$319.000"));
        lista.add(new Hotel(R.drawable.manigua,"Casa de Campo Manigua","Servicios",R.drawable.ic_baseline_wifi_24,"WiFi gratis",R.drawable.ic_baseline_restaurant_24,"Restaurante",R.drawable.ic_baseline_water_24,"Piscina al aire libre",
                R.drawable.ic_baseline_local_parking_24,"Parking gratis","$1.600.000"));
        lista.add(new Hotel(R.drawable.cabanas,"Housy Host","Servicios",R.drawable.ic_baseline_wifi_24,"WiFi gratis",R.drawable.ic_baseline_restaurant_24,"Restaurante",R.drawable.ic_baseline_water_24,"Piscina al aire libre",
                R.drawable.ic_baseline_local_parking_24,"Parking gratis","$584.000"));
    }
}