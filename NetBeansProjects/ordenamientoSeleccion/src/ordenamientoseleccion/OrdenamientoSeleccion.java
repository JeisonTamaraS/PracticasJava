/*
 * Ordenamiento por seleccion: consiste en selecinar el minimo valor de arreglo e
                               ir cambiandolo de posicion siguiento los siguientes pasos
                               1.buscarel minimo elemento de la lista
                               2.intercambiar con el primer elemento
                               3.buscar el minimo de resto de la lista
                               4.intercambiar con el segundo
                               5.y asi sucesivamente
 */
package ordenamientoseleccion;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jeison tamara
 */
public class OrdenamientoSeleccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int Nelementos,min,aux;
        Nelementos=Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del arreglo: "));
        int array[]=new int[Nelementos];
        
        for(int i=0; i<Nelementos;i++){
            System.out.print("Digite ps["+i+"] del arreglo: ");
            array[i]=entrada.nextInt();
        }
        //ordenamiento por seleccion
        
        for(int i=0;i<Nelementos;i++){//recorre el arreglo 
            min=i;//guarda la posicion en la que esta
            for(int j=i+1;j<Nelementos;j++){//recorre el resto del arreglo para seleccionar el minimo dato
                if(array[j]<array[min]){//condidion si la posicion siguiente es menor que la posicion actual
                    min=j;//si se cumple la condicion entonces la nueva posicion sera el dato minimo
                }
            }
            //intercambiamos el valor minimo en la pocicion anterior
            aux=array[i];
            array[i]=array[min];
            array[min]=aux;
        }
        System.out.println("Imprimimos el arreglo: ");
        for(int i=0;i<Nelementos;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");
    }
}
    

