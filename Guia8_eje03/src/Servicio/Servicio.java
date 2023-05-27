package Servicio;

import Entidad.Persona;
import java.util.Scanner;

public class Servicio {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public boolean esMayorDeEdad(Persona p1) {
        boolean edad = false;
        int cantMayorEdad = 0;
        int cantMenorEdad = 0;
        if (p1.getEdad() >= 18) {
            cantMayorEdad++;
            edad = true;
            System.out.println("es mayor");
            return edad;
        } else {
            cantMenorEdad++;
            System.out.println("es menor");
            return edad;
        }
    }

//    Metodo crearPersona():
// * el método crear persona, le pide los valores de los atributos al usuario y después se le asignan a sus respectivos atributos
// * para llenar el objeto Persona.
    public Persona CrearPersona() {
        System.out.println("ingrese nombre de la persona\n");
        String nombre = read.next();
        System.out.println("ingrese edad e la persona\n");
        int edad = read.nextInt();
        System.out.println("ingrese sexo de la persona\n");
        String sexo;
        do {
            System.out.println("ingrese un caracter\n h\n m\n o");
            sexo = read.next();

        } while (!sexo.equalsIgnoreCase("h") && !sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("o"));

        System.out.println("ingrese peso de la persona\n");
        double peso = read.nextDouble();
        System.out.println("ingrese altura de la persona\n");
        double altura = read.nextDouble();
        return new Persona(nombre, edad, sexo, peso, altura);

    }
//     Si la fórmula da por resultado un número entre 20 y 25 (incluidos), 
//significa que la persona está en su peso ideal y la función devuelve un 0. Finalmente, 
//si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
//A continuación, en la clase main hacer lo siguiente:

    public int CalcularIMC(Persona gente) {
        double PesoIdeal = gente.getPeso() / (Math.pow(gente.getAltura(), 2));
        int bajoPeso = 0;
        int pesoIdeal1 = 0;
        int sobrePeso = 0;
        
        if (PesoIdeal < 20) { 
            bajoPeso++;
            return -1;
        } else if (PesoIdeal > 20 && PesoIdeal < 25) { 
            pesoIdeal1++;
            return 0;
        } else if (PesoIdeal > 25) { 
            sobrePeso++;
            return 1;
        }
        return 0;
       
    }
    public double porcentajeMayorEdad(Persona p1){
       double porcentaje1; 
       porcentaje1=(p1.cantMayorEdad*100)/p1.getEdad(); 
       return porcentaje1;
    }
    public double porcentajeMenorEdad(Persona p1){
       double porcentaje2;
       porcentaje2=(p1.cantMenorEdad*100)/p1.getEdad();
       return porcentaje2;
    }
    public double porcentajeBajoPeso(Persona gente){
        double porcentaje3;
        porcentaje3=(gente.sobrePeso*100)/gente.getPeso();
        return porcentaje3;
    }
    public double porcentajePesoNormal(Persona gente){
        double porcentaje4;
        porcentaje4=(gente.pesoIdeal1*100)/gente.getPeso();
        return porcentaje4;
    }
    public double porcentajeSobrepeso(Persona gente){
        double porcentaje5;
        porcentaje5=(gente.sobrePeso*100)/gente.getPeso();
        return porcentaje5;
    }
}

