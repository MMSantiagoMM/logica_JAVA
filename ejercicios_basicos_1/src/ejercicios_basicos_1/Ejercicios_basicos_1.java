/*

 */
package ejercicios_basicos_1;

import java.util.Scanner;


public class Ejercicios_basicos_1 {

  
    public static void main(String[] args) {
        Scanner objread = new Scanner(System.in);
        
        /*n1=0;
        while (n1 < 25) {            
            n1+=5;
            System.out.println(n1);
        }*/
        
       /*    public static void main(String[] args) {
        // Definicion de objetos y variables
        Scanner objread=new Scanner(System.in);
        int number,sw=0,i=2;
        //Lectura de numero
        System.out.print("Escriba el numero positivo ");
        number=objread.nextInt();
        //Operacion con divisiones sucesivas de modulo
        while (i <= number/2 && sw == 0)
            if (number % i == 0)
                sw=1;
            else
                i++; //i=i + 2 num=num * 10   num*=10
        if (sw == 1)
            System.out.println("\n El numero " + number + " no es primo");
        else
            System.out.println("\n El numero " + number + " es primo");       
    }   
}
*/
       int n1,sw=0,i=2,number;
        System.out.print("Escriba un numero positivo ");
        number=objread.nextInt();
        while (i <= number/2 && sw == 0)             
            if (number % i == 0) {
                sw=1;
            } else {
                i++;
            }
        if (sw ==1) {
            System.out.print("\n el numero " + number + " no es primo");
        } else {
            System.out.print("\n el numero " + number + " es primo");
        }
        }
    }
    
    

