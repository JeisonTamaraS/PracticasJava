/*
ejercicio2: en Megaplaza se hace un 20% de descuento en compras mayores a $300
            que cantidad pagara un cliente por su compra?
 */
package ejercicioc2;

import javax.swing.JOptionPane;

/**
 *
 * @author jeison tamara
 */
public class EjercicioC2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float compra,descuento;
        compra= Float.parseFloat(JOptionPane.showInputDialog("Ingree el valor de la Compra: "));
        
        if (compra>300){
            descuento=compra-(compra*0.20f);
            JOptionPane.showMessageDialog(null,"el valor a pagar es: "+ descuento);      
        }else{
            JOptionPane.showMessageDialog(null,"el valor a pagar es: "+compra);
        }
    }
    
}
