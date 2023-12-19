/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Carro {
    private List<PartesNoEsenciales> partesN;
    
    private List<PartesEsenciales> partesE;
    private String modelo;
    
    public Carro(String modelo){
        this.modelo = modelo;
        this.partesN = new ArrayList<>();
        this.partesE = new ArrayList<>();
    }
    
    public void addPartesEsenciales(String nombre, int precio){
       partesE.add(new PartesEsenciales(nombre, precio));
        System.out.println("hecho");
    }
    public void addPartesNoEsenciales(PartesNoEsenciales partes){
        this.partesN.add(partes); 
    }
    
    
    public void mostrarDatos(){
        for (PartesEsenciales partes : partesE) {
            System.out.println(partes);
        }
    }
    
    
}
    
    

    

