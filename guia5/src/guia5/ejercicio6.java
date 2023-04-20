
import java.util.Scanner;

/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear 
un programa que permita introducir un cuadrado por teclado y determine si este 
cuadrado es mágico o no. El programa deberá comprobar que los números 
introducidos son correctos, es decir, están entre el 1 y el 9.
 */

public class ejercicio6 {

    
       

    public static void main(String[] args) {
        int[][] vMatriz = new int[3][3];
        cargarMatriz(vMatriz);
        mostrarMatriz(vMatriz);
        cuadradoMagico(vMatriz);
        if (cuadradoMagico(vMatriz)) {
            System.out.println("El cuadrado es Magico");
        } else {
            System.out.println("El cuadrado no es Magico");
        }
    }

    public static void cargarMatriz(int[][] matriz) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingresar los valores de la matriz de 3x3 con numeros del 1 al 9");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    matriz[i][j] = read.nextInt();
                    if (matriz[i][j] < 1 || matriz[i][j] > 9) {
                        System.out.println("El numero ingresado no es correcto, por favor ingresar del 1 al 9");
                    }
                } while (matriz[i][j] < 1 || matriz[i][j] > 9);
            }
        }
    }

    public static void mostrarMatriz(int[][] verMatriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[ " + verMatriz[i][j] + " ]");
            }
            System.out.println("");
        }
    }

    public static boolean cuadradoMagico(int[][] matriz) {
        int diagonal = 0;
        int diagonal2 = 0;
        int suma;
        for (int i = 0; i < 3; i++) {
            diagonal += matriz[i][i];
        }
        for (int i = 0; i < 3; i++) {
            diagonal2 += matriz[2 - i][i];
        }
        for (int i = 0; i < 3; i++) {
            suma = 0;
            for (int j = 0; j < 3; j++) {
                suma += matriz[i][j];
            }
            System.out.println("diagonal: " + diagonal + " suma: " + suma);
            if (suma != diagonal || diagonal != diagonal2) {
                return false;
            }
        }
        return true;
    }
}

