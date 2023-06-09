
package appfactura;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author jeison tamara
 */
public class Appfactura extends JFrame {
    
    public Appfactura(){
        JLabel ordedendecompra=new JLabel("ORDEN DE COMPRA");
        ordedendecompra.setBounds(20,20,300,300);
        JLabel cliente=new JLabel("CLIENTE");
        cliente.setBounds(20,30,300,30);
        JLabel producto=new JLabel("PRODUCTO");
        producto.setBounds(30,10,300,30);
        JLabel vlrunitario=new JLabel("VLR. UNITARIO");
        vlrunitario.setBounds(40,10,300,30);
        JLabel cantidad=new JLabel("CANTIDAD");
        cantidad.setBounds(10,10,300,30);
        JLabel vlrtotal=new JLabel("VLR. TOTAL");
        vlrtotal.setBounds(10,10,300,30);
        JLabel valortotal=new JLabel("VALOR TOTAL");
        valortotal.setBounds(10,10,300,30);
        JLabel resultado=new JLabel();
        resultado.setBounds(10,10,300,30);
        JButton boton = new JButton("CALCULAR");
        boton.setBounds(100,100,150,30);
        JTextField nombrecliente=new JTextField(150);
        nombrecliente.setBounds(100,100,150,30);
        JTextField producto1=new JTextField(150);
        producto1.setBounds(100,100,150,30);
        JTextField producto2=new JTextField(150);
        producto2.setBounds(100,100,150,30);
        JTextField producto3=new JTextField(150);
        producto3.setBounds(100,100,150,30);
        JTextField vlr1=new JTextField(150);
        vlr1.setBounds(100,100,150,30);
        JTextField vlr2=new JTextField(150);
        vlr2.setBounds(100,100,150,30);
        JTextField vlr3=new JTextField(150);
        vlr3.setBounds(100,100,150,30);
        JTextField cant1=new JTextField(150);
        cant1.setBounds(100,100,150,30);
        JTextField cant2=new JTextField(150);
        cant2.setBounds(100,100,150,30);
        JTextField cant3=new JTextField(150);
        cant3.setBounds(100,100,150,30);
        JTextField vlrtotal1=new JTextField(150);
        vlrtotal1.setBounds(100,100,150,30);
        JTextField vlrtotal2=new JTextField(150);
        vlrtotal2.setBounds(100,100,150,30);
        JTextField vlrtotal3=new JTextField(150);
        vlrtotal3.setBounds(100,100,150,30);
        JTextField valortotal1=new JTextField(150);
        valortotal1.setBounds(100,100,150,30);
        
        ActionListener escuchador=new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                resultado.setText("SEÑOR@ "+ nombrecliente.getSelectedText()+"EL TOTAL DE SU COMPRA ES: "+valortotal1.getText());
            
            }
        };
        boton.addActionListener(escuchador);
        add(ordedendecompra);
        add(cliente);
        add(producto);
        add(vlrunitario);
        add(cantidad);
        add(vlrtotal);
        add(valortotal);
        add(resultado);
        add(boton);
        add(nombrecliente);
        add(producto1);
        add(producto2);
        add(producto3);
        add(vlr1);
        add(vlr2);
        add(vlr3);
        add(cant1);
        add(cant2);
        add(cant3);
        add(vlrtotal1);
        add(vlrtotal2);
        add(vlrtotal3);
        add(valortotal1);
        setSize(600,600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
     
     
    public static void main(String[] args) {
        new Appfactura();
    }
    
}
