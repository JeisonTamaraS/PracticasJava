/*
 * ejercicio12: pedir 10 numeros,mostrar la media de los numeros positivos, la media de los numeros negativos
                y la cantidad de ceros.
 */
package ejerciciob12;

import javax.swing.JOptionPane;

/**
 *
 * @author jeison tamara
 */
public class EjercicioB12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, positivos=0,contpos=0, negativos=0,contneg=0, ceros=1;
        float mediapos, medianeg;

        for(int i=1;i<10;i++){
            numero=Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
            if(numero>0){
                positivos+=numero;
                contpos++;
            }else if(numero<0){
                negativos+=numero;    
                contneg++;
            }else{
                ceros++;
            }
        }
        mediapos=(float)positivos/contpos;
        medianeg=(float)negativos/contneg;
        JOptionPane.showMessageDialog(null,"la media de los positivos es: "+mediapos);
        JOptionPane.showMessageDialog(null,"la media de los negativos es: "+medianeg);
        JOptionPane.showMessageDialog(null,"la cantidad de ceros es: "+ceros);
    }
    
}
