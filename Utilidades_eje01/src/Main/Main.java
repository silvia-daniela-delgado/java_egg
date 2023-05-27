package Main;

import entidades.Cadena;

import servicios.CadenaServicio;

public class Main {

    public static void main(String[] args) {
        CadenaServicio serv = new CadenaServicio();
        Cadena c1 = new Cadena("Casa Blanca");
        serv.mostrarVocales(c1);
        serv.invertirFrase(c1);
    }
    
}
