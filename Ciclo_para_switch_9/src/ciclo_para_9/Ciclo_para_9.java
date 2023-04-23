/*
 Un empresario del transporte cuenta con 30 vehículos entre buses, busetas 
y colectivos. Al final del día se elabora por cada vehículo un registro 
con la placa, el tipo (1= bus, 2= buseta, 3= colectivo) y el número de 
pasajeros transportados. Elabore un diagrama que imprima por cada vehículo 
la placa, el dinero recolectado y el pago para el conductor que 
es el 20 % del total recolectado. También tenga en cuenta que el precio 
del pasajes en Bus es de  $400.oo , en Buseta es de $ 500.oo 
y en Colectivos es de $800.oo.
 */
package ciclo_para_9;

import java.util.Scanner;


public class Ciclo_para_9 {

   
    public static void main(String[] args) {
        Scanner objread=new Scanner(System.in);
        String placa,tipo;
        int num_p_t,din_rec=0;
        float pago_c;
        for (int i = 1; i <= 30; i++) {
            System.out.print("Cual es la placa ");
            placa=objread.next();
            System.out.print("Cual es el tipo de vehiculo ");
            tipo=objread.next();
            System.out.print("Cuantos son los pasajeros transportados ");
            num_p_t=objread.nextInt();
            /*if ("bus".equals(tipo)) {
                din_rec = num_p_t * 400;
            } else {
                if ("buseta".equals(tipo)) {
                    din_rec = num_p_t * 500;
                    
                } else {
                    if ("colectivo".equals(tipo)) {
                        din_rec = num_p_t * 800;
                    }
                    else {
                        System.out.print("Error. Digite de nuevo ");
                    }
                }
            }*/
                switch (tipo) {
                case "bus" -> din_rec = num_p_t * 400;
                case "buseta" -> din_rec = num_p_t * 500;
                case "colectivo" -> din_rec = num_p_t * 800;
                default -> throw new AssertionError();
            }
            
            pago_c = din_rec * (float)0.20;
            System.out.print("El tipo de vehiculo es " + tipo + "\nla placa es " + placa + "\n el dinero recolectado es " + din_rec + "\n el pago al conductor es " + pago_c + "\n");
            
        }
        
    }
    
}
