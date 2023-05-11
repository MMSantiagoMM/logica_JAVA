/*
Hacer un programa que lea un vector de tamaño N de números 
enteros y luego invierta su contenido sin utilizar otro vector
 */
package arreglos_8;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Arreglos_8 {

    /**
     Inicie
	Lea n
	Para i=0,n-1,1
		Lea números[i]
	Fin-para
	T=n-1
	Para k=1,n/2,1
		Temp=números[i]
		Números[i]=números[t]
		Números[t]=temp
		T=t-1
	Fin-para
	Para i=0,n-1,1
		imprima números[i]
	Fin-para
Termine
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n;
        System.out.print("Ingrese el tamano del vector ");
        n=read.nextInt();
        int[] vector = new int [n];
        for (int i = 0;i < n; i++) {
            System.out.print("Ingrese un numero ");
            vector[i]=read.nextInt();
        }
        int temp=0;
        for (int i = 0; i < n/2; i++) {
            temp=vector[i];
            vector[i]=vector[vector.length-1 -i];
            vector[vector.length -1 -i]=temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(vector[i]);
        }
    }
    
}
