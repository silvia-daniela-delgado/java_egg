/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author dani.delgado
 */
public class Persona {
    private String nombre;
    private Perro perroAdoptado;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.perroAdoptado = perroAdoptado;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public Perro getPerroAdoptado(){
        return perroAdoptado;
    }
    
    public void setPerroAdoptado(Perro perro){
        this.perroAdoptado = perro;
    }
}
