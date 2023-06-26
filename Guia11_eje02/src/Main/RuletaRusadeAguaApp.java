/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruletarusadeaguaapp;

import java.util.ArrayList;
import java.util.Scanner;
import ruletarusadeaguaapp.Entidades.Juego;
import ruletarusadeaguaapp.Entidades.Jugador;
import ruletarusadeaguaapp.Entidades.RevolverAgua;

/**
 *
 * @author pc
 */
public class RuletaRusadeAguaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Jugador> jugadores = new ArrayList<>();

        // Solicitar número de jugadores al usuario (entre 1 y 6)
        int numJugadores = 0;
        Scanner read = new Scanner(System.in);
        while (numJugadores < 1 || numJugadores > 6) {
            System.out.println("Ingrese el numero de jugadores (entre 1 y 6) ");
            numJugadores = read.nextInt();
        }

        for (int i = 1; i <= numJugadores; i++) {
            jugadores.add(new Jugador(i));
        }

        RevolverAgua revolver = new RevolverAgua();
        revolver.llenarRevolver();

        Juego juego = new Juego();
        juego.llenarJuego(jugadores, revolver);
        System.out.println(" COMIENZA EL JUEGO ");
        int numronda= 0;
        
        do{
            numronda= juego.ronda(numronda, revolver);;
            
            if (numronda== 5){
                numronda =0;
                        }
        } while(juego.getJugadores().get(numronda).estaMojado()==false);

    }

}