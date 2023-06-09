/*
ejercicio1: hacer la suma de tres calificaciones y mostrarlas en consola
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author jeison tamara
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);//
      float nota1, nota2, nota3, suma;
        System.out.println("digite nota1: ");
        nota1= entrada.nextFloat();
        System.out.println("digite nota2: ");
        nota2= entrada.nextFloat();
        System.out.println("digite nota3: ");
        nota3= entrada.nextFloat();
        
        suma=nota1+nota2+nota3;
        System.out.println("la suma de las notas es: "+suma);
    }
    
}
