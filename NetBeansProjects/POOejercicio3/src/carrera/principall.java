/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrera;

import java.util.Scanner;

/**
 *
 * @author jeison tamara
 */
public class principall {
      public static int atletaGanador(Atleta A[]){
        float tiempo;
        int indice=0;
        
        tiempo=A[0].getTiemVarrera();//asignamos el tiempo inicial
        for(int i=1;i<A.length;i++){
            if(tiempo>A[i].getTiemVarrera()){
                tiempo=A[i].getTiemVarrera();
                indice=i;
            }
        }
        return indice;
    }
    
    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);
        String nombre;
        int numAtleta;
        float tiemCarrera;
        int Natletas,indice;
        System.out.print("Digite el numero de atletas: ");
        Natletas=entrada.nextInt();
        //creamos e inicializamos el array que nos ayudara a crear los objetos
        Atleta A[]=new Atleta[Natletas];
        
        for(int i=0;i<Natletas;i++){
            entrada.nextLine();
            System.out.print("Digite los datos del atleta Nº"+(i+1));
            System.out.print("\nNombre: ");
            nombre=entrada.nextLine();
            System.out.print("Numero de atleta: ");
            numAtleta=entrada.nextInt();
            System.out.print("Tiempo de carrera: ");
            tiemCarrera=entrada.nextFloat();
            
            A[i]=new Atleta(nombre,numAtleta,tiemCarrera);
        }
        indice= atletaGanador(A);
        System.out.println("\nEl atleta ganador es: ");
        System.out.println(A[indice].mostrarDatos());
    }
}
