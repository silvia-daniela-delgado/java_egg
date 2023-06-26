/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Random;

/**
 *
 * @author dani.delgado
 */
public class Sala {
    private String[][] asientos;
    private Pelicula pelicula;
    private double precioEntrada;

    public Sala(Pelicula pelicula, double precioEntrada) {
        this.pelicula = pelicula;
        this.precioEntrada = precioEntrada;
        asientos = new String[8][6];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                asientos[i][j] = " ";
            }
        }
        crearAsientosAleatorios();
    }
    private void crearAsientosAleatorios(){
        Random random = new Random();
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 6; j++){
                if (random.nextBoolean()){
                    asientos[i][j] = "X";
                }
            }
        }
    }

    public boolean hayAsientoDisponible() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if (asientos[i][j].equals(" ")) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean ubicarEspectador(Espectador espectador) {
        if (espectador.getDinero() >= precioEntrada && espectador.getEdad() >= pelicula.getEdadMinima()) {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 6; j++) {
                    if (asientos[i][j].equals(" ")) {
                        asientos[i][j] = "X";
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void mostrarSala() {
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 6; j++) {
                System.out.print((char) ('A' + i) + (j + 1) + " " + asientos[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
