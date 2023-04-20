/*
Crear un programa que dado un número determine si es par o impar.
 */
package guia3;

import java.util.Scanner;

public class guia3_prac_eje1 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("ingrese un numero:");
        int num = read.nextInt();
        if (num % 2 != 0) {
            System.out.println("el numero es impar");
        } else {
            System.out.println("el numero es par");

        }
    }

}
