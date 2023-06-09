/*
 * ejercicio12: diseñar un programa que pida un arreglo de 10 posiciones, y divida
                en dos los numeros pares y los impares.
 */
package ejercicov12;

import java.util.Scanner;

/**
 *
 * @author jeison tamara
 */
public class EjercicoV12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int array[]= new int[10];
        int conteopar=0,conteoimpar=0;
        for(int i=0;i<10;i++){//llenamos el array de 10 posiciones
            System.out.print("Digite pos["+i+"] del array: ");
            array[i]=entrada.nextInt();
            
            if(array[i]%2==0){//contamos cuantos numeros pares hay
                conteopar++;
            }else{//cuantos numeros impares
                conteoimpar++;
            }
        }
        int par[]=new int[conteopar];//declaramos e inicializamos el array par dependiendo cuantos numero pares hay
        int impar[]=new int[conteoimpar];//declaramos e inicializamos el array con la cantidad de numeros impares
        
        conteopar=0;
        conteoimpar=0;
        
        for(int i=0;i<10;i++){
            if(array[i]%2==0){//guardamos en el array par los datos pares
                par[conteopar]=array[i];
                conteopar++;
            }else{//guardamos el el array impar los datos impares
                impar[conteoimpar]=array[i];
                conteoimpar++;
            }
        }
        for(int i=0;i<conteopar;i++){//imprimimos el array par
            System.out.print(par[i]+" ");
        }
        System.out.println(" ");
        for(int i=0;i<conteoimpar;i++){//imprimimos el array impar
            System.out.print(impar[i]+" ");
        }
    }
    
}
