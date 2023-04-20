/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y 
le pida al usuario un número a buscar en el vector. El programa mostrará dónde 
se encuentra el numero y si se encuentra repetido
 */
package guia5;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("ingrese el tamaño del vector");
        int n = read.nextInt();
        int[] vector = new int[n];
        
        for (int i = 0; i < vector.length; i++){
            vector[i] = (int) (Math.random() * n);
        }
            for (int i = 0; i < vector.length; i++){
             System.out.print(vector[i] + " - ");   
            }
            System.out.println("");
            System.out.print("ingrese numero a buscar: ");
            int numero = read.nextInt();
        
            for (int i = 0; i < vector.length; i++){
                if (numero == vector[i]){
                System.out.println("se encontro en la posicion: " + i);
            }
        }
 
    }
    
}
