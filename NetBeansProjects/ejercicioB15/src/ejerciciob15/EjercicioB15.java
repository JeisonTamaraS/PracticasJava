/*
 * ejercicio15:pedir un numero N, introducir N sueldos y mostrar el sueldo maximo.a
 */
package ejerciciob15;

import javax.swing.JOptionPane;

/**
 *
 * @author jeison tamara
 */
public class EjercicioB15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N;
        float sueldomax=0, sueldo;
        N=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero N:"));
        for(int i=1; i<=N;i++){
            sueldo=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el sueldo: "));
            if(sueldo>sueldomax){
                sueldomax=sueldo;
            }
        }
        System.out.println("el sueldo maximo es: "+sueldomax);
    }
    
}
