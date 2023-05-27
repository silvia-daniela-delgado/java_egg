/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

/**
 *
 * @author Usuario
 */

import Entidad.NIF;
import java.util.Scanner;

public class NIFServicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el DNI: ");
        long dni = scanner.nextLong();

        NIF nif = new NIF(dni);

        System.out.println("NIF: " + nif);
    }
}
