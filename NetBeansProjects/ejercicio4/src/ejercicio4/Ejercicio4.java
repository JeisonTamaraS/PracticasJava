/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author jeison tamara
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        final int salario= 1000;
        int Ncarros;
        float costocarro, salariototal;
        System.out.println("digite en nro de carros vendidos: ");
        Ncarros= entrada.nextInt();
        System.out.println("diguite el valor unitario de los carros: ");
        costocarro= entrada.nextFloat();
        salariototal=salario+(Ncarros*150)+(0.05f*costocarro*Ncarros);
        System.out.println("salario total es de: "+salariototal);
    }
    
}
