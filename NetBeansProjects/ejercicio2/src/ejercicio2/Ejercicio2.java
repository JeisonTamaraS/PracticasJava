/*
ejercicio2:hacer un programa que calcule e imprima el salario 
semanal de un empleado a partir de sus horas semanales trabajadas
y de su salario por hora.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author jeison tamara
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int horas; 
        float salario, salsemanal;
        System.out.print("horas semanales: ");
        horas= entrada.nextInt();
        System.out.print("salario: ");
        salario= entrada.nextFloat();
        salsemanal= salario*horas;
        System.out.println("el salario semanal es:  "+salsemanal);
        
    }
    
}
