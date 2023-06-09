/*
 * ejercicio1: construir un programa que permita dirigir rl movimiento de un objeto
               dentro de un tabolero y actualice su posicion dentro del mismo. los 
               movimientos posibles son ARRIBA, ABAJO, IZQUIERDA y DERECHA. tras cada
               movimiento el programa mostrara la nueva direccion elegida y las coordenadas
               de situacion del objeto dentro del tablero.
atrubutos: X, Y: enteros
metodos: ARRIBA, ABAJO, DERECHA, IZQUIERDA, getX, getY
 */
package plano_cartesiano;

import java.util.Scanner;

/**
 *
 * @author jeison tamara
 */
public class tablero {
    //atributos
    private int X;
    private int Y;
    
    //metodo contructor

    public tablero(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }
    //metodos 
    public void arriba(int incremento){
        Y+=incremento;
    }
    
    public void abajo(int incremento){
        Y-=incremento;
    }
    public void izquierda(int incremento){
        X-=incremento;
    }
    public void derecha(int incremento){
        X+=incremento;
    }
    //metodos getter

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }
    public static void main(String[] args){
        Scanner entrada= new Scanner(System.in);
        
        tablero t1;//creamos objeto
        //declaramos y pedimos las variables en X y Y
        int X,Y,opcion,incremento=0;
        System.out.println("Digite coordenada en X: ");
        X=entrada.nextInt();
        System.out.println("Digite corrdenada en Y: ");
        Y=entrada.nextInt();
        //posicion inicial
        t1=new tablero(X,Y);
        
        //pedimos al usuario las acciones a realizar
        do{
            System.out.println("\n.:MENU:.");
            System.out.println("1.Mover hacia ARRIBA");
            System.out.println("2.Mover hacia ABAJO");
            System.out.println("3.Mover hacia IZQUIERDA");
            System.out.println("4.Mover hacia DERECHA");
            System.out.println("5.SALIR");
            System.out.print("Digite la opcion: ");
            opcion=entrada.nextInt();
            
            if(opcion!=5){
                System.out.print("Cuantas posiciones desea Moverse: ");
                incremento=entrada.nextInt();
            }
            
            //dependiendo de la opcion que se digite realizara una accion
            switch(opcion){
                case 1: t1.arriba(incremento);break;
                case 2: t1.abajo(incremento);break;
                case 3: t1.izquierda(incremento);break;
                case 4: t1.derecha(incremento);break;
                case 5: break;
            }
            //mostramos posicion actual
            System.out.println("La posicion acatual en (X,Y) es: ( "+t1.getX()+" , "+t1.getY()+" )");
        }while(opcion!=5);//el bucle se repite mientras la opcion sea diferente de 5
    }
}