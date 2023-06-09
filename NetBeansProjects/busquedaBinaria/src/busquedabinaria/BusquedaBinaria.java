/*
 * Busqueda Binaria: este Metodo de busqueda es mas eficiente pero necesita que
                     el arreglo este ordenado de forma creciente
 */
package busquedabinaria;

import javax.swing.JOptionPane;

/**
 *
 * @author jeison tamara
 */
public class BusquedaBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arreglo[] = {1,2,3,4,5};
        int dato,inferior,superior,mitad,i;
        boolean bandera=false;
        
        dato=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero que desea buscar: "));
        
        //busqueda binaria
        inferior=0;
        superior=5;
        i=0;
        mitad=(inferior+superior)/2;
        while(inferior<=superior && i<5){
            if(arreglo[mitad]==dato){
                bandera=true;
            }
            if(arreglo[mitad]>dato){
                superior=mitad;
                mitad=(inferior+superior)/2;
            }
            if(arreglo[mitad]<dato){
                inferior=mitad;
                mitad=(inferior+superior)/2;
            }
            i++;
        }
        
        if(bandera==true){//se imprime la posicion i-1 porque en el ciclo el contador aumenta al final
            JOptionPane.showMessageDialog(null,"El numero se encuentra en la posicion["+mitad+"] del arreglo");          
        }else{
            JOptionPane.showMessageDialog(null,"El numero no se encuentra en el arreglo");
        }
    }
    
}
