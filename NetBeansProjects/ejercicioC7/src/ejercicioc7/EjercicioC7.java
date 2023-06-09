/*
 * ejercicio7: hacer una calculadora que tome dos valores y realice las 4 operaciones basicas
               pero diferenciandolas con las letras S:suma , R:resta , M:multiplicacion
               y D:division
 */
package ejercicioc7;

import javax.swing.JOptionPane;

/**
 *
 * @author jeison tamara
 */
public class EjercicioC7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1,numero2,resultado;
        char operacion;
        numero1=Integer.parseInt(JOptionPane.showInputDialog("digite el primer numero: "));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("digite el segundo numero: "));
        operacion=JOptionPane.showInputDialog("digite la operacion: ").charAt(0);
        switch (operacion){
            case 'S':
                resultado=numero1+numero2;
                JOptionPane.showMessageDialog(null,"la suma es: "+resultado);
                break;
            case 'M':
                resultado=numero1*numero2;
                JOptionPane.showMessageDialog(null,"la multiplicacion es: "+resultado);
                break;
            case 'R':
                resultado=numero1-numero2;
                JOptionPane.showMessageDialog(null,"la resta es: "+resultado);
                break;
            case 'D':
                resultado=numero1/numero2;
                JOptionPane.showMessageDialog(null,"la division es: "+resultado);
                break;
            default: 
                JOptionPane.showMessageDialog(null,"la operacion no existe");
                break;
        }
        
    }
    
}
    

