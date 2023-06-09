/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

import java.util.Scanner;

/**
 *
 * @author jeison tamara
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // OPERADORES ARITMETICOS
        Scanner entrada = new Scanner(System.in);//se declara la variable tipo scaner para capturar los datos 
        float numero1,numero2,suma,resta,multip,div,resto;//se delcaran las variables con las que se opera
        
        System.out.println("digite 2 numeros: ");
        numero1 = entrada.nextFloat();//se capturan los datos 
        numero2 = entrada.nextFloat();
        
        suma= numero1+numero2;//operacion suma
        resta= numero1-numero2;//operacion resta
        multip= numero1*numero2;//multiplicacion
        div= numero1/numero2;//division
        resto= numero1%numero2;//residuo
        
        System.out.println("la suma es: "+suma);//se muestran en consola los resultados
        System.out.println("la resta es: "+resta);
        System.out.println("la multiplicacion es: "+multip);
        System.out.println("la division es: "+div);
        System.out.println("el residuo es: "+resto);
        
        //operadores concombinados con asignacion, incremento y decremento
        int num=10;
        num = num+10;// para hacer ua operacion sobre la misma variable esta puede ser abreviada
        num -=5;//en este caso la abreviacion es -= pero puede ser cualquier operacion
        num--;//el operador -- le resta una unidad al valor de la variable
        num++;//el operador ++ incrementa en uno el valor de la variable
        
        //operaciones con la clase math
        double raiz = Math.sqrt(9); //el metodo .sqrt de la clase math solo acepta variables de tipo double para la raiz
        double base=4, exponen=3;//se declaran las variables a operar en el exponencial de tipo double
        double resultado= Math.pow(base, exponen);//el metodo .pow de la clase math solo acepta valores double
        double dato= 4.68;//se declara la variable tipo float o double
        long redondeo= Math.round(dato);//el metodo .round acepta dato tipo double y el resultado es tipo long, y los datos tipo float los regresa como tipo int.
        double aleatorio = Math.random();//el metodo .radom genera un valor aleatorio de tipo double 
    }
    
}
