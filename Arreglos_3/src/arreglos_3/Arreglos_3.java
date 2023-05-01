/*
Crear un algoritmo que lea un vector de tamaño N de números enteros y 
un dato y devuelva la cantidad de veces que está dicho dato en el vector
 */
package arreglos_3;

import java.util.Scanner;


public class Arreglos_3 {

  
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int tam,cont=0,dato,posi=0;
        System.out.print("Ingrese el dato que desea hallar en el vector ");
        dato=read.nextInt();
        System.out.print("Ingrese el tamano del vector ");
        tam=read.nextInt();
        int[]vector = new int [tam];
        for (int i = 0; i <tam; i++) {
            System.out.print("Ingrese en la posicion " + i + " el numero: ");
            vector[i]=read.nextInt();
        }
        for (int i = 0; i < tam; i++) {
            if (vector[i] == dato) {
                cont++;
                posi=i;
            }
        }
        System.out.print("El dato ingresa está " + cont + " veces");
        System.out.print("Las posiciones son " + posi);
    }
    
}

