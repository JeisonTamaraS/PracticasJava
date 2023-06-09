/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.awt.image.ImageObserver;
import javax.swing.JOptionPane;

/**
 *
 * @author jeison tamara
 */
public class Ejercicios {

   
    public static void main(String[] args) {
        int a=5,b=4;
        int suma=0,resta=0,mult=0,div=0,mod=0;
        String nombre=JOptionPane.showInputDialog("Ingresa tu nombre");
        suma=a+b;
        resta=a-b;
        mult=a*b;
        div=a/b;
        mod=a%b;
        System.out.println("Bienvenido "+nombre );
        System.out.println("suma= "+suma+" resta= "+resta+" multiplicacion= "+mult+" division= "+div+" modulo= "+mod);
        if(a>b){
            System.out.println("el numero mayor es a="+a);
        }else if(a<b){
            System.out.println("el numero mayor es b="+b);
        }else{
            System.out.println("Los numeros son iguales");
        }
    }
    
}
