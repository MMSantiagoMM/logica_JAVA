/*Hacer un algoritmo que lea el sexo (1=hombre, 2=mujer), 
la edad y el deporte que practica e imprimir un mensaje si es mujer, 
mayor de edad y practica baloncesto*/
package condicional_4;

import java.util.Scanner;


public class Condicional_4 {

    
    public static void main(String[] args) {
        Scanner objread=new Scanner(System.in);
        int edad,sex;
        String name,deport;
        System.out.print("Cual es su nombre ");
        name=objread.next();
        System.out.print("Cual es el sexo ");
        sex=objread.nextInt();
        System.out.print("Cual es la edad ");
        edad=objread.nextInt();
        System.out.print("Cual es su deporte ");
        deport=objread.next();
        if (sex == 2 && edad >= 18 && "baloncesto".equals(deport)) {
            System.out.print("Es mujer mayor de edad y practica baloncesto");
        }
            
        }
        
        
        
        
    }
    
