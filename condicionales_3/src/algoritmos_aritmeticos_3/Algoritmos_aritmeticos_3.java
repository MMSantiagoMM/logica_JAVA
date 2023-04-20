/*Elaborar un algoritmo que lea las tres notas de un estudiante e imprima 
si gano o no la materia*/
package algoritmos_aritmeticos_3;

import java.util.Scanner;


public class Algoritmos_aritmeticos_3 {

    
    public static void main(String[] args) {
        Scanner objread=new Scanner(System.in);
        float n1,n2,n3,prom;
        System.out.print("Ingrese la primera nota del estudiante ");
        n1=objread.nextFloat();
        System.out.print("Ingrese la segunda nota del estudiante ");
        n2=objread.nextFloat();
        System.out.print("Ingrese la tercer nota del estudiante ");
        n3=objread.nextFloat();
        prom=(float)(n1+n2+n3)/3;
        if (prom >= 3) {
            System.out.print("El estudiante gana la materia con la nota " + prom);  
        } 
    }
    
}
