/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class extra_eje5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String socio;
        float valor;
        System.out.println("ingrese una lerta");

        socio = leer.next();

        System.out.println("ingrese el valor del tratamiento");

        valor = leer.nextFloat();

        switch (socio) {
            case "a":
                System.out.println("ustede debe pagar " + valor + " menos el 50% que seria: " + (valor - valor * 0.50));
                break;
            case "b":
                System.out.println("ustede debe pagar " + valor + " menos el 35% que seria: " + (valor - valor * 0.35));
                break;
            case "c":
                System.out.println("ustede debe pagar " + valor);
                break;

        }
    }
}
