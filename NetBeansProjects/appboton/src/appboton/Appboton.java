
package appboton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Appboton extends JFrame {
    
    public Appboton (){
        JLabel titulo=new JLabel("Servicio de Aprendizaje SENA");
        titulo.setBounds(100,60,300,30);
        JButton boton = new JButton("BOTON");
        boton.setBounds(100,100,150,30);
        JLabel muestramensaje = new JLabel();
        muestramensaje.setBounds(100,200,200,50);
        
        ActionListener accionador;
        accionador = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                    muestramensaje.setText("el BOTON ha sido presionado");
            }        
        };
        boton.addActionListener(accionador);
        add(titulo);
        add(boton);
        add(muestramensaje);
        setSize(400,400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        
    }

   
    public static void main(String[] args) {
        
        new Appboton();
    }
    
}
