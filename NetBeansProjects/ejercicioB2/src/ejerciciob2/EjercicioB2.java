/*
 * ejercicio2: leer numeros hasta que se ingrese un cer, para cada uno indicar si es par o impar.
 */
package ejerciciob2;

import javax.swing.JOptionPane;

/**
 *
 * @author jeison tamara
 */
public class EjercicioB2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero: "));
        while(numero!=0){
            if(numero%2==0){//condicion si el numero es par
                System.out.println("el numero "+numero+" es par");
            }else{//si no es impar
                System.out.println("el numero "+numero+" es impar");
            }
            numero=Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
        }
    }
    
}
