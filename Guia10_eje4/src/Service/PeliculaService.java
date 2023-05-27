package Service;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PeliculaService {
    private List<Pelicula> listaPeliculas;
    
    public PeliculaService(){
        listaPeliculas = new ArrayList<>();
    }
    public void cargarPeliculas(){
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        boolean cargarOtraPelicula = true;
        while (cargarOtraPelicula){
            System.out.println("Ingrese el titulo de la pelicula: ");
            String titulo = read.next();
            System.out.println("Ingrese el director de la pelicula: ");
            String director = read.next();
            System.out.println("Ingrese la duracion de la pelicula en horas: ");
            int duracion = read.nextInt();
            Pelicula pelicula = new Pelicula(titulo, director,duracion);
            listaPeliculas.add(pelicula);
            System.out.println("¡Desea cargar otra pelicula? (si/no)");
            String opcion = read.next();
            
            if (opcion.equalsIgnoreCase("no")){
                cargarOtraPelicula = false;
            }   
        }
    }
    public void mostrarTodasLasPeliculas(){
        System.out.println("Listado de todas las peliculas: ");
        for (Pelicula pelicula : listaPeliculas){
            System.out.println(pelicula.getTitulo() + " - Director: " + pelicula.getDirector()
            + " - Duracion: " + pelicula.getDuracion() + "horas" );   
        }
    }
    public void mostrarPeliculasMayorAunaHora(){
        System.out.println(" Listado de peliculas con duracion mayor a 1 hora: ");
        for (Pelicula pelicula : listaPeliculas){
            if (pelicula.getDuracion() > 1){
                System.out.println(pelicula.getTitulo() + " - Director: " + pelicula.getDirector()
                + " - Duracion: " + pelicula.getDuracion() + " horas ");
            }
        }
    }
    public void ordenarPeliculasPorDuracionMayorMenor(){
        System.out.println(" Listado de peliculas ordenadas por duracion (de mayor a menor: ");
        Collections.sort(listaPeliculas, Comparator.comparingInt(Pelicula::getDuracion).reversed());
        for (Pelicula pelicula : listaPeliculas){
            System.out.println(pelicula.getTitulo() + " - Director: " + pelicula.getDirector()
            + " - Duracion: " + pelicula.getDuracion() + " horas");
        }
    }
    public void ordenarPeliculasPorDuracionMenorMayor(){
        System.out.println(" Listado de peliculas ordenadas por duracion (de menor a mayor) ");
        Collections.sort(listaPeliculas, Comparator.comparingInt(Pelicula::getDuracion));
        for (Pelicula pelicula : listaPeliculas){
            System.out.println(pelicula.getTitulo() + " - Director: " + pelicula.getDirector()
            + " - Duracion: " + pelicula.getDuracion() + " horas ");
        }
    }
    public void ordenarPeliculasPorTituloAlfabeticamente(){
        System.out.println(" Listado de peliculas ordenadas por titulo (alfabeticamente): ");
        Collections.sort(listaPeliculas, Comparator.comparing(Pelicula::getTitulo));
        for (Pelicula pelicula : listaPeliculas){
            System.out.println(pelicula.getTitulo() + " - Director: " + pelicula.getDirector()
            + " - Duracion: " + pelicula.getDuracion() + " horas ");
        }
    }
    public void ordenarPeliculasPorDirectorAlfabeticamente(){
        System.out.println(" Listado de peliculas ordenadas por director (alfabeticamente): ");
        Collections.sort(listaPeliculas, Comparator.comparing(Pelicula::getDirector));
        for (Pelicula pelicula : listaPeliculas){
            System.out.println(pelicula.getTitulo() + " - Director: " + pelicula.getDirector()
                    + " - Duracion: " + pelicula.getDuracion() + " horas ");
        }
    }
    public void ejecutarOperacionesCine(){
        cargarPeliculas();
        mostrarTodasLasPeliculas();
        mostrarPeliculasMayorAunaHora();
        ordenarPeliculasPorDuracionMayorMenor();
        ordenarPeliculasPorDuracionMenorMayor();
        ordenarPeliculasPorTituloAlfabeticamente();
        ordenarPeliculasPorDirectorAlfabeticamente();
    }
}
