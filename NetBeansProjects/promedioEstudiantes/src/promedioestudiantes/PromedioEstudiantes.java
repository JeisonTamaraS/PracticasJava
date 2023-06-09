
package promedioestudiantes;

import java.util.Scanner;

/**
 *
 * @author jeison tamara
 */
public class PromedioEstudiantes {

   
    public static void main(String[] args) {
       int n,est=1,est2=1;
       float prom=0,calif,sum1=0,sum2=0,sum3=0;
       Scanner sc=new Scanner(System.in);
       System.out.print("ingrese el numero de estudiantes: ");
       n=sc.nextInt();
       System.out.println("el numero de estudiantes es: "+n);
       
       for(int i=0; i<n; i++){
           System.out.print("nota matematica estudiante #"+(i+1)+": ");
           calif=sc.nextFloat();
           sum1=sum1+calif;         
       }
       prom=sum1/n;
       System.out.println("promedio de matematica es: "+prom);
       
       while(est<=n){
           System.out.print("nota español estudiante #"+est+": ");
           calif=sc.nextFloat();
           est++;
           sum2=sum2+calif; 
       }
       System.out.println("promedio de español es: "+(sum2/n));
       
       do{
           System.out.print("nota ingles estudiante #"+est2+": ");
           calif=sc.nextFloat();
           est2++;
           sum3=sum3+calif;
       }
       while(est2<=n);
       System.out.println("promedio de ingles es: "+(sum3/n));
    }
       
}
