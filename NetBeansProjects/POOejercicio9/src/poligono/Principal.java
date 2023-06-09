/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligono;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jeison tamara
 */
public class Principal {
    //creamos un arreglo dinamico, no es necesario indicar el tamaño del arreglo pues este se acomoda
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    //Declaramos el Scanner en moto estatico de clase para poder usarlo en todos los metodos de esta
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args){
        //para que el metodo principal ejecute el programa solo es necesario invocar los metodos creados
        //esto permite que el programa este mejor organizado
        llenarPoligono();
        mostrarDatos();
    }    
        
    //metodo para llenar los poligonos 
    public static void llenarPoligono(){
        char respuesta;
        int opcion;
            
        do{//este ciclo se encarga de llenar diferentes poligonos
            do{//este ciclo permite escoger entre las opciones de poligono
                System.out.println("Digite el poligono que desea: ");
                System.out.println("1. Triangulo");
                System.out.println("2. Rectangulo");
                System.out.print("Digite una opcion: ");
                opcion = entrada.nextInt();
            }while(opcion<1 || opcion>2);//y se repite mientras sea menor a 1 o mayor a 2
            switch(opcion){
                case 1: llenarTriangulo();//llenar triangulo
                        break;
                case 2: llenarRectangulo();//llenar rectangulo
                        break;
            }
            System.out.print("Desea llenar otro poligono: ");
            respuesta =entrada.next().charAt(0);
            System.out.println("");
        }while(respuesta=='s'||respuesta=='S');//mientras que la respiesta sea s o S  
    }
    //creamos un metodo para llenar un triangulo cuando la opcion del case lo pida
    public static void llenarTriangulo(){
        double lado1,lado2,lado3;
        //pedimos y guardamos los datos de los lados
        System.out.print("\nDigite el valor del lado1: ");
        lado1=entrada.nextDouble();
        System.out.print("Digite el valor del lado2: ");
        lado2=entrada.nextDouble();
        System.out.print("Digite el valor del lado3: ");
        lado3=entrada.nextDouble();
        //creamos un objeto de la clase triangulo
        Triangulo triangulo = new Triangulo(lado1,lado2,lado3);
        //con el metodo .add del arraylist agregamos el triangulo a el arreglo de poligonos 
        poligono.add(triangulo);
    }
    //creamos un metodo para llenar un rectangulo cuando la opcion del case lo pida
    public static void llenarRectangulo(){
        double lado1,lado2;
        //pedimos y guardamos los datos de los lados
        System.out.print("\nDigite el valor del lado1: ");
        lado1=entrada.nextDouble();
        System.out.print("Digite el valor del lado2: ");
        lado2=entrada.nextDouble();
      
        //creamos un objeto de la clase rectangulo
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        //con el metodo .add del arraylist agregamos el triangulo a el arreglo de poligonos 
        poligono.add(rectangulo);
    }
    //creamos un metodo para mostrar los datos
    public static void mostrarDatos(){
        //utilizamos un bucle for edge para recorrer el array de poligono
        //con el objeto poli y llamando los metodos .toString() y .area() podemos mostrar en consola
        //los datos almacenados en el arreglo de poligonos pero detectando si es triangulo o rectangulo
        for(Poligono poli: poligono){
            System.out.println(poli.toString());
            System.out.println("Area: "+poli.area());
            System.out.println("");
        }
    }
}
