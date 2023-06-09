/*
 * ejercicio11:pedir un numero y calcular su factorial.
 */
package ejerciciob11;

import javax.swing.JOptionPane;

/**
 *
 * @author jeison tamara
 */
public class EjercicioB11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        long factorial=1;
        numero= Integer.parseInt(JOptionPane.showInputDialog("digite en numero N: "));
        
        for(int i=1;i<=numero;i++){
            factorial*=i;
        }
        System.out.println("el factorial de "+numero+"! es: "+factorial);
        
    }
    
}
