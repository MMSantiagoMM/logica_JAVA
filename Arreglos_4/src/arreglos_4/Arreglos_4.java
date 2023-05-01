/*
Crear un algoritmo que lea un vector de tamaño N de números enteros y 
devuelva el mayor dato del vector y la posición que ocupa
 */
package arreglos_4;

import java.util.Scanner;


public class Arreglos_4 {

    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int tam,nu_ma=0,posi=0;
        System.out.print("Ingrese el tamano del vector ");
        tam=read.nextInt();
        int[]vector = new int [tam];
        for (int i = 0; i < tam; i++) {
            System.out.print("Ingrese en la posicion " + i + " un numero: ");
            vector[i]=read.nextInt();
        }
        for (int i = 0; i < tam; i++) {
            if (vector[i] >= nu_ma) {
                nu_ma=vector[i];
                posi=i;
            }
        }
        System.out.print("El numero mayor dentro del vector es " + nu_ma + "\n y la posicion que ocupa es: " + posi);
    }
    
}
