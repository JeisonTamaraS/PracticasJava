/*
 * Clases y Objetos: Los objetos son un concepto de la programacion basado en la realidad,
                     en la manera de manipularlos, un objeto tiene unos atributos (caracteristicas)
                     y metodos(acciones que puede realizarse con ellos), en la programacion esto 
                     puede ser utilizado de la misma forma; las clases son un conjunto de objetos 
                     que comparten caracteristicas similares.
 */
package clasesyobjetos;

/**
 *
 * @author jeison tamara
 */
//declaracion de la clase coches: modificador_de_acceso class nombre_clase{} 
public class coches {//clase coche
    //declaramos los atributos(caracteristicas) de la clase coche
    String color;
    String marca;
    int km;

    //metodo principar
    public static void main(String [] args){
        //creamos los objetos que pertenecen a la clase coche
        //clase nombre_objeto= new clase(); 
        coches auto1=new coches();//objeto auto1
        coches auto2=new coches();//objeto auto2
        //asignamos atributos a los objetos
        auto1.color="rojo";
        auto1.marca="ford";
        auto1.km=3000;
        auto2.color="gris";
        auto2.marca="toyota";
        auto2.km=10000;
        
        System.out.println("Coche 1");
        System.out.println("Color coche1: "+auto1.color);
        System.out.println("Marca coche1: "+auto1.marca);
        System.out.println("Km coche1: "+auto1.km);
        System.out.println("");
        System.out.println("Coche 2");
        System.out.println("Color coche2: "+auto2.color);
        System.out.println("Marca coche2: "+auto2.marca);
        System.out.println("Km coche2: "+auto2.km);
        
    }

}
