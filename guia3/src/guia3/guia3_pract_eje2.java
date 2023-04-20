/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el 
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
Nota: investigar la función equals() en Java.
 */
package guia3;

import java.util.Scanner;

public class guia3_pract_eje2 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese una frase:");
        String frase = read.next();
        if (frase.equals("eureka")) {
            System.out.println("CORRECTO");

        } else {
            System.out.println("INCORRECTO");
        }

    }

}
