/* Hacer un programa que lea dos números enteros y luego imprima 
su multiplicación (se debe realizar a través de sumas) */
package multiplicacion_sumas;
import java.util.Scanner;

public class Multiplicacion_sumas {

    public static void main(String[] args) {
        // Definicion de objetos y variables
         Scanner objread=new Scanner(System.in);
         int num1,num2,resultado=0;
         //Lectura de os dos numeros
         System.out.print("Digite numero entero positivo ");
         num1=objread.nextInt();
         System.out.print("Digite otro numero entero positivo ");
         num2=objread.nextInt();
         //Multiplicacion a traves de sumas
         for (int i = 1; i <= num2; i++) {
            resultado+=num1;
        }//fin para
        System.out.println("\n La multiplicacion da " + resultado); 
    }
}
