/*
 *ejercicio8: crear un programa que lea una tabla de 10 numeros y la dezplace una
              posicion hacia abajo: el primero pasa a segundo, el segundo a tercero,etc
              y el ultimo pasa a ser el primero.
 */
package ejerciciov8;

import java.util.Scanner;

/**
 *
 * @author jeison tamara
 */
public class EjercicioV8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int array[]=new int[10];//inicializamos y declaramos el array
        int elemento=0; 
        for(int i=0;i<10;i++){//este ciclo llena el array
            System.out.print("Digite el nº"+(i+1)+": ");
            array[i]=entrada.nextInt();
        }
       
        elemento=array[9];//guardamos el ultimo elemento
        for(int i=8;i>=0;i--){//este ciclo recorre el array desde la posicion 9 hasta el inicio
            array[i+1]=array[i];//le asignamos el valor a la posicion de al lado, corremos los numeros hacia la derecha
        }
        array[0]=elemento;//asignamos el ultimo elemento como el primero
        
        System.out.print("el vector es: ");//este ciclo recorre el array para imprimirlo
        for(int i=0; i<10;i++){
            System.out.print(array[i]+" ");
        }
    }
    
}
