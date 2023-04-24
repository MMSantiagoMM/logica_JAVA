/*
Hacer un programa que lea un numero desconocido de registros 
(identificación, nombre, salario y dependencia), debe calcular e 
imprimir la nómina de la empresa y la cantidad de empleados de 
sistemas que ganan mas de 3000000 de pesos
 */
package ciclo_mientras_1;

import java.util.Scanner;


public class Ciclo_mientras_1 {

  
    public static void main(String[] args) {
        Scanner objread=new Scanner(System.in);
        String id,nombre,depen;
        int salario,nomina=0,con_s=0;
        System.out.print("Ingrese la identificacion ");
        id=objread.next();
        while (!id.equals("000")) {            
            System.out.print("Ingrese el nombre ");
            nombre=objread.next();
            System.out.print("Dependencia ");
            depen=objread.next();
            System.out.print("Ingrese el salario ");
            salario=objread.nextInt();
            nomina += salario;
            //cantidad de empleados de sistemas que ganan mas de 3000000 de pesos
            if ("sistemas".equals(depen) && salario > 3000000) {
                con_s++;
            }
            System.out.print("Cual es la identificacion");
            id=objread.next();
            
        }
        System.out.print("la nomina de la empresa es " + nomina );
        System.out.print("\n La cantidad de personas de sistemas que superan el salario de 3000000 es " + con_s);
    }
    
}
