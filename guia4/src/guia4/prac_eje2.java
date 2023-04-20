/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los 
datos de las personas ingresadas por teclado e indique si son mayores o menores
de edad. Después de cada persona, el programa debe preguntarle al usuario si 
quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra 
“No”
 */
package guia4;

import java.util.Scanner;

public class prac_eje2 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese la cantidad de personas:");
        int n = read.nextInt();
        cantPersonas(n);
    }

    public static void cantPersonas(int n) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        String opcion;
        for (int i = 0; i < n; i++) {
            System.out.println("ingrese el nombre de la persona:");
            String nombrePersona = read.nextLine();
            System.out.println("ingresa la edad:");
            int edad = read.nextInt();
            if (edad >= 18) {
                System.out.println("es mayor de edad");
            } else {
                System.out.println("es menor de edad");
            }
            System.out.println("desea continuar?");
            opcion = read.next();
            if (opcion.equalsIgnoreCase("no")) {
                break;

            }
        }

    }

}
