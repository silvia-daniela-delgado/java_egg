/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

/**
 *
 * @author dani.delgado
 */

class Simulador {
    private Random random;

    public Simulador() {
        random = new Random();
    }

    public List<String> generarNombresAleatorios(int cantidad) {
        List<String> nombres = new ArrayList<>();
        String[] nombresDisponibles = {"Juan", "Maria", "Carlos", "Luisa", "Pedro", "Ana", "Miguel", "Laura"};

        for (int i = 0; i < cantidad; i++) {
            int indice = random.nextInt(nombresDisponibles.length);
            nombres.add(nombresDisponibles[indice]);
        }

        return nombres;
    }

    public List<Integer> generarDNIAleatorios(int cantidad, int rangoInicial, int rangoFinal) {
        List<Integer> dnis = new ArrayList<>();

        for (int i = 0; i < cantidad; i++) {
            int dni = random.nextInt(rangoFinal - rangoInicial + 1) + rangoInicial;
            dnis.add(dni);
        }

        return dnis;
    }

    public List<Alumno> generarAlumnos(List<String> nombres, List<Integer> dnis) {
        List<Alumno> alumnos = new ArrayList<>();

        for (int i = 0; i < nombres.size(); i++) {
            String nombre = nombres.get(i);
            int dni = dnis.get(i);
            Alumno alumno = new Alumno(nombre, dni);
            alumnos.add(alumno);
        }

        return alumnos;
    }

    public void mostrarListadoAlumnos(List<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println("Nombre: " + alumno.getNombreCompleto() + ", DNI: " + alumno.getDNI());
        }
    }

    public void votacion(List<Alumno> alumnos) {
        HashSet<Alumno> votados = new HashSet<>();

        for (Alumno alumno : alumnos) {
            List<Alumno> votos = new ArrayList<>();

            while (votos.size() < 3) {
                int indice = random.nextInt(alumnos.size());
                Alumno alumnoVotado = alumnos.get(indice);

                if (alumnoVotado != alumno && !votados.contains(alumnoVotado)) {
                    votos.add(alumnoVotado);
                    votados.add(alumnoVotado);
                    alumnoVotado.incrementarVoto();
                }
            }

            Voto voto = new Voto(alumno, votos);
            System.out.println("Alumno: " + voto.getAlumno().getNombreCompleto());
            System.out.println("Votos: ");
            for (Alumno votado : voto.getVotos()) {
                System.out.println("- " + votado.getNombreCompleto());
            }
            System.out.println();
        }
    }

    public void mostrarRecuentoVotos(List<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println("Alumno: " + alumno.getNombreCompleto());
            System.out.println("Cantidad de votos: " + alumno.getCantidadVotos());
            System.out.println("Votos recibidos: ");
            for (Alumno votado : alumnos) {
                if (votado.getCantidadVotos() > 0) {
                    System.out.println("- " + votado.getNombreCompleto());
                }
            }
            System.out.println();
        }
    }

    public void mostrarFacilitadores(List<Alumno> alumnos) {
        System.out.println("Facilitadores:");
        for (int i = 0; i < 5; i++) {
            Alumno facilitador = alumnos.get(i);
            System.out.println("- " + facilitador.getNombreCompleto());
        }

        System.out.println();

        System.out.println("Facilitadores suplentes:");
        for (int i = 5; i < 10; i++) {
            Alumno facilitadorSuplente = alumnos.get(i);
            System.out.println("- " + facilitadorSuplente.getNombreCompleto());
        }
    }
}



