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
public class Aeropuertoprivado extends Aeropuerto{
    //atributos de clase
    private String listaEmpresas[] = new String[10];
    private int numEmpresa;

    //metodos constructores
    public Aeropuertoprivado(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public Aeropuertoprivado(String nombre, String ciudad, String pais, Compañia[] c, String e[]) {
        super(nombre, ciudad, pais, c);
        this.listaEmpresas = e;
        numEmpresa=e.length;
    }
    
    //metodo para insertar empresas
    public void insertarEmpresa(String e[]){
        this.listaEmpresas = e;
        this.numEmpresa = e.length;
    }
    //metodo para ingresar empresas individuales
    public void insertarEmpresa(String e){
        listaEmpresas[numEmpresa] = e;
        numEmpresa++;
    }

    public String[] getListaEmpresas() {
        return listaEmpresas;
    }

    public int getNumEmpresa() {
        return numEmpresa;
    }
    
}