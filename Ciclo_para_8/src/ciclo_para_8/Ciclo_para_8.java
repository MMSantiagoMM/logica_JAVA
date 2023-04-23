/*
Es una universidad, cada que se matricula un estudiante se elabora un
registro con el numero del carnet, la cantidad de materias matriculadas
y el estrato social al que pertenece. Elabora un diagrama que imprima
por cada estudiante el carnet y el valor de la matricula, teniendo
en cuenta que si el numero de materias es superior a 5 y el estrato
social es igual a 1 se hace un descuento del 20%.
Cada materia tiene un valor de 100.000
 */
package ciclo_para_8;

import java.util.Scanner;


public class Ciclo_para_8 {

    
    public static void main(String[] args) {
        Scanner objread=new Scanner(System.in);
        String carnet;
        int mat,estr,r;
        float vm;
        System.out.print("Cuantos registros desea ingresar ");
        r=objread.nextInt();
        for (int i = 0; i < r; i++) {
            System.out.print("Ingrese numero del carnet ");
            carnet=objread.next();
            System.out.print("Ingrese la cantidad de materias matriculadas ");
            mat=objread.nextInt();
            System.out.print("Ingrese el estrato social del estudiante ");
            estr=objread.nextInt();
            vm = mat * 100000;
            if (estr == 1) {
                vm = vm - vm*(float)0.20;
            }
            System.out.print(carnet +" \n" + vm);
        }
    }
    
}
