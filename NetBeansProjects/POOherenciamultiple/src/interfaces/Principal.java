/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author jeison tamara
 */
public class Principal {
    public static void main(String[] args){
        //creamos objeto de la clase musicoestudiante
        MusicoEstudiante musicoE=new MusicoEstudiante();
        
        //invocamos los metodos mediante el objeto
        musicoE.hablar();
        musicoE.estudiar();
        musicoE.tocarMusica();
    }
}
