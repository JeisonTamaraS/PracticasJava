/*
ejercicio3:pedir numeros hasta que se teclee uno negativo, y mostrar cuantos numeros se han introducido.
 */
package ejerciciob3;

import javax.swing.JOptionPane;

/**
 *
 * @author jeison tamara
 */
public class EjercicioB3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero,i=1;//se declaran las variables a operar
        numero=Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));//se pide el numero inicial
        for(i=1;numero>=0;i++){//se declaran las condiciones del ciclo; inicio:1 ;condicion: numeros mayores o iguales a cero; incremento:+1
            JOptionPane.showMessageDialog(null,"se han introducido "+i+" numeros");//imprime cantidad de numeros digitados
            numero=Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
        }
    }
    
}
