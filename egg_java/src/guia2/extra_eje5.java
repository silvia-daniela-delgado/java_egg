/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. 
 */
package guia2;

import java.util.Scanner;

public class extra_eje5 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("ingrese un numero entero:");

        int num = read.nextInt();
        int numDoble = num * 2;
        int numTriple = num * 3;
        double raizCuadrada = Math.sqrt(num);

        System.out.println("el dible es:" + numDoble);
        System.out.println("el triple es:" + numTriple);
        System.out.println("la raiz cuadrada es:" + raizCuadrada);
    }

}
