package Servicio;

import Entidad.RazaPerro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class RazaPerroServicio {
    //instancio en ArrarList.
    private List<RazaPerro> razasPerros = new ArrayList<>();
    //Metodo para agregar la raza.
    public void agregarRazaPerro(RazaPerro razaPerro){
        razasPerros.add(razaPerro);
    }
    //Metodo para obtener las razas.
    public List<RazaPerro> obtenerRazasPerros(){
        return razasPerros;
    }
    //Metodo para guardar las razas en el ArrayList.
    public void guardarRazasPerros(ArrayList<RazaPerro> razasPerros){
        for (RazaPerro razaPerro : razasPerros){
            agregarRazaPerro(razaPerro);
        }
    }
    //Metodo para guardar el nombre de la raza
    public void guardarRazaPerro(String nombreRaza) {
        agregarRazaPerro(new RazaPerro(nombreRaza));
    }
    //Metodo para leer la raza que se introdusca por teclado.
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
    //Metodo para mostrar el ArryaList.
    public void mostrarRazasPerros(){
        List<RazaPerro> razasPerros = obtenerRazasPerros();
        System.out.println("Razas de perros guardadas");
        for (RazaPerro razaPerro : razasPerros){
            System.out.println(razaPerro.getRaza());
        }
    }
    //Metodo para eliminar raza.
    public void eliminarPerro(String nombrePerro) {
        Iterator<RazaPerro> iterator = razasPerros.iterator();
        while (iterator.hasNext()){
            RazaPerro razaPerro = iterator.next();
            if (razaPerro.getRaza().equalsIgnoreCase(nombrePerro)){
              iterator.remove();
            }
        }
    }
    //Metodo que guarda todos los metodos para llamarlo y ejecutarlo desde el main.
    public void ejecutar(){ 
        leerRazasPerros();
        mostrarRazasPerros();
        
        Scanner read  = new Scanner(System.in);
        System.out.println("Ingrese el nombre del perro a eliminar");
        String nombrePerro = read.nextLine();
        eliminarPerro(nombrePerro);
        Collections.sort(razasPerros, Comparator.comparing(RazaPerro::getRaza));
        mostrarRazasPerros();
    }
    
}
