/*
 * constantes: son datos que cuando son declarados no pueden ser cambiados en ninguna
               otra parte del programa, son declarados con la palabra reservada final
   ejemplo: 
   private(modificador de acceso) final(palabra reservada) int(tipo de dato) numero(nombre variable);
   miembros estaticos de clase: tambien llamados mienbros de clase, al declarar un atributo como static
                                este ya pasa a ser parte de la clase y no de los objetos, por consiguiente
                                si varios objetos tienen dicho atributo static, al modificarlo en un 
                                objeto, este cambiaria para todos, ademas de poder ejecutar dicho atributo 
                                directamente de la clase. 
 */
package miembrosstaticos;

/**
 *
 * @author jeison tamara
 */
public class clase1 {
    //declaramos atributo de la clase 1
    private static String frase="hola mundo";
    
    //tambien podemos tener metodos staticos
    public static int suma(int n1,int n2){
        int suma=n1+n2;
        return suma;
    }
    //declaramos metodo principal
    public static void main(String [] args){
        //creamos objetos
        clase1 obj1= new clase1();
        clase1 obj2= new clase1();
        //como el atributo es static el resultado en pantalla es el mismo para 
        //ambos objetos ya que static modifica ambos
        obj2.frase="hola programacion";
        
        System.out.println(obj1.frase);
        System.out.println(obj2.frase);
        //podemos imprimir el valor del atributo directamente con la clase
        System.out.println(clase1.frase);
        //imprimimos en pantalla el resultado del metodo estatico declarado anteriormente 
        System.out.println("la suma es: "+clase1.suma(2, 3));
        
    }
}
