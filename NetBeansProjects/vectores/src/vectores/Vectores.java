/*
 *arreglos(arrays) o vectores: permiten almacenar conjunto de datos de un mismo tipo.
    se declara y se inicializa:
        tipo-de-dato[] nombre = new tipo-de-dato[dimension o tamaño];
        int[] numeros = new int[5];
        long[] edad = new long[10];
 */
package vectores;

/**
 *
 * @author jeison tamara
 */
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numero = new int[3];//declaramos e inicializamos el array
        // asignamos los valores del array
        numero[0]=5;//asignamos el valor de 5 en la posicion cero del array
        numero[1]=3;
        numero[2]=8;
        /*podemos asignar los valores uno a uno, pero en arrays de gran tamaño no
        seria practico. en cambio podemos inicializarlo directamente con los valores
        int[] numero = {5,3,8};
        */
        for(int i=0;i<3;i++){//se recorren las posiciones del array
            System.out.println(numero[i]);//se imprime el valor de cada posicion del array.        
        }
        
    }
    
}
