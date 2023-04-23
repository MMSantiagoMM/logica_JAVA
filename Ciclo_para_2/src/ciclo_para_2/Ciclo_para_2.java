/*
 Se tienen 10 registros, cada registro contiene el nombre, salario básico hora,
el número de horas trabajadas, el total de deducciones y el total de bonificaciones.
Elabore un diagrama que imprima por cada trabajador el nombre, el salario bruto y el salario neto.
 */
package ciclo_para_2;

import java.util.Scanner;


public class Ciclo_para_2 {

    
    public static void main(String[] args) {
        Scanner objread=new Scanner(System.in);
        int salbh,numht,dedu,boni,sal_bru,sal_net;
        String name;
        for (int i = 0; i <= 10; i++) {
            System.out.print("El nombre del trabajador es ");
            name=objread.next();
            System.out.print("El salario básico por hora es ");
            salbh=objread.nextInt();
            System.out.print("Las horas trabajadas son ");
            numht=objread.nextInt();
            System.out.print("Las deduccion son ");
            dedu=objread.nextInt();
            System.out.print("Las bonificaciones son ");
            boni=objread.nextInt();
            sal_bru = salbh * numht;
            sal_net = sal_bru - dedu + boni;
            System.out.println("El nombre del trabajador es " + name + "\nSu salario bruto es " + sal_bru + "\nSu salario neto es " + sal_net);
        }
        
    }
    
}
