/*
 *ejercicio3:leer 10 numeros enteros, guardarlos en un arreglo y mostrarlos en
             el siguiente orden: el primero, el ultimo, el segundo, el penultimo
             el tercero,etc.
 */
package ejerciciov3;

import java.util.Scanner;

/**
 *
 * @author jeison tamara
 */
public class EjercicioV3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int numeros[]=new int[10];
        for(int i=0;i<10;i++){
            System.out.print("digite el n°"+(i+1)+": ");
            numeros[i]=entrada.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.print(numeros[i]+" ");
            System.out.print(numeros[9-i]+" ");
        }
    }
    
}
