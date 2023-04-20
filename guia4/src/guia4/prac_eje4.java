/*
Crea una aplicación que nos pida un número por teclado y con una función se lo
pasamos por parámetro para que nos indique si es o no un número primo, debe 
devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por 
ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es 
primo.
 */
package guia4;

import java.util.Scanner;

public class prac_eje4 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese un numero:");
        int num = read.nextInt();
        System.out.println(primo(num));
    }

    public static boolean primo(int num) {
        int cont = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cont++;
            } 
                if (cont > 2) {

                }
            }
            return cont <= 2;
    }
}    
        

    
