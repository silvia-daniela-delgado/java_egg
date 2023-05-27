/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package Entidad;



/**
 *
 * @author Usuario
 */
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
