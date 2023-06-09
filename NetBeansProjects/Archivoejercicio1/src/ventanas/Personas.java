/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

/**
 *
 * @author jeison tamara
 */
//creamos una clase persona con los datos del contacto guardar y su respectivo metodo constructos, ademas de los metodos getter para acceder a la informacion
public class Personas {
    private String nombre,correo,telefono;

    public Personas(String nombre, String correo, String telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }
    
}
