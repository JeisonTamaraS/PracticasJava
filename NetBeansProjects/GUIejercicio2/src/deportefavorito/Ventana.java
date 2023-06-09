/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deportefavorito;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author jeison tamara
 */
public class Ventana extends JFrame {
    private JPanel panel;
    private JLabel etiqueta,imagen;
    private JRadioButton rb1,rb2,rb3,rb4;
    
    public Ventana(){
        setSize(600,400);
        setTitle("Deporte Favorito");
        setLocationRelativeTo(null);
        iniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void iniciarComponentes(){
        iniciarPanel();
        colocarEtiqueta();
        radioBoton();
        
    }
    private void iniciarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }
    private void colocarEtiqueta(){
        etiqueta = new JLabel("Escoje tu Deporte favorito:");
        etiqueta.setBounds(10, 10, 300, 30);
        etiqueta.setFont(new Font("arial",1,20));
        panel.add(etiqueta);
    }
    private void radioBoton(){
        JRadioButton rb1 = new JRadioButton("Futbol", false);
        rb1.setBounds(20, 60, 120, 30);
        rb1.setFont(new Font("arial",1,15));
        panel.add(rb1);
        
        JRadioButton rb2 = new JRadioButton("Baloncesto", false);
        rb2.setBounds(20, 110, 120, 30);
        rb2.setFont(new Font("arial",1,15));
        panel.add(rb2);
        
        JRadioButton rb3 = new JRadioButton("Natacion", false);
        rb3.setBounds(20, 160, 120, 30);
        rb3.setFont(new Font("arial",1,15));
        panel.add(rb3);
        
        JRadioButton rb4 = new JRadioButton("Beisbol", false);
        rb4.setBounds(20, 210, 120, 30);
        rb4.setFont(new Font("arial",1,15));
        panel.add(rb4);
        
        ButtonGroup grupobotones = new ButtonGroup();
        grupobotones.add(rb1);
        grupobotones.add(rb2);
        grupobotones.add(rb3);
        grupobotones.add(rb4);
        
        eventoAccion();
    }
    private void eventoAccion(){
        imagen = new JLabel();
        imagen.setBounds(200, 60, 300, 200);
        panel.add(imagen);
        
        final ImageIcon imagenfutbol = new ImageIcon(getClass().getResource("/imagenes/futbol.jpg"));
       /* final ImageIcon imagenbaloncesto = new ImageIcon(getClass().getResource("/imagenes/baloncesto.jpg"));
        final ImageIcon imagennatacion = new ImageIcon(getClass().getResource("/imagenes/natacion.jpg"));
        final ImageIcon imagenbeisbol = new ImageIcon(getClass().getResource("/imagenes/beisbol.jpg"));
        */
        ActionListener evento1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.setIcon(new ImageIcon(imagenfutbol.getImage().getScaledInstance(imagen.getWidth(),imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        rb1.addActionListener(evento1);
        
       /* ActionListener evento2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.setIcon(new ImageIcon(imagenbaloncesto.getImage().getScaledInstance(imagen.getWidth(),imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        rb2.addActionListener(evento2);
       
        ActionListener evento3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.setIcon(new ImageIcon(imagennatacion.getImage().getScaledInstance(imagen.getWidth(),imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        rb3.addActionListener(evento3);
        
        ActionListener evento4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.setIcon(new ImageIcon(imagenbeisbol.getImage().getScaledInstance(imagen.getWidth(),imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        rb4.addActionListener(evento4);
    */
    }
    
}
