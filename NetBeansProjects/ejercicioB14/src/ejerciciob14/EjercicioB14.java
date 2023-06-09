/*
 *ejercicio14: pedir un numero entr 0 y 10 y mostrar su tabla de multiplicar
 */
package ejerciciob14;

import javax.swing.JOptionPane;

/**
 *
 * @author jeison tamara
 */
public class EjercicioB14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, multiplicacion;
        do{
            numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero numero: "));
        }while(numero<0 || numero>10);
        System.out.println("la tabla de multiplicar de "+numero+" es :");
        for(int i=1; i<=12; i++){
            multiplicacion=numero*i;
            System.out.println(numero+" * "+i+" = "+multiplicacion);
        }
    }
    
}
