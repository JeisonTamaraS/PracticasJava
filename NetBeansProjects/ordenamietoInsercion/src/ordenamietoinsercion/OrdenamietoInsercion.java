/*
 * Ordenamiento por insercion: este metodo recorre cada posicion del arreglo preguntando 
                               si el numero anterior o el de la izquierda es mayor, si 
                               este es el caso entonces intercambia las posiciones y 
                               continua preguntando.
 */
package ordenamietoinsercion;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jeison tamara
 */
public class OrdenamietoInsercion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int tamaño,aux,pos;
        tamaño=Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del arreglo: "));
        int array[]= new int[tamaño];
        
        for(int i=0;i<tamaño;i++){
            System.out.print("Digite pos["+i+"] del arreglo: ");
            array[i]=entrada.nextInt();
        }
        //ordenamiento por insercion
        for(int i=0;i<tamaño;i++){//este ciclo recorre las posiciones del arreglo
            pos=i;//guardamos la posicion en la que se encuentra el arreglo
            aux=array[i];//guardamos el dato contenido en esa posicion
            while((pos>0)&& (array[pos-1]>aux)){//ciclo que se repite mientras el iterador almacenado en pos sea mayor a cer y ademas el daro en la posicion de la izquierda sea mayor a la posicion actual
                array[pos]=array[pos-1];//intercambiamos los valores 
                pos--;//disminuye la iteracion para seguir comparando hasta que llegue a la primera posicion y no tenga con quien mas comparar
            }
            array[pos]=aux;
        }
        //imprimimos el arreglo
        System.out.println("Arreglo ordenado: ");
        for(int i=0; i<tamaño;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("");
    }
    
}
