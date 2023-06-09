/*
ciclo while
    while(condicion){               este ciclo evalua la condicion y si esta se cumple 
        instruccion;                ejecuta las instrucciones hasta que deje de cumplirse.
        incremento o decremento;--->se declara la variable que le pone fin a la condicion.     
    }
ciclo do while
    do{                             este ciclo ejecula las instrucciones antes de evaluar  
        instrucciones;              la condicion, lo que garantiza que por lo menos una vez
        incremento o decremento;    se ejecutaran las instrucciones.
    }while(condicion);   
ciclo for
    for(inicializacion ; condicion ; incremento o decremento){ las caracteristicas para que las condiciones 
        instrucciones;                                         se den estan declaradas dentro del for, si estas
    }                                                          se cumplen se ejecutaran las instrucciones.
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author jeison tamara
 */
public class Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int i=1,contador;
        System.out.print("digite cuantos numeros quiere: ");
        contador=entrada.nextInt();
        while(i<=contador){
            System.out.println(i);
            i++;
        }
    }
    
}
