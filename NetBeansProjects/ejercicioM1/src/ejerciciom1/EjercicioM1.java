/*
 * ejercicio1: determinar si una matriz es simetrica o no 
 */
package ejerciciom1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jeison tamara
 */
public class EjercicioM1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int matriz[][],Nfilas,Ncolum;
        boolean simetrica=true;
        Nfilas=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));
        Ncolum=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas: "));
        
        matriz=new int[Nfilas][Ncolum];
        //llenamos la matriz
        for(int i=0;i<Nfilas;i++){
            for(int j=0;j<Ncolum;j++){
                System.out.print("Digite pos["+i+"]["+j+"]: ");
                matriz[i][j]=entrada.nextInt();
            }
        }
        //comprobamos si la matriz es simetrica
        //para que sea simetrica debe cumplir dos caracteristicas 
        if(Nfilas==Ncolum){//1.comprobamos si es cuadrada
            //ademas de ser cuadrada para ser simetrica  debe cumplir una segunda condicion
            //2.la matriz debe ser igual a su traspuesta
            int i,j;
            i=0;
            while(i<Nfilas && simetrica==true){//ciclo que recorre la matriz hasta la ultima posicion de la fila mientras 
                j=0;
                while(j<i && simetrica==true){
                    if(matriz[i][j]!=matriz[j][i]){//condicion si la matriz traspuesta es diferente de la matriz original
                        simetrica=false;//cambio de estado de la bandera para terminar el ciclo
                    }
                    j++;
                }
                i++;
            }
            if(simetrica==true){//mientras la bandera sea verdadera se cumple la condidion de que la matriz original es igual a su traspuesta
                JOptionPane.showMessageDialog(null,"La matriz es simetrica");//entonces se imprime mensage de matriz simetrica
            }else{//por el contrario la matriz en asimetrica 
                JOptionPane.showMessageDialog(null,"La matriz no es simetrica");
            }
        }else{//si no cumple la primera condicion entonces no es simetrica
            JOptionPane.showMessageDialog(null,"La matriz no es simetrica");
        }
    }
    
}
