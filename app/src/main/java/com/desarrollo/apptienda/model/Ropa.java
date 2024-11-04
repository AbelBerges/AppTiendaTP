package com.desarrollo.apptienda.model;

public class Ropa {
    private String nombre;
    private int foto;
    private int talle;
    private int color;
    private String marca;
    private float precio;
    private int stock;

    public Ropa(String ninguno, int ic_launcher_foreground){}
    public Ropa(String nombre, int foto, int talle,int color,String marca,float precio,int stock){
        this.nombre = nombre;
        this.foto = foto;
        this.talle = talle;
        this.color = color;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getFoto(){
        return this.foto;
    }
    public void setFoto(int foto){
        this.foto = foto;
    }

    public int getTalle() {
        return talle;
    }

    public void setTalle(int talle) {
        this.talle = talle;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
