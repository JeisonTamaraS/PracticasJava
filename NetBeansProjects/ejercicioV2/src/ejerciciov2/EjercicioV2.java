/*
 * ejercicio2: leer 5 numeros por teclado, almacenarlos en un arreglo y realizar 
               la media de los numeros positivos la media de los numeros negativos
               y la cntidad de ceros.
 */
package ejerciciov2;

import java.util.Scanner;

/**
 *
 * @author jeison tamara
 */
public class EjercicioV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];
        float sumapos=0,sumaneg=0;
        int contceros=0,cuentapos=0,cuentaneg=0;
        for(int i=0;i<5;i++){//recorremos el array para almacenar los datos
            System.out.print("Digite el n°"+(i+1)+": ");
            numeros[i]=entrada.nextFloat();//almacenamos los datos ingresados en pantalla
            if(numeros[i]>0){//condicion para numeros positivos
                sumapos+=numeros[i];
                cuentapos++;
            }else if(numeros[i]<0){//condicion para numeros negativos
                sumaneg+=numeros[i];
                cuentaneg++;
            }else{
                contceros++;//conteo de ceros
            }
        }
        if(cuentapos==0){
            System.out.println("la media de los numeros positivos no se puede calcular");
        }else{
            System.out.println("la media de los numeros positivos es de: "+(sumapos/cuentapos));
        }
        if(cuentaneg==0){
            System.out.println("la media de los numeros negativos no se puede calcular");
        }else{
            System.out.println("la media de los numeros negativos es de: "+(sumaneg/cuentaneg));
        }
        System.out.println("la cantidad de ceros es: "+contceros);
       
        
    }
    
}
