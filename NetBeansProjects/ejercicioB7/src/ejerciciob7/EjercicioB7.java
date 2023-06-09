/*
 * ejercicio7:pedir un numero N y mostrar todos los numeros de 1 a N.
 */
package ejerciciob7;

import javax.swing.JOptionPane;

/**
 *
 * @author jeison tamara
 */
public class EjercicioB7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, N;
        N= Integer.parseInt(JOptionPane.showInputDialog("digite N: "));
        for(i=1;i<=N;i++){
            System.out.println(i);
        }
        
        
    }
    
}
