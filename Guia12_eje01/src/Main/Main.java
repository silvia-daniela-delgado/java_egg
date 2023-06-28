/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;

/**
 *
 * @author dani.delgado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal animal = new Animal("Animal generico", "alimento generico", 5, "raza generica");
        Perro perro = new Perro("Bobby", "croquetas", 3, "Labrador");
        Gato gato = new Gato("Garfield", "pescado", 4, "Persa");
        Caballo caballo = new Caballo("Spark", "pasto", 7, "Pura Sangre");
        
        animal.alimentarse();
        perro.alimentarse();
        gato.alimentarse();
        caballo.alimentarse();
    }
    
}
