/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

import java.util.Scanner;

/**
 *
 * @author jeison tamara
 */
public class principal {
    //metodo statico de clase para saber que auto es mas barato 
    public static int autoBarato(autos A[]){
        float precio;
        int indice=0;
        
        precio=A[0].getPrecio();//asignamos el precio inicial
        for(int i=1;i<A.length;i++){
            if(precio>A[i].getPrecio()){
                precio=A[i].getPrecio();
                indice=i;
            }
        }
        return indice;
    }
    
    public static void main(String [] args){
        Scanner entrada=new Scanner(System.in);
        //declaramos las variables
        String marca, modelo;
        float precio;
        //como el numero de autos es variable la declaramos
        int numeroAutos,indice;
        
        System.out.print("Digite la cantidad de autos: ");
        numeroAutos=entrada.nextInt();//asignamos la cantidad ingresada por el usuario
        
        //creamos objetos para los vehiculos con la ayuda de arrays
        autos A[]= new autos[numeroAutos];
        //llenamos los objetos
        for(int i=0;i<numeroAutos;i++){
            entrada.nextLine();
            //pedimos las caracteristicas(atributos) de los objetos(autos)
            System.out.println("\nDiigite las caracteristicas del vehiculo Nº"+(i+1));
            System.out.print("marca: ");
            marca=entrada.nextLine();
            System.out.print("Modelo: ");
            modelo=entrada.nextLine();
            System.out.print("precio: ");
            precio=entrada.nextFloat();
            //asignamos los datos ingresados a cada objeto mediante e metodo constructor
            A[i]= new autos(marca,modelo,precio);
        }
        indice= autoBarato(A);
        System.out.println("\nEl vehiculo mas barato es: ");
        System.out.println(A[indice].mostrarDatos());
    }
}
