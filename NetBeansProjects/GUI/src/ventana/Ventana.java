/*
 * Interfaces graficas de usuario(GUI)
 */
package ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jeison tamara
 */
//Jframe es la clase que contiene todos los objetos y metodos para crear interfaces graficas
//por lo tamto las clase ventana ereda de la superclase JFrame 
public class Ventana extends JFrame{
    public JPanel panel;
    public Ventana(){//metodo constructor de la clase ventana
        this.setSize(500,500);//parametro tamaño de ventana setSize(ancho,largo)
        setDefaultCloseOperation(EXIT_ON_CLOSE);//cerramos la ventana y terminamos el programa 
        setTitle("TITULO DE LA APP");//asignamos un titulo a la ventana
        //setLocation(400, 150);//le damos valor en coordenadas x y y a la posicion de la ventana
        //setBounds(400, 150, 500, 500);//este metodo junta el setsize y el setLocation con los argumentos(x,y,ancho,alto)
        setLocationRelativeTo(null);//este metodo con el valor null posiciona por defecto la ventana en el centro de la pantalla
        //setResizable(false);//este metodo por defecto esta en true pero al cambiar su estado bloquea la opcion de redimensionar la ventana
        setMinimumSize(new Dimension(200,200));//con este metodo podemos redimensionar la ventana pero teniendo un limite ninimo de tamaño al que puede llegar la ventana
        
        this.getContentPane().setBackground(Color.red);//asignamos la vetana y cambiamos el color
        iniciarComponentes();
    }
    //metodo para crear un panel 
    private void iniciarComponentes(){
        iniciarPanel();
        colocarEtiquetas();
        //colocarBoton();
        //colocarBotonRadio();
        //colocarBotonActivacion();
        //colocarCajaTexto();
        //colocarAreaTexto();
        //colocarCasillaVerificacion();
        //colocarListaDesplegable();
        //colocarCampoContraseña();
        //colocarTabla();
        //colocarLista();
    }
    private void iniciarPanel(){
        panel = new JPanel();//Creamos un objeto de la clase panel
        //panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(null);//desactivamos los diseños por defecto
        this.getContentPane().add(panel);//agregamos el panel a la ventana
    }
    private void colocarEtiquetas(){
         //creamos una etiqueta
        JLabel etiqueta = new JLabel("hola mundo", SwingConstants.CENTER);//creamos un objeto de la clase JLabel, conlos atributos de texto y alineacion del texto en la etiqueta
        //etiqueta.setText("Hola Mundo");//agregamos texto a la etiqueta
        //etiqueta.setHorizontalAlignment(SwingConstants.CENTER);//centramos el texto de la etiqueta dentro de ella
        etiqueta.setForeground(Color.red);//cambiamos el color de la letra
        etiqueta.setOpaque(true);//activamos la opcion de modificar el fondo de la etiqueta que por defecto es false
        etiqueta.setBackground(Color.ORANGE);//cambiamos el color de fondo de la etiqueta de transparente a naranja
        panel.add(etiqueta);//agregamos la etiqueta al panel 
        etiqueta.setBounds(20, 20, 400, 100);//modifica posicion (x y y) y tamaño (ancho y alto)de la etiqueta
        etiqueta.setFont(new Font("calibri",Font.ITALIC,60));//modificamos el tipo de letra, la familia y el tamaño
    
        //etiqueta para imagen
        ImageIcon imagen = new ImageIcon("minion.jpg");//creamos un objeto de tipo imagen
        JLabel etiqueta2 = new JLabel();//creamos la etiqueta
        //JLabel imagen = new JLabel(new ImageIcon("minion.jpg"));//declaramos un objeto de la clase JLabel y como argumento enviamos un objeto de tipo imageicon
        etiqueta2.setBounds(5, 10, 630, 354);// modificamos el tamaño y posicion de la imagen 
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));//creamos un nuevo objeto de tipo imageicon, obtenemos la imagen y utilizamos el metodo getscaleinstance para configurar el tamaño de la imagen
        panel.add(etiqueta2);//agregamos la imagen al panel 
    }
    private void colocarBoton(){
        JButton boton1 = new JButton("enviar");//creamos objeto de la clase Jbutton con el nombre como argumento
        //boton1.setText("enviar");//si no enviamos el argumento en la creacion del objeto podemos utilizar este metodo
        boton1.setBounds(100, 200, 100, 40);//posicionamos y le damos el tamaño al boton
        boton1.setEnabled(true);//habilitamos el uso del boton o lo desabilitamos cuando le mandaos false como atributo
        boton1.setMnemonic('a');//le damos una opcion de accionarlo con el teclado usando la tecla alt+ la letra que se le pasa como argumento
        boton1.setForeground(Color.red);//color de la letra del boton
        boton1.setFont(new Font("cooper black", 2, 20));//asignamos la fuente, el tipo y el tamaño.
        panel.add(boton1);//agregamos el boton al panel}
        
        //boton2 para imagen
        JButton boton2 = new JButton();//creamos objeto boton2 de la clase JButoon
        boton2.setBounds(300, 200, 100, 40);//posicionamos y le damos tamaño al boton
        ImageIcon click = new ImageIcon("boton.png");//creamos objeto de imagen
        boton2.setIcon(new ImageIcon(click.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));//modificamos el icono del boton le asignamos la imagen como atributo, la obtenemos y la redimensionamos con las medidas del boton
        //boton2.setBackground(Color.red);//cambiamos el color del boton
        panel.add(boton2);//agregamos el boton al panel
        
        //boton bordes
        JButton boton3 = new JButton();
        boton3.setBounds(200, 300, 150, 60);
        boton3.setBorder(BorderFactory.createLineBorder(Color.BLUE, 5, true));//configuramos el borde del boton, le pasamos un argumento de tipo borderfactori con el que creamos un borde con atrubutos(color, tamaño de borde, redondeo)
        panel.add(boton3);
    }
    private void colocarBotonRadio(){
        //creamos objeto boton radio y inicializamos con nombre y seleccion
        JRadioButton radioboton1 = new JRadioButton("opcion1",true);
        radioboton1.setBounds(50, 100, 100, 30);//posicionamos i le damos tamaño
        panel.add(radioboton1);//agregamos al panel
        //se hace lo mismo para los demas botones radio
        JRadioButton radioboton2 = new JRadioButton("opcion2",false);
        radioboton2.setBounds(50, 130, 100, 30);
        panel.add(radioboton2);
        
        JRadioButton radioboton3 = new JRadioButton("opcion3",false);
        radioboton3.setBounds(50, 160, 100, 30);
        panel.add(radioboton3);
        //creamos un objeto grupo de botones para agruparlos y que funcionen en conjunto
        ButtonGroup grupoboton = new ButtonGroup();
        //agregamos los botones al grupo creado
        grupoboton.add(radioboton1);
        grupoboton.add(radioboton2);
        grupoboton.add(radioboton3);
    }
    private void colocarBotonActivacion(){
        
        JToggleButton botonactivacion1 = new JToggleButton("boton1",true);
        botonactivacion1.setBounds(50,100,100,40);
        panel.add(botonactivacion1);
        
        JToggleButton botonactivacion2 = new JToggleButton("boton2",false);
        botonactivacion2.setBounds(50,160,100,40);
        panel.add(botonactivacion2);
        
        JToggleButton botonactivacion3 = new JToggleButton("boton3",false);
        botonactivacion3.setBounds(50,220,100,40);
        panel.add(botonactivacion3);
        
        ButtonGroup grupobotonactivacion = new ButtonGroup();
        grupobotonactivacion.add(botonactivacion1);
        grupobotonactivacion.add(botonactivacion2);
        grupobotonactivacion.add(botonactivacion3);
    }
    private void colocarCajaTexto(){
        JTextField cajatexto1 = new JTextField();
        cajatexto1.setBounds(50, 50, 100, 50);
        cajatexto1.setText("escriba aqui");
        
        System.out.println("caja de texto: " +cajatexto1.getText());
        panel.add(cajatexto1);
        
    }
    private void colocarAreaTexto(){
        JTextArea areatexto = new JTextArea();//creamos objeto de area texto
        areatexto.setBounds(20, 20, 200, 200);//posicionamos y le damos tamaño
        areatexto.setText("Escriba aqui...");//le damos texto inicial
        areatexto.append(" continue aqui...");//le agregamos texto
        areatexto.setEnabled(true);//habilitamos o no la edicion del texto inicial
        panel.add(areatexto);
        
        //colocar barras de dezplazamiento
        JScrollPane barradesplazamiento = new JScrollPane(areatexto,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);//creamos el objeto de tipo Jscrollpane y le pasamos como parametro el area texto al que vamos a aplicarla, tambien podemos inicializar las barras (horizontal y vertical) desde el mismo constructor
        barradesplazamiento.setBounds(20, 20, 200, 200);//posicionamos y le damos tamaño a la barra de desplazamiento, es recomendable usar las mismas medidas del area de texto
        //barradesplazamiento.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);//inicializamos la barra vertical y como argumento(le pasamos que sea visible cuando sea necesario)
        //barradesplazamiento.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);//inicializamos la barra horizontal y como argumento(le pasamos que sea visible cuando sea necesario)
        panel.add(barradesplazamiento);//agregamos al panel 
    }
    private void colocarCasillaVerificacion(){    
        JCheckBox casillaverificacion1 = new JCheckBox("Leche",false);//creamos el objeto de tipo Jcheckbox y le pasamos coo parametro el texto y un valor bolleano que me determina se inicia seleccionado o no 
        casillaverificacion1.setEnabled(false);//desactiva la opcion
        casillaverificacion1.setBounds(20, 20, 150, 50);//posicionamos y le damos tamaño 
        panel.add(casillaverificacion1);//agregamos al panel
        JCheckBox casillaverificacion2 = new JCheckBox("Carne",false);
        casillaverificacion2.setBounds(20, 80, 150, 50);
        panel.add(casillaverificacion2);
        JCheckBox casillaverificacion3 = new JCheckBox("Huevos",false);
        casillaverificacion3.setBounds(20, 140, 150, 50);
        panel.add(casillaverificacion3);
        JCheckBox casillaverificacion4 = new JCheckBox("Pollo",false);
        casillaverificacion4.setBounds(20, 200, 150, 50);
        panel.add(casillaverificacion4);
    }
    private void colocarListaDesplegable(){
        /*String paises[] = {"colombia","peru","brazil","argentina"}; //creamos un arreglo de paises tipo cadena 
        
        JComboBox listadesplegable = new JComboBox(paises);//creamos objeto tipo combobox y le pasamos como argumento el arreglo de paises
        listadesplegable.setBounds(50, 50, 100, 40);//posicionamos y le damos tamaño 
        listadesplegable.addItem("paraguay");//agregamos otro item despues de haber inicializado
        listadesplegable.setSelectedItem("brazil");//se mostrara el item seleccionado en la lista no dezplegada
        panel.add(listadesplegable);//agregamos al panel*/
                
          //creamos objetos de tipo persona de la clase perzonalizada persona
        Persona persona1 = new Persona("jeison tamara",27,"colombiano");
        Persona persona2 = new Persona("pedro lopez",25,"colombiano");
        Persona persona3 = new Persona("luis mercado",58,"colombiano");
        Persona persona4 = new Persona("arelis sangregorio",50,"colombiano");
        
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();//creamos un modelo con el constructor defaultcomboboxmodel
        JComboBox listadesplegable = new JComboBox(modelo);//creamos la lista desplegable y le pasamos el modelo creado como parametro
        modelo.addElement(persona1);//agregamos los objetos a la lista
        modelo.addElement(persona2);
        modelo.addElement(persona3);
        modelo.addElement(persona4);
        
        listadesplegable.setBounds(50, 50, 200, 40);//posicionamos y le damos tamaño a lalista
        panel.add(listadesplegable);//agregamos al panel
    }
    private void colocarCampoContraseña(){
        JPasswordField campocontraseña = new JPasswordField("hola mundo");//creamos objeto de tipo paswordfile
        campocontraseña.setBounds(20, 20, 100, 40);//posicionamos y le damos tamaño
        //para obtener los datos dentro del campocontraseña
        String contraseña="";//creamos un String vacio para almacenar la contraseña
        for(int i=0;i<campocontraseña.getPassword().length;i++){//recorremos los caracteres de la contraseña
            contraseña += campocontraseña.getPassword()[i];//guardamos cada caracter en la contraseña
        }
        System.out.println("La contraseña es: " + contraseña);//mostramos la contraseña
        panel.add(campocontraseña);
    }
    private void colocarTabla(){
        DefaultTableModel modelo = new DefaultTableModel();//creaos un modelo de tabla por defecto
        //agregamos columnas al modelo
        modelo.addColumn("Nombre");
        modelo.addColumn("Edad");
        modelo.addColumn("Nacionalidad");
        //creamos filas 
        String [] persona1 = {"jeison","27","colombiano"};
        String [] persona2 = {"arelis","50","colombiano"};
        String [] persona3 = {"pedro","25","colombiano"};
        String [] persona4 = {"luis","30","colombiano"};
        String [] persona5 = {"liam","2","colombiano"};
        modelo.addRow(persona1);
        modelo.addRow(persona2);
        modelo.addRow(persona3);
        modelo.addRow(persona4);
        modelo.addRow(persona5);
        //cramos un objeto de la clase Jtable con argumento del modelo
        JTable tabla = new JTable(modelo);
        tabla.setBounds(20, 20, 300, 200);//posicionamos y le damos tamaño a la tabla
        panel.add(tabla);
        //agregamos un Scroll o barra deslazamiento esto ayuda a mostrar la tabla
        JScrollPane scroll = new JScrollPane(tabla,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(20, 20, 300, 200);
        panel.add(scroll);
    }
    private void colocarLista(){
        DefaultListModel modelo = new DefaultListModel();
        modelo.addElement(new Persona("jeison tamara",27,"colombiano"));
        modelo.addElement(new Persona("pedro lopez",25,"colombiano"));
        modelo.addElement(new Persona("luis mercado",58,"colombiano"));
        modelo.addElement(new Persona("arelis sangregorio",50,"colombiano"));
        modelo.addElement(new Persona("jeison tamara",27,"colombiano"));
        modelo.addElement(new Persona("pedro lopez",25,"colombiano"));
        modelo.addElement(new Persona("luis mercado",58,"colombiano"));
        modelo.addElement(new Persona("arelis sangregorio",50,"colombiano"));
        modelo.addElement(new Persona("jeison tamara",27,"colombiano"));
        modelo.addElement(new Persona("pedro lopez",25,"colombiano"));
        modelo.addElement(new Persona("luis mercado",58,"colombiano"));
        modelo.addElement(new Persona("arelis sangregorio",50,"colombiano"));
        modelo.addElement(new Persona("jeison tamara",27,"colombiano"));
        modelo.addElement(new Persona("pedro lopez",25,"colombiano"));
        modelo.addElement(new Persona("luis mercado",58,"colombiano"));
        modelo.addElement(new Persona("arelis sangregorio",50,"colombiano"));
        modelo.addElement(new Persona("jeison tamara",27,"colombiano"));
        modelo.addElement(new Persona("pedro lopez",25,"colombiano"));
        modelo.addElement(new Persona("luis mercado",58,"colombiano"));
        modelo.addElement(new Persona("arelis sangregorio",50,"colombiano"));
        JList lista = new JList(modelo);
        lista.setBounds(20, 20, 200, 300);
        panel.add(lista);
        JScrollPane scroll = new JScrollPane(lista,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(20, 20, 200, 300);
        panel.add(scroll);
    
    }
}
