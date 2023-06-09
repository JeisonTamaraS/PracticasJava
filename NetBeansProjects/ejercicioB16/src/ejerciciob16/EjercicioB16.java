/*
 * ejercicio16: pedir 10 numeros y mostrar al final si se ha introducido uno negativo.
 */
package ejerciciob16;

import javax.swing.JOptionPane;

/**
 *
 * @author jeison tamara
 */
public class EjercicioB16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero,contador=0;
        boolean negativo=false;
        for(int i=1; i<=10;i++){
            numero=Integer.parseInt(JOptionPane.showInputDialog("ingrese Nº"+i+": "));
            if(numero<0){
                contador++;
                negativo=true;
            }
        }
        if (negativo==true){
            System.out.println("se han introducido: "+contador+" numeros negativos");
        }else{
            System.out.println("no hay numeros negativos");
        }
    }
    
}
