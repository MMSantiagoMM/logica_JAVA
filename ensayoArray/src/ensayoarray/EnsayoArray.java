/*

 */
package ensayoarray;

import java.util.Scanner;


public class EnsayoArray {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int tam;
        System.out.print("Ingrese el tamano del vector ");
        tam=read.nextInt();
        int[]vector = new int [tam];
        for (int i = 0; i < tam; i++) {
            System.out.print("Ingrese en la posicion " + i + " un numero: ");
            vector[i]=read.nextInt();
            int aux=vector[i];
            if (vector[i]!= aux) 
                System.out.print("Se le entrega");
            else 
                System.out.print("No se le entrega");
        }
    }
    
}
