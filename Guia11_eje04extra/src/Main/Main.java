/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.Alumno;
import java.util.List;

/**
 *
 * @author dani.delgado
 */



public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Simulador simulador = new Simulador();

        List<String> nombres = simulador.generarNombresAleatorios(10);
        List<Integer> dnis = simulador.generarDNIAleatorios(10, 10000000, 99999999);
        List<Alumno> alumnos = simulador.generarAlumnos(nombres, dnis);

        System.out.println("Listado de Alumnos:");
        simulador.mostrarListadoAlumnos(alumnos);
        System.out.println();

        System.out.println("Votaciones:");
        simulador.votacion(alumnos);
        System.out.println();

        System.out.println("Recuento de Votos:");
        simulador.mostrarRecuentoVotos(alumnos);
        System.out.println();

        System.out.println("Facilitadores y Facilitadores Suplentes:");
        simulador.mostrarFacilitadores(alumnos);
    }
}
