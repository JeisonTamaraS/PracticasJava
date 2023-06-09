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
//para declarar la herencia de las diferentes superclases se utiliza la palabra implements seguido de las superclases separadas por coma(,)
public class MusicoEstudiante implements Musico,Estudiante{
   
    //sobreescribimos los metodos heredados de las diferentes superclases
    @Override
    public void hablar(){
        System.out.println("Estoy hablando");
    }
    @Override
    public void estudiar(){
        System.out.println("Estoy estudiando matematicas");
    }
    @Override
    public void tocarMusica(){
        System.out.println("Estoy tocando guitarra");
    }
}
