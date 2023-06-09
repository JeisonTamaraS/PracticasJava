/*
 * ejercicio5: leer los datos de dos tablas de 12 elementos numericos, y mezclarlos
               en una tercera de la forma: 3 de A, 3 de B,etc.
 */
package ejerciciov5;

import java.util.Scanner;

/**
 *
 * @author jeison tamara
 */
public class EjercicioV5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int A[],B[],C[];
        A= new int[12];
        B= new int[12];
        C= new int[24];
        for(int i=0;i<12;i++){
            System.out.print("Digite el N°"+(i+1)+" de A: ");
            A[i]=entrada.nextInt();
        }
        for(int i=0;i<12;i++){
            System.out.print("Digite el N°"+(i+1)+" de B: ");
            B[i]=entrada.nextInt();
        }
        int j=0,i=0;//i controla los arrays A y B, y j el array C
        while(i<12){//este ciclo while permite recorrer los array A y B condicionando su tamaño
            for(int k=0;k<3;k++){//este ciclo copia las tres posiciones de A
                C[j]=A[i+k];//al sumarle k se garantiza que recorra el ciclo
                j++;//este incremento permite las 3 posiciones del array C
            }
            for(int k=0;k<3;k++){//este ciclo copia las tres posiciones de B
                C[j]=B[i+k];//nuevamente sumamos k para recorrer el ciclo
                j++;//en este incremento se recorren las tres posiciones del array C
            }
            i+=3;//incrementamos en 3 porque en los ciclos copiamos 3 posiciones
        }
        
        for(i=0;i<24;i++){
            System.out.println(C[i]+" ");
        }
    }
    
}
