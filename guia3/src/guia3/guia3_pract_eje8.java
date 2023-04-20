/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por 
ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo 
siguiente:
 */
package guia3;

import java.util.Scanner;

public class guia3_pract_eje8 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("ingrese el tamaño del cuadrado:");
        int tam = read.nextInt();
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (i == 0 || i == tam - 1 || j == 0 || j == tam - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}


