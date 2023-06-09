/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author jeison tamara
 */
public class Ventana extends javax.swing.JFrame {
    private Timer tiempo;
    private int centesimasegundos=0,segundos=0,minutos=0,horas=0;
    private ActionListener acciones = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            centesimasegundos++;
            if(centesimasegundos==100){
                segundos++;
                centesimasegundos=0;
            }if(segundos==60){
                minutos++;
                segundos=0;
            }if(minutos==60){
                horas++;
                minutos=0;
            }
            actualizarEtiquetaTiempo();
        }
    };
    private void actualizarEtiquetaTiempo(){
        String texto = (horas<=9?"0":" ")+horas+":"+(minutos<=9?"0":" ")+minutos+":"+(segundos<=9?"0":" ")+segundos+":"+(centesimasegundos<=9?"0":" ")+centesimasegundos;
        etiquetatiempo.setText(texto);
    }
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
        tiempo = new Timer(10, acciones);
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
        imagencronometro = new javax.swing.JLabel();
        etiquetacronometro = new javax.swing.JLabel();
        etiquetatiempo = new javax.swing.JLabel();
        botoniniciar = new javax.swing.JButton();
        botonpausar = new javax.swing.JButton();
        botondetener = new javax.swing.JButton();
        etiquetafondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cronometro");
        setResizable(false);

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagencronometro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cronometro.png"))); // NOI18N
        panel.add(imagencronometro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 180));

        etiquetacronometro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 33)); // NOI18N
        etiquetacronometro.setForeground(new java.awt.Color(255, 255, 255));
        etiquetacronometro.setText("Cronometro");
        panel.add(etiquetacronometro, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 30, 200, -1));

        etiquetatiempo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        etiquetatiempo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetatiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetatiempo.setText("00:00:00:00");
        etiquetatiempo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panel.add(etiquetatiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 220, 60));

        botoniniciar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botoniniciar.setText("Iniciar");
        botoniniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoniniciarActionPerformed(evt);
            }
        });
        panel.add(botoniniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 100, 40));

        botonpausar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonpausar.setText("Pausar");
        botonpausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonpausarActionPerformed(evt);
            }
        });
        panel.add(botonpausar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 100, 40));

        botondetener.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botondetener.setText("Detener");
        botondetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botondetenerActionPerformed(evt);
            }
        });
        panel.add(botondetener, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 100, 40));

        etiquetafondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        panel.add(etiquetafondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botoniniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoniniciarActionPerformed
        tiempo.start();
        botoniniciar.setEnabled(false);
        botoniniciar.setText("Reanudar");
        botonpausar.setEnabled(true);
        botondetener.setEnabled(true);
    }//GEN-LAST:event_botoniniciarActionPerformed

    private void botonpausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonpausarActionPerformed
        tiempo.stop();
        botoniniciar.setEnabled(true);
        botonpausar.setEnabled(false);
    }//GEN-LAST:event_botonpausarActionPerformed

    private void botondetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botondetenerActionPerformed
        if(tiempo.isRunning()){
            tiempo.stop();
            botoniniciar.setEnabled(true);
        }
        botoniniciar.setText("Iniciar");
        botonpausar.setEnabled(false);
        botondetener.setEnabled(false);
        
        horas=0;
        minutos=0;
        segundos=0;
        centesimasegundos=0;
        
        actualizarEtiquetaTiempo();
    }//GEN-LAST:event_botondetenerActionPerformed

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
    private javax.swing.JButton botondetener;
    private javax.swing.JButton botoniniciar;
    private javax.swing.JButton botonpausar;
    private javax.swing.JLabel etiquetacronometro;
    private javax.swing.JLabel etiquetafondo;
    private javax.swing.JLabel etiquetatiempo;
    private javax.swing.JLabel imagencronometro;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
