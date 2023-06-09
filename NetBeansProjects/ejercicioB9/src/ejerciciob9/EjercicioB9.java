/*
 * ejercicio9: pedir 10 numeros y escribir la suma total.
 */
package ejerciciob9;

import javax.swing.JOptionPane;

/**
 *
 * @author jeison tamara
 */
public class EjercicioB9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero,suma=0,i=1;
        do{
            numero=Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
            suma+=numero;
            i++;
        }while(i<=10);
        JOptionPane.showMessageDialog(null,"la suma es: "+suma);
    }
    
}
