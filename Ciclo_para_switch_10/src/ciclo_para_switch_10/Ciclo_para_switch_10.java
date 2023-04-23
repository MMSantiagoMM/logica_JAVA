/*
 10.	Se tiene un grupo de registros, no se conoce cuantos, 
cada registro contiene el nombre, la edad, estatura, sexo(1=hombre, 2=mujer)
, deporte (1=natación, 2= fútbol, 3=ciclismo, 4=patinaje, 5=otro deporte). 
Elabore un diagrama que imprima :
•	Promedio de edad de las personas que prefieren el fútbol.
•	Porcentaje que representan las mujeres que prefieren el ciclismo respecto a las personas de ciclismo.
•	Nombre de la mujer más alta en patinaje.
•	Cuantos de los que practican natación, pesan menos de 50 kg y miden mas de 1.80 mts.
•	Promedio de edad de todas las personas sin importar el deporte que practiquen.

 */
package ciclo_para_switch_10;

import java.util.Scanner;


public class Ciclo_para_switch_10 {

   
    public static void main(String[] args) {
        Scanner objread=new Scanner(System.in);
        String nam,sport,sex,nam_m_a = null;
        int edad,r,con_f=0,con_c=0,con_nat=0,con_total=0;
        float esta,prom_fut=0,acum_f=0,por_muj_cicli=0,con_m_c=0,muj_alt=0,acu_total=0,pro_edad_total;
        System.out.print("Ingrese la cantidad de registros ");
        r=objread.nextInt();
        for (int i = 1; i <= r; i++) {
            System.out.print("Ingrese el nombre ");
            nam=objread.next();
            System.out.print("Ingrese el sexo ");
            sex=objread.next();
            System.out.print("Cual es la edad ");
            edad=objread.nextInt();
            System.out.print("Ingrese el deporte ");
            sport=objread.next();
            System.out.print("Ingrese la estatura");
            esta=objread.nextFloat();
            switch (sport) {
                //Promedio de edad de las personas que prefieren el fútbol.
                case "futbol" -> { con_f++;
                acum_f = acum_f + edad;
                }
                //Porcentaje que representan las mujeres que prefieren el ciclismo respecto a las personas de ciclismo.
                case "ciclismo" -> { con_c++;
                    if ("mujer".equals(sex)) {
                        con_m_c++;
                    }
                }
                //Nombre de la mujer más alta en patinaje.
                case "patinaje" ->{
                    if ("mujer".equals(sex)) {
                        if (esta > muj_alt) {
                            muj_alt = esta;
                            nam_m_a = nam;
                        }
                    }
                } 
                //Cuantos de los que practican natación, pesan menos de 50 kg y miden mas de 1.80 mts.
                case "natacion" -> {
                    if (esta > 1.80) {
                        con_nat++;
                    }
                    
                }
                    
                default -> throw new AssertionError();
            }
            //Promedio de edad de todas las personas sin importar el deporte que practiquen
            switch (sport) {
                case "futbol","natacion","patinaje","ciclismo","otro deporte" -> {
                    con_total++;
                    acu_total = acu_total + edad;
                }
                default -> throw new AssertionError();
            }
        }
        pro_edad_total = acu_total / con_total; 
        por_muj_cicli = con_m_c / con_c * 100;
        prom_fut = acum_f / con_f;
        //System.out.println("El promedio de edad de las personas que prefieren el futbol es " + prom_fut);
        //System.out.println("El porcentaje de mujeres que prefieren el ciclismo con respecto al total \n de personas que prefieren el ciclismo es " + por_muj_cicli);
        //System.out.println("El nombre de la mujer más alta en patina es " + nam_m_a);
        //System.out.println("Cantidad de personas que practican natacion y miden mas de 1.80 metros " + con_nat);
        System.out.println("El promedio de edad de todas las personas sin importar el deporte es " + pro_edad_total);
    }
    
}
