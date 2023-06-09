/*
 * ejercicio11: diseñar un programa que me pida en pantalla un array de 10 posiciones
                pedir una posicion(0-9) y eliminar el dato, ademas imprimir el array sin 
                hueco.
 */
package ejerciciov11;

import java.util.Scanner;

/**
 *
 * @author jeison tamara
 */
public class EjercicioV11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int array[]=new int[10];//declaramos e inicializamos el array
        int posicion;
        
        for(int i=0;i<10;i++){//llenamos el array
            System.out.print("Digite pos["+i+"] del array: ");
            array[i]=entrada.nextInt();
        }
        do{//este ciclo garantiza que la posicion este enre 0 y 9
            System.out.println("Digite una posicion(0-9): ");
            posicion=entrada.nextInt();
        }while(posicion<0 || posicion>9);//la condicion para que el ciclo se repita si posicion no esta entre 0-9
        
        for(int i=posicion;i<9;i++){//este ciclo se posiciona sobre la posicion ingresada 
            array[i]=array[i+1];//se le asignan los valores a la posicion de la izquierda
        }
        
        System.out.print("El arreglo resultante es: ");
        for(int i=0;i<9;i++){//imprimimos el array resultante
            System.out.print(array[i]+" ");
        }
    }
    
}
