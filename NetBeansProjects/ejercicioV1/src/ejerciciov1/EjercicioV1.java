/*
 * ejercicio1: leer 5 numeros, guardarlos en un arreglo y mostrarlo en el orden inverso.
 */
package ejerciciov1;

import java.util.Scanner;

/**
 *
 * @author jeison tamara
 */
public class EjercicioV1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numero[]=new float[5];//se declara y se inicializa el array
        for(int i=0;i<5;i++){//con este ciclo llenamos las posiciones del array
            System.out.print("ingrese el N°"+(i+1)+": ");
            numero[i]=entrada.nextFloat();
        }
        System.out.println("el array inverso es: ");
        for(int i=4;i>=0;i--){//este ciclo recorre el array de manera inversa e imprime los datos.
            System.out.println(numero[i]);
        }
        
    }
    
}
