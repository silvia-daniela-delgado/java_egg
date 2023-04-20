/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y 
después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package guia2;

import java.util.Scanner;

public class extra_eje3 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese una frase:");
        String frase = read.next();
 
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        

    }

}
