/*
 *Para abordar el encapsulamiento, primero debemos conocer los modificadores de acceso;
  estos permiten el acceso a los datos desde la misma clase o dediferentes, como tambien
  de difere paquetes o de laherencia. 
  el modificador de acceso mas utilizado es el public que puede ser accedido desde cualquier 
  parte otros son private, protectec y el defautl, cada uno con sus diferentes limitaciones 
  de accesos.
  cuando necesitamos acceder a estos tipod de datos que se encuentran protegidos o no estan 
  a nuestro alcance, tenemos la ayuda de los metodos setter y getter con estos metodos podemos
  tener acceso incluso cuando los modificadores de acceso no lo permiten. ejemplo:
  public void setEdad(){ //con el metodo setter(configurar,colocar) asignamos la variable que se quiere acceder  
    this.edad=edad;
  }
  public int getEdad(){//con el metodo getter(conseguir) retornamos el valor que queremos mostrar
    return edad;
  }
  
*/
package metodosaccesorios;

/**
 *
 * @author jeison tamara
 */
public class Clase1 {
    //asignamos atributos de clase con modificador de acceso preivate 
    private int edad;
    private String nombre;
    
    public void setEdad(int edad){//asignamos el dato de la variable edad al metodo setter
        this.edad=edad;
    }
    
    public int getEdad(){//declaramos el metodo getter de la variable edad
        return edad;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    
   
    
}
