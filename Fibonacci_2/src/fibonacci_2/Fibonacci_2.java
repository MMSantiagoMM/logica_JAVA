/*

 */
package fibonacci_2;

import java.util.Scanner;


public class Fibonacci_2 {


    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num1=0,num2=1,num3,n;
        System.out.print("Ingrese la cantidad de numeros que desea ingresar en la serie ");
        n=read.nextInt();
        System.out.println(num1+" \n" + num2);
        for (int i = 0; i < n; i++) {
            num3 = num1 + num2;
            System.out.println("" + num3);
            num1=num2;
            num2=num3;
        }
    }
    
}
