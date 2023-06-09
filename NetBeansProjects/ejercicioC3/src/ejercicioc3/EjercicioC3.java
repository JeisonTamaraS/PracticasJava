/*
 * ejercicio3: un obrero necesita calcular su salario semanal
               si trabaja 40 horas o menos se le paga $16 por hora
               si trabaja mas de 40 horas se le paga a $16 las 
               primeras 40 horas y a $20 las extra
 */
package ejercicioc3;

import javax.swing.JOptionPane;

/**
 *
 * @author jeison tamara
 */
public class EjercicioC3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int horas,extras,resultado;
        horas=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de horas trabajadas: "));
        if(horas<=40){
            resultado=horas*16;
        }else{
            extras=horas-40;
            resultado=(40*16)+(extras*20);
        }
         JOptionPane.showMessageDialog(null,"el salario semanal es de: $"+resultado);
    }
    
}
