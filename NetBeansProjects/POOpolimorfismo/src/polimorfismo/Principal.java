/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author jeison tamara
 */
public class Principal {
    public static void main(String[] args){
        //creamos un arreglo de objetos con la superclase vehiculos
        Vehiculo misvehiculos[] = new Vehiculo[4];
        //creamos los objetos de las subclases guardandolos en la superclase y asi aplicamos el polimorfismo
        misvehiculos[0] = new Vehiculo("HS34","chevrolet","sail");
        misvehiculos[1] = new VehiculoCarga(3000,"SD65","JAC","jac1"); 
        misvehiculos[2] = new VehiculoDeportivo(5000,"RS34","ferrari","urus");
        misvehiculos[3] = new VehiculoTurismo(5,"TH98","toyota","prado");
        
        //aplicamos el polimorfismo upcasting
        Vehiculo vehiculo = new VehiculoCarga(2000,"CG56","GMC","gmc2");
        System.out.println(vehiculo);
        
        //retornaremos el onjeto a la subclase utilizando el downcasting
        //se le indica (la conversion a la subclase) del nombre_del_objeto;
        VehiculoCarga nuevovehiculo=(VehiculoCarga) vehiculo;
        System.out.println(nuevovehiculo);
    }
}
