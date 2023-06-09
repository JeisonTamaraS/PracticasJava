/*
 * ejercicio9: dezplazar N posiciones en un arreglo
 */
package ejerciciov9;

import java.util.Scanner;

/**
 *
 * @author jeison tamara
 */
public class EjercicioV9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int array[]=new int[10];//declaramos e inicializamos el array
        int N,ultimo;//declaramos las variables a operar
        
        for(int i=0;i<10;i++){//elte ciclo llena el array
            System.out.print("Pos["+i+"] del array: ");
            array[i]=entrada.nextInt();
        }
        System.out.println("Digite el numero de posiciones a desplazar: ");
        N=entrada.nextInt();
        for(int desplazar=1; desplazar<=N;desplazar++){//este ciclo recorre las N posiciones que se desplazaran
            ultimo=array[9];//guardamos el ultimo numero 
            for(int i=8;i>=0;i--){//este ciclo corre los valores hacia la derecha
                array[i+1]=array[i];//asignamos el valor a la posicion de al lado
            }
            array[0]=ultimo;//asignamos el valor de la ultima posicion a la primera
        }
        System.out.print("arreglo desplazado: ");
        for(int i=0;i<10;i++){//este ciclo imprime el array resultante
            System.out.print(+array[i]+" ");
        }
    }
    
}
