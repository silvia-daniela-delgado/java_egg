/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package Entidad;

/**
 *
 * @author Usuario
 */
//Creo el objeto con sus atributos get y set.
public class RazaPerro {
    private String nombre;
    
    public RazaPerro(String nombre){
        this.nombre = nombre;
    }

    public String getRaza() {
        return nombre;
    }

    public void setRaza(String raza) {
        this.nombre = nombre;
    }
    
    
}


