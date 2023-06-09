/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author jeison tamara
 */
public class Conexion extends javax.swing.JFrame {
    //establecemos como publicos y estaticos-constantes los datos necesarios para establecer una conexion con la base de datos
    public static final String URL = "jdbc:mysql://localhost:3306/escuela?autoReconnet=true&useSSL=false";
    public static final String usuario = "root";
    public static final String contraseña = "95050201";
            
    public Conexion() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonConectar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonConectar.setText("Conectar");
        botonConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConectarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(botonConectar)
                .addContainerGap(179, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(botonConectar)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConectarActionPerformed
        
        Connection conexion = getConnection();//para el boton conectar llamamos el metodo creado anteriormente con la ayuda de un objeto conector 
        PreparedStatement ps; //guarda las diferentes consultas 
        ResultSet rs;//permite obtener todo el contenido de la base de datos
        
        try{
            ps = conexion.prepareStatement("select * from persona");//hacemos la consuta
            rs = ps.executeQuery();//ejecutamos la linea de codigo
            
            if(rs.next()){//si se encuentra resultdo 
                JOptionPane.showMessageDialog(null, "Nombre"+rs.getString("nombre")+
                        "\nDomicilio"+rs.getString("domicilio")+
                        "\nCelular"+rs.getString("celular"));//+
                       // "\nCorreo electronico"+rs.getString("correo_electronico"+
                        //"\nFecha de nacimiento"+String.valueOf(rs.getDate("fecha_nacimiento"))+
                        //"\nGenero"+rs.getString("genero")));
            }else{
                JOptionPane.showMessageDialog(null, "No se encontraron registros");
            }
            conexion.close();
        }catch(Exception ex){//capturamos las escepciones que puedan presentarse
            System.err.println("Error, "+ex);
        }
        
    }//GEN-LAST:event_botonConectarActionPerformed
    
    public Connection getConnection(){//creamos un metodo para establecer la conexion con la base de datos
        Connection conexion = null;//creamos un objeto de tipo coneccion
        
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");//utilizamos la clase .forname para utilizar el driver de conexion
            conexion = (Connection) DriverManager.getConnection(URL,usuario,contraseña);//utilizamos el driver para obtener la conexion 
            JOptionPane.showMessageDialog(null,"Conexion exitosa");//mostramos si la conexion ha sido exitosa
        }catch(Exception ex){//capturamos las escepciones que se puedan presentar
            System.err.println("Error, "+ex);
        }
        return conexion;//retornamos la conexcion
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conexion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonConectar;
    // End of variables declaration//GEN-END:variables
}
