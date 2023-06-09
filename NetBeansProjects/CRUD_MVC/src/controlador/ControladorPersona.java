

package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import javax.swing.JOptionPane;
import modelo.ConsultasPersona;
import modelo.Persona;
import vista.VistaPersona;


public class ControladorPersona implements ActionListener {
    private VistaPersona vista;
    private Persona persona;
    private ConsultasPersona modelo;

    public ControladorPersona(VistaPersona vista, Persona persona, ConsultasPersona modelo) {
        this.vista = vista;
        this.persona = persona;
        this.modelo = modelo;
        vista.botonInsertar.addActionListener(this);
        vista.botonLimpiar.addActionListener(this);
        vista.botonBuscar.addActionListener(this);
        vista.botonModificar.addActionListener(this);
        vista.botonEliminar.addActionListener(this);
    }
    
    public void iniciar(){
        vista.setTitle("CRUD_MVC");
        vista.setLocationRelativeTo(null);
        vista.boxIdpersona.setVisible(false);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista.botonInsertar){
            persona.setClave(vista.boxClave.getText());
            persona.setNombre(vista.boxNombre.getText());
            persona.setDomicilio(vista.boxDomicilio.getText());
            persona.setCelular(vista.boxCelular.getText());
            persona.setCorreo_electronico(vista.boxCorreo.getText());
            persona.setFecha_nacimiento(Date.valueOf(vista.boxFecha.getText()));
            persona.setGenero(vista.comboGenero.getSelectedItem().toString());
            
            if(modelo.insertar(persona)){
                JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
                limpiarCajas();
            }else{
                JOptionPane.showMessageDialog(null, "Error al insertar el registro");
                limpiarCajas();
            }
        }
        if(e.getSource()==vista.botonLimpiar){
            limpiarCajas();
        }
        if(e.getSource()==vista.botonBuscar){
            persona.setClave(vista.boxBuscar.getText());
            
            if(modelo.buscar(persona)){
                vista.boxIdpersona.setText(String.valueOf(persona.getIdpersona()));
                vista.boxClave.setText(persona.getClave());
                vista.boxNombre.setText(persona.getNombre());
                vista.boxDomicilio.setText(persona.getDomicilio());
                vista.boxCelular.setText(persona.getCelular());
                vista.boxCorreo.setText(persona.getCorreo_electronico());
                vista.boxFecha.setText(String.valueOf(persona.getFecha_nacimiento()));
                vista.comboGenero.setSelectedItem(persona.getGenero());              
            }
            else{
                JOptionPane.showMessageDialog(null, "No existe persona con esa clave ");
                limpiarCajas();
            }
        }
        if(e.getSource()==vista.botonModificar){
            persona.setIdpersona(Integer.parseInt(vista.boxIdpersona.getText()));
            persona.setClave(vista.boxClave.getText());
            persona.setNombre(vista.boxNombre.getText());
            persona.setDomicilio(vista.boxDomicilio.getText());
            persona.setCelular(vista.boxCelular.getText());
            persona.setCorreo_electronico(vista.boxCorreo.getText());
            persona.setFecha_nacimiento(Date.valueOf(vista.boxFecha.getText()));
            persona.setGenero(vista.comboGenero.getSelectedItem().toString());
            
            if(modelo.modificar(persona)){
                JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
                limpiarCajas();
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo modificar el registro");
                limpiarCajas();
            }
        }
        if(e.getSource()==vista.botonEliminar){
            persona.setIdpersona(Integer.parseInt(vista.boxIdpersona.getText()));
            
            if(modelo.eliminar(persona)){
                JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
                limpiarCajas();
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro");
                limpiarCajas();
            }
        }
    }
    
    public void limpiarCajas(){
        vista.boxIdpersona.setText(null);
        vista.boxBuscar.setText(null);
        vista.boxClave.setText(null);
        vista.boxNombre.setText(null);
        vista.boxDomicilio.setText(null);
        vista.boxCelular.setText(null);
        vista.boxCorreo.setText(null);
        vista.boxFecha.setText(null);
        vista.comboGenero.setSelectedIndex(0);
    }
    
}
