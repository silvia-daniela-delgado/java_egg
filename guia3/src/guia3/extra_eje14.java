/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M 
cantidad de hijos. Escriba un programa que pida la cantidad de familias y para 
cada familia la cantidad de hijos para averiguar la media de edad de los hijos
de todas las familias.
*/
package guia3;

import java.util.Scanner;

public class extra_eje14 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese la cantidad de familias");
        int familia = read.nextInt();
        int totalHijos = 0;
        int totalEdades = 0;
        for (int i = 0; i < familia; i++){
            System.out.println("ingrese la cantidad de hijos");
            int cantHijos = read.nextInt();
            totalHijos += cantHijos;
            for (int j = 0; j < cantHijos; j++){
                System.out.println("ingrese la edad el hijo" + (j + 1));
                int edadHijo = read.nextInt();
                totalEdades += edadHijo;
            }    
        }    
        double edadMedia = ( double ) totalEdades / totalHijos;
        System.out.println("la edad media de los hijos de todas las familias es: " + edadMedia);
    }
    
}
