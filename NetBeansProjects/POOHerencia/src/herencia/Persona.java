/*
 * Herencia: es un concepto que permite reutilizar los argumentos y metodos que 
             tengan en comun diferentes clases, la que hereda sus datos es considerada 
             como superclase o clase padre, la que los recibe se denomina subclase o hija.

*/
package herencia;

/**
 *
 * @author jeison tamara
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    
    public Persona(String nombre, String apellido, int edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }
   
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
    
}
