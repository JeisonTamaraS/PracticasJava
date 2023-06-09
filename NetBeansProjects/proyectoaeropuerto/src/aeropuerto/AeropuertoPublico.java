/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuerto;

/**
 *
 * @author jeison tamara
 */
public class AeropuertoPublico extends Aeropuerto{
    //atributos de clase
    private double subvension;

    public AeropuertoPublico(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public AeropuertoPublico(double subvension, String nombre, String ciudad, String pais, Compañia[] c) {
        super(nombre, ciudad, pais, c);
        this.subvension = subvension;
    }

    public AeropuertoPublico(double subvension, String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
        this.subvension = subvension;
    }

    public double getSubvension() {
        return subvension;
    }
    
}
