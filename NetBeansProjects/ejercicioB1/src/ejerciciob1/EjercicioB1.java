/*
 *ejercicio1:leer un numeroe indicar si es positivo o negativo.
             el proceso se repetira hasta que se digite un cero.
 */
package ejerciciob1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jeison tamara
 */
public class EjercicioB1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        numero=Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
        while(numero!=0){//se declara la condicion del bucle para que todo numero diferente de cero sea positivo o negativo cumpla la condicion.
            if(numero>0){//se declara la cndicion para saber si el numero es positivo
                JOptionPane.showMessageDialog(null, "el numero "+ numero +" es positivo.");
            }else{//si el if no se cumple entonces el else garantiza que el numero es negativo
                 JOptionPane.showMessageDialog(null, "el numero "+ numero +" es negativo.");
            }
            numero=Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
        }
    }
    
}
