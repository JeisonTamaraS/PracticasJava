/*
 * ejercicio6: digite un numero entre 0 y 99999 y diga cuantas cifras tiene.
 */
package ejercicioc6;

import javax.swing.JOptionPane;

/**
 *
 * @author jeison tamara
 */
public class EjercicioC6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        numero=Integer.parseInt(JOptionPane.showInputDialog("digite un numero entre 0 y 99999: "));
        if(numero<10){
            JOptionPane.showMessageDialog(null,"el numero "+numero+" tiene una cifra");
        }else if(numero<100) {
            JOptionPane.showMessageDialog(null,"el numero "+numero+" tiene dos cifra");
        }else if(numero<1000) {
            JOptionPane.showMessageDialog(null,"el numero "+numero+" tiene tres cifra");
        }else if((numero<10000)) {
            JOptionPane.showMessageDialog(null,"el numero "+numero+" tiene cuatro cifra");
        }else{
            JOptionPane.showMessageDialog(null,"el numero "+numero+" tiene cinco cifra");
        }
    }
    
}
