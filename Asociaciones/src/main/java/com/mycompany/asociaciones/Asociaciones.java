/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.asociaciones;

/**
 *
 * @author user
 */
public class Asociaciones {

    public static void main(String[] args) {
        Empleado e1 = new Empleado("Maria");
        Empleado e2 = new Empleado("Juan");
        
        Empresa empresa = new Empresa("Amaris");
        empresa.addEmpleado(e1);
        empresa.addEmpleado(e2);
        
    }
}
