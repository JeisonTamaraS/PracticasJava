/*
 * ejercicio3: Construir un programa para una competencia de atletismo, el programa 
               debe gestionar una serie de atletas con su nu numero, nombre y tiempo 
               de carrera, al final el programa debe mostar los datos del atleta ganador.
   Diagrama de clases(UML)
   atributos: nombre: String, numero: int, tiempo:float
   metodos: atleta, getTiempo; mostrarDatos.  
 */
package carrera;

/**
 *
 * @author jeison tamara
 */
public class Atleta {
    //atributos
    private String nombre;
    private int numAtleta;
    private float tiemCarrera;
    
    //metodo constructor
    public Atleta(String nombre, int numAtleta, float tiemCarrera){
      this.nombre = nombre;
      this.numAtleta = numAtleta;
      this.tiemCarrera = tiemCarrera;
    }
    
    public float getTiemVarrera(){
        return tiemCarrera;
    }
    
    public String mostrarDatos(){
        return "Nombre: "+nombre+"\nNumero de atleta: "+numAtleta+"\nTiempo de carrera: "+tiemCarrera;
    }
    
}
