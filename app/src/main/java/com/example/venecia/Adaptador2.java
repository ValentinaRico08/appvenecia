package com.example.venecia;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador2 extends RecyclerView.Adapter<Adaptador2.viewHolder> {

    public ArrayList<Restaurante> listaRestaurantes;

    public Adaptador2(ArrayList<Restaurante> listaRestaurantes) {this.listaRestaurantes = listaRestaurantes;}

    @NonNull
    @Override
    public Adaptador2.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item2,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptador2.viewHolder viewHolder, int i) {
        viewHolder.actualizarDatos(listaRestaurantes.get(i));

    }

    @Override
    public int getItemCount() { return listaRestaurantes.size();}

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView fotoRestaurante;
        TextView nombreRestaurante;
        TextView tiposComida;
        TextView comida;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            fotoRestaurante= itemView.findViewById(R.id.imagenlagraciela);
            nombreRestaurante = itemView.findViewById(R.id.tituloComida);
            tiposComida = itemView.findViewById(R.id.tiposcomida);
            comida = itemView.findViewById(R.id.textocomida);
        }

        public void actualizarDatos(Restaurante restaurante) {
            fotoRestaurante.setImageResource(restaurante.getFotografiaRestaurante());
            nombreRestaurante.setText(restaurante.getNombreRestaurante());
            tiposComida.setText(restaurante.getTextTiposComida());
            comida.setText(restaurante.getTextComidas());
        }
    }
}
