/*
 * ejercicio4: crear y llenar una matriz, y mostrar la suma de cada una de las filas y columnas.
 */
package ejerciciom4;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jeison tamara
 */
public class EjercicioM4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int Matriz[][], Nfilas, Ncolum, sumaF, sumaC;
        Nfilas=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));
        Ncolum=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas: "));
        Matriz= new int[Nfilas][Ncolum];
        //llenamos la matriz
        for(int i=0;i<Nfilas;i++){
            for(int j=0;j<Ncolum;j++){
                System.out.print("Dijite pos["+i+"]["+j+"] de la matriz: ");
                Matriz[i][j]=entrada.nextInt();
            }
        }
        //mostramos la matriz
        for(int i=0;i<Nfilas;i++){
            for(int j=0;j<Ncolum;j++){
                System.out.print(Matriz[i][j]+" ");
            }
            System.out.println("");
        }
        //simamos las filas
        for(int i=0;i<Nfilas;i++){
            sumaF=0;
            for(int j=0;j<Ncolum;j++){
                sumaF+=Matriz[i][j];
            }
            System.out.println("suma Fila["+i+"]: "+sumaF);
        }
        //sumamos las columnas
        for(int j=0;j<Ncolum;j++){
            sumaC=0;
            for(int i=0;i<Nfilas;i++){
                sumaC+=Matriz[i][j];
            }
            System.out.println("suma columna["+j+"]: "+sumaC);
        }
        System.out.println("");
    }
    
}
