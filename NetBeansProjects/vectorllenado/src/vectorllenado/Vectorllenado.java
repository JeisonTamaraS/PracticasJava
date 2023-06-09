/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectorllenado;

import javax.swing.JOptionPane;

/**
 *
 * @author jeison tamara
 */
public class Vectorllenado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamaño;
        tamaño = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del vector: "));
        char[] letra = new char[tamaño]; //se declara el vector y se inicializa con la variable tamaño 
        for(int i=0;i<tamaño;i++){//en este ciclo se digitan los datos que llenaran el array
            letra[i]=JOptionPane.showInputDialog("Digite el caracter de la posicion "+(i+1)+": ").charAt(0);
        }
        for(int i=0;i<tamaño;i++){//este bucle recorre el array para imprimir los datos
            System.out.print(letra[i]+" , ");
        }
    }
    
}
