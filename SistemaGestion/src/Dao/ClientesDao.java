/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cliente;

/**
 *
 * @author jeison tamara
 */
public class ClientesDao {
    public void agregar(Cliente cliente){
        String baseDeDatos = "clientes";
        String usuario = "root";
        String password = "95050201";
        String host="localhost";
        String puerto="3306";
        String driver="com.mysql.jdbc.Driver";
        String conexionUrl="jdbc:mysql://"+host+":"+puerto+"/"+baseDeDatos+"?useSSL=false";
        
        Connection conexion = null;
        
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(conexionUrl, usuario, password);
            
            String sql="insert into `clientes`(`id`,`nombre`,`apellido`,`telefono`,`email`) values(null,'"+cliente.getNombre()+"','"+cliente.getApellido()+"','"+cliente.getTelefono()+"','"+cliente.getEmail()+"');";
            Statement statement = conexion.createStatement();
            statement.executeQuery(sql);
        } catch (Exception ex) {
            Logger.getLogger(ClientesDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
