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
public class VehiculoCarga extends Vehiculo {
    //atributo propio de la subclase
    private int carga;
    
    //metodo constructor

    public VehiculoCarga(int carga, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }
    //sobreescribimos el metodo de la superclase
    @Override
    public String nostrarDatos(){
        return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo"+modelo+"\nCarga"+carga;
    }
}
