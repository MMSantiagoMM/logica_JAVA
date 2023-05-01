
package numero_primo;

import java.util.Scanner;


public class Numero_primo {

    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int i=2,sw=0,num;
        System.out.print("Ingrese un numero para saber si es primo o no ");
        num=read.nextInt();
        while (i<num && sw==0) {            
            if (num % i == 0) {
                sw=1;
            } else {
                i++;
            }
           
        }
        if (sw==0) {
                System.out.print("El numero es primo ");
            } 
            else {
                System.out.print("El numero NO es primo");
            }
    }
    
}
