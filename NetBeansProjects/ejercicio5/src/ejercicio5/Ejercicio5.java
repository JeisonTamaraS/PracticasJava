/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author jeison tamara
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        float participacion,primerexamen,segundoexamen,examenfinal,notatotal;
        
        System.out.println("nota participacion: ");
        participacion= entrada.nextFloat();
        System.out.println("nota primer examen: ");
        primerexamen= entrada.nextFloat();
        System.out.println("nota segundo examen: ");
        segundoexamen= entrada.nextFloat();
        System.out.println("nota examen final: ");
        examenfinal= entrada.nextFloat();
        notatotal=(participacion*0.10f)+(primerexamen*0.25f)+(segundoexamen*0.25f)+(examenfinal*0.40f);
        System.out.println("la nota total es: "+notatotal);
    }
    
}
