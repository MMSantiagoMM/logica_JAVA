/*Para la materia de Destrezas se determinó con los estudiantes que,
si la nota del primer quiz era menor que la del segundo, se sustituía la primera
nota por la segunda. Elabore un algoritmo que le permita al profesor ingresar 
las 4 notas que obtuvo un alumno y el computador le muestre la nota definitiva 
y la calificación cualitativa que es: “E” si es mayor o igual 
a 4.5, “S” si es mayor o igual a 4.0  y menor de 4.5, “B” si es mayor 
o igual a 3.5  y menor de 4.0, “A” si es mayor o igual a 3.0  y menor de 3.5, 
“D” si es mayor o igual a 2.0  y menor de 3.0 e “I” si es menor de 2.0 

 */
package condicionales_15;

import java.util.Scanner;


public class Condicionales_15 {

    
    public static void main(String[] args) {
        Scanner objread=new Scanner(System.in);
        float n1,n2,n3,n4,not_def;
        String name;
        System.out.print("Cual es el nombre del estudiante ");
        name=objread.next();
        System.out.print("Cual es la primera nota ");
        n1=objread.nextFloat();
        System.out.print("Cual es la segunda nota ");
        n2=objread.nextFloat();
        System.out.print("Cual es la tercera nota ");
        n3=objread.nextFloat();
        System.out.print("Cual es la cuarta nota ");
        n4=objread.nextFloat();
        not_def = (float)(n1+n2+n3+n4)/4;
        if (n1 < n2) {
            n1 = n2;
        }
        if (not_def >=(float) 4.5) {
            System.out.print("Excelente\n");
        } else {
            if (not_def >= 4) {
                System.out.print("Sobresaliente\n");
            } else {
                if (not_def >= 3.5) {
                    System.out.print("B\n");
                } else {
                    if (not_def >= 3) {
                        System.out.print("A\n");
                    } else {
                        if (not_def >= 2) {
                            System.out.print("D\n");
                        } else {
                            System.out.print("I\n");
                        }
                    }
                }
            }
        }
    }
    
}
