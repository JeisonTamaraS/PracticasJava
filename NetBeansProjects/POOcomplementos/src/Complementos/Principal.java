/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Complementos;

/**
 *
 * @author jeison tamara
 */
public class Principal {
    public static void main(String[] args){
        //creamos objetos de las subclases pero no de la clase abstracta
        Planta planta = new Planta();
        AnimarCarnivoro animalC = new AnimarCarnivoro();
        AnimalHervivoro animalH = new AnimalHervivoro();
        //utilizamos el mismo metodo alimentarse en los diferentes objetos y vemos la diferencia en los resultados
        planta.alimentarse();
        animalC.alimentarse();
        animalH.alimentarse();
    }
}
