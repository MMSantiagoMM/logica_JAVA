/*
Se tiene un número desconocido de personas y por cada una de ellas se maneja 
Identificación, sexo, edad, bebida preferida y ciudad donde reside. Hacer un 
algoritmo que calcule e imprima los siguientes datos:
Cantidad de personas que viven en Medellín y toman Coca Cola
Los nombres de los hombres, mayores de edad que toman Pepsi Cola y viven en Cali
Cantidad de personas encuestadas
Porcentaje de personas que toman Manzana y viven en Bogotá en relación a todas las personas encuestadas
Promedio de edad de las mujeres que toman Naranjada y viven en Cartagena

 */
package ciclo_while_switch_3;

import java.util.Scanner;




public class Ciclo_while_switch_3 {

    
    public static void main(String[] args) {
        Scanner objread = new Scanner(System.in);
        String sex,bebida,city,nom,nom_h_c_p = "";
        int id,edad,con_cola=0,can_p_e=0,can_m_n_c=0;
        float con_p_m_b=0,por_p_m_b=0,acu_m_n_c=0,pro_ed_mu_na_ca=0;
        System.out.print("Cual es la identificacion ");
        id=objread.nextInt();
        while (id != 0) {     
            System.out.print("Cual es el nombre ");
            nom=objread.next();
            System.out.print("Cual es el sexo ");
            sex=objread.next();
            System.out.print("Cual es la edad ");
            edad=objread.nextInt();
            System.out.print("Cual es la ciudad ");
            city=objread.next();
            System.out.print("Cual es la bebida ");
            bebida=objread.next();
            can_p_e++;
            switch (bebida) {
                //Cantidad de personas que viven en Medellín y toman Coca Cola
                case "cola" -> {
                    if (city.equals("medellin")) {
                        con_cola++;
                    }
                    
                }
                //Los nombres de los hombres, mayores de edad que toman Pepsi Cola y viven en Cali
                case "pepsi" -> {
                    if (city.equals("cali")&& edad >= 18 && sex.equals("hombre")) {
                        nom_h_c_p+= nom;
                    }
                }
                //Porcentaje de personas que toman Manzana y viven en Bogotá en relación a todas las personas encuestadas
                case "manzana" -> {
                    if (city.equals("bogota")) {
                        con_p_m_b++;
                    }
                
                }
                //Promedio de edad de las mujeres que toman Naranjada y viven en Cartagena
                case "naranjada" -> {
                    if (city.equals("cartagena") && sex.equals("mujer")) {
                        can_m_n_c ++;
                        acu_m_n_c += edad;
                    }
                }
                default -> throw new AssertionError();
            }
            System.out.print("Cual es la identificacion ");
            id=objread.nextInt();
        }
        por_p_m_b = con_p_m_b / can_p_e * 100;
        pro_ed_mu_na_ca = acu_m_n_c / can_m_n_c;
        //System.out.print("La cantidad de personas que viven en \n medellin y toman coca cola es " + con_cola);
        //System.out.print("Los nombres de los hombres +18 que toman \n pepsi y viven en cali son " + nom_h_c_p);
        //System.out.print("El porcentahe de quienes toman manzana\n  en bogota con respecto a todas las personas encuentadas es " + por_p_m_b);
        //System.out.print("El promedio de edad de las mujeres que\n  toman naranjada y viven en cartagena es " + pro_ed_mu_na_ca);
    }
    
}
