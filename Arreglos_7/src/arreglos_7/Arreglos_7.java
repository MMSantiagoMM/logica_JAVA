/*

 */
package arreglos_7;

import java.util.Scanner;


public class Arreglos_7 {


    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num,pos=-1,sw,j;
        String regi;
        int [] vector = new int [5];
        System.out.print("Desea ingresar un numero (si/no)");
        regi=read.next();
        while (!regi.equals("no")) {            
            System.out.print("Ingrese un numero ");
            num=read.nextInt();
            sw=0;
            j=2;
            while (j <= num/2 && sw==0) {                
                if (num % j == 0)
                    sw=1;
                else
                    j++;
            }
            if (sw==0) {
                pos++;
                vector[pos]=num;
                
            }
            System.out.print("Desea ingresar un numero (si/no)");
            regi=read.next();
            
            }
        for (int i = 0; i < pos; i++) {
                System.out.println(vector[i]);
        }
        
    }
    
}
