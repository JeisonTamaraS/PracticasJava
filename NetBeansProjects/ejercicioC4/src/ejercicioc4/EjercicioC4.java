/*
 *ejercico4: comprobar si dos numeros son pares o impares
 */
package ejercicioc4;

import javax.swing.JOptionPane;

/**
 *
 * @author jeison tamara
 */
public class EjercicioC4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1,numero2;
        numero1=Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("digite otro numero: "));
    
        if((numero1%2==0)&&(numero2%2==0)){
            JOptionPane.showMessageDialog(null,"los numeros son pares");
        }else if((numero1%2!=0)&&(numero2%2!=0)){
            JOptionPane.showMessageDialog(null,"los numeros son impares");
        }else{
            JOptionPane.showMessageDialog(null,"un numero es par y otro impar ");
        }
    }
    
}
