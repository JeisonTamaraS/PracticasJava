/*
ejercicio3: guillermo tiene N dolares, luis tiene la mitad de lo que guillermo posee
juan tiene la mitad de lo que guillermo y luis tienen juntos, hacer un programa
que calcule e imprima la cantidad de dinero que tienen entre los tres.
 */
package ejercicio3;
import java.util.Scanner;
/**
 *
 * @author jeison tamara
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        float guillermo, luis, juan, total;
        System.out.println("cuantos dolares que tiene guillermo: ");
        guillermo= entrada.nextFloat();
        
        luis= guillermo/2;
        juan= (guillermo+luis)/2;
        total= guillermo+juan+luis;
        System.out.println("entre los tres tienen: "+total+" dolares");
    }
    
}
