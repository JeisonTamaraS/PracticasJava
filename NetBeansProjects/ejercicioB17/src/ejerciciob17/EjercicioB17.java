/*
 * ejercicio17: pedir 5 calificaciones y decir si al final hay algun reprobado.
 */
package ejerciciob17;

import javax.swing.JOptionPane;

/**
 *
 * @author jeison tamara
 */
public class EjercicioB17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float calificacion;
        boolean reprobado=false;
        
        for(int i=1;i<=5;i++){
            do{
            calificacion=Float.parseFloat(JOptionPane.showInputDialog("ingrese la calificacion Nª"+i+": "));
            }while(calificacion<1 || calificacion>5);
            if(calificacion<3){
                reprobado=true;
            }
        }
        if(reprobado==true){
            System.out.println("hay al menos un reprobado");
        }else{
            System.out.println("no hay reprobados");
        }
    }
    
}
