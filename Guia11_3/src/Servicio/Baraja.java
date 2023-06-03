package Servicio;

import Entidad.Carta;
import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author dani.delgado
 */
public class Baraja {
    private ArrayList<Carta> cartas;
    
    public Baraja() {
        cartas = new ArrayList<>();
        String[] palos = {"espadas", "bastos", "oros", "copas"};
        
        for (String palo : palos){
            for(int numero = 1; numero <= 12; numero++){
                if (numero != 8 && numero != 9){
                    cartas.add(new Carta(numero,palo));
                }
            }
        }
    }
    public void barajar() {
        Collections.shuffle(cartas);
    }
    public Carta siguienteCarta(){
        if (cartas.isEmpty()){
            System.out.println("No hay mas cartas en la baraja.");
        }
        return cartas.remove(0);
    }
    public int cartasDisponibles(){
        return cartas.size();
    }
    public ArrayList<Carta> darCartas(int cantidad){
        if (cantidad > cartas.size()){
            System.out.println("No hay sufucientes cartas disponibles.");
            return null;
        }
        ArrayList<Carta> cartasRepartidas = new ArrayList<>();
        for (int i = 0; i < cantidad; i++){
            cartasRepartidas.add(cartas.remove(0));
        }
        return cartasRepartidas;
    }
    public ArrayList<Carta> cartasMonton(){
        return cartas;
    }
    public void mostrarBaraja(){
        for (Carta carta : cartas){
            System.out.println(carta);
        }
    }
    public void realizarJuego() {
        Baraja baraja = new Baraja();
        System.out.println("Barajando las cartas...");
        baraja.barajar();

        System.out.println("Cartas disponibles: " + baraja.cartasDisponibles());

        System.out.println("Mostrando la baraja: ");
        baraja.mostrarBaraja();

        System.out.println("Siguiente carta: " + baraja.siguienteCarta());

        System.out.println("Cartas disponibles: " + baraja.cartasDisponibles());

        System.out.println("Repartiendo 5 cartas: ");

        ArrayList<Carta> cartasRepartidas = baraja.darCartas(5);
        if (cartasRepartidas != null) {
            for (Carta carta : cartasRepartidas) {
                System.out.println("Carta: " + carta);
            }

        }
        System.out.println("Cartas disponibles");
    }
}
