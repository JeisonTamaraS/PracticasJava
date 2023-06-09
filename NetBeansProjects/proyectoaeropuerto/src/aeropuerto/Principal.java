/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuerto;

import java.util.Scanner;

/**
 *
 * @author jeison tamara
 */
public class Principal {
    static Scanner entrada = new Scanner(System.in);
    final static int num=4;//numero de aeropuertos
    static Aeropuerto aeropuertos[] = new Aeropuerto[num];
    
    public static void main(String[] args){
            insertarDatosAeropuertos(aeropuertos);
            menu();
    }
    public static void insertarDatosAeropuertos(Aeropuerto aero[]){
    
        //creamos aeropuerto #1
        aero[0]=new AeropuertoPublico(80000000,"Jorge Chavez","Lima","Peru");
        //insertamos compañias
        aero[0].insertarCompañia(new Compañia("Aeroperu"));
        aero[0].insertarCompañia(new Compañia("LATAM"));
        //insertamos vuelos
        aero[0].getCompañia("Aeroperu").insertatVuelo(new Vuelo("IB20","Lima","mexico",150.90,120));
        aero[0].getCompañia("Aeroperu").insertatVuelo(new Vuelo("IB21","Lima","Buenos Aires",120.99,150));
        aero[0].getCompañia("LATAM").insertatVuelo(new Vuelo("LT12","Lima","Londres",500.89,180));
        //insertamos pasajeros
        aero[0].getCompañia("Aeroperu").getVuelo("IB20").insertarPasajero(new Pasajero("jeison","PS431","Colombiano"));
        aero[0].getCompañia("Aeroperu").getVuelo("IB21").insertarPasajero(new Pasajero("andres","PS987","Peruano"));
        aero[0].getCompañia("LATAM").getVuelo("LT12").insertarPasajero(new Pasajero("luis","PF123","Ingles"));
        aero[0].getCompañia("LATAM").getVuelo("LT12").insertarPasajero(new Pasajero("jhon","LK216","Mejicano"));
        

        //aeropuerto #2
        aero[1]=new AeropuertoPublico(100000000,"El Dorado","Bogota","Colombia");
        //insertamos compañias
        aero[1].insertarCompañia(new Compañia("Avianca"));
        aero[1].insertarCompañia(new Compañia("Viva"));
        //insertamos vuelos
        aero[1].getCompañia("Avianca").insertatVuelo(new Vuelo("AV20","Bogota","Lima",150.90,120));
        aero[1].getCompañia("Avianca").insertatVuelo(new Vuelo("AV21","Bogota","Montevideo",180.99,110));
        aero[1].getCompañia("Viva").insertatVuelo(new Vuelo("VI12","Bogota","New York",600.89,200));
        //insertamos pasajeros
        aero[1].getCompañia("Avianca").getVuelo("AV20").insertarPasajero(new Pasajero("jose","CT431","Colombiano"));
        aero[1].getCompañia("Avianca").getVuelo("AV21").insertarPasajero(new Pasajero("alberto","OM087","Colombiano"));
        aero[1].getCompañia("Viva").getVuelo("VI12").insertarPasajero(new Pasajero("luisa","PO523","EEUU"));
        aero[1].getCompañia("Viva").getVuelo("VI12").insertarPasajero(new Pasajero("ALfredo","LW916","Mejicano"));
        
        
        //aeropuerto #3
        aero[2]=new Aeropuertoprivado("Ciudad de Mexico","Ciudad de Mexico","Mexico");
        //insertamos compañias
        aero[2].insertarCompañia(new Compañia("Aeromex"));
        aero[2].insertarCompañia(new Compañia("LATAM"));
        String empresas[] = {"Cobresol","Anguila32"};
        ((Aeropuertoprivado)aero[2]).insertarEmpresa(empresas);
        //insertamos vuelos
        aero[2].getCompañia("Aeromex").insertatVuelo(new Vuelo("AM20","Ciudad de Mexico","Bogota",120.90,190));
        aero[2].getCompañia("Aeromex").insertatVuelo(new Vuelo("AM21","Ciudad de Mexico","Rio de janeiro",190.99,110));
        aero[2].getCompañia("LATAM").insertatVuelo(new Vuelo("LT21","Ciudad de Mexico","Roma",1000.89,300));
        //insertamos pasajeros
        aero[2].getCompañia("Aeromex").getVuelo("AM20").insertarPasajero(new Pasajero("jeferson","FG431","Colombiano"));
        aero[2].getCompañia("Aeromex").getVuelo("AM21").insertarPasajero(new Pasajero("are","OI387","Peruano"));
        aero[2].getCompañia("LATAM").getVuelo("LT21").insertarPasajero(new Pasajero("pablo","RT323","Brasilero"));
        aero[2].getCompañia("LATAM").getVuelo("LT21").insertarPasajero(new Pasajero("barack","WS246","sueco"));
        
        
        //aeropuerto #4
        aero[3]=new AeropuertoPublico(300000000,"Ministro Pistarini","Buenos Aires","Argentina");
        //insertamos compañias
        aero[3].insertarCompañia(new Compañia("Aerosamba"));
        aero[3].insertarCompañia(new Compañia("LATAM"));
        //insertamos vuelos
        aero[3].getCompañia("Aerosamba").insertatVuelo(new Vuelo("AS62","Buenos Aires","Tijuana",150.90,120));
        aero[3].getCompañia("Aerosamba").insertatVuelo(new Vuelo("AS61","Buenos Aires","Caracas",120.99,150));
        aero[3].getCompañia("LATAM").insertatVuelo(new Vuelo("LT90","Buenos Aires","Moscou",1500.89,180));
        //insertamos pasajeros
        aero[3].getCompañia("Aerosamba").getVuelo("AS62").insertarPasajero(new Pasajero("jorge","CL931","Colombiano"));
        aero[3].getCompañia("Aerosamba").getVuelo("AS61").insertarPasajero(new Pasajero("anderson","EC587","Ecuatoriano"));
        aero[3].getCompañia("LATAM").getVuelo("LT90").insertarPasajero(new Pasajero("efrain","VN823","Venezolano"));
        aero[3].getCompañia("LATAM").getVuelo("LT90").insertarPasajero(new Pasajero("mario","BV916","Boliviano"));
    }
    
    public static void menu(){
        String nombreAeropuerto,nombreCompañia,origen,destino;
        int opcion;
        Aeropuerto aeropuerto;
        Compañia compañia;
        do{
            System.out.println("\t.:MENU:.");
            System.out.println("1. Aeropuertos gestionados");
            System.out.println("2. Ver empresas o subvension");
            System.out.println("3. Lista de compañias de aeropuertos");
            System.out.println("4. Lista de vuelos por compañias");
            System.out.println("5. Lista de vuelos Origen-Destino");
            System.out.println("6. Salir");
            System.out.print("Digite una opcion: ");
            opcion=entrada.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("");
                    mostrarDatosAeropuertos(aeropuertos);
                    break;
                case 2: 
                    System.out.println("");
                    mostrarPatrocinio(aeropuertos);
                    break;
                case 3: 
                    entrada.nextLine();
                    System.out.println("");
                    System.out.print("Digite un aeropuerto: ");
                    nombreAeropuerto=entrada.nextLine();
                    aeropuerto=buscarAeropuerto(nombreAeropuerto,aeropuertos);
                    if(aeropuerto==null){
                        System.out.println("el aeropuerto no existe");
                    }else{
                        mostrarCompañias(aeropuerto);
                    }
                    break;
                case 4:
                    entrada.nextLine();
                    System.out.print("Digite un aeropuerto: ");
                    nombreAeropuerto=entrada.nextLine();
                    aeropuerto=buscarAeropuerto(nombreAeropuerto,aeropuertos);
                    if(aeropuerto==null){
                        System.out.println("el aeropuerto no existe");
                    }else{
                        System.out.print("Digite el nombre de la compañia: ");
                        nombreCompañia=entrada.nextLine();
                        compañia = aeropuerto.getCompañia(nombreCompañia);
                        mostarVuelos(compañia);
                    }
                    break;
                case 5: 
                    entrada.nextLine();
                    System.out.println("Digite la ciudad de Origen: ");
                    origen=entrada.nextLine();
                    System.out.println("Digite la ciudad de Destino: ");
                    destino=entrada.nextLine();
                    break;
                case 6: break;
                default: System.out.println("Error, opcion no existe");break;
            }
            System.out.println("");
        }while(opcion!=6);
    
    }
    public static void mostrarDatosAeropuertos(Aeropuerto aeropuertos[]){
        for(int i=0;i<aeropuertos.length;i++){
            //la palabra reservada instanceof evalua si el objeto hace parte de la clase Aeropuertoprivado 
            if(aeropuertos[i] instanceof Aeropuertoprivado){
                System.out.println("Aeropuerto privado");
                System.out.println("Nombre: "+aeropuertos[i].getNombre());
                System.out.println("Ciudad: "+aeropuertos[i].getCiudad());
                System.out.println("Pais: "+aeropuertos[i].getPais());
            }else{
                System.out.println("Aeropuerto publico");
                System.out.println("Nombre: "+aeropuertos[i].getNombre());
                System.out.println("Ciudad: "+aeropuertos[i].getCiudad());
                System.out.println("Pais: "+aeropuertos[i].getPais());
            }
            System.out.println("");
        }
    
    }
    public static void mostrarPatrocinio(Aeropuerto aeropuertos[]){
        String empresas[];
        for(int i=0;i<aeropuertos.length;i++){
            //la palabra reservada instanceof evalua si el objeto hace parte de la clase Aeropuertoprivado 
            if(aeropuertos[i] instanceof Aeropuertoprivado){
                System.out.println("Aeropuerto privado: "+aeropuertos[i].getNombre());
                empresas=((Aeropuertoprivado)aeropuertos[i]).getListaEmpresas();
                System.out.println("Empresas: ");
                for(int j=0;j<empresas.length;j++){
                    System.out.println(empresas[j]);
                }
                
            }else{
                System.out.println("Aeropuerto publico"+aeropuertos[i].getNombre());
                System.out.println("Subvension: "+((AeropuertoPublico)aeropuertos[i]).getSubvension());
            }
            System.out.println("");
        }
    
    }
    public static Aeropuerto buscarAeropuerto(String nombre, Aeropuerto aeropuertos[]){
        boolean encontrado= false;
        int i=0;
        Aeropuerto aero=null;
        while((!encontrado)&&(i<aeropuertos.length)){
            if(nombre.equals(aeropuertos[i].getNombre())){
                encontrado=true;
                aero=aeropuertos[i];            
            }
            i++;
        }
        return aero;
    }
    public static void mostrarCompañias(Aeropuerto aeropuerto){
        System.out.println("Compañias del aeropuerto: "+aeropuerto.getNombre());
        for(int i=0;i<aeropuerto.getNumCompañia();i++){
            System.out.println(aeropuerto.getCompañia(i).getNombre());
        }
    }
    public static void mostarVuelos(Compañia compañia){
        Vuelo vuelo;
        System.out.println("Los vuelos de la compañia: "+compañia.getNombre());
        for(int i=0;i<compañia.getNumVuelo();i++){
            vuelo=compañia.getVuelo(i);
            System.out.println("Id: "+vuelo.getIdentificador());
            System.out.println("Origen: "+vuelo.getOrigen());
            System.out.println("Destino: "+vuelo.getDestino());
            System.out.println("precio: $"+vuelo.getPrecio());
            System.out.println("");
        }
    }
}
