/*  Hacer un programa que lea un vector de números enteros, de tamaño N, 
y luego me imprima la cantidad de elementos pares que hay en dicho vector*/
package contar_elementos_pares_vector;
import java.util.Scanner;

public class Contar_elementos_pares_vector {

    public static void main(String[] args) {
        // Definicion de objetos y variables
        Scanner objread=new Scanner(System.in);
        int tam,cont_pares=0;
        //Leer el tamaño del vector
        System.out.print("¿Cuantos elementos tiene el vector? ");
        tam=objread.nextInt();
        //Definir el vector
        int[] numeros=new int[tam];
        for (int i = 0; i < tam; i++) {
            System.out.print("Digite elemento " + i + " ");
            numeros[i]=objread.nextInt();
        }
        //Contar los elementos pares
        for (int i = 0; i < tam; i++) {
            if (numeros[i] % 2 == 0)
                cont_pares++;
        }
        //Imprimir resultados
        System.out.println("\n La cantidad de elementos pares es " + cont_pares);   
    }
    
}
