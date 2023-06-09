/*
 * Herencia multiple: la herencia en JAVA se presenta cuando una subclase hereda atributos y metodos
                      de una superclase o clase padre; para la herencia multiple la subclase debe
                      heredar atributos y metodos de dos o mas superclases.
                      En Java no se permite la herencia multiple por si sola, por lo que se utiliza
                      las interfaces las cuales son abstractas y con metodos abstractos; y solo deben
                      ser implementadas en la subclase que aplica para herencia multiple.
 *interfaces en java: -permiten simular la herencia multiple
                      -solo es public o default
                      -todos sus metodos son abstractos
                      -todos sus atributos son final
                        
 */
package interfaces;

/**
 *
 * @author jeison tamara
 */
//las interfaces se declaran con la palabra interface en vez de class
public interface Persona {
    public abstract void hablar();
}
