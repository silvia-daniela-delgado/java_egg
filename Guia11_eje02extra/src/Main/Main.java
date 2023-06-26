/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.Espectador;
import Entidad.Pelicula;
import Entidad.Sala;
import java.util.Random;

/**
 *
 * @author dani.delgado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("Título de la Película", 120, 18, "Director de la Película");
        Sala sala = new Sala(pelicula, 10.0);

        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            String nombre = "Espectador " + (i + 1);
            int edad = random.nextInt(50) + 10;
            double dinero = random.nextDouble() * 50.0;

            Espectador espectador = new Espectador(nombre, edad, dinero);
            if (sala.hayAsientoDisponible() && sala.ubicarEspectador(espectador)) {
                System.out.println(espectador.getNombre() + " se ha ubicado en un asiento.");
            } else {
                System.out.println(espectador.getNombre() + " no puede ubicarse en un asiento.");
            }
        }

        System.out.println("\nEstado de la sala:");
        sala.mostrarSala();
    }

}
