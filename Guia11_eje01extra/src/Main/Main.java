/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.Perro;
import Entidad.Persona;
import Service.ServicioAdopcion;

/**
 *
 * @author dani.delgado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioAdopcion servicioAdopcion = new ServicioAdopcion();

        Perro perro1 = new Perro("Tobby");
        Perro perro2 = new Perro("Rocky");
        Perro perro3 = new Perro("Max");

        // Agregar perros al servicio de adopción
        servicioAdopcion.agregarPerro(perro1);
        servicioAdopcion.agregarPerro(perro2);
        servicioAdopcion.agregarPerro(perro3);

        // Crear personas
        Persona persona1 = new Persona("Juan");
        Persona persona2 = new Persona("María");
        Persona persona3 = new Persona("Pedro");

        // Agregar personas al servicio de adopción
        servicioAdopcion.agregarPersona(persona1);
        servicioAdopcion.agregarPersona(persona2);
        servicioAdopcion.agregarPersona(persona3);

        // Realizar adopciones
        servicioAdopcion.realizarAdopcion();

        // Mostrar adopciones realizadas
        System.out.println("Adopciones realizadas:");
        servicioAdopcion.mostrarAdopciones();
    }
}


