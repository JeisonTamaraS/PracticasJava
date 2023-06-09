package ejerciciom3;
import java.util.Scanner;

/*
 * ejercicio3: crear y llenar una matriz de 3x3, mostrar la matriz traspuesta
package ejerciciom3;

/**
 *
 * @author jeison tamara
 */
public class EjercicioM3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int matriz[][]=new int[3][3];//inicializamos la matriz
        //llenamos la matriz
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Digite pos["+i+"]["+j+"] de la matriz: ");
                matriz[i][j]=entrada.nextInt();
            }
        }
        //mostramos matriz original
        System.out.println("Matriz original:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
        //sacamos la matriz traspuesta
        int aux;
        for(int i=0;i<3;i++){
            for(int j=0;j<i;j++){
                aux=matriz[i][j];//giardamos el dato de la matriz original
                matriz[i][j]=matriz[j][i];//lo asignamos a la matriz traspuesta
                matriz[j][i]=aux;//y luego reasignamos el valos guardado en la posicion contraria
            }
        }
        //imprimimos la matriz resultante
        System.out.println("Matriz traspuesta:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    
}
