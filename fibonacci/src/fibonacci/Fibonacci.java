/*

 */
package fibonacci;

import java.util.Scanner;


public class Fibonacci {

   
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int N,num1=0,num2=1,num3;
        System.out.print("Cuantos numeros desea procesar en la serie ");
        N=read.nextInt();
        System.out.print("La serie empieza \n "+num1+" "+num2);
        for (int i = 3; i <= N; i++) {
            num3=num1+num2;
            System.out.print(" "+num3);
            num1=num2;
            num2=num3;
            
        }
        
    }
    
}
