/*
 hacer un programa que lea un vector de tamaño N de numeros enteros y luego 
ivierta su contenido sin utilizar otro vector
 */
package Array_inver;

import java.util.Scanner;

public class Array_inver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner objread = new Scanner(System.in);
        int n=0; 
        
        int[] numeros=new int[n];
        System.out.print("Digite tamaño de vector: ");
        n=objread.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Digite un valor para la posicion " + i);
            numeros[i]=objread.nextInt();
            
        }
         int t=0,temp;
         for (int i = 0; i < n/2; i++) {
            temp=numeros[i];
            numeros[i]=numeros[t];
            numeros[t]=temp;
            t--;
        }
         for (int i = 0; i < n; i++) {
             System.out.println(numeros[i]);
        }
        }

    }
    

