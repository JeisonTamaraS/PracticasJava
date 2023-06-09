/*
 * Creamos una clase principal dentro del mismo paquete para demostrar que podemos
 * usar los metodos creados en diferente clase.
 */
package metodos;

/**
 *
 * @author jeison tamara
 */
public class main {
    public static void main(){//declaramos el metodo principal
        
        //declaramos un objeto con la clase inicial
        operaciones op=new operaciones();
        
        //ejecutamos los metodos del objeto creado
        op.pedirNumeros();
        op.suma();
        op.resta();
        op.multiplicacion();
        op.div();
        op.resultados();
    
    }
    
}
