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
public class AnimalHervivoro extends Animal{
    @Override//se sobreescribe el metodo de la superclase 
    public void alimentarse(){
        System.out.println("el animal se alimenta de hiervas");
    }
}
