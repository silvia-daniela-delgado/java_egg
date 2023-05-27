
package Main;

import FechaServicio.FechaServicio;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        FechaServicio fechaServicio = new FechaServicio();

        // Obtener la fecha de nacimiento del usuario
        Date fechaNacimiento = fechaServicio.fechaNacimiento();

        // Obtener la fecha actual
        Date fechaActual = fechaServicio.fechaActual();

        // Calcular la diferencia de años (edad del usuario)
        int edad = fechaServicio.diferencia(fechaNacimiento, fechaActual);

        System.out.println("Tu edad es: " + edad + " años");
    }
}
    
