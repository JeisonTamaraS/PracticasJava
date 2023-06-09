/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import javax.swing.DefaultComboBoxModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jeison tamara
 */
public class Ventana extends javax.swing.JFrame {
    private DefaultComboBoxModel<Persona> modelo = new DefaultComboBoxModel<Persona>();
    private DefaultTableModel modelotabla = new DefaultTableModel();
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        llenarComboBox();
        agregarModeloTabla();
        initComponents();
        setLocationRelativeTo(null);
    }
    private void llenarComboBox(){
        modelo.addElement(new Persona("jeison","tamara","jeison@hotmail.com","322345987","cll4#45-22"));
        modelo.addElement(new Persona("karen","lozada","karen@hotmail.com","321487667","cr#09-12"));
        modelo.addElement(new Persona("luis","manjarres","luits@yahoo.com","323147657","cr4#58-98"));
        modelo.addElement(new Persona("pedro","lopez","pmlopez@gmail.com","327380987","cll4#23-38"));
        modelo.addElement(new Persona("liam","sangregorio","liam@gmail.com","311496977","tvz48#4-02"));
    }
    private void agregarModeloTabla(){
        modelotabla.addColumn("Nombre");
        modelotabla.addColumn("Apellido");
        modelotabla.addColumn("Email");
        modelotabla.addColumn("Celular");
        modelotabla.addColumn("Direccion");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        etiquetaPersonas = new javax.swing.JLabel();
        botonInsertar = new javax.swing.JButton();
        comboPersonas = new javax.swing.JComboBox<>();
        scroll = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        separador = new javax.swing.JSeparator();
        etiquetadatospersonales = new javax.swing.JLabel();
        cuadronombre = new javax.swing.JTextField();
        etiquetanombre = new javax.swing.JLabel();
        cuadroapellido = new javax.swing.JTextField();
        etiquetaapellido = new javax.swing.JLabel();
        etiquetaemail = new javax.swing.JLabel();
        etiquetacelular = new javax.swing.JLabel();
        cuadroemail = new javax.swing.JTextField();
        cuadrocelular = new javax.swing.JTextField();
        etiquetadireccion = new javax.swing.JLabel();
        cuadrodireccion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiquetaPersonas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetaPersonas.setText("Personas");

        botonInsertar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonInsertar.setText("Insertar Persona");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });

        comboPersonas.setModel(modelo);

        tabla.setModel(modelotabla);
        ListSelectionListener oyenteseleccion = new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e){
                if(e.getValueIsAdjusting()){
                    int filaseleccionada = tabla.getSelectedRow();

                    String nombre = (String)modelotabla.getValueAt(filaseleccionada, 0);
                    String apellido = (String)modelotabla.getValueAt(filaseleccionada, 1);
                    String email = (String)modelotabla.getValueAt(filaseleccionada, 2);
                    String celular = (String)modelotabla.getValueAt(filaseleccionada, 3);
                    String direccion = (String)modelotabla.getValueAt(filaseleccionada, 4);

                    cuadronombre.setText(nombre);
                    cuadroapellido.setText(apellido);
                    cuadroemail.setText(email);
                    cuadrocelular.setText(celular);
                    cuadrodireccion.setText(direccion);
                }
            }

        };

        tabla.getSelectionModel().addListSelectionListener(oyenteseleccion);
        scroll.setViewportView(tabla);

        etiquetadatospersonales.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetadatospersonales.setText("Datos Personales");

        etiquetanombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetanombre.setText("Nombre");

        etiquetaapellido.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetaapellido.setText("Apellido");

        etiquetaemail.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetaemail.setText("Email");

        etiquetacelular.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetacelular.setText("Celular");

        etiquetadireccion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetadireccion.setText("Direccion");

        cuadrodireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadrodireccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(etiquetaPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(comboPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(botonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cuadrodireccion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                .addComponent(cuadroemail, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cuadrocelular))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                .addComponent(cuadronombre, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cuadroapellido))
                            .addComponent(etiquetadatospersonales, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scroll, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                            .addComponent(separador, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                .addComponent(etiquetanombre)
                                .addGap(185, 185, 185)
                                .addComponent(etiquetaapellido))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                .addComponent(etiquetaemail)
                                .addGap(206, 206, 206)
                                .addComponent(etiquetacelular))
                            .addComponent(etiquetadireccion, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetadatospersonales, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetanombre)
                    .addComponent(etiquetaapellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cuadroapellido, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(cuadronombre))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaemail)
                    .addComponent(etiquetacelular, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cuadrocelular, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(cuadroemail))
                .addGap(18, 18, 18)
                .addComponent(etiquetadireccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cuadrodireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cuadrodireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadrodireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuadrodireccionActionPerformed

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        Persona p =(Persona)comboPersonas.getSelectedItem();
        
        String nombre = p.getNombre();
        String apellido = p.getApellido();
        String email = p.getEmail();
        String celular = p.getCelular();
        String direccion = p.getDireccion();
        
        String [] Personas ={nombre,apellido,email,celular,direccion};
        modelotabla.addRow(Personas);
    }//GEN-LAST:event_botonInsertarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonInsertar;
    private javax.swing.JComboBox<Persona> comboPersonas;
    private javax.swing.JTextField cuadroapellido;
    private javax.swing.JTextField cuadrocelular;
    private javax.swing.JTextField cuadrodireccion;
    private javax.swing.JTextField cuadroemail;
    private javax.swing.JTextField cuadronombre;
    private javax.swing.JLabel etiquetaPersonas;
    private javax.swing.JLabel etiquetaapellido;
    private javax.swing.JLabel etiquetacelular;
    private javax.swing.JLabel etiquetadatospersonales;
    private javax.swing.JLabel etiquetadireccion;
    private javax.swing.JLabel etiquetaemail;
    private javax.swing.JLabel etiquetanombre;
    private javax.swing.JPanel panel;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JSeparator separador;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
