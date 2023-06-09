/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoforeach;

/**
 *
 * @author jeison tamara
 */
public class Vectoforeach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nombres = {"luis","karen","are","liam","daniela","jose"};//se declara e inicializa el array  
        /*cuando no conocemos la cantida de datos que tiene un array para recorrerlo 
          podemos utilizar el ciclo for con algunas modificaciones
            for(int i=0;i<nombres.length;i++){
                System.out.println(nombres[i]);
            }
          se utiliza el metodo .length para conocer la lonjitud(tamaño) del array
        */
        /*para facilitar el recorrido de los arrays se utiliza el ciclo for each o mejorado
            for(tipo-de-dato variable-posicion:nombre-array){
            }*/
        for(String i:nombres){//la variable i guarda los datos que tiene el array 
            System.out.println(i);
        }
    }
    
}
