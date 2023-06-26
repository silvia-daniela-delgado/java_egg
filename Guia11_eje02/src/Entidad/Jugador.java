/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruletarusadeaguaapp.Entidades;

/**
 *
 * @author pc
 */
public class Jugador {
    private final int id;
    private final String nombre;
    private boolean mojado;

    public Jugador(int id) {
        this.id = id;
        this.nombre = "jugador " + id;
        this.mojado = false;
    }
    public boolean disparo(RevolverAgua r){
        if (r.mojar()){
            // System.out.println(" if disparo  se mojo");
            mojado = true;
           
            return true;
        }else{
             //System.out.println(" else disparo ");
            //r.siguienteChorro();
            return false;
        }
    }
    public boolean estaMojado(){
        return mojado;
    }
    public String toString(){
        return nombre ;
    }
    
}
