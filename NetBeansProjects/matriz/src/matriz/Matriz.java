/*
 * matriz: tambien llamada arrego de arreglos, esta formada por N filas y M columnas
 */
package matriz;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jeison tamara
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int Nfilas, Ncolum;
        Nfilas= Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de Filas: "));
        Ncolum=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de Columnas: "));
        //declaramos e inicializamos la matriz con el tamaño en filas y columnas que pedimos en pantalla enteriormente
        int matriz[][]= new int[Nfilas][Ncolum];
        //llenamos la matriz
        //las matrices al ser arreglos de arreglos o arreglos bidimensionales utilizan dos ciclos para manupularlos
        for(int i=0;i<Nfilas;i++){//el primer ciclo controla las filas
            for(int j=0;j<Ncolum;j++){//el segundo ciclo las columnas
                System.out.print("Digite numero en la pos["+i+"]["+j+"]: ");
                matriz[i][j]=entrada.nextInt();
            }
        }
        //si no quieres llenar la matriz puedes ingrezar los datos directamente como matriz[][]={{fila 1},{fila2},{fila3}}
        //imprimimos la matriz
        for(int i=0;i<Nfilas;i++){
            for(int j=0;j<Ncolum;j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        }
        
    }
    
}
