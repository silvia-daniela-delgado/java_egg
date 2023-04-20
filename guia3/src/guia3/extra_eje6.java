/*
Leer la altura de N personas y determinar el promedio de estaturas que se 
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.

 */
package guia3;

import java.util.Scanner;

public class extra_eje6 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        float height, promedio, peques, suma, sumaPeques;
        promedio = 0;
        peques = 0;
        suma = 0;
        sumaPeques = 0;

        do {
            System.out.println("Ingrese las diferentes estaturas, para salir ingrese 0");
            height = read.nextFloat();

            suma = suma + height;
            if (height >= 1 && height <= 2) {
                promedio = promedio + 1;
            }
            if (height >= 1 && height <= 1.6) {
                peques = peques + 1;
                sumaPeques += height;
            }
        } while (height != 0);
        System.out.println(suma);
        System.out.println("El promedio de estaturas menores a 1.60 son " + (sumaPeques / peques));
        System.out.println("El promedio de estaturas mayores en general " + (suma / promedio));
    }
}


