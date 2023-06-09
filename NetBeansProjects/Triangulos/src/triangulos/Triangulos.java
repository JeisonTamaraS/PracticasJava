
package triangulos;

import java.util.Scanner;

/**
 *
 * @author jeison tamara
 */
public class Triangulos {

   
    public static void main(String[] args) {
       double l_a,l_b,l_c;
       double A,B,C;
       double a,b,c;
       Scanner sc=new Scanner(System.in);
       System.out.println("ingrese lado a: ");
       l_a=sc.nextFloat();
       System.out.println("ingrese lado b: ");
       l_b=sc.nextFloat();
       System.out.println("ingrese lado c: ");
       l_c=sc.nextFloat();
       int tipo;
       if((l_a == l_b)&&(l_b == l_c)){
           System.out.println("el triangulo es equilatero");
           tipo=1;
       }
       else if((l_a == l_b)&&(l_b != l_c)||(l_b == l_c)&&(l_c !=l_a)||(l_a==l_c)&&(l_c!=l_b)){
           System.out.println("el triangulo es isoceles");
           tipo=2;
       }
       else{ 
           System.out.println("el triangulo es escaleno");
           tipo=3;
       }
       
       switch(tipo){
           case 1: 
               System.out.println("el valos de los angulos es de 60º");
               break;
           case 2:
               a=(((l_b*l_b)+(l_c*l_c)-(l_a*l_a))/(2*l_b*l_c)); 
               A=Math.acos(a);
               b=(((l_a*l_a)+(l_c*l_c)-(l_b*l_b))/(2*l_a*l_c)); 
               B=Math.acos(b);
               c=(((l_a*l_a)+(l_b*l_b)-(l_c*l_c))/(2*l_a*l_b)); 
               C=Math.acos(c);
               System.out.println("angulo A ="+A+", angulo B= "+B+", angulo C= "+C);
               break;
           case 3:
               a=(((l_b*l_b)+(l_c*l_c)-(l_a*l_a))/(2*l_b*l_c)); 
               A=Math.acos(a);
               b=(((l_a*l_a)+(l_c*l_c)-(l_b*l_b))/(2*l_a*l_c)); 
               B=Math.acos(b);
               c=(((l_a*l_a)+(l_b*l_b)-(l_c*l_c))/(2*l_a*l_b)); 
               C=Math.acos(c);
               System.out.println("angulo A ="+A+", angulo B= "+B+", angulo C= "+C);
               break;
       }
    }
    
}
