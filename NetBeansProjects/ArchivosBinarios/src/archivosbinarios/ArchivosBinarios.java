/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosbinarios;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jeison tamara
 */
public class ArchivosBinarios {
    private void escribirBinario(){
        try {
            FileOutputStream archivo = new FileOutputStream("Personas.bin");//creamos el archibo binario
            ObjectOutputStream escritura = new ObjectOutputStream(archivo);//creamos el objeto con el que vamos a escribir en el archivo binario
            //creamos objetos tipo persona
            Personas persona1 = new Personas("jeison", 27);
            Personas persona2 = new Personas("luis", 30);
            Personas persona3 = new Personas("arelis", 50);
            //con el objeto escritura y el metodo .escribirobjeto escribimos los datos de los objetos creados anteriormente
            escritura.writeObject(persona1);
            escritura.writeObject(persona2);
            escritura.writeObject(persona3);
            escritura.close();
            
        } catch (FileNotFoundException ex) {
            System.err.println("Error, "+ex);
        } catch (IOException ex) {
            System.err.println("Error; "+ex);
        }
    }
    private void añadirBinario(){
        try {
            FileOutputStream archivo = new FileOutputStream("Personas.bin",true);//creamos el archibo binario
            AñadirContenidoBinario escritura = new AñadirContenidoBinario(archivo);//Utilizamos la clase que creamos para que la cabecera sea reseteada
            //creamos objetos tipo persona adicionales
            Personas persona1 = new Personas("liam", 2);
            Personas persona2 = new Personas("karen", 22);
            
            //con el objeto escritura y el metodo .escribirobjeto escribimos los datos de los objetos creados anteriormente
            escritura.writeObject(persona1);
            escritura.writeObject(persona2);
            
            escritura.close();
            
        } catch (FileNotFoundException ex) {
            System.err.println("Error, "+ex);
        } catch (IOException ex) {
            System.err.println("Error; "+ex);
        }
    }
    private void leerBinario(){
        Personas objetoPersona;
        
        try {
            FileInputStream archivo = new FileInputStream("Personas.bin");
            ObjectInputStream lectura = new ObjectInputStream(archivo);
            
            while(true){//recorremos el archivo binario con el ciclo infinito
                objetoPersona = (Personas)lectura.readObject();//leemos el archivo
                objetoPersona.mostrarDatos();
            }
        } catch(EOFException ex){
            return;//escepcion que indica que ya termino de leer el archivo,la utilizamos para salir del while
        }catch (FileNotFoundException ex) {
            System.err.println("Error, "+ex);
        } catch (IOException ex) {
            System.err.println("Error, "+ex);        
        } catch (ClassNotFoundException ex) {
            System.err.println("Error, "+ex);
        }
    }
    public static void main(String[] args) {
        ArchivosBinarios archivos = new ArchivosBinarios();//creamos un objeto de tipo archivo binario para utilizar sus metodos
        
        //archivos.escribirBinario();//implementamos el metodo escribir binario con ayuda del objeto
        archivos.añadirBinario();
        archivos.leerBinario();
    }
}
