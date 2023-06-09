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
public class VehiculoTurismo extends Vehiculo{
    //atributo propio de subclase
    private int numeroPuertas;
    
    //metodo constructor subclase
    public VehiculoTurismo(int numeroPuertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }
    
    @Override//soobreescribimos el metodo de la superclase
    public String nostrarDatos(){
        return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo"+modelo+"\nNumero de puertas: "+numeroPuertas;
    }
}
