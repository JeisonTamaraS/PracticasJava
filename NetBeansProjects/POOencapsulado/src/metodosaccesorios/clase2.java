/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosaccesorios;

/**
 *
 * @author jeison tamara
 */
public class clase2 {
    public static void main(String [] args){
        Clase1 objeto1 = new Clase1();//creamos un objeto en una clase distinta 
        objeto1.setNombre("jeison");
        objeto1.setEdad(27);//con el objeto asignamos un valor a la vsariable edad aun estandon en otra clase y teniendo un modificador de acceso private
        System.out.println("nombre "+objeto1.getNombre());
        System.out.println("edad "+objeto1.getEdad());
    }
    
}
