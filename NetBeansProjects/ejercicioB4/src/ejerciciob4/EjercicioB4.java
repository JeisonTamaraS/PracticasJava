/*
 *ejercicio4: realizar un juego para adivinar un numero, para ello generar un numero aleatorio entre
              0-100, y luego ir pidiendo numeros indicando es mayor o menor segun sea menor o mayor,
              con respecto a N, el proceso termina cuando el usuario acierta y mostrar el numero de 
              intentos.
 */
package ejerciciob4;

import javax.swing.JOptionPane;

/**
 *
 * @author jeison tamara
 */
public class EjercicioB4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N,contador=0,numero;
        N=(int)(Math.random()*100);//generamos un numero aleatorio con el metodo .random lo miltiplicamos por 100
                                   //para que sea entre 0-100.
        numero=Integer.parseInt(JOptionPane.showInputDialog("Dijite un numero: "));
        while(numero!=N){
            contador++;//la variable contador lleva la cuenta de los intentos realizados.
            if(numero>N){//se evalua la condicion si el numero es mayor
                JOptionPane.showMessageDialog(null,"el numero "+numero+" es mayor");
            }else{//si no el numero es menor
                JOptionPane.showMessageDialog(null,"el numero "+numero+" es menor");
            }
        numero=Integer.parseInt(JOptionPane.showInputDialog("Dijite un numero: "));
        }
        JOptionPane.showMessageDialog(null,"Has acertado el numero "+N+"\nintentos: "+contador);
    }
    
}
