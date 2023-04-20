/*
Realizar un algoritmo que llene un vector con los 100 primeros números enteros
y los muestre por pantalla en orden descendente.
 */
package guia5;

public class ejercicio1 {

    public static void main(String[] args) {
        int[] vector = new int[100];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = 100 - i;
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i] + " - ");
        }
    }

}
