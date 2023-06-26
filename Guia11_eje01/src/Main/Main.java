package Main;

import Entidad.Perro;
import Entidad.Persona;
import Servicio.PerroService;
import java.util.ArrayList;

/**
 *
 * @author dani.delgado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear instancia de Servicio
        PerroService servicio = new PerroService();

        // Crear ArrayList para almacenar personas y perros
        ArrayList<Persona> personas = new ArrayList<>();
        ArrayList<Perro> perros = new ArrayList<>();

        // Crear personas y perros utilizando el servicio
        int cantidad = 2; // Cantidad de personas y perros a ingresar
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese los datos de la persona " + (i + 1) + ":");
            Persona persona = servicio.crearPersona();
            personas.add(persona);

            System.out.println("Ingrese los datos del perro " + (i + 1) + ":");
            Perro perro = servicio.crearPerro();
            perros.add(perro);

            System.out.println();
        }

        // Asignar perros a las personas utilizando el servicio
        for (int i = 0; i < cantidad; i++) {
            servicio.asignarPerro(personas.get(i), perros.get(i));
        }

        // Mostrar información de las personas y sus perros utilizando el servicio
        for (Persona persona : personas) {
            servicio.mostrarInformacion(persona);
            System.out.println();
        }
    }
}
    
