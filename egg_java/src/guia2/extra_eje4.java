/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package guia2;

import java.util.Scanner;

public class extra_eje4 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("ingrese la cantidad de grados centigrados");

        double centigrados = read.nextDouble();
        double f = 32 + (9 * centigrados / 5);
        System.out.println("los grados convertidos a fahrenheit son:" + f);

    }

}
