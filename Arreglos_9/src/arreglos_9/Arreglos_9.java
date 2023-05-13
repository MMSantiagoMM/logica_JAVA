/*
INVERTIR LAS POSICIONES DE UN VECTOR
 */
package arreglos_9;

import java.util.Scanner;


public class Arreglos_9 {


    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n;
        System.out.print("Ingrese el tamano del vector ");
        n=read.nextInt();
        int[]vector = new int [n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un numero ");
            vector[i]=read.nextInt();
        }
        int temp;
        for (int i = 0; i < n/2; i++) {
            temp=vector[i];
            vector[i]=vector[vector.length-1-i];
            vector[vector.length-1-i]=temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(vector[i]);
        }
    }
    
}
