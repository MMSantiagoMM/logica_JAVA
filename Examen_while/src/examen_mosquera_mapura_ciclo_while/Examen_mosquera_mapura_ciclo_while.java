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
package examen_mosquera_mapura_ciclo_while;

import java.util.Scanner;


public class Examen_mosquera_mapura_ciclo_while {

    
    public static void main(String[] args) {
        Scanner objread = new Scanner(System.in);
        String nro_apar;
        float tam_met,total_bruto=0,total_net=0;
        int val_met;
        System.out.print("Ingrese el numero del apartamento ");
        nro_apar=objread.next();
        while (!nro_apar.equals("0")) {
            System.out.print ("Ingrese el tamaño en metros del apartamento ");
            tam_met=objread.nextFloat();
            System.out.print("Ingrese el valor por metro ");
            val_met=objread.nextInt();
            total_bruto = tam_met * val_met;
            /*-Total bruto a pagar por concepto de administración 
            -Descuento (es del 20% sobre el total bruto si el tamaño del apartamento es de 
            40 metros o menos, del 15% si el tamaño del apartamento es mayor a 40 metros, 
            pero igual o menor a 60 metros y del 10% si el tamaño del apartamento es mayor de 60 metros)
            -El neto a pagar por administración de cada apartamento*/
            if (tam_met <= 40) {
                total_net = total_bruto - (total_bruto * (float)0.20);
                System.out.print("El total bruto a pagar por la administracion del apartamento es " + total_bruto + "\n");
                System.out.print("El total neto a pagar por la administracion del apartamento es " + total_net);
            } else {
                if (tam_met <= 60) {
                    total_net = total_bruto - (total_bruto * (float)0.15);
                    System.out.print("El total bruto a pagar por la administracion del apartamento es " + total_bruto + "\n");
                    System.out.print("El total neto a pagar por la administracion del apartamento es " + total_net);
                } else {
                     total_net = total_bruto - (total_bruto * (float)0.10);
                    System.out.print("El total bruto a pagar por la administracion del apartamento es " + total_bruto + "\n");
                    System.out.print("El total neto a pagar por la administracion del apartamento es " + total_net);
                }
            
            }
            System.out.println(" \n Ingrese el numero del apartamento ");
            nro_apar=objread.next();
            
        }
       
    }
    
}
