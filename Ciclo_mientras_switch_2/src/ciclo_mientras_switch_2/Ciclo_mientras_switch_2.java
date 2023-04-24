/*
Se tiene un número desconocido de clientes (por cada uno se lee cedula, 
nombre, cupo asignado y ciudad donde reside), se pide:
Cantidad de clientes de Cali que tienen un cupo mayor de un millón de pesos
Promedio de cupo asignado a los clientes de Medellín
Total de cupo asignado a los clientes de Bogotá
Porcentaje de clientes de Pereira en relación a todos los clientes 
Nombre y cupo del cliente que tiene mayor cupo en Cartagena

 */
package ciclo_mientras_switch_2;

import java.util.Scanner;


public class Ciclo_mientras_switch_2 {

   
    public static void main(String[] args) {
        Scanner objread=new Scanner(System.in);
        String nom,city,nom_car_may = null;
        int ced,cup,c_c=0,c_m=0,c_b=0,c_p=0,cup_car_may=0;
        float prom_med_cup=0,a_m=0,por_cli_per=0,con_t_c=0;
        System.out.print("Ingrese la cedula ");
        ced=objread.nextInt();
        while (ced != 000) {            
            System.out.print("Cual es el nombre ");
            nom=objread.next();
            System.out.print("Cual es la ciudad ");
            city=objread.next();
            System.out.print("De cuanto es el cupo ");
            cup=objread.nextInt();
            con_t_c++;
            switch (city) {
                //Cantidad de clientes de Cali que tienen un cupo mayor de un millón de pesos
                case "cali" -> {
                    if (cup > 1000000) {
                        c_c++;
                    }  
                }  
                //Promedio de cupo asignado a los clientes de Medellín
                case "medellin" -> {
                    c_m++;
                    a_m += cup;
                }
                //Total de cupo asignado a los clientes de Bogotá
                case "bogota" -> {
                    c_b += cup;
                }
                //Porcentaje de clientes de Pereira en relación a todos los clientes 
                case "pereira" -> {
                    c_p++;
                }
                //Nombre y cupo del cliente que tiene mayor cupo en Cartagena
                case "cartagena" -> {
                    if (cup > cup_car_may) {
                        cup_car_may = cup;
                        nom_car_may = nom;
                    }
                }
                default -> throw new AssertionError();
                
                }
            System.out.println("Cual es la cedula ");
            ced=objread.nextInt();
                
            }
        prom_med_cup = a_m / c_m;
        por_cli_per = c_p/con_t_c*100;
        //System.out.print("La cantidad de clientes calenos con cupo +1000000 es " + c_c);
        //System.out.print("El promedio de cupos asignado a los clientes de Medellin " + prom_med_cup);
        //System.out.print("El total de cupo asignado a bogota es " + c_b);
        //System.out.print("El porcentaje de clientes de pereira en relacion a todos los clientes es " + por_cli_per);
        //System.out.print("El nombre del cliente con mayor cupo en Cartagena es " + nom_car_may + "su cupo es de " + cup_car_may);
        }
    }
    

