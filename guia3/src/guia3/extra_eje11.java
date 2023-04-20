/*
Escribir un programa que lea un número entero y devuelva el número de dígitos 
que componen ese número. Por ejemplo, si introducimos el número 12345, el 
programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente 
utilizando el operador de división. Nota: recordar que las variables de tipo 
entero truncan los números o resultados.
*/
package guia3;

import java.util.Scanner;

public class extra_eje11 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese un numero");
        int num = read.nextInt();
        int cont = 0;
        while (num > 0){
            num /= 10;
            cont++;
        }
        System.out.println("se introdujeron " + cont + " digitos");
    }
    
}
