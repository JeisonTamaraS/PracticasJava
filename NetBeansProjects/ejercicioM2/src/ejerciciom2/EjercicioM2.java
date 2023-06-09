/*
 * ejercicio2: crear y cargar 2 matrices 3x3, sumarlas y mortrar su suma.
 */
package ejerciciom2;

import java.util.Scanner;

/**
 *
 * @author jeison tamara
 */
public class EjercicioM2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int matrizA[][]=new int[3][3];
        int matrizB[][]=new int[3][3];
        int resultado[][]= new int[3][3];
        
        System.out.println("Digite la Matiz A");        
        for(int i=0;i<3;i++){//llenamos el primer arreglo
            for(int j=0;j<3;j++){
                System.out.print("Digite pos["+i+"]["+j+"] del arreglo A: ");
                matrizA[i][j]=entrada.nextInt();
            }
        }
        System.out.println("Digite la Matiz B");
        for(int i=0;i<3;i++){//llenamos el segundo arreglo
            for(int j=0;j<3;j++){
                System.out.print("Digite pos["+i+"]["+j+"] del arreglo B: ");
                matrizB[i][j]=entrada.nextInt();
            }
        }
        //sumamos las matrices matriz
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                resultado[i][j]=matrizA[i][j]+matrizB[i][j];
            }
        }
        //imprimimos la matriz resultante
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(resultado[i][j]);
            }
            System.out.println("");
        }
        
    }
    
}
