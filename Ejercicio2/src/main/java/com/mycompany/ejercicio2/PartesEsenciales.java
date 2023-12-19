package com.mycompany.ejercicio2;

public class PartesEsenciales extends Partes {

    public PartesEsenciales(String nombre, int precio) {
        super(nombre, precio);
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Partes Esenciales{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }
}
