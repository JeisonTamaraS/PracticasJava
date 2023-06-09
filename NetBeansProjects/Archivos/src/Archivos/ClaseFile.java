/*
 * Archivos: es un conjunto de bits almacenados en un dispositivo esta 
 *           identificado por un nombre y la descripcion de la carpeta o
 *           directorio que lo contiene; facilitan una manera de organizar 
 *           los recursos usador para almacenar permanentemente datos en un 
 *           sistema informatico virtual.
 * tipos: archivos de texto: su contenido puede ser abierto por cualquier
 *        editor de texto.
 *        archivos binarios: contienen informacion de cualquier tipo codificada en 
 *        binario, solo puede ser leido con el mismo software que lo creo
 */
package Archivos;

import java.io.File;

/**
 *
 * @author jeison tamara
 */
public class ClaseFile {
    public static void main(String[] args) {
        //podemor hacer lo mismo con carpetas o directorios
        File archivo = new File("Prueba.txt");//creamos un objeto tipo file y le pasamos como argumento la ruta donde se encuentra el archivo
    
        if(archivo.exists()){//metodo para verificar si el archivo existe
            System.out.println("el archivo existe");
            System.out.println("ruta absoluta: "+archivo.getAbsolutePath());//metodo para conocer la ubicacion con la ruta absoluta del archivo
            System.out.println("es un archivo? "+archivo.isFile());//retorna true si es un archivo
            System.out.println("se puede leer? "+archivo.canRead());//retorna true si se puede leer
        }else{
            System.out.println("el archivo no existe");
        }
    }
    
}
