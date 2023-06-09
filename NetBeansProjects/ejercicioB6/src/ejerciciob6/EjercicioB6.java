/*
 * ejercicio6:pedir numeros hasta que se digite uno negativo y calcular la media.
 */
package ejerciciob6;

import javax.swing.JOptionPane;

/**
 *
 * @author jeison tamara
 */
public class EjercicioB6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero,suma=0,contador=0;
        float media;
        numero=Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
        while(numero>=0){//se declara la condicion para que el ciclo se cumpla
            suma+=numero;//se suman los numeros ingresados
            contador++;//se lleva la cuenta de los numeros ingresados 
            numero=Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));     
        }
        if(contador==0){
            JOptionPane.showMessageDialog(null,"no hay elementos para la media");
        }else{
            media= (float) suma/contador;//se calcula la media de los numeros ingresados y se convierte el dato en tipo float
            System.out.println("la media es: "+ media);
        }
    }
    
}
