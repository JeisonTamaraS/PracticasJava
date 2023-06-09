/*
CONDICIONALES: 
if(condicion){
    instruccion 1
}else{
    instruccion 2
}
swich(dato){
    case1: instruccion1;
           break;
    case2: instruccion2;
           break;
    default: instruccion;
}
operador ternario
valor= (condicion) ? valor1 : valor2;
 */
package condicionales;

import javax.swing.JOptionPane;

/**
 
 */
public class Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A,B;//declaramos las variables a operar
        A= Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de A: "));//pedimos los datos mediante JOption
        B= Integer.parseInt(JOptionPane.showInputDialog("digite el valor de B: "));//y los almavcenamos en las variables
        
        //este es el bloque de condiciones 
        if(A==B){
            JOptionPane.showMessageDialog(null,"el valor de A es igual a B");
        }else if(A>B){
            JOptionPane.showMessageDialog(null,"el valor de A es mayor al de B");
        }else{
            JOptionPane.showMessageDialog(null,"el valor de A es menor al de B");
        }
    }
    
}
