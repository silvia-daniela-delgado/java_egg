/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruletarusadeaguaapp.Entidades;

import java.util.Random;

/**
 *
 * @author pc
 */
public class RevolverAgua {
     private int posicionActual;
    private int posicionAgua;
    
    public void llenarRevolver(){
         //System.out.println(" nuevo random ");
        Random random = new Random();
        // Genera un número aleatorio entre 1 y 6
         //System.out.println(" set posicionActual llenar revolver ");
        posicionActual = random.nextInt(6) + 1; 
         //System.out.println(" set posicionAgua llenarRevolver");
        posicionAgua = random.nextInt(6) + 1;
    }
    public boolean mojar(){
        // System.out.println(" mojar()  compara posicion actual y posicion agua " +  posicionActual + " "+ posicionAgua );
        return posicionActual == posicionAgua;
    }
    public void siguienteChorro(){
         //System.out.println(" siguientechorro ");
        posicionActual = (posicionActual % 6) + 1;
    }
    public String toString(){
        return "Posicion actual: " + posicionActual + "Posicion del agua: " + posicionAgua;
    }
}
