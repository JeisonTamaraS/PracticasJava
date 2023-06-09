/*
 *ejercicio10: diseñar un programa que tenga un arreglo de 10 posiciones, pedir
               en pantalla 5 numeros en orden creciente, pedir un numero e insertarlo
               en la posicion que permita que el arreglo siga ordenado de formacreciente.
 */
package ejerciciov10;

import java.util.Scanner;

/**
 *
 * @author jeison tamara
 */
public class EjercicioV10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int array[]= new int[10];//declaramos e inicializamos el array
        int numero,sitio_numero=0,j=0;
        boolean creciente=true;
        
        do{//este ciclo me permite digitar el array las veces que no se digite correctamente
            for(int i=0;i<5;i++){//este ciclo me pide los 5 numero del array
                System.out.print("Digite Pos["+i+"] del array: ");
                array[i]=entrada.nextInt();
            }
            for(int i=0;i<4;i++){//este ciclo evaluara si el orden de los numeros es correcto
                if(array[i]<array[i+1]){//condicion si el numero que sige es mayor entonces es creciente
                    creciente=true;
                }
                if(array[i]>array[i+1]){//condicion si el numero que sige es menos entonces no es creciente
                    creciente=false;
                    break;
                }
            }
            if(creciente==false){//condicion si el vector no es creciente digite nuevamente
                System.out.println("El array esta en desorden, Digite nuevamente");
            }
        
        }while(creciente==false);//el ciclo do-while se repite hasta que creciente sea true
        
        System.out.println("Digite un numero N: ");//pedimos el numero que se insertara en el array
        numero=entrada.nextInt();
        while(array[j]<numero && j<5){//este ciclo recorre las posiciones del array evaluando si el numero ingresado es mayor al de la posicion
            sitio_numero++;//llevamos la cuenta de la posicion en la que el numero debe ser ingresado
            j++;
        }
        for(int i=4;i>=sitio_numero;i--){//desplazamos los numeros despues del numero ingresado hacia la derecha
            array[i+1]=array[i];
        }
        array[sitio_numero]=numero;//insertamos el numero
        for(int i=0;i<6;i++){//imprimimos el array eresultante
            System.out.print(array[i]+" ");
        }
    }
        
    
}
