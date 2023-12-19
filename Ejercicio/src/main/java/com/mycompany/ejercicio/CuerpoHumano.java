/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class CuerpoHumano {
     private String seccion;
     private List<Organos> organo;

    public CuerpoHumano(String seccion) {
        this.seccion = seccion;
        this.organo = new ArrayList<>();
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
     
     public void addOrganos(String nombre){
         organo.add(new Organos(nombre));
         
     }
    
     public void mostrarDatos(){
         System.out.println("Los organos de la seccion: "+ seccion);
         for (Organos organos : organo) {
                   System.out.println(organos);
         }
     }
}
