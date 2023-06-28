/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.Electrodomesticos;
import Entidad.Lavadora;
import Entidad.Televisor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dani.delgado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Electrodomesticos> electrodomesticos = new ArrayList<>();

        Lavadora lavadora1 = new Lavadora();
        lavadora1.crearLavadora();
        electrodomesticos.add(lavadora1);

        Televisor televisor1 = new Televisor();
        televisor1.crearTelevisor();
        electrodomesticos.add(televisor1);

        Lavadora lavadora2 = new Lavadora();
        lavadora2.crearLavadora();
        electrodomesticos.add(lavadora2);

        Televisor televisor2 = new Televisor();
        televisor2.crearTelevisor();
        electrodomesticos.add(televisor2);

        double precioTotalElectrodomesticos = 0;
        double precioTotalLavadoras = 0;
        double precioTotalTelevisores = 0;

        for (Electrodomesticos electrodomestico : electrodomesticos) {
            double precioFinal = electrodomestico.precioFinal();
            precioTotalElectrodomesticos += precioFinal;

            if (electrodomestico instanceof Lavadora) {
                precioTotalLavadoras += precioFinal;
            } else if (electrodomestico instanceof Televisor) {
                precioTotalTelevisores += precioFinal;
            }
        }

        System.out.println("Precio de todos los electrodomésticos: $" + precioTotalElectrodomesticos);
        System.out.println("Precio de las lavadoras: $" + precioTotalLavadoras);
        System.out.println("Precio de los televisores: $" + precioTotalTelevisores);
    }

}

