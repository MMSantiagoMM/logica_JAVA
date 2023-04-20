/* Programa que lea dos numeros y
luego imprima la suma,la resta, la division
y la multiplicacion de los numeros */
package operaciones_basicas;
//Librerias
import java.util.Scanner;


public class Operaciones_basicas {
//Metodos locales
/*Inicie
	Lea num1,num2
	Suma=num1 + num2
	Resta=num1 – num2
	Multiplicacion=num1 * num2
	Division=num1/num2
	Imprima suma,resta,multiplicacion,division
Termine*/
    public static void main(String[] args) {
        // Definicion de objetos y variables
        Scanner objread=new Scanner(System.in);
        int num1,num2;                  //String = next();
        int suma,resta,multiplicacion;  //nextInt()
        float division;                 //nextFloat()
        //Lectura de datos  Lea num1,num2
        System.out.print("¿Cual es el primer numero? ");
        num1=objread.nextInt();
        System.out.print("¿Cual es el numero dos? ");
        num2=objread.nextInt();
        //Operaciones
        suma=num1 + num2;
	resta=num1 - num2;
	multiplicacion=num1 * num2;
	division=(float)num1/num2;
        //Imprimir resultados
        System.out.println("\n La suma de los numeros es " + suma);
        System.out.println(" La resta es " + resta);
        System.out.println(" La multiplicacion es " + multiplicacion);
        System.out.println(" La division es " + division);
    }
    
}
