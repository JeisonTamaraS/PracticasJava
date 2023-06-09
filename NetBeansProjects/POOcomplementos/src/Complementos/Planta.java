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
public class Planta extends SerVivo{
    @Override//sobreescribimos el metodo alimentarse de la superclase SerVivo
    public void alimentarse(){
        System.out.println("Las plantas se alimentan mediante la fotosintesis");
    }
}
