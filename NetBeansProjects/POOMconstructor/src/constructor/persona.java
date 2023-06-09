/*
 * Metodo constructor: es un metodo que se invoca siempre que se crea un objeto de la clase
                       este permite ingresar los atributos directamente en la creacion del objeto.
   caracteristicas:    1.tiene el mismo nombre de la clase
                       2.no retorna nungun valor
                       3.debe declararse como publico
   sobrecarga de metodos: se presenta cuando existen varios metodoscon el mismo nombre, estos 
                          pueden utilizarce siempre y cuando los parametros de cada uno sean distintos.
 */
package constructor;

/**
 *
 * @author jeison tamara
 */
public class persona {
    //atributos
    String nombre;
    int edad;
    long identificacion;
    //metodo constructor
    //modificador_de_acceso nombre_clase(parametros){}
    public persona(String nombre,int edad){
        this.nombre=nombre;//el this. indica que nombre es el atributo declarado en la clase
        this.edad=edad;
    }
    //se crea otro metodo persona para demostrar la sobrecarga de metodo

    public persona(long identificacion) {
        this.identificacion = identificacion;
    }
    public void correr(){
        System.out.println("soy "+nombre+" tengo "+edad+" años y estoy coriendo una maraton");
    }
    //creamos un metodo sin valor de retorno con un nombre repetido pero que se diferencia en el parametro
    public void correr(int km){
        System.out.println("he corrido "+km+" kms");
    }
    public void mostrar(){
        System.out.println("nombre: "+nombre);
        System.out.println("edad: "+edad);   
    }
    //metodo principar
    public static void main(String [] args){
        //creamos el objeto directamente asignando los argumentos
        //clase nombre_objeto= new clase(argumento1,argumento2);
        persona p1=new persona("jeison",27);
        p1.mostrar();
    }
}
