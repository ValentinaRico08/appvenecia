package com.example.venecia;

public class Hotel {

    private int fotografia;
    private String nombre;
    private String servicio;
    private int vectorwifi;
    private String textWifi;
    private int vectorRestaurante;
    private String textRestaurant;
    private int vectorPiscina;
    private String textPiscina;
    private int vectorParking;
    private String textParking;
    private String precio;

    public Hotel(int fotografia, String nombre, String servicio, int vectorwifi, String textWifi, int vectorRestaurante, String textRestaurant, int vectorPiscina, String textPiscina, int vectorParking, String textParking, String precio) {
        this.fotografia = fotografia;
        this.nombre = nombre;
        this.servicio = servicio;
        this.vectorwifi = vectorwifi;
        this.textWifi = textWifi;
        this.vectorRestaurante = vectorRestaurante;
        this.textRestaurant = textRestaurant;
        this.vectorPiscina = vectorPiscina;
        this.textPiscina = textPiscina;
        this.vectorParking = vectorParking;
        this.textParking = textParking;
        this.precio = precio;
    }

    public int getFotografia() { return fotografia; }

    public void setFotografia(int fotografia) { this.fotografia = fotografia;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getServicio() {return servicio;}

    public void setServicio(String servicio) {this.servicio = servicio;}

    public int getVectorwifi() {return vectorwifi;}

    public void setVectorwifi(int vectorwifi) {this.vectorwifi = vectorwifi;}

    public String getTextWifi() {return textWifi;}

    public void setTextWifi(String textWifi) {this.textWifi = textWifi;}

    public int getVectorRestaurante() {return vectorRestaurante;}

    public void setVectorRestaurante(int vectorRestaurante) {this.vectorRestaurante = vectorRestaurante;}

    public String getTextRestaurant() {return textRestaurant;}

    public void setTextRestaurant(String textRestaurant) {this.textRestaurant = textRestaurant;}


    public int getVectorPiscina() {return vectorPiscina;}

    public void setVectorPiscina(int vectorPiscina) {this.vectorPiscina = vectorPiscina;}

    public String getTextPiscina() {return textPiscina;}

    public void setTextPiscina(String textPiscina) {this.textPiscina = textPiscina;}

    public int getVectorParking() {return vectorParking;}

    public void setVectorParking(int vectorParking) {this.vectorParking = vectorParking;}

    public String getTextParking() {return textParking;}

    public void setTextParking(String textParking) {this.textParking = textParking;}

    public String getPrecio() {return precio;}

    public void setPrecio(String precio) {this.precio = precio;}
}
