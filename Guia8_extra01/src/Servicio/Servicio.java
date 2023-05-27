/*
Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.
Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en que se tenga una única solución posible.
Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
 */
package Servicio;

import Entidad.Raices;
import java.util.Scanner;

public class Servicio {
    Scanner read = new Scanner(System.in);
    public Raices crearFuncion(){
        System.out.println("ingrese el valor de a");
        int a = read.nextInt();
        System.out.println("ingrese el valor de b");
        int b = read.nextInt();
        System.out.println("ingrese el valor de c");
        int c = read.nextInt();
        return new Raices(a,b,c);
    }
    public double getDiscriminante(Raices r1){
        return Math.pow(r1.getB(),2)- 4*r1.getA()*r1.getC();
    }
    public boolean tieneRaices(Raices r1){
        if (getDiscriminante(r1)>=0){
            return true;
        }else{
            return false;
        }
    }
    public boolean tieneRaiz(Raices r1){
        if (getDiscriminante(r1)==0){
            return true;
        }else{
            return false;
        }
    }
    public void  obtenerRaices(Raices r1){
        if (tieneRaices(r1)== true){
            System.out.println("la primer raiz es: " + (-r1.getB()+(Math.sqrt(getDiscriminante(r1))))/(2*r1.getA()));
            System.out.println("la segunda raiz es: " + (-r1.getB()-(Math.sqrt(getDiscriminante(r1))))/(2*r1.getA()));
        }
    
    }
    public void obtenerRaiz(Raices r1){
      if (tieneRaiz(r1) == true){
          System.out.println("la raiz es: " + (-r1.getB())/(2*r1.getA()));
      } 
    }
    public void calcular(Raices r1){
        if (tieneRaices(r1)== true && (tieneRaiz(r1)== true)){
           obtenerRaiz(r1);
        }else if (tieneRaices(r1) == true && (tieneRaiz(r1) == false)){
           obtenerRaices(r1);
           System.out.println("esta curba nunca toca el eje x");
        }
    }
    
}
