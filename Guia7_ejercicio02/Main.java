/*
 Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 
A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): yque le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
package Main;

import Entidad.Circunferencia;


public class Main {

    public static void main(String[] args) {
        Circunferencia nueva = new Circunferencia();
        
        nueva.crearCircunferencia();
        
        System.out.println("El area es tanto: " + nueva.area());
        
        System.out.println("El perimetro es tanto: " + nueva.perimetro());
        
        
    }
    
}
