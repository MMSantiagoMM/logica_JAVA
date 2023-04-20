/*Hacer un algoritmo que lea las estaturas de dos personas y luego me 
imprima el promedio de estaturas solo si este es más mayor de 1.70*/
package condicionales_3;

import java.util.Scanner;

public class Condicionales_3 {

    //
    public static void main(String[] args) {
        Scanner objread=new Scanner(System.in);
        float est1,est2,promedio;
        System.out.print("Ingrese la primera estatura: ");
        est1=objread.nextFloat();
        System.out.println("Ingrese la segunda estatura: ");
        est2=objread.nextFloat();
        promedio=(est1+est2)/2;
        System.out.println("El promedio de estaturas es: " + promedio);
        
    }
    
}
