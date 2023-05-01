/*
Crear un algoritmo que lea un vector de tamaño N de números enteros, 
luego imprima los elementos que se encuentren después 
de la posición que ocupa el mayor dato
 */
package arreglos_5;

import java.util.Scanner;


public class Arreglos_5 {

   
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int tam,may=0,posi=0,nu_may=0;
        System.out.print("Ingrese el tamano del vector ");
        tam=read.nextInt();
        int[]vector = new int [tam];
        for (int i = 0; i < tam; i++) {
            System.out.print("Ingrese en la posicion " + i + " un numero: ");
            vector[i]=read.nextInt();
        }
        for (int i = 0; i < tam; i++) {
            if (vector[i] >= may) {
                may=vector[i];
                posi=i;
                }
            if (i > posi) {
                System.out.print("Los numeros son " + vector[i]);
            }
            
            }
        }
    }
    

