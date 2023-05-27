/*
Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.
 */
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicio {
    public Date leerFechaNacimiento(){
        Scanner read = new Scanner(System.in);
        System.out.println("ingrese el dia de nacimiento");
        int dia = read.nextInt();
        System.out.println("ingrese el mes de nacimiento");
        int mes = read.nextInt()-1;
        System.out.println("ingrese el año de su nacimiento");
        int anio = read.nextInt()-1900;
        return new Date(anio, mes, dia);
    }
    public int calcularDiferencia(Date fechaNacimiento, Date fechaActual){
        long milisegundosPorAnio = 1000L * 60 * 60 * 24 * 365;
        long diferenciaMilisegundos = fechaActual.getTime() - fechaNacimiento.getTime();
        int edad = (int) (diferenciaMilisegundos / milisegundosPorAnio);
        return edad;
    }
    public Persona crearPersona(){
        Scanner read = new Scanner(System.in);
        System.out.println("ingrese el nobre de la persona");
        String nombre = read.nextLine();
        //System.out.println("ingrese la fecha de nacimiento");
        Date fechaNacimiento = leerFechaNacimiento();
        return new Persona(nombre, fechaNacimiento);
    }
    public int calcularEdad(Persona persona){
        Date fechaActual = new Date();
        return calcularDiferencia(persona.getFechaNacimiento(), fechaActual);
    }
    public boolean menorQue(Persona persona, int edad){
        int edadPersona = calcularEdad(persona);
        return edadPersona < edad;
    }
    public void mostrarPersona(Persona persona){
        System.out.println("nombre" + persona.getNombre());
        System.out.println("fecha de nacimiento" + persona);
    }
}
