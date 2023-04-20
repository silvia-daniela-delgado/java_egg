package circulito;

import Entidad.Circunferencia;


public class Circulito {

  
    public static void main(String[] args) {
       Circunferencia c1 = new Circunferencia();
       c1.crearCircunferencia();
       System.out.println("el area es; " + c1.calcularArea() + " y el perimetro es de: " + c1.calcularPerimetro());
    }
    
}