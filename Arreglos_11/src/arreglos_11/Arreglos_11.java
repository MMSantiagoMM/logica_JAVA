/*
Hacer un programa que lea un número desconocido de números enteros 
positivos y luego almacene, en un vector, los números primos que ingreso
 */
package arreglos_11;

import java.util.Scanner;

public class Arreglos_11 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num, j, pos = -1, sw;
        String reg;
        int[] vector = new int[5];
        System.out.print("Desea ingresar un numero ");
        reg = read.next();
        while (!reg.equals("no") && pos < 5) {
            System.out.print("Ingrese un numero ");
            num = read.nextInt();
            sw = 0;
            j = 2;
            while (j <= num / 2 && sw == 0) {
                if (num % j == 0) 
                    sw = 1;
                 else 
                    j++;
                
            }
            if (sw == 0) {
                pos++;
                vector[pos] = num;

            }
            System.out.print("Desea ingresar un numero ");
            reg = read.next();
        }
        for (int i = 0; i < pos; i++) {
            System.out.println(vector[i]);
        }
    }

}
