
package Main;

import Entidad.Persona;
import Servicio.PersonaServicio;

public class Main {

    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();
        Persona persona = ps.crearPersona();
        
        int edad = ps.calcularEdad(persona);
        System.out.println(" la edad de " + persona.getNombre() + " es " + edad + " años ");
        
        int edadComparar = 30;
        boolean esMenor = ps.menorQue(persona, edadComparar);
        System.out.println(persona.getNombre() + (esMenor ? " es  " : " no es") + " menor que " + edadComparar + " años ");
        System.out.println("informacion de la persona");
        ps.mostrarPersona(persona);
    }
    
}
