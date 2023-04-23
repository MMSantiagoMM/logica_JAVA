/*

Elaborar un diagrama que imprima los primeros 15 términos de 
la siguiente serie de números:
4 - 8 - 12 - 16 - 20 - 24 .........
}

 */
package ciclo_para_1;

import java.util.Scanner;


public class Ciclo_para_1 {
/*Inicie
     Serie=4
     Para j=1,5,1
         Imprima serie
         Serie=serie + 4
    Fin-para
Termine*/

    
    public static void main(String[] args) {
        Scanner objread=new Scanner(System.in);
        int n1,n2,n3;
        n1= 0;
        for (int i = 1; i <= 15; i++) {
            n1 = n1 + 4;
             System.out.println("La serie es " + n1);
        }
       
    }
    
}
