/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruletarusadeaguaapp.Entidades;

import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class Juego {
    
    private ArrayList<Jugador> jugadores;
    private RevolverAgua revolver;
    private int jugador1;

    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverAgua revolver) {
        // System.out.println(" llenar juego ");
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public int ronda(int numronda, RevolverAgua r) {
         //System.out.println(" inicia ronda ");
        int numJugadores = jugadores.size();
        int jugadorActual = numronda;
         //System.out.println(" LLEGA AL BUCLE IF-ELSE ");
        if (jugadores.get(jugadorActual).disparo(revolver)) {
           //  System.out.println(" entro al if ");

            System.out.println("¡Se mojó " + jugadores.get(jugadorActual) + "!");
            System.out.println(" FIN DEL JUEGO");
        } else {
             System.out.println("el  " + jugadores.get(jugadorActual) + " no se mojo!");
            System.out.println(" el siguiente es el turno de  " +jugadores.get(jugadorActual+1) );
             
             {
            jugadorActual=((jugadorActual+1)%numJugadores);
            }
        }
        r.siguienteChorro();
     /*
    while(jugadorActual!= 0 && !jugadores.get(jugadorActual).disparo(revolver)){
        
       
        
        
        
         System.out.println(" dentro del while  ");
             jugadorActual = (jugadorActual + 1) % numJugadores;
             System.out.println(" fin de while ");
    }*/
     
    return jugadorActual;
    }


    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverAgua revolver) {
        this.revolver = revolver;
    }

    public int getJugador1() {
        return jugador1;
    }

    public void setJugador1(int jugador1) {
        this.jugador1 = jugador1;
    }

    public Juego() {
    }
}
