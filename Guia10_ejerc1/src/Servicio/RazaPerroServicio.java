
package Servicio;

import Entidad.RazaPerro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class RazaPerroServicio {
    private List<RazaPerro> razasPerros = new ArrayList<>();
    
    public void agregarRazaPerro(RazaPerro razaPerro){
        razasPerros.add(razaPerro);
    }
    public List<RazaPerro> obtenerRazasPerros(){
        return razasPerros;
    }
    public void guardarRazasPerros(ArrayList<RazaPerro> razasPerros){
        for (RazaPerro razaPerro : razasPerros){
            agregarRazaPerro(razaPerro);
        }
    }
    public void guardarRazaPerro(String nombreRaza) {
        agregarRazaPerro(new RazaPerro(nombreRaza));
    }

    public void leerRazasPerros(){
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        boolean continuar = true;
        while (continuar) {
            System.out.print("Ingrese el nombre de la raza del perro: ");
            String nombreRaza = read.next();
            guardarRazaPerro(nombreRaza);
            System.out.print("¿Desea ingresar otra raza de perro? (si/no): ");
            String opcion = read.next();
            if (!opcion.equalsIgnoreCase("si")) {
                continuar = false;
            }
        }    
    }
    public void mostrarRazasPerros(){
        List<RazaPerro> razasPerros = obtenerRazasPerros();
        System.out.println("Razas de perros guardadas");
        for (RazaPerro razaPerro : razasPerros){
            System.out.println(razaPerro.getRaza());
        }
    }
    public void ejecutar(){
        
        leerRazasPerros();
        mostrarRazasPerros();
    }
    
}
