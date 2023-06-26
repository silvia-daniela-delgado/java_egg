/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Perro;
import Entidad.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dani.delgado
 */
public class ServicioAdopcion {
    private List<Persona> personas;
    private List<Perro> perros;

    public ServicioAdopcion(){
        this.personas = new ArrayList<>();
        this.perros = new ArrayList<>();
    }
    
    public void agregarPerro(Perro p){
        perros.add(p);
    }
    
    public void agregarPersona(Persona a){
        personas.add(a);
    }
    
    public void mostrarAdopciones(){
        for (Persona persona : personas){
            System.out.println(persona.getNombre() + ": " + (persona.getPerroAdoptado() != null ? persona.getPerroAdoptado().getNombre() : "Sin perro asignado"));          
        }
    }
    
    public void realizarAdopcion(){
        Scanner read = new Scanner(System.in);
        for (Persona persona : personas){
            System.out.println("Persona: " + persona.getNombre());
            System.out.println("Perros disponibles: ");
            
            for (Perro perro : perros){
                if (!perro.isAdoptado()){
                    System.out.println(perro.getNombre());
                }
            }
            
            System.out.println("Elige el perro que deseas adoptar: ");
            String nombrePerro = read.nextLine();
            
            Perro perroAdoptado = null;
            
            for (Perro perro : perros){
                if (perro.getNombre().equalsIgnoreCase(nombrePerro) && !perro.isAdoptado()){
                   perroAdoptado = perro;
                   break;
                }
            }
            
            if (perroAdoptado != null){
                persona.setPerroAdoptado(perroAdoptado);
                perroAdoptado.setAdoptado(true);
                System.out.println("Adopcion realizada con exito. \n");
            }else{
                System.out.println("El perro soleccionado no esta disponible para adopcion.\n");
            }
        }
    }
    
    
    
}
