package Main;

import Service.PeliculaService;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculaService peliculaService = new PeliculaService();
        peliculaService.ejecutarOperacionesCine();
    }
    
}
