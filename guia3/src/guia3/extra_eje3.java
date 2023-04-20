/*
 Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar 
la función equals() de la clase String.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class extra_eje3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
       String letra;
       
        System.out.print("Ingrese una letra: ");
        letra = read.next();
        while (letra.length()>1){
            System.out.print("Te dije una letra SALAME: ");
            letra = read.next();
        } 
        
        if (letra.equalsIgnoreCase("A")||letra.equalsIgnoreCase("E")||letra.equalsIgnoreCase("I")||letra.equalsIgnoreCase("O")||letra.equalsIgnoreCase("U")) {
            System.out.println("Es vocal");
        }
        else 
            System.out.println("No es vocal");
    }
    
}
