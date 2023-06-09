/*
 * ejercicio6: leer 10 numeros enteros, la aplicacion debe indicarnos si los numeros
               estan ordenados de manera creciente, decreciente o en desorden.
 */
package ejerciciov6;

import java.util.Scanner;

/**
 *
 * @author jeison tamara
 */
public class EjercicioV6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int numero[]= new int[10];//declaramos e inicializamos el array
        boolean creciente=false, decreciente=false;//declaramos las variables de tipo bool para evaluar el orden de el vector
        for(int i=0;i<10;i++){//con este ciclo llenamos el vector
            System.out.print("Digite en Nº"+(i+1)+": ");
            numero[i]=entrada.nextInt();
        }
        
        for(int i=0;i<9;i++){//con este ciclo recorremos el array
            if(numero[i]<numero[i+1]){//comparamos la posicion anterior con la siguiente para saber si crece
                creciente=true;
            }
            if(numero[i]>numero[i+1]){//comparamos la posicion anterior con la siguiente para saber si decrece
                decreciente=true;
            }
        }
        
        if(creciente==true && decreciente==false){//si la variable creciente es verdadera y la decreciente es falsa
            System.out.println("el orden es creciente");//entonces el orden es creciente
        }else if(creciente==false && decreciente==true){//si la variable creciente es falsa y la decreciente es verdadera
            System.out.println("el orden es decreciente");//entonces el orden es decreciente
        }else if(creciente==true && decreciente==true){//cuando las dos variables son verdaderas 
            System.out.println("el array esta en desorden");//el orden cambia de creciente a decreciente por lo que esta en desorden
        }else{//en cualquier otro caso o que las dos variables son falsas
            System.out.println("todos los numeros son iguales");//entonces los numeros son iguales
        }
        
        
    }
    
}
