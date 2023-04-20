
import java.util.Scanner;

/*
Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice 
que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta,
pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz 
traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas 
por columnas (o viceversa).
 */


public class ejercicio5 {

    
    public static void main(String[] args) {
        
        int[][] vMatriz = new int[3][3];
        cargarMatriz(vMatriz);  
        mostrarMatriz(vMatriz);
        if (matrizAntisimetrica(vMatriz)) {
            System.out.println("La matriz es Antisimetrica!");
        }else   {
            System.out.println("La matriz no es Antisimetrica");
        }
    }
    public static void cargarMatriz (int[][] matriz){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingresar los valores de la matriz de 3x3");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3; j++) {
               matriz[i][j]= read.nextInt(); 
            }
        }    
    }
    public static void mostrarMatriz (int[][] verMatriz){
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3; j++) {
                System.out.print( "[ " + verMatriz[i][j] + " ]" ); 
            }
            System.out.println("");
        }
    }
    public static boolean matrizAntisimetrica (int [][] matrizAnti){
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3; j++) {
                if(matrizAnti[i][j] + matrizAnti[j][i] != 0){
                    return false;
                }
            }
        } 
        return true;
    }
}        
    