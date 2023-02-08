package com.example.venecia;

public class Restaurante {

    private int fotografiaRestaurante;
    private String nombreRestaurante;
    private String textTiposComida;
    private String textComidas;

    public Restaurante(int fotografiaRestaurante, String nombreRestaurante, String textTiposComida, String textComidas) {
        this.fotografiaRestaurante = fotografiaRestaurante;
        this.nombreRestaurante = nombreRestaurante;
        this.textTiposComida = textTiposComida;
        this.textComidas = textComidas;
    }

    public int getFotografiaRestaurante() {
        return fotografiaRestaurante;
    }

    public void setFotografiaRestaurante(int fotografiaRestaurante) {
        this.fotografiaRestaurante = fotografiaRestaurante;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public String getTextTiposComida() {
        return textTiposComida;
    }

    public void setTextTiposComida(String textTiposComida) {
        this.textTiposComida = textTiposComida;
    }

    public String getTextComidas() {
        return textComidas;
    }

    public void setTextComidas(String textComidas) {
        this.textComidas = textComidas;
    }
}
