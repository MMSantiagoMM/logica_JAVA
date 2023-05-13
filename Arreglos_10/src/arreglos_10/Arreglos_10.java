package arreglos_10;

import java.util.Scanner;

public class Arreglos_10 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num, tam, pos = -1;
        String reg;
        System.out.print("Ingrese el tamano del vector ");
        tam = read.nextInt();
        int[] vector = new int[tam];
        System.out.print("Desea ingresar un concursante ");
        reg = read.next();
        while (!reg.equals("no") && pos <= tam ) {
            System.out.print("Ingrese el numero de identificacion ");
            num = read.nextInt();
            int j = 0, sw = 0;

            while (j < tam && sw == 0) {
                if (num == vector[j]) {
                    sw = 1;
                } else {
                    j++;
                }
            }
            if (sw == 0) {
                pos++;
                vector[pos] = num;
            }
            else
                System.out.println("NO concursa");
            System.out.print("Desea ingresar un concursante ");
            reg = read.next();
        }
    }

}
