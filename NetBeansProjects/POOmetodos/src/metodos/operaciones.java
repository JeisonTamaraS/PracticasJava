/*
 * Metodos: los metodos son acciones que pueden realizar los objetos de las clases
            se declaran de la siguiente forma:
            modificador_de_acceso valor_de_retorno nombre_metodo(argumentos){
            }
 */
package metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author jeison tamara
 */
public class operaciones {
    //declaramos atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multi;
    int div;
    
    //creamos metodos
    public void pedirNumeros(){//metodo para ingresar dos numeros
        numero1=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 1: "));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 2: "));
    }
    public void suma(){//mtodo para sumar dos numeros
        suma=numero1+numero2;
    }
    public void resta(){//metodo para restar dos numeros
        resta= numero1-numero2;
    }
    public void multiplicacion(){//metodo para sumar dos numeros
        multi=numero1*numero2;
    }
    public void div(){//metodo para sumar dos numeros
        div=numero1/numero2;
    }
    public void resultados(){
        System.out.println("la suma es: "+suma);
        System.out.println("la resta es: "+resta);
        System.out.println("la multiplicacion es: "+multi);
        System.out.println("la division es: "+div);
    }
}
