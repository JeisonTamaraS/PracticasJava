/*
 * Parametros y argumentos: son caracteristicas que hacen parte de la declaracion 
                            y ejecucion de los metodos.
                            delaramos un metodo:
                            modificador_de_acceso valor_de_retorno nombre_metodo(parametros){
                            }//los parametros son declaraciones de variables establecidas en el metodo
                            ahora invocamos el metodo:
                            objeto.nombre_metodo(argumentos);//los argumentos son valores equivalentes 
                            //a las declaraciones hechas en los parametros.

                            el valor de retorno puede ser modificado en la creacion de los metodos
                            cuando esperamos o sabemos que tipo de dato nos debe reornar
                            public int suma(int numero1, int numero2){
                                int suma=numero1+numero2;
                                return suma;
                            }
                            en este caso el valor de retorno es de tipo entero y nos retorna el dato
                            almacenado en una variable suma.
                            para imprimir la operacion con el objeto se declara una variable
                            int suma=op.suma(N1,N2); y luego se imprime en consola la variable suma.
 */
package Parametrosyargumentos;

import javax.swing.JOptionPane;

/**
 *
 * @author jeison tamara
 */
public class operaciones {
    //declaramos atributos
    int suma;
    int resta;
    int multi;
    int div;
    
    //declaramos metodos con sus parametros correspondientes;
    public void suma(int numero1,int numero2){
        suma=numero1+numero2;
    }
    public void resta(int numero1,int numero2){
        resta=numero1-numero2;
    }
    public void multiplicacion(int numero1,int numero2){
        multi=numero1*numero2;
    }
    public void div(int numero1,int numero2){
        div=numero1/numero2;
    }
    public void resultado(){
        System.out.println("la suma es: "+suma);
        System.out.println("la resta es: "+resta);
        System.out.println("la multiplicacion es: "+multi);
        System.out.println("la division es: "+div);
    }
    //metodo principal
    public static void main(String[] args){
        int N1,N2;
        N1=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero1: "));
        N2=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero1: "));
        
        //creamos el objeto
        operaciones op=new operaciones();
        
        //utilicamos los metodos creados con ayuda del objeto
        //al ejecutar el metodo percibimos que como argumentos tenemos dos numeros N1 y N2 que digita  
        //el usuario, pero que van ligados a los parametros propuestos en la declaracion de los mismos 
        op.suma(N1, N2);
        op.resta(N1, N2);
        op.multiplicacion(N1, N2);
        op.div(N1, N2);
        op.resultado();
    }   
    
}
