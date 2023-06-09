/*
 * Busqueda secuencial: este metodo se utiliza para buscar un dato en un arraglo 
                        recorriendo cada posicion del arraglo, no es necesario que
                        este ordenado.
 */
package busquedasecuencial;

import javax.swing.JOptionPane;

/**
 *
 * @author jeison tamara
 */
public class BusquedaSecuencial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arreglo[] = {3,2,5,6,1};
        int dato;
        boolean bandera=false;
        
        dato=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero que desea buscar: "));
        
        //busqueda secuencial
        int i=0;
        while(i<5 && bandera==false){//el ciclo se repite hasta que se recorra todo el arreglo y ademas el dato no sea encontrado
            if(arreglo[i]==dato){//condicion si el dato es igual a la posicion actual del arreglo
                bandera=true;
            }
            i++;
        }
        if(bandera==false){
            JOptionPane.showMessageDialog(null,"El numero no se encuentra en el arreglo");
        }else{//se imprime la posicion i-1 porque en el ciclo el contador aumenta al final
            JOptionPane.showMessageDialog(null,"El numero se encuentra en la posicion["+(i-1)+"] del arreglo");
        }
    }
    
}
