/*
 * ejercicio5: ordenar 3 numeros de mayor a menor
 */
package ejercicioc5;

import javax.swing.JOptionPane;

/**
 *
 * @author jeison tamara
 */
public class EjercicioC5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A,B,C;
        A=Integer.parseInt(JOptionPane.showInputDialog("digite primer numero: "));
        B=Integer.parseInt(JOptionPane.showInputDialog("digite segundo numero: "));
        C=Integer.parseInt(JOptionPane.showInputDialog("digite tercer numero: "));
        if((A>B)&&(B>C)){
            JOptionPane.showMessageDialog(null,"Orden: "+ A+" , "+B+" , "+C);
        }else if((A>C)&&(C>B)){
            JOptionPane.showMessageDialog(null,"Orden: "+ A+" , "+C+" , "+B);
        }else if((B>A)&&(A>C)){
            JOptionPane.showMessageDialog(null,"Orden: "+ B+" , "+A+" , "+C);
        }else if((B>C)&&(C>A)){
            JOptionPane.showMessageDialog(null,"Orden: "+ B+" , "+C+" , "+A);
        }else if((C>A)&&(A>B)){
            JOptionPane.showMessageDialog(null,"Orden: "+ C+" , "+A+" , "+B);
        }else{
            JOptionPane.showMessageDialog(null,"Orden: "+ C+" , "+B+" , "+A);
        }
    }
    
}
