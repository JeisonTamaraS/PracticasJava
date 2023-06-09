/*
 * ejercicio5:pedir numeros hasta que se teclee un cero, mostrar la suma de todos los numeros introducidos.
 * 
 */
package ejerciciob5;

import javax.swing.JOptionPane;

/**
 *
 * @author jeison tamara
 */
public class EjercicioB5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero,suma=0;
        numero=Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
        while(numero!=0){
            suma+=numero;
            numero=Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
        }
        JOptionPane.showMessageDialog(null,"La suma de los numeros es: "+suma);
    }
    
}
