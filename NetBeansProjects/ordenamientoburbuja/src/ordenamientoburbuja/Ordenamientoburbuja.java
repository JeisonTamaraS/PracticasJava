/*
 * Metodo de ordenamiento Burbuja: es un metodo para ordenar arreglos, recorriendo
                                   la posiciones cuantas veces sea necesaria hasta 
                                   obtener un arreglo ordenado.
 */
package ordenamientoburbuja;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jeison tamara
 */
public class Ordenamientoburbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int arreglo[], Nelementos, aux;//declaramos las variables
        Nelementos=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de datos del arreglo: "));//pedimos el tamaño total del arreglo
        
        arreglo= new int[Nelementos];//inicializamos el arreglo con el tamaño ingresado
        
        for(int i=0;i<Nelementos;i++){//llenamos el arreglo
            System.out.print("Digite pos["+i+"] del array: ");
            arreglo[i]=entrada.nextInt();
        }
        //Metodo burbuja
        for(int i=0;i<(Nelementos-1);i++){//este ciclo recorre el arreglo las veces necesarias para ordenarlo
            for(int j=0;j<(Nelementos-1);j++){//este ciclo recoore el arreglo para intercambiar los datos 
                if(arreglo[j]>arreglo[j+1]){//si posicion actual es mayor posicion siguiente intercambiamos los datos
                    aux=arreglo[j];//guardamos el dato de la posicion actual
                    arreglo[j]=arreglo[j+1];//asignamos el valor de la posicion siguiente
                    arreglo[j+1]=aux;//completamos el intercambio
                }
            }
        }
        System.out.println("Arreglo ordenado de manera creciente");
        for(int i=0;i<Nelementos;i++){
            System.out.print(arreglo[i]+" ");
        }
    }
    
}
