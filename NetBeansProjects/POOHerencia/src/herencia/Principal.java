/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author jeison tamara
 */
public class Principal {
    //creamos el metodo principar
    public static void main(String[] args){
        //creamos e inicializamos un objeto
        Estudiante estudiante = new Estudiante("jeison","tamara",27,123,3.5f);
        estudiante.mostrarDatos();
    }
}    
