/*
 * ejercicio4: leer por teclado dos tablas dwe 10 numeros enteros y mezclarla 
               en una tercera de la forma: 1°de A, 1° de B, 2° de A, 2° de B,etc.
 */
package ejerciciov4;

import java.util.Scanner;

/**
 *
 * @author jeison tamara
 */
public class EjercicioV4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int vectorA[]=new int[10];
        int vectorB[]=new int[10];
        int vectorC[]=new int[20];
        for(int i=0;i<10;i++){
            System.out.print("Digite el N° "+(i+1)+" de A: ");
            vectorA[i]=entrada.nextInt();
            System.out.print("Digite el N° "+(i+1)+" de B: ");
            vectorB[i]=entrada.nextInt();
        }
        int j=0;
        for(int i=0;i<10;i++){
            vectorC[j]=vectorA[i];
            j++;
            vectorC[j]=vectorB[i];
            j++;
        }
        for(int i=0;i<20;i++){
            System.out.print(vectorC[i]+" ");
        }
    }
    
}
