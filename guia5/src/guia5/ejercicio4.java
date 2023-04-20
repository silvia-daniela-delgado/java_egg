/*
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y 
muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se 
denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */
import java.util.Random;

public class ejercicio4 {

    public static void main(String[] args) {
        int[][] vMatriz = new int[4][4];
        cargarMatriz(vMatriz);
        System.out.println("La matriz original es:");
        mostrarMatriz(vMatriz);
        System.out.println("La matriz traspuesta es:");
        mostrarMatrizTras(vMatriz);
    }

    public static void cargarMatriz(int[][] matriz) {
        Random dado = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = dado.nextInt(10);
            }
        }
    }

    public static void mostrarMatriz(int[][] verMatriz) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[ " + verMatriz[i][j] + " ]");
            }
            System.out.println("");
        }
    }

    public static void mostrarMatrizTras(int[][] verMatrizTras) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[ " + verMatrizTras[j][i] + " ]");
            }
            System.out.println("");
        }
    }
}