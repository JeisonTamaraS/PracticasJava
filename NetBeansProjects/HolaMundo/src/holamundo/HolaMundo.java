/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jeison tamara
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo"); //en esta linea se usa la palabra sout+tab para escritura rapida
       
        //TIPOS DE VARIABLES PRIMITIVAS
        // tipos de variables entero
        long entero= 50; //variable tipo entero tamaño: 8 rango: -9,223.372.036,854.775.808 hasta 9,223.372.036,854.775.807
        int entero1= 50;//variable tipo entero tamaño: 16 rango: -2,147.483.648hasta 2,147.483.647
        short entero2= 50;//variable tipo entero tamaño: 32 rango: -32,768 hasta 32767
        byte entero3= 50;//variable tipo entero tamaño: 64 rango: -128 hasta 127
        
        // variables de punto flotante
        float decimal= 3.45f;//variable tipo .flotante tamaño: 32 rango: -1.4e-045 hasta 3.4e+038
        double decimal1= 3.45;//variable tipo entero tamaño: 64 rango: -4.9e-324 hasta 1.8e+308
        
        //variables caracter y boleanos
        char caracter='a';//variable tipo caracter
        boolean decision=true;//variable booleana solo puede tener dos valores 
        boolean decision1=false;//verdadero o falso
        
        //TIPOS DE VARIABLES NO PRIMITIVAS
        //datos tipo integer y cadenas
        Integer numero= null;// variable de tipo entero que recibe el dato null
        String cadena="cadena de caracteres";//tipo de dato que recibe cadena de caracteres con comillas dobles
        
        //constantes
        final int constante=12;//para decalarar una constante se utiliza la palabra final 
        // entrada de datos por consola
        
        Scanner entrada= new Scanner(System.in);//se inicializa la variable tipo scaner
        String nombre;
        int edad;
        System.out.print("digite un nombre: ");
        nombre= entrada.nextLine();//funcion entrada de dato tipo cadena con variable tipo scaner
        System.out.print("digite la edad: ");
        edad = entrada.nextInt();//funcion entrada de dato tipo entero con variable tipo scaner
        System.out.println("nombre: "+nombre+"  eda: "+edad );
        
        //entrada y salida de datos con JOptionpage
        String texto;
        int numeroentero;
        char letra;
        double numerodecimal;
        
        texto = JOptionPane.showInputDialog("digite la cadena: ");
        //con el comando JOptionPane.showInputDialog abrimos una ventana que recibe datos de tipo caracter
        numeroentero = Integer.parseInt(JOptionPane.showInputDialog("digitr el numero: "));
        //con el comando Integer.parseInt convierto la cadena de caracteres en un dato tipo entero
        letra= JOptionPane.showInputDialog("digite la letra: ").charAt(0);
        //con el comando .chartAt(0) convierto la cadena de caracters a un solo caracter con indice cero
        numerodecimal = Double.parseDouble(JOptionPane.showInputDialog("digite el decimal: "));
        //con el comando Double.parseDouble convierto la cadena de texto en un dato tipo coma flotante
        
        JOptionPane.showMessageDialog(null, "la cadena es: "+texto);
        JOptionPane.showMessageDialog(null, "el numero es: "+numeroentero);
        JOptionPane.showMessageDialog(null, "la letra es: "+letra);
        JOptionPane.showMessageDialog(null, "el decimal es: "+numerodecimal);
        
    }
    
}
