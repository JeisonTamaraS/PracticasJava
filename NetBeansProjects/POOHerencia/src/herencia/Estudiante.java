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
//esta clase es una subclase de Persona debido a que todo estudiante es una persona y tienen argumentos y metodos en comun
public class Estudiante extends Persona{//con la palbra reservada extends seguido del nombre de la clase padre
                                        //se extiende la herencia sobre esta subclase Estudiante
    //en la subclase estudiantes solo se declaran dos argumentos puesto que los otros los esta heredando 
    private int codigoEstudiante;        
    private float notaFinal;

    //para el metodo constructor es necesario tener en cuenta los argumentos de la clase padre 
    public Estudiante(String nombre, String apellido, int edad,int codigoEstudiante, float notaFinal) {
        super(nombre, apellido, edad);//pero como ya estan declarados en la superclase solo declara con la palabra super
        this.codigoEstudiante=codigoEstudiante;
        this.notaFinal = notaFinal;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre()+"\nApellido: "+getApellido()+"\nEdad: "+getEdad()+"\nCodigo de Estudiante: "+codigoEstudiante+"\nNota final: "+notaFinal);
    }   
    
}
