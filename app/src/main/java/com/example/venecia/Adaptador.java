package com.example.venecia;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.viewHolder>{

    public ArrayList<Hotel> listaHoteles;

    public Adaptador(ArrayList<Hotel> listaHoteles) {this.listaHoteles = listaHoteles;}

    @NonNull
    @Override
    public Adaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptador.viewHolder viewHolder, int i) {
        viewHolder.actualizarDatos(listaHoteles.get(i));
    }

    @Override
    public int getItemCount() { return listaHoteles.size();}

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView fotoHotel;
        TextView nombreHotel;
        TextView servicios;
        ImageView fotoWifi;
        TextView textoWifi;
        ImageView fotoRestaurante;
        TextView textoRestaurante;
        ImageView fotoPiscina;
        TextView textoPiscina;
        ImageView fotoParking;
        TextView textoParking;
        TextView precioHotel;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoHotel= itemView.findViewById(R.id.imagensprings);
            nombreHotel=itemView.findViewById(R.id.tituloSprings);
            servicios=itemView.findViewById(R.id.serviciosSprings);
            fotoWifi=itemView.findViewById(R.id.imagenwifi);
            textoWifi=itemView.findViewById(R.id.textowifi);
            fotoRestaurante=itemView.findViewById(R.id.imagenrestaurante);
            textoRestaurante=itemView.findViewById(R.id.textorestaurante);
            fotoPiscina=itemView.findViewById(R.id.imagenpiscina);
            textoPiscina=itemView.findViewById(R.id.textopiscina);
            fotoParking=itemView.findViewById(R.id.imagenparking);
            textoParking=itemView.findViewById(R.id.textoparking);
            precioHotel=itemView.findViewById(R.id.textoprecio);
        }

        public void actualizarDatos(Hotel hotel) {
            fotoHotel.setImageResource(hotel.getFotografia());
            nombreHotel.setText(hotel.getNombre());
            servicios.setText(hotel.getServicio());
            fotoWifi.setImageResource(hotel.getVectorwifi());
            textoWifi.setText(hotel.getTextWifi());
            fotoRestaurante.setImageResource(hotel.getVectorRestaurante());
            textoRestaurante.setText(hotel.getTextRestaurant());
            fotoPiscina.setImageResource(hotel.getVectorPiscina());
            textoPiscina.setText(hotel.getTextPiscina());
            fotoParking.setImageResource(hotel.getVectorPiscina());
            textoParking.setText(hotel.getTextParking());
            precioHotel.setText(hotel.getPrecio());
        }
    }
}