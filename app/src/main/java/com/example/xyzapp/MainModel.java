package com.example.xyzapp;

public class MainModel {
    String Nombre, Descripcion, Precio;

    public MainModel(){

    }

    public MainModel(String nombre, String desc, String precio) {
        Nombre = nombre;
        Descripcion = desc;
        Precio = precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String precio) {
        Precio = precio;
    }
}
