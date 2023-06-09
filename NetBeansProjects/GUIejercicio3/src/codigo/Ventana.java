/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author jeison tamara
 */
public class Ventana extends JFrame{
    private JPanel panel;
    private JButton boton1,boton2,boton3;
    private JLabel etiqueta;
    private int pulsado = 0;
    private int contador1=0,contador2=0,contador3=0;
    public Ventana(){
        setSize(550,550);
        setTitle("Juego de Colores");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        iniciarPanel();
        colocarEtiqueta();
        colocarBotones();
    }
    private void iniciarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
        
        eventoRuedaRaton();
    }
    private void colocarEtiqueta(){
        etiqueta = new JLabel("Color(Rojo= 0, Verde= 0, Azul= 0)");
        etiqueta.setBounds(10, 20, 500, 40);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setFont(new Font("arial black",1,20));
        panel.add(etiqueta);
    }
    private void colocarBotones(){
        boton1 = new JButton("Rojo");
        boton1.setBounds(60, 300, 100, 60);
        boton1.setForeground(Color.red);
        boton1.setFont(new Font("aharoni",1,20));
        panel.add(boton1);
        //evento de accion para saber que boton ha sido presionado boton 1
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pulsado=1;
            }
        });
        
        boton2 = new JButton("Verde");
        boton2.setBounds(210, 300, 100, 60);
        boton2.setForeground(Color.green);
        boton2.setFont(new Font("aharoni",1,20));
        panel.add(boton2);
        //evento de accion para saber que boton ha sido presionado boton 2
         boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pulsado=2;
            }
        });
        
        boton3 = new JButton("Azul");
        boton3.setBounds(360, 300, 100, 60);
        boton3.setForeground(Color.BLUE);
        boton3.setFont(new Font("aharoni",1,20));
        panel.add(boton3);
        //evento de accion para saber que boton ha sido presionado boton 3
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pulsado=3;
            }
        });
    }
    private void eventoRuedaRaton(){
        //agregamos una accion con el oyente de rueda raton 
        MouseWheelListener eventoRaton = new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                if(pulsado !=0){
                    //este condicional permite hacer el cambio de valor del color
                    if(pulsado==1){//condicional si es presionado el boton1
                        contador1 += e.getWheelRotation();//le asignamos al contador el valor dado por la rueda del raton
                        if(contador1<0){//bloqueamos valores negativos
                            contador1=0;
                        }if(contador1>255){//boqueamos valores superiores a 255
                            contador1=255;
                        }
                    }else if(pulsado==2){//condicional para boton2
                        contador2 += e.getWheelRotation();
                        if(contador2<0){
                            contador2=0;
                        }if(contador2>255){
                            contador2=255;
                        }
                    }else{//condicional para boton3
                        contador3 += e.getWheelRotation();
                        if(contador3<0){
                            contador3=0;
                        }if(contador3>255){
                            contador3=255;
                        }
                    }
                }
                etiqueta.setText("Color(Rojo= "+contador1+", Verde= "+contador2+", Azul= "+contador3+")");//mostramos el valor de cambio de color en la etiqueta
                panel.setBackground(new Color(contador1,contador2,contador3));//le asignamos la combinacion de color(RGB)con los valosres que tienen loc ontadores al fondo del panel
            }
        };
        
        panel.addMouseWheelListener(eventoRaton);//agregamos el oyentederuedaraton al panel
    }
}
