/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jeison tamara
 */
public class Archivo {
    private File archivo;
    
    public void crearArchivo(){//metodo para crear un archivo
        archivo = new File("agendaContactos.txt");//objeto tipo archivo con su argumento 
        try {
            if(archivo.createNewFile()){//creamos archivo con el metodo .createnewfile
                //se ha creado el archivo
            }
        } catch (IOException ex) {//capturamos las escepciones
            System.err.println("Error, " +ex);
        }
    }
    public void escribirTexto(Personas persona){//metodo para escribir y añadir texto de tipo persona en el archivo
        try {
            FileWriter escribir = new FileWriter(archivo,true);//objeto tipo escribir archivo
            escribir.write(persona.getNombre()+"%"+persona.getCorreo()+"%"+persona.getTelefono()+"\r\n");//metodo .write para escibir en el archivo con el constructor de persona 
            escribir.close();
        } catch (IOException ex) {//capturamos la escepcion
            System.err.println("Error, "+ex);
        }
    }
}
