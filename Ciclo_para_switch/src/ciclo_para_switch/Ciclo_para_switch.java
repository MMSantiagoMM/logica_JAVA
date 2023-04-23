/*
Elaborar un diagrama que lea para un grupo de N personas el nombre, 
la edad y el deporte( 1= fútbol, 2=baloncesto, 3= otro deporte) e imprima 
cuantos de fútbol son mayores de edad, cuantos de baloncesto son menores de 
edad y cuantas personas prefieren otro deporte.
 */
package ciclo_para_switch;

import java.util.Scanner;


public class Ciclo_para_switch {

    
    public static void main(String[] args) {
        Scanner objread=new Scanner(System.in);
        String name,sport;
        int edad,N,con_f=0,con_b=0,con_o=0;
        System.out.print("Cuantos registros desea ingresar ");
        N=objread.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.print("Cual es el nombre ");
            name=objread.next();
            System.out.print("Cual es la edad ");
            edad=objread.nextInt();
            System.out.print("Cual es el deporte ");
            sport=objread.next();
            switch (sport) {
                case "futbol" -> {
                    //cuantos de fútbol son mayores de edad
                    if (edad >= 18) {
                        con_f++;
                    }
                }
                //cuantos de baloncesto son menores de edad
                case "baloncesto" -> {
                    if (edad < 18) {
                        con_b++;
                    }
                }
                //cuantas personas prefieren otro deporte
                case "otro" -> {
                    con_o++;
                }
                default -> throw new AssertionError();
            }
        }
        //System.out.println("Los mayores de edad que prefieren el futbol son " + con_f);
        //System.out.println("Los menores de edad que prefieren el baloncesto son " + con_b);
        //System.out.println("Las personas que prefieren otro deporte son " + con_o);
    }
    
}
