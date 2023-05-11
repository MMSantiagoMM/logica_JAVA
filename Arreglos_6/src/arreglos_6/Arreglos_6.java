/*
En una emisora se entrega una boleta a cada oyente que llame,
pero no se le entrega dos veces, crear un programa que permita ingresar
la cédula del oyente y el programa diga inmediatamente si se le otorga 
la boleta o no
 */
package arreglos_6;

import java.util.Scanner;

public class Arreglos_6 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int pos = -1, num, sw, j;
        String resp;
        System.out.print("Desea ingresar un participante ");
        resp = read.next();
        int[] vector = new int[100];
        while (!"no".equals(resp)) {
            System.out.print("Ingrese un numero de cedula ");
            num=read.nextInt();
            j = 0;
            sw = 0;

             while (j <= pos && sw == 0) {
                if (vector[j] == num) {
                    sw = 1;
                } else {
                    j++;     
                }

            }
            if (sw == 0) {
                pos++;
                vector[pos] = num;

            } else {
                System.out.print("No se le entrega \n");
            }
            System.out.print("De ingresar un particioante ");
            resp = read.next();
        }
    }

}
