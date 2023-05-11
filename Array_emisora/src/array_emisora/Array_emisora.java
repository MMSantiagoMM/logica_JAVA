/*

 */
package array_emisora;

import java.util.Scanner;


public class Array_emisora {

 
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int num,pos=0;
        String regi;
        System.out.print("Desea ingresar un registro ");
        regi=read.next();
        int [] vector = new int [5];
        while (!regi.equals("no")) {            
            System.out.print("Ingrese un numero de documento ");
            num=read.nextInt();
            int j=0;
            int sw=0;
            while (j <= pos && sw==0) {                
                if (num==vector[j])
                    sw=1;
                else
                    j++;
            }
            if (sw==0) {
                pos++;
                vector[pos]=num;
            } else {
                System.out.print("No se le entrega ");
            }
        }
    }
    
}
