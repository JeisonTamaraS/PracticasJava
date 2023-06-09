/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuerto;

/**
 *
 * @author jeison tamara
 */
public class Vuelo {
    //atrubutos 
    private String identificador;
    private String origen;
    private String destino;
    private double precio;
    private int numMaxPasajeros;
    private int numActPasajeros;
    
    private Pasajero listaPasajero[];//arreglo de objetos tipo pasajeros
    
    //metodo constructor
    public Vuelo(String identificador, String origen, String destino, double precio, int numMaxPasajeros) {
        this.identificador = identificador;
        this.origen = origen;
        this.destino = destino;
        this.precio = precio;
        this.numMaxPasajeros = numMaxPasajeros;
        
        this.numActPasajeros = 0;//el num actual de pasajeros es cero porque se esta declarando por primera vez
        this.listaPasajero = new Pasajero[numMaxPasajeros];//inicializamos el objeto declarado anteriormente con el tamaño dado por el usuario
    }
    
    //Metodo para insertar un pasajero a la lista de pasajeros 
    public void insertarPasajero(Pasajero pasajero){
        listaPasajero[numActPasajeros]=pasajero;
        numActPasajeros++;
    }
            
    //metodos getters
    public String getIdentificador() {
        return identificador;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public double getPrecio() {
        return precio;
    }

    public int getNumMaxPasajeros() {
        return numMaxPasajeros;
    }

    public int getNumActPasajeros() {
        return numActPasajeros;
    }
    
    //metodos para encontar pasajeros en la lista de pasajeros
    //metodo para encontrar pasajero mediante la busqueda del numero i 
    public Pasajero getPasajero(int i){
        return listaPasajero[i];
    }
    
    //metodo para encontrar pasajero mediante la busqueda de pasaporte
    public Pasajero getPasajero(String pasaporte){
        boolean encontrado=false;//declaramos variable boleana para saber cuando encuentre el pasaporte(true)
        int i=0;//iterador para controlar bucle while
        Pasajero pas=null;//variable para almacenar el dato encontrado
        
        while((encontrado==false)&&(i<listaPasajero.length)){//el ciclo se repite mientras la variable encontrado sea falso y el arreglo no se haya recorrido totalmente
            //if(pasaporte.equals(listaPasajeros[i].getPasaporte()))//esta comparacion tambien puede utilizarse en vez de ==
            if(pasaporte==listaPasajero[i].getPasaporte()){//se evalua si el pasaporte ingresado es igual al de la lista en la posicion actual i
                encontrado=true;//si es cierto la variable encontrado cambia su estado a true 
                pas=listaPasajero[i];//y se asigna los datos de la lista a la variable pas que es la que retornara en el metodo getter
            }
            i++;
        }
        return pas;
    }

}
