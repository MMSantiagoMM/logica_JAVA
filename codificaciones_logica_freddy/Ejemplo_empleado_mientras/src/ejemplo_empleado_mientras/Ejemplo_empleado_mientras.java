/*Hacer un programa que lea un numero desconocido de registros (identificación, 
nombre, salario y dependencia), debe calcular e imprimir la nómina de la 
empresa y la cantidad de empleados de sistemas que ganan mas de 3000000 de pesos*/

package ejemplo_empleado_mientras;
import java.util.Scanner;

public class Ejemplo_empleado_mientras {
    /* Inicie
	Nomina=0
	Cant_empl_sistemas=0
	Lea identificacion
	Mientras (identificacion <>  “000”)
		Lea nombre, salario, dependencia
		Nomina=nomina + salario
		Si (dependencia = “Sistemas” and salario > 3000000)
			Cant_empl_sistemas= Cant_empl_sistemas + 1
                     Fin-si
		Lea identificacion
          Fin-mientras
	Imprima nomina, Cant_empl_sistemas
        Termine*/

    public static void main(String[] args) {
        // Definicion de objetos y variables
        Scanner objread=new Scanner(System.in);
        String id,name,departament;
        int count_emp_system=0;
        float salary,nomina=0;
        // Read id
        System.out.print("¿Cual es la identificacion? ");
        id=objread.next();
        // Cicle while and operation
        while (!id.equals("000")){
            System.out.print("\n Digite su nombre ");
            name=objread.next();
            System.out.print(" Digite su salario ");
            salary=objread.nextFloat();
            System.out.print(" Digite la dependencia ");
            departament=objread.next();
            nomina+=salary;
            if (departament.equals("Sistemas"))
                count_emp_system++;
            System.out.print("¿Cual es la identificacion? ");
            id=objread.next();
        } //End While
        System.out.println("\n La nomina de la empresa es " + nomina);
        System.out.println(" La cantidad de empleados de sistemas " + count_emp_system);
    }  
}
