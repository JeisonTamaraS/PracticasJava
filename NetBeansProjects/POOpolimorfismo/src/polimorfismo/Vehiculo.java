/*
 * Polimorfismo: Para que haya polimorfismo debe habler herencia; esta consiste en que
                 un objeto de la super clase puede almacenar un objeto de cualquiera de
                 sus subclases. La clase padre es compatible con los tipos que derivan
                 de ella, pero no al revez.
 * para el caso de instanciar un objeto de clase:
                vehiculo vehiculo1= new vehiculo();//donde vehiculo es la superclase
                vehiculo vehiculo2= new vehiculoturismo();//donde superclase vehiculo guarda objeto de subclase vehiculoturismo
                vehiculo vehiculo2= new vehiculodeportivo();//el objeto de la superclase guarda uno de la subclase
                vehiculo vehiculo2= new vehiculocarga();//en esto consiste el polimosfismo
                superclase nombre_objeto= new subclase();
 * Conversion ascendente de tipos(upcasting): es tomar y convertir un objeto de la subclase en uno de la superclase.
                                              subir en la jerarquia de clase.
 * Conversion descendente de tipos(downcasting): es lo contrario del upcasting, aqui se convierte un objeto de la supercalse
                                                 en objetode la subclase, pero debio haber aplicado el upcasting.
                                                 bajar en la jerarquia de clases.
 */
package polimorfismo;

/**
 *
 * @author jeison tamara
 */
public class Vehiculo {
    //atributos de clase
    protected String matricula;
    protected String marca;
    protected String modelo;
    
    //metodo constructor
    public Vehiculo(String matricula,String marca,String modelo){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    public String nostrarDatos(){
        return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo"+modelo;
    }
}
