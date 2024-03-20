package com.example.firstrecycler.Model;

import android.graphics.Color;

public class Persona {
    private String nombre;
    private Double edad;
    private String correo;
    private Mascota mascota;

    //Constructor nuevo con propiedad "color"
    public Persona(String nombre, Double edad, String correo, Mascota mascota, Integer color) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.mascota = mascota;
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    //Importante que esté en "int" la propiedad color porque es lo que recibe el método donde se pasa.
    public void setColor(int color) {
        this.color = color;
    }

    private int color; // XDDDD en "int"

    //Constructor viejo sin propiedad "color"
    public Persona(String nombre, Double edad, String correo, Mascota mascota) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.mascota = mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getEdad() {
        return edad;
    }

    public void setEdad(Double edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
}
