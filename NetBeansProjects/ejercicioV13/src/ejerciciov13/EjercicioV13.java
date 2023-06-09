/*
 * ejericio13: diseñar un programa que lea dos arreglos de 10 numeros enteros cada
               uno, ordenados de forma creciente, combinarlos en otro arreglo pero 
               manteniendo el orden creciente.
 */
package ejerciciov13;

import java.util.Scanner;

/**
 *
 * @author jeison tamara
 */
public class EjercicioV13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int A[]= new int[10];//declaramos e inicializamos los arrays 
        int B[]= new int[10];
        int C[]= new int[20];
        boolean creciente = true;
        System.out.println("Digite el primer array");
        do{//ciclo que evalua si el orden es creciente
            for(int i=0;i<10;i++){//llenamos el array
                System.out.print("Digigte pos["+i+"] del array: ");
                A[i]=entrada.nextInt();
            }
            for(int i=0;i<9;i++){//evaluamos la condicion si el dato siguiente es mayor 
                if(A[i]<A[i+1]){
                    creciente=true;
                }
                if(A[i]>A[i+1]){//evaliamos si el dato siguiente es menor
                    creciente=false;
                    break;
                }
            
            }
            if(creciente==false){//si el orden es decreciente repetimos el array
                System.out.println("el orden del array es incorrecto, Digite nuevamente");
            }
        
        }while(creciente==false);//el ciclo se repite siempre que el orden no sea creciente
        //repetimos para el segundo array
        System.out.println("Digite el segundo array");
        do{
            for(int i=0;i<10;i++){
                System.out.print("Digigte pos["+i+"] del array: ");
                A[i]=entrada.nextInt();
            }
            for(int i=0;i<9;i++){
                if(B[i]<B[i+1]){
                    creciente=true;
                }
                if(B[i]>B[i+1]){
                    creciente=false;
                    break;
                }       
            }
            if(creciente==false){
                System.out.println("el orden del array es incorrecto, Digite nuevamente");
            }
        }while(creciente==false);
        
        int i=0;//iterador para el array A
        int j=0;//iterador para el array B
        int k=0;//iterador para el array C
        
        while(i<10 && j<10){
            if(A[i]<B[j]){//si el dato en A es menor que en B
                C[k]=A[i];//copiamos el dato en C
                i++;
            }else{
                C[k]=B[j];//si no copiamos el dato de B en C
                j++;
            }
            k++;
        }
        if(i==10){//cuando i llega a 10 significa que ya comipamos el arreglo A o B
            while(j<10){//mientras i sea menor a 10
                C[k]=B[j];//copiamos el arreglo B en C
                j++;
                k++;
            }
        }else{
            while(i<10){
                C[k]=A[i];//falta el arreglo A en C
                i++;
                k++;
            }
        }
        System.out.println("el arreglo resultante es: ");
        for(k=0;k<20;k++){
            System.out.print(C[k]+" ");
        }
    }
    
}
