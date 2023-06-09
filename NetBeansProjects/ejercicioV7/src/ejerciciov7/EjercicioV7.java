/*
 * ejercicio7: diseñar un programa que declare una tabla de 10 numeros enteros,
               leer 8 numeros, despues pedir un numero y una posicion, insertarlo
               y dezplazar los que le siguen.
 */
package ejerciciov7;

import java.util.Scanner;

/**
 *
 * @author jeison tamara
 */
public class EjercicioV7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int array[]=new int[10];//inicializamos y declaramos el array
        int numero,posicion;//declaramos variables que necesitaremos 
        for(int i=0;i<8;i++){//este ciclo llena el array
            System.out.print("Digite el nº"+(i+1)+": ");
            array[i]=entrada.nextInt();
        }
        System.out.println("Digite un numero: ");//digitamos el numero
        numero=entrada.nextInt();
        System.out.println("Digite una posicion: ");//digitamos posicion
        posicion=entrada.nextInt();
        
        for(int i=7;i>=posicion;i--){//este ciclo recorre el array desde la posicion 8 hasta la que ingresamos
            array[i+1]=array[i];//le asignamos el valor a la posicion de al lado, corremos los numeros hacia la derecha
        }
        array[posicion]=numero;//asignamos el numero en la posicion ingresada
        System.out.print("el vector es: ");//este ciclo recorre el array para imprimirlo
        for(int i=0; i<9;i++){
            System.out.print(array[i]+" ");
        }
    }
    
}
