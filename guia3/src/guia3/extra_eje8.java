/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco 
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de
números pares y la cantidad de números impares. Al igual que en el ejercicio
anterior los números negativos no deben sumarse. Nota: recordar el uso de la 
sentencia break.
 */
package guia3;

import java.util.Scanner;

public class extra_eje8 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        int num;
        int contNum = 0;
        int contPar = 0;
        int contImpar = 0;
        do {
            System.out.println("Ingrese un numero");
            num = read.nextInt();
            if (num > 0) {
                if (num % 2 == 0) {
                    contPar++;
                } else {
                    contImpar++;
                }
            }
            contNum++;
        } while (!(num % 5 == 0));
        System.out.println("se leyeron " + contNum + " numeros");
        System.out.println("se leyeron " + contPar + " numeros pares");
        System.out.println("se leyeron " + contImpar + " numeros impares");
    }
}
