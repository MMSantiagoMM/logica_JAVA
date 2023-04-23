/*
11.	Para una cantidad desconocida de registros, se lee : nombre, edad, sexo, 
estado civil(1=soltero, 2=casado, 3= unión libre, 4=viudo), carrera 
(1=sistemas, 2=programación, 3=mantenimiento, 4=diseño).
 Elabore un diagrama que encuentre e imprima:
a) 	Nombre de la mujer de sistemas más joven.
b) 	Nombre del hombre más viejo en sistemas.
c) 	Promedio de edad de las personas de programación que son casadas
d) 	Porcentaje que representan los menores de edad que estudian mantenimiento respecto a todas las personas de mantenimiento.
e) 	Cuantas personas de diseño son mujeres mayores de edad.

 */
package ciclo_para_switch_11;

import java.util.Scanner;


public class Ciclo_para_switch_11 {

   //Para una cantidad desconocida de registros, se lee : nombre, edad, sexo, 
//estado civil(1=soltero, 2=casado, 3= unión libre, 4=viudo), carrera 
//(1=sistemas, 2=programación, 3=mantenimiento, 4=diseño).
    public static void main(String[] args) {
        Scanner objread=new Scanner(System.in);
        String nom,sex,est_civ,carr,nom_m_j,nom_h_v,nom_p_c_j,nom_m_ochenta = null;
        int edad,n,ed_m_j=100,ed_h_m_v=0,c_p_c_s=0,con_man=0,con_m_di=0,con_m_total=0,con_h_total=0,ed_p_c_j=150,con_vi=0,con_sol=0;
        float a_p_c_s=0,prom_p_c_s=0,porc_men_man=0,con_man_men=0,acu_m_total=0,pro_ed_mu_total=0,acu_h_total=0,pro_ed_ho_total=0,con_total=0,por_vi=0;
        System.out.println("Ingrese la cantidad de registros ");
        n=objread.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el nombre ");
            nom=objread.next();
            System.out.print("Ingrese la edad ");
            edad=objread.nextInt();
            System.out.print("Ingrese el sexo ");
            sex=objread.next();
            System.out.print("Ingrese el estado civil ");
            est_civ=objread.next();
            System.out.print("Ingrese la carrera ");
            carr=objread.next();
            switch (carr) {
                //Nombre de la mujer de sistemas más joven.
                case "sistemas" -> {
                    if ("mujer".equals(sex)) {
                        if (edad < ed_m_j ) {
                            ed_m_j = edad;
                            nom_m_j = nom;
                        }
                    }
                    //Nombre del hombre más viejo en sistemas.
                    else {
                        if ("hombre".equals(sex)) {
                            if (edad > ed_h_m_v) {
                                ed_h_m_v = edad;
                                nom_h_v = nom;
                            }
                        }
                    }
                }
                //Promedio de edad de las personas de programación que son casadas
                case "programacion" -> {
                    if ("casado".equals(est_civ)) {
                        c_p_c_s++;
                        a_p_c_s = a_p_c_s + edad;
                    }
                }
                //Porcentaje que representan los menores de edad que estudian mantenimiento
                //respecto a todas las personas de mantenimiento.
                case "mantenimiento" -> {
                    con_man++;
                    if (edad < 18) {
                        con_man_men++;
                    }
                }
                //Cuantas personas de diseño son mujeres mayores de edad.
                case "diseno" -> {
                    if ("mujer".equals(sex)&& (edad >= 18)) {
                        con_m_di++;
                    }
                }
                default -> throw new AssertionError();
            }
            //Promedio de edad de todas las mujeres
            if ("mujer".equals(sex)) {
                con_m_total++;
                acu_m_total = acu_m_total + edad;
            }
            //Promedio de edad de todos los hombres
            else {
                if ("hombre".equals(sex)) {
                    con_h_total++;
                    acu_h_total = acu_h_total + edad;
                }
            }
            //Contador total
            if ("viudo".equals(est_civ)||("casado".equals(est_civ)||("soltero".equals(est_civ) || ("soltero".equals(est_civ))))) {
                con_total++;
            }
            switch (est_civ) {
                //Nombre de la persona casada más joven (sin importar el sexo)
                case "casado" -> {
                    if (edad <= ed_p_c_j) {
                        ed_p_c_j = edad;
                        nom_p_c_j = nom;
                    }
                }
                //Porcentaje que representan los viudos respecto al total de las personas
                case "viudo" -> {
                    con_vi++;
                }
                //Cuantas personas son solteras.
                case "soltero" -> {
                    con_sol++;
                }
                //nombre de todos los de unión libre que tengan mas de 80 años. 
                case "union_libre" -> {
                    if (edad > 80) {
                        nom_m_ochenta = nom_m_ochenta + nom;
                    }
                }
                default -> throw new AssertionError();
            }
       
       


            
            
        }
        por_vi = con_vi/con_total*100;
        pro_ed_ho_total = acu_h_total / con_h_total;
        pro_ed_mu_total = acu_m_total / con_m_total;
        prom_p_c_s = a_p_c_s / c_p_c_s * 100;
        porc_men_man = con_man_men / con_man;
        //System.out.println("El nombre de la mujer mas joven en sistemas es " + nom_m_j);
        //System.out.println("El nombre del hombre mas viejo en sistemas es " + nom_h_v);
        //System.out.println("El promedio de personas casadas es " + prom_p_c_s);
        //System.out.println("El porcentaje de -18 de manteniemiento con respecto al total es de " + porc_men_man);
        //System.out.println("La cantidad de mujeres de diseño +18 años es " + con_m_di);
        //System.out.println("El promedio de edad de todas las mujeres es " + pro_ed_mu_total);
        //System.out.println("El promedio de edad de todos los hombres es " + pro_ed_ho_total);
        //System.out.println("El porcentaje de viudos con respecto al total de personas es " + por_vi);
        //System.out.println("La cantidad de personas solteras es de " + con_sol);
        //System.out.println("Los nombres de las personas mayores de ochenta años son " + nom_m_ochenta);
    }
    
}
