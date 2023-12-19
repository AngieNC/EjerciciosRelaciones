/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asociaciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Empresa {

    private String nombre;
    private List<Empleado> empleados;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarEmpleado() {
        System.out.println("Empleados de la empresa " + nombre);
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }
    
    public void addEmpleado(Empleado empleado){
        empleado.setEmpresa(this);
        empleados.add(empleado);
       
    }

}
