/*
 * Tejercicio13: pedir 10 sueldos, mostrar su suma y cuantos hay mayores a $1000.
 */
package ejerciciob13;

import javax.swing.JOptionPane;

/**
 *
 * @author jeison tamara
 */
public class EjercicioB13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float sueldo, suma=0;
        int    contador=1;
        for(int i=1;i<=10;i++){
            sueldo=Float.parseFloat(JOptionPane.showInputDialog("Digite el sueldo: "));
            suma+=sueldo;
            if(sueldo>1000){
                contador++;
            }
        }
        System.out.println("la suma es: "+suma);
        System.out.println("los sueldos mayores a $1000 son: "+contador);
    
    }
}
