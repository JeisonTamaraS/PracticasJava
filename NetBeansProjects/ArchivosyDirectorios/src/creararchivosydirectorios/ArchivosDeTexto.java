/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creararchivosydirectorios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jeison tamara
 */
public class ArchivosDeTexto {
    //declaramos parametros
    File archivo;
    
    private void crearArchivo(){//metodo para crear archivos
        archivo = new File("prueba.txt");//instanciamos el archivo tipo file que vamos a crear
        try {//con el metodo try-catch capturamos las escepciones
            if(archivo.createNewFile()){
                System.out.println("El archivo ha sido creado correctamente");
            }
        } catch (IOException ex) {//si el archivo no puede ser creado salta una escepcion
            System.err.println("No se pudo crear el archivo");//con el serr salta el mensaje de error  
        }
    
    }
    private void crearCarppeta(){
        archivo = new File("carpetaPrueba");//instanciamos la carpeta tipo file que vamos a crear
        
        if(archivo.mkdir()){//metodo para crear la carpeta
            System.out.println("La carpeta ha sido creada correctamente");
        }else{//caso contrario
            System.err.println("Error, la carpeta no ha sido creada correctamente");
        }
    }
    
    private void escribirTexto(){
        try {//capturamos las escepciones
            FileWriter escribir = new FileWriter(archivo);//creamos un objeto de tipo escribir archivo
            escribir.write("Hola mundo");//con el metodo .write escribimos sobre el archivo
            escribir.write("\r\nel mundo de la programacion");//le enviamos mas texto con un salto de linea
            escribir.close();//cerramos el escritor
            
        } catch (IOException ex) {
            System.err.println("error, no se pudo escribir sobre el archivo");        
        }
    }
    private void añadirTexto(){
        try {//capturamos las escepciones
            FileWriter escribir = new FileWriter(archivo,true);//al agregarle el true como argumento el texto ya no se sobreescribe sino que se añade al existente
            escribir.write("\r\nProgramacion orientada a objetos");//con el metodo .write escribimos sobre el archivo
            escribir.write("\r\nJAVA");//le enviamos mas texto con un salto de linea
            escribir.close();//cerramos el escritor
            
        } catch (IOException ex) {
            System.err.println("error, no se pudo escribir sobre el archivo");        
        }
    }
    private void leerTexto(){
        String cadena;
        
        try {
            FileReader lector = new FileReader(archivo);//creamos un objeto de tipo lector de archivo y le pasamos como parametro el archivo a leer
            BufferedReader lectura = new BufferedReader(lector);//creamos un objeto memoria lectura ligado al lector creado
            cadena = lectura.readLine();//leemos la primera linea del archivo y la guardamos en el string cadena
            
            while(cadena != null){//con este ciclo leemos todo el archivo hasta que no quede nada por leer
                System.out.println(cadena);
                cadena = lectura.readLine();
            }
            
        }catch (FileNotFoundException ex) {
            System.err.println("Error: "+ex); 
        } catch (IOException ex) {
            System.err.println("Error: "+ex);
        } 
    }
    
    public static void main(String[] args) {
        ArchivosDeTexto archivos = new ArchivosDeTexto();//creamos objeto de la clase principal
        
        archivos.crearArchivo();//ejecutamos metodo creado a partir del objeto 
        archivos.leerTexto();
        //archivos.escribirTexto();
        //archivos.añadirTexto();
        //archivos.crearCarppeta();
    }
}
