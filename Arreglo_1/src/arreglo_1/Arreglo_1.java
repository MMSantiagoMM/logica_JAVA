/*
Hacer un programa que lea un vector de tamaño N, de números enteros, y luego 
me imprima la cantidad de elementos de las posiciones pares que son mayores 
que el promedio de los elementos de las posiciones impares 
(tomar la posición 0 como par)
 */
package arreglo_1;

import java.util.Scanner;


public class Arreglo_1 {

    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int tam,cont_p=0,cont_i=0;
        float acum=0, prom=0;
        System.out.print("De que tamano desea el vector ");
        tam=read.nextInt();
        int[]vector=new int [tam];
        for (int i = 0; i < tam; i++) {
            System.out.print("Ingrese un numero en la posicion " + i + " del vector ");
            vector[i]=read.nextInt();
        }
        for (int i = 0; i < tam; i++) {
            if (i%2!=0) {
                cont_i++;
                acum+=vector[i];
            }
        }
        prom=acum/cont_i;
        
        for (int i = 0; i < tam; i++) {
            if (i%2==0 && vector[i]>prom) {
                cont_p++;
            }
        }
        System.out.println("La cantidad de numeros pares mayores al promedio: " + prom + "\n son " + cont_p);
    }
    
}
