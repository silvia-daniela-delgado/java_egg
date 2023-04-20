/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la 
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los 
elementos).
 */
package guia5;

import static java.lang.Math.abs;
import java.util.Scanner;

public class extra_eje2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[] vector1 = new int[3];
        int[] vector2 = new int[3];

        for (int i = 0; i < 3; i++) {

            vector1[i] = abs((int) (Math.random() * 10 - 5));
            vector2[i] = abs((int) (Math.random() * 10 - 5));

        }
        for (int i = 0; i < 3; i++) {
            System.out.print("[" + vector1[i] + "]");

        }
        System.out.println("");

        for (int i = 0; i < 3; i++) {

            System.out.print("[" + vector2[i] + "]");

        }
        System.out.println("");

        for (int i = 0; i < 3; i++) {

            if (vector1[i] != vector2[i]) {
                System.out.println("los elementos son diferentes");

                break;
            } else {

                System.out.println("son iguales");
            }

        }

    }
}
