/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

/**
 *
 * @author jeison tamara
 */
public class Ventana extends JFrame{
    private JPanel panel;
    private JLabel saludo;
    private JButton boton;
    private JTextField cuadrotexto;
    private JTextArea areatexto;
    
    public Ventana(){
        this.setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Ventana de Eventos");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(400,400));
        iniciarComponentes();

    }
    private void iniciarComponentes(){
        iniciarPanel();
        //colocarEtiqueta();
        colocarCuadroTexto();
        colocarAreaTexto();
        //ColocarBoton();
    }
    private void iniciarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        //eventoMovimientoRaton();
        //eventoRuedaRaton();
        eventoTeclado();
    }
    private void colocarEtiqueta(){
        JLabel etiqueta = new JLabel("Ingrese su Nombre",SwingConstants.CENTER);
        etiqueta.setBounds(150, 0, 200, 100);
        etiqueta.setFont(new Font("caribri",1,20));
        panel.add(etiqueta);
        
    }
    private void colocarCuadroTexto(){
        cuadrotexto = new JTextField();
        cuadrotexto.setBounds(250, 100, 200, 30);
        cuadrotexto.setFont(new Font("biome",0,15));
        panel.add(cuadrotexto);
        
    }
    private void colocarAreaTexto(){
        areatexto = new JTextArea();
        areatexto.setBounds(20, 20, 200, 300);
        panel.add(areatexto);
        
        JScrollPane scroll = new JScrollPane(areatexto,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED ,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(20, 20, 200, 300);
        panel.add(scroll);
    }
    private void ColocarBoton(){
        boton = new JButton("¡click aqui!");
        boton.setBounds(175, 400, 150, 40);
        boton.setFont(new Font("algerian",1,15));
        panel.add(boton);
                
        /*saludo = new JLabel();
        saludo.setBounds(100, 300, 300, 60);
        saludo.setFont(new Font("forte",1,30));
        panel.add(saludo);*/
        
        //actionListener();
        //mouseListener();
        
    }
    private void actionListener(){
        //le damos la accion al boton mediante el actionlistener
        ActionListener oyenteaccion = new ActionListener() {
            //como es una clase interface implementamos el metodo directamente 
            @Override
            public void actionPerformed(ActionEvent e) {
                saludo.setText("Hola "+ cuadrotexto.getText());//esta es la accion que se realizara al presionar el boton
            }
        };
        
        boton.addActionListener(oyenteaccion);//agregamos al boton la accion
    }
    private void mouseListener(){
        //metodos oyente de raton
        MouseListener oyenteraton = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {//los eventos del metodo mouseclicked estan dados por el objeto de tipo MouseEvent e.
                if(e.isAltDown()){//un tipo de metodo que se ejecuta al presionar el clik al mismo tiempo que la tecla Alt
                    areatexto.append("alt\n");
                }else if(e.isControlDown()){//un tipo de metodo que se ejecuta al presionar el clik al mismo tiempo que la tecla Ctrl
                    areatexto.append("ctrl\n");
                }else if(e.isShiftDown()){//un tipo de metodo que se ejecuta al presionar el clik al mismo tiempo que la tecla Shift
                    areatexto.append("shift\n");
                }else if(e.isMetaDown()){//un tipo de metodo que se ejecuta al presionar el clik derecho
                    areatexto.append("Click derecho\n");
                }else{
                    areatexto.append("click izquierdo\n");
                }
                if(e.getClickCount()==2){
                    areatexto.append("doble click\n");
                }
                //areatexto.append("mouseClicked\n");//se ejecuta cuando se le da click y se suelta el boton dentro del mismo
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //areatexto.append("mousePressed\n");//se ejecuta cuando se presiona el boton 
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //areatexto.append("mouseReleased\n");//se ejecuta al dar clik en el boton sin importar donde se suelte
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //areatexto.append("mouseEntered\n");//se ejecuta cuando el cursor toca el boton sin necesidad de dar clik 
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //areatexto.append("mouseExited\n");//se ejecuta cuando el cursor sale del boton sin necesidad de dar click
            }
        };
        boton.addMouseListener(oyenteraton);
    }
    private void eventoMovimientoRaton(){
        //utilizamos eventos relacionados con el movimiento del raton
        MouseMotionListener movimientoraton = new MouseMotionListener() {//utilizamos el objeto de tipo mousemotionlistener y al ser una interface debemos implementar sus metodos            @Override
            @Override
            public void mouseDragged(MouseEvent e) {//este metodo se ejecuta cuando movemos el raton por la zona con el click sostenido
                areatexto.append("mouseDragged\n");
            }

            @Override
            public void mouseMoved(MouseEvent e) {//este metodo se ejecuta  con el movimiento del raton dentro de la zona
                areatexto.append("mouseMoved\n");
            }
        };
        panel.addMouseMotionListener(movimientoraton);
    }
    private void eventoRuedaRaton(){
        MouseWheelListener movimientoraton = new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                if(e.getPreciseWheelRotation()==-1){
                    areatexto.append("rueda hacia arriba\n");
                }if(e.getPreciseWheelRotation()==1){
                    areatexto.append("rueda hacia abajo\n");
                }
            }
        };
        
        panel.addMouseWheelListener(movimientoraton);
    }
    private void eventoTeclado(){
        KeyListener eventoteclado = new KeyListener() {//creamos un objeto oyente de teclado e implementamos sus metodos 
            @Override
            public void keyTyped(KeyEvent e) {//se ejecuta cuando se presiona numeros, letras y simbolos, no es necesario soltar
                areatexto.append("keyTyped");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //areatexto.append("keyPressed");//se ejecuta con cualquier tecla, no es necesario soltar
            }

            @Override
            public void keyReleased(KeyEvent e) {//se ejecuta con cualquier tecla cuando esta es presionada y soltada
                //areatexto.append("keyReleased");
                if(e.getKeyChar()=='p'){
                    areatexto.append("letra p\n");
                }if(e.getKeyChar()=='\n'){
                    areatexto.append("presiono Enter\n");
                }if(e.getKeyChar()==' '){
                    areatexto.append("presiono Espacio\n");
                }
            }
        };
        
        cuadrotexto.addKeyListener(eventoteclado);//la accion se le agrega al cuadro de texto en el cual se digitaran las letras 
    }
}
    