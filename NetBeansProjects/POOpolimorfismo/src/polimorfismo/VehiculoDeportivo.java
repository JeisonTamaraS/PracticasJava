/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author jeison tamara
 */
public class VehiculoDeportivo extends Vehiculo {
    //atributo propio de subclase
    private int cilindraje;
    
    //metodo constructor

    public VehiculoDeportivo(int cilindraje, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.cilindraje = cilindraje;
    }

    public int getCilindrada() {
        return cilindraje;
    }
    //sobreescribimos el metodo de la superclase
    @Override
    public String nostrarDatos(){
        return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo"+modelo+"\nCilindraje: "+cilindraje;
    }
    
}
