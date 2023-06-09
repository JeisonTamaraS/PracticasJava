
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conexion {
    public static final String URL = "jdbc:mysql://localhost:3306/escuela?autoReconnet=true&useSSL=false";
    public static final String usuario = "root";
    public static final String contraseña = "95050201";
    
     public Connection getConnection(){//creamos un metodo para establecer la conexion con la base de datos
        Connection conexion = null;//creamos un objeto de tipo coneccion
        
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");//utilizamos la clase .forname para utilizar el driver de conexion
            conexion = (Connection) DriverManager.getConnection(URL,usuario,contraseña);//utilizamos el driver para obtener la conexion 
        }catch(Exception ex){//capturamos las escepciones que se puedan presentar
            System.err.println("Error, "+ex);
        }
        return conexion;//retornamos la conexcion
    }
}
