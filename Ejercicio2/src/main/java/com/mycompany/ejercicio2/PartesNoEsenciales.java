package com.mycompany.ejercicio2;

public class PartesNoEsenciales extends Partes {

    public PartesNoEsenciales(String nombre, int precio) {
        super(nombre, precio);
        this.nombre = nombre;
        this.precio = precio;

    }

    @Override
    public String toString() {
        return "Partes No Esenciales{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }

}
