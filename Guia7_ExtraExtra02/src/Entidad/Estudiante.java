/*
Crea una clase "Estudiante" con las propiedades "nombre", "edad" y "nota media".
Crea un método para calcular la nota media de un grupo de estudiantes y otro para 
mostrar por pantalla los estudiantes que tienen una nota media superior.
 */
package Entidad;

import java.util.Scanner;

public class Estudiante {

    //propiedades "nombre", "edad" y "nota media"
    private String nombre;
    private int edad;
    private float notaMedia;

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    //constructor por defecto
    public Estudiante() {
    }

    //constructor con parámetros
    public Estudiante(String nombre, int edad, float notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }

    //gett
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public float getNotaMedia() {
        return notaMedia;
    }

    //sett
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }

    //método para cargar los estudiantes
    public void cargarDatos() {
        System.out.print("Nombre: ");
        nombre = read.next();
        System.out.print("Edad: ");
        edad = read.nextInt();
        System.out.print("Nota promedio: ");
        notaMedia = read.nextFloat();
        System.out.println("-----------------------------------------------------------");
    }

    //método para calcular la nota media de un grupo de estudiantes
    public void notaMediaGrupal() {
        System.out.println("===========================================================");
        System.out.println("=     P R O M E D I O S     D E L     A L U M N A D O     =");
        System.out.println("===========================================================\n");
        System.out.print("Ingrese la cantidad de estudiantes a promediar: ");
        int cantidad = read.nextInt();
        System.out.println("===========================================================");
        double mejorPromNota = 0; //variable para verificar el promedio más alto
        double promedioGeneral = 0; //variable para guardar la suma de los promedios
        Estudiante mejor = new Estudiante(); //instanciar el objeto que guarda al estudiante con mejor promedio
        //bucle para ingresar los estudiantes a evaluar
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese los datos del " + (i + 1) + "° estudiante:");
            cargarDatos(); //se llama al método que pide los datos de cada estudiante
            promedioGeneral = promedioGeneral + getNotaMedia(); //suma de los promedios que se ingresan
            //verificación para encontrar al estudiante con mejor promedio
            if (getNotaMedia() > mejorPromNota) {
                mejor.nombre = getNombre();
                mejor.edad = getEdad();
                mejor.notaMedia = getNotaMedia();
                mejorPromNota = getNotaMedia(); //actualiza con el promedio más alto con cada vuelta del bucle que ingresa al if               
                //si ingresa al if se cargan los tres atributos al objeto Estudiante que se 
                //intanció para guardar al estudiante con mejor promedio
            }
        }
        //al finalizar el bucle:
        //* se muestran los datos del mejor estudiante llamando al método pasando como parámetro el objeto Estudiante mejor
        System.out.println(mediaSuperior(mejor));
        System.out.println("");
        //* se muestra el promedio general de los estudiantes ingresados
        System.out.println("El promedio general de los estudiantes listados es " + promedioGeneral / cantidad);
        System.out.println("===========================================================");

    }

    //método para mostrar por pantalla el estudiante que tiene una nota media superior.
    //se recibe como parámetro un objeto y se muestran los datos guardados en el a través de sus getters
    public String mediaSuperior(Estudiante estudiante) {
        return "El estudiante con mejor promedio es: \n"
                + estudiante.getNombre() + " de " + estudiante.getEdad()
                + " años, con un promedio de " + estudiante.getNotaMedia();
    }
}
