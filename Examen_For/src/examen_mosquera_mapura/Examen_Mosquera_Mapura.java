/*
 1.Para el pago de la administración se tiene un numero N de registros 
(nro_apartamento, tamaño en metros, valor por metro), hacer un algoritmo 
que realice las siguientes tareas:

-Total bruto a pagar por concepto de administración 
-Descuento (es del 20% sobre el total bruto si el tamaño del apartamento es de 
40 metros o menos, del 15% si el tamaño del apartamento es mayor a 40 metros, 
pero igual o menor a 60 metros y del 10% si el tamaño del apartamento es mayor de 60 metros)
-El neto a pagar por administración de cada apartamento

 */
package examen_mosquera_mapura;

import java.util.Scanner;


public class Examen_Mosquera_Mapura {

  
    public static void main(String[] args) {
        Scanner objread = new Scanner(System.in);
        String num_apar;
        float tam_m,total_bruto=0,total_neto=0;
        int val_met,N;
        System.out.print("Ingrese el numero de registros que desea procesar ");
        N=objread.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.print("Ingrese el numero del apartamento ");
            num_apar=objread.next();
            System.out.print("Ingrese el tamaño en metros ");
            tam_m=objread.nextFloat();
            System.out.print("Ingrese el valor por metro ");
            val_met=objread.nextInt();
            //Total bruto a pagar por concepto de administración
            total_bruto = tam_m * val_met;
            /*Descuento (es del 20% sobre el total bruto si el tamaño del apartamento es de 
            40 metros o menos, del 15% si el tamaño del apartamento es mayor a 40 metros, 
            pero igual o menor a 60 metros y del 10% si el tamaño del apartamento es mayor de 60 metros)*/
            
            if (tam_m <=  40) {
                total_neto = total_bruto - (total_bruto * (float)0.20);
            } else {
                if (tam_m > 40) {
                    total_neto = total_bruto - (total_bruto * (float)0.15);
                } else {
                    total_neto = total_bruto - (total_bruto * (float)0.10);
                }
            }
            System.out.print("El total bruto a pagar es de " + total_bruto + "\n");
            System.out.println("El total neto a pagar es de " + total_neto);
        }
        
    }
    
}
