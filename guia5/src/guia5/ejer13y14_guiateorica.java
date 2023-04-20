/*
Ej13: Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
de equipo y define su tipo de dato de tal manera que te permita alojar sus
nombres más adelante.
Ej14: Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus
compañeros de equipo
 */
package Guia5;

import java.util.Scanner;

/**
 *
 * @author Erica
 */
public class ejer13y14_guiateorica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] equipo = new String[8];
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i <= 7; i++) {
            System.out.println("Ingrese el nombre del " + (i + 1) + " participante");
            equipo[i] = leer.nextLine();
        }
        for (int i = 0; i < 8; i++) {
            System.out.print(" [ " + equipo[i] + " ]");

        }
        System.out.println("\n");
    }
}
