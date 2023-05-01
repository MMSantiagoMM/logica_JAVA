/*
Hacer un programa que lea un vector de números enteros y luego 
imprima la cantidad de números mayores de 10 que hay en el vector
 */
package arreglos_2;

import java.util.Scanner;


public class Arreglos_2 {

  
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int tam,cont=0;
        System.out.print("Defina el tamano del vector ");
        tam=read.nextInt();
        int[]vector = new int [tam];
        for (int i = 0; i < tam; i++) {
            System.out.print("Ingrese en la posicion " + i + " un numero: ");
            vector[i]=read.nextInt();
        }
        for (int i = 0; i < tam; i++) {
            if (vector[i] > 10) {
                cont++;
            }
        }
        System.out.println("Los numeros mayores a diez dentro del vector son " + cont);
    }
    
}

