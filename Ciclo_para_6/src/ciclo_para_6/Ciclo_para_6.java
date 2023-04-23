/*
Elabore un diagrama que lea el nombre, la edad y la estatura 
de un grupo de 20 personas, e imprima el nombre solo de las personas 
que sean mayores de edad y que su estatura sea mayor de 1.80 mts.
 */
package ciclo_para_6;

import java.util.Scanner;


public class Ciclo_para_6 {


    public static void main(String[] args) {
        Scanner objread=new Scanner(System.in);
        String name;
        int edad;
        float estatura;
        for (int i = 1; i <= 3; i++) {
            System.out.print("El nombre es ");
            name=objread.next();
            System.out.print("La edad es ");
            edad=objread.nextInt();
            System.out.print("La estatura es ");
            estatura=objread.nextFloat();
            if (edad >= 18 && estatura > 1.80) {
                System.out.print(name + "\n");
            }
        }
        
        }
    }
    

