/*
 * ejercicio2: construir un programa que dada una serie de vehiculos caracterizados 
               por su marca, modelo y precio, imprima las propiedades del vehiculo mas 
               barato. para ello, se deberan leer por teclado las caracteristicas de 
               cada vehiculo y crear una classe que represente a cada uno de ellos.
   atributos:  marca: string, modelo: int, precio: float
   metodos: vehiculo(String marca String modelo float precio)
            getPrecio():float
            mostrarDatos():String
*/
package vehiculos;

import java.util.Scanner;

/**
 *
 * @author jeison tamara
 */
public class autos {
        //atributos
       private String marca;
       private String modelo;
       private float precio;

    public autos(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
    
    public String mostrarDatos(){
        
        return "Marca: "+marca+", Modelo: "+modelo+", precio: "+precio+"\n";
    }
           
}
