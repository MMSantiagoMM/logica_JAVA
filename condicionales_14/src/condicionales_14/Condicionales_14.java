/*
 laborar un programa que le permita a un usuario ingresar el nombre de un 
trabajador, el salario básico hora y el número de horas trabajadas, se pide 
que el programa le imprima el salario bruto, las bonificaciones, 
las deducciones y el salario neto; teniendo en cuenta que las bonificaciones 
serán de $20000 si trabajó como máximo 48 horas, de $50000 si trabajo 
entre 49 y 58 horas y de $100000 si trabajó más de 58 horas. 
Las deducciones son de $10000 si el salario básico hora es menor o igual de $5000, 
de $20000 si el salario básico hora es mayor de $5000 y menor de $8000 
y de $ 50000 si su salario básico hora es de $8000 o más.
 */
package condicionales_14;

import java.util.Scanner;


public class Condicionales_14 {

 
    public static void main(String[] args) {
        Scanner objread=new Scanner(System.in);
        String name;
        int sbh,hrt,salbru,boni,dedu;
        float salnet;
        System.out.print("Cual es el nombre del trabajador ");
        name=objread.next();
        System.out.print("Cual es el salario básico por hora ");
        sbh=objread.nextInt();
        System.out.print("Cuantas son las horas trabajadas ");
        hrt=objread.nextInt();
        if (hrt <= 48) {
            boni=20000;
        } else  
            {
                if (hrt <= 58) {
                    boni=50000;
                } else {
                    boni=100000;
                }
        }
        if (sbh <= 5000) {
            dedu=10000;
            
        } else {
            if (sbh < 8000) {
                dedu=20000;
                
            } else {
                dedu=50000;
            }
        }
        salnet= sbh*hrt-dedu+boni;
        System.out.println("El salario neto es " + salnet);

        }
    }
    

