/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
por pantalla.

 */
package guia2;

import java.util.Scanner;

public class extra_eje2 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String nom, ape;

        System.out.println("ingrese su nombre:");
        nom = read.nextLine();

        System.out.println("ingrese su apellido:");
        ape = read.nextLine();

        System.out.println(" usted se llama " +nom+ " " +ape);

    }

}
