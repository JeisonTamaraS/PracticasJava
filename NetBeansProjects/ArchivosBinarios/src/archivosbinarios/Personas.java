/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosbinarios;

import java.io.Serializable;

/**
 *
 * @author jeison tamara
 */
public class Personas implements Serializable{//con la implementacion del serializable convertimos los datos en un flujo de bits y asi guardarlo sobre el archivo binario
    private String nombre;
    private int edad;

    public Personas(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("");
    }
}
