package Servicio;

import Entidad.Perro;
import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author dani.delgado
 */
public class PerroService {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    public Perro crearPerro(){
        System.out.println("Ingrese el nombre del perro: ");
        String nombre = read.next();
        System.out.println("Ingrese la raza del perro: ");
        String raza = read.next();
        System.out.println("Ingrese la edad del perro:");
        int edad = read.nextInt();
        System.out.println("Ingrese el tamaño del perro: ");
        String tamaño = read.next();
        return new Perro(nombre, raza, edad, tamaño);
    }
    public Persona crearPersona(){
        System.out.println("Ingrese el nombre de la persona: ");
        String nombre = read.next();
        System.out.println("Ingrese el apellido de la persona: ");
        String apellido = read.next();
        System.out.println("Ingrese la edad de la persona: ");
        int edad = read.nextInt();
        System.out.println("Ingrese el documento de la persona: ");
        String documento = read.next();
        return new Persona(nombre, apellido, edad, documento);
    }
    
    public void asignarPerro(Persona persona, Perro perro){
        persona.setPerro(perro);
    }
    public void mostrarInformacion(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Documento: " + persona.getDocumento());
        Perro perro = persona.getPerro();
        if (perro != null) {
            System.out.println("--- Información del perro ---");
            System.out.println("Nombre del perro: " + perro.getNombre());
            System.out.println("Raza del perro: " + perro.getRaza());
            System.out.println("Edad del perro: " + perro.getEdad());
            System.out.println("Tamaño del perro: " + perro.getTamaño());
        }
    }
    
}
