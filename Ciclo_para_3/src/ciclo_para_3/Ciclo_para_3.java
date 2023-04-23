/*
 3.	Elabore un diagrama que lea para un grupo de 15 personas el nombre 
y la edad, e imprima por cada una el nombre y un mensaje que imprima si 
es mayor o menor de edad.
 */
package ciclo_para_3;

import java.util.Scanner;


public class Ciclo_para_3 {

   
    public static void main(String[] args) {
        Scanner objread=new Scanner(System.in);
        String name;
        int edad;
        for (int i = 1; i <= 15; i++) {
            System.out.print("Introduzca el nombre ");
            name=objread.next();
            System.out.print("Introduzca la edad ");
            edad=objread.nextInt();
                if (edad >= 18) {
                    System.out.print("Es mayor de edad\n");
                } else {
                    System.out.print("Es menor de edad\n");
                }
            }
        }
    }
    
