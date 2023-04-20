/*
Crea una aplicación que a través de una función nos convierta una cantidad de 
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes
o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
convertir que será una cadena, este no devolverá ningún valor y mostrará un 
mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package guia4;

import java.util.Scanner;

public class prac_eje3 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("ingresa cantidad de euros:");
        double euro = read.nextDouble();
        cambio(euro);
    }

    public static void cambio(double euro) {
        Scanner read = new Scanner(System.in);
        System.out.println("elija una opcion");
        String opcion = read.nextLine();
        //double libra;
        //double dolar;
        //double yenes;
        switch (opcion.toLowerCase()) {
            case "libra hola":
                double aux = euro * 0.86;
                System.out.println("pasado a libras es: " + aux);
                break;
            case "dolar":
                aux = euro * 1.28611;
                System.out.println("pasado a dolar es: " + aux);
                break;
            case "yenes":
                aux = euro * 129.852;
                System.out.println("pasado a yenes es: " + aux);
                break;

        }

    }

}
