/*
 Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.
 */
package guia3;

import java.util.Scanner;

public class extra_eje4 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num;
        do {

            System.out.println("ingrese un nujmero del 1 al 10:");
            num = read.nextInt();

            while (num < 1 || num > 10) {
                System.out.println("ingrese un nujmero del 1 al 10:");
                num = read.nextInt();

            }
            switch (num) {
                case 1:
                    System.out.println("I");
                    break;
                case 2:
                    System.out.println("II");
                    break;
                case 3:
                    System.out.println("III");
                    break;
                case 4:
                    System.out.println("IV");
                    break;
                case 5:
                    System.out.println("V");
                    break;
                case 6:
                    System.out.println("VI");
                    break;
                case 7:
                    System.out.println("VII");
                    break;
                case 8:
                    System.out.println("VIII");
                    break;
                case 9:
                    System.out.println("IX");
                    break;
                case 10:
                    System.out.println("X");
                    break;

            }
        } while (num > 1 || num < 10);
    }

}
