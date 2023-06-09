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
public class Compañia {
    //atributos
    private String nombre;
    private Vuelo listaVuelos[]= new Vuelo[10];//arreglo de objetos tipo vuelo con tamaño max 10 
    private int numVuelo=0;
    
    //metodo constructor
    public Compañia(String nombre) {
        this.nombre = nombre;
    }
    
    public Compañia(String nombre, Vuelo v[]){// inicializamos la lista de vuelos con el argumento v[] dado por el usuario
        this.nombre = nombre;
        listaVuelos = v;//guardamos los datos en la lista de vuelos
        numVuelo = v.length;//numero de vuelos igual a la cantidad de latos digitados por el usuario
    }
    
    //metodo para insertar un vuelo
    public void insertatVuelo(Vuelo vuelo){
        listaVuelos[numVuelo]=vuelo;
        numVuelo++;
    }
    
    //metodos getters
    public String getNombre() {
        return nombre;
    }

    public int getNumVuelo() {
        return numVuelo;
    }
    
    public Vuelo getVuelo(int i){
        return listaVuelos[i];
    }
    
    public Vuelo getVuelo(String id){
        boolean encontrado=false;
        int i=0;
        Vuelo v=null;
        while((!encontrado) && (i<listaVuelos.length)){
            if(id.equals(listaVuelos[i].getIdentificador())){
                encontrado=true;
                v=listaVuelos[i];
            }
            i++;
        }
        return v;
    }
}
