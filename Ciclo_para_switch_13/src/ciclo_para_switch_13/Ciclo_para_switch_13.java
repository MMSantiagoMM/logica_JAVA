/*
13.	Una empresa transportadora desea sistematizar la liquidación diaria 
de sus N vehículos, para ello, crea el siguiente registro por cada carro :
placa, propietario, tipo de vehículo(1=colectivo, 2=microbus, 3=buseta, 4=bus) 
número de pasajeros transportados, valor de cada pasaje.
      El administrador desea saber :
a) 	Total recolectado por la empresa.
b) 	Cuantos de los colectivos transportaron mas de 100 pasajeros.
c) 	Promedio de pasajeros transportados por los microbuses.
d) 	Placa de la buseta que mas dinero recolectó.
e) 	Cuanto dinero recolectaron en total los buses.

 */
package ciclo_para_switch_13;

import java.util.Scanner;


public class Ciclo_para_switch_13 {

    
    public static void main(String[] args) {
        Scanner objread=new Scanner(System.in);
        String placa,prop,tipo_v,placa_b_m = null;
        int num_p_t=0,val_p = 0,N,total_rec = 0,acu_v_t=0,con_c=0,con_m=0,din_rec=0, b_m_r=0,acu_buses=0;
        float acu_m=0,pro_micro=0;
        System.out.print("Ingrese el numero de vehiculos ");
        N=objread.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.print("Ingrese el tipo de vehiculo ");
            tipo_v=objread.next();
            System.out.print("Ingrese la placa del vehiculo ");
            placa=objread.next();
            System.out.print("Cuantos pasajeros transporto ");
            num_p_t=objread.nextInt();
            System.out.print("Cual es el valor del pasaje ");
            val_p=objread.nextInt();
            System.out.print("Quien el propietario del vehiculo ");
            prop=objread.next();
            din_rec = num_p_t * val_p;
            //Total recolectado por la empresa.
            if ("1".equals(tipo_v) || "2".equals(tipo_v) || "3".equals(tipo_v) || "4".equals(tipo_v)) {
                acu_v_t = acu_v_t + val_p;
            }
            switch (tipo_v) {
                //Cuantos de los colectivos transportaron mas de 100 pasajeros.
                case "1" -> {
                    if (num_p_t > 100) {
                        con_c++;
                    }
                }
                //Promedio de pasajeros transportados por los microbuses.
                case "2" -> {
                    con_m++;
                    acu_m = acu_m + num_p_t;
                }
                //Placa de la buseta que mas dinero recolectó.
                case "3" -> {
                    if (din_rec > b_m_r) {
                        b_m_r = din_rec;
                        placa_b_m = placa;
                    }
                }
                //Cuanto dinero recolectaron en total los buses.
                case "4" -> {
                    acu_buses = acu_buses + din_rec;
                }
                default -> throw new AssertionError();
            }
        }
        total_rec = num_p_t * acu_v_t;
        pro_micro = acu_m / con_m;
        //System.out.print("El total de dinero recolectado por la empresa es " + total_rec);
        //System.out.print("El numero de colectivos que transportador mas de 100 pasajeros es " + con_c);
        //System.out.print("El promedio de pasajeros transportados por los microbuses es " + pro_micro);
        //System.out.print("La placa de la buseta que mas recolecto es " + placa_b_m);
        //System.out.print("El total del dinero recolectado por los buses es " + acu_buses);
    }
    
}
