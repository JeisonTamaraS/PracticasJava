/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conteodeclicks;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author jeison tamara
 */
public class Ventana extends JFrame{
    private JPanel panel;
    private JLabel etiqueta;
    private JButton boton;
    private int i=0;
    
    public Ventana(){
        setSize(500,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("CONTADOR DE CLICKS");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(300,100));
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        colocarPanel();
        colocarEtiqueta();
        colocarBoton();
    }
    private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
        
    }
    private void colocarEtiqueta(){
        etiqueta = new JLabel("Pulsa el Boton");
        etiqueta.setBounds(0, 20, 500, 60);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setFont(new Font("arial",1,20));
        panel.add(etiqueta);
    }
    
    private void colocarBoton(){
        
        boton = new JButton("¡Click aqui!");
        boton.setBounds(200, 100, 120, 50);
        boton.setFont(new Font("arial",1,15));
        panel.add(boton);
        
        
        actionListener();
    }
    private void actionListener(){
        ActionListener oyenteAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {            
                i++; 
                if(i==1){
                    etiqueta.setText("El Boton ha sido precionado 1 vez");
                }else{
                    etiqueta.setText("El Boton ha sido precionado "+i+" veces");
                }
            }
        };
          
        boton.addActionListener(oyenteAccion);
    }
}

