/*
 * ejercicio10:hacer un programa que muestre el producto de los primeros 10 numeros impares.
 */
package ejerciciob10;

/**
 *
 * @author jeison tamara
 */
public class EjercicioB10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int producto=1;
        for(int i=1;i<=20;i+=2){
            producto*=i;
        }
        System.out.println("el producto es: "+producto);
    }
    
}
