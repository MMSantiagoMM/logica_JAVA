/*
 4.	En un almacén, cada que se realiza una venta se elabora un registro 
con el nombre del artículo, el precio por unidad y la cantidad de artículos vendidos. 
Suponiendo que se hicieron 20 ventas, elabore un diagrama que imprima por cada venta
el nombre del articulo y el valor total de la venta.
 */
package ciclo_para_4;

import java.util.Scanner;


public class Ciclo_para_4 {
/*Para el mismo enunciado del ejercicio anterior, suponga que si el valor 
    de la venta es mayor de   50.000.oo se concede un descuento del 10 % 
    sobre el valor de la venta.*/
    
    public static void main(String[] args) {
        Scanner objread=new Scanner(System.in);
        String name;
        int p_u,c_v;
        float d,v_t;
        d= (float)0.10;
        
        for (int i = 1; i <= 2; i++) {
            System.out.print("Cual es el nombre del articulo ");
            name=objread.next();
            System.out.print("El precio del articulo es ");
            p_u=objread.nextInt();
            System.out.print("La cantidad es ");
            c_v=objread.nextInt();
            v_t = p_u * c_v;
            if (v_t > 50000) {
                v_t=v_t-v_t*d;
            }
            System.out.print("El articulo vendido es "+name+"\n su valor total es " + v_t+"\n");
        }
    }
    
}
