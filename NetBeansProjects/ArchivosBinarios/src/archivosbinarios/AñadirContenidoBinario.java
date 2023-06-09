/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosbinarios;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author jeison tamara
 */
public class AñadirContenidoBinario extends ObjectOutputStream{//creamos una clase que herede de objectoutputstream

    public AñadirContenidoBinario(OutputStream out) throws IOException {//aplicamos los constructores
        super(out);
    }

    public AñadirContenidoBinario() throws IOException, SecurityException {
    }
    
    @Override
    public void writeStreamHeader() throws IOException{//sobreescribimos el metodo writeStreamheader
        reset();//lo reseteamos
    }
}
