/*
 * Metodos y clases Final: final icialmente se utilizo para declarar tipos de datos constantes 
                           inalterables durante la ejecucion del programa, pero tambien puede
                           utilizarce en las clase; las clases final se declaran de la siguiente 
                           forma: final public class nombre_de_clase(){
                                  }//esto significa que esta clase no puede tener subclases.
                           Para los metodos significa que estos no pueden tener metodos de mismo
                           nombre ni siquiera en subclases heredadas, y esta se declara de la
                           siguiente manera: public final void nombre_metodo(){
                                             }
 * Sobreescritura de miembros: puede parecer similar a la sobrecarga de metodos, pero esta se presenta 
                               en las subclases que heredan metodos iguales de la superclase, con la 
                               diferencia que en las subclases el metodo se ejecuta de diferente manera
                               lo que causaria una sobreescritura del metodo original, esta se denota
                               con la palabra @Override seguido del metodo que sobrerescribe
 
 *Clases y metodos abstractos: las clases abstractas solo se utilizan como superclases, estas obligatoriamente
                               deben tener por lo menos una subclase, no pueden instanciar objetos, sirve como 
                               bosquejo de las subclases que contiene; se declaran de la siguiente manera:
                               public abstract class nombre_de clase{}
                               los metodos aabstractos se declaran en las clases abstractas, estos no sabemos
                               como implementarlos pero deben ser implementados en aguna de las sub clases; se
                               declara de la siguiente manera: public abstract void nombre_metodo();
 */
package Complementos;

/**
 *
 * @author jeison tamara
 */
//generamos la clase y el metodo abstaracto
public abstract class SerVivo {
    public abstract void alimentarse();
}
