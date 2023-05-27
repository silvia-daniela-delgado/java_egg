
package Main;


import Entidad.NIF;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el DNI: ");
        long dni = scanner.nextLong();

        NIF nif = new NIF(dni);

        System.out.println("NIF: " + nif);
    }
}
