/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

/**
 *
 * @author user
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Carro carro = new Carro("Ferrari");
        PartesNoEsenciales partes = new PartesNoEsenciales("Tubo de Escape", 45000);
        
        carro.addPartesNoEsenciales(partes);
        carro.addPartesEsenciales("Motor", 100000);
        carro.mostrarDatos();
    }
}
