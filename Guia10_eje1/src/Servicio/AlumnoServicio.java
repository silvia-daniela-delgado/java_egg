/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AlumnoServicio {
    private List<Alumno> listaAlumnos;
    public AlumnoServicio(){
        listaAlumnos = new ArrayList<>();
       
    }
    public void crearAlumnos(){
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de alumnosa ingresar: ");
        int cantAlumnos = read.nextInt();
        for (int i = 0; i < cantAlumnos; i++) {
            System.out.println("Ingrese el nombre del alumno: ");
            String nombre = read.next();
            
            ArrayList<Integer> notas = new ArrayList<>();
            for (int j = 1; j <= 3; j++){
                System.out.println("Ingrese la nota " + j + " del alumno: ");
                int nota = read.nextInt();
                notas.add(nota);
            }
            Alumno alumno = new Alumno(nombre, notas);
            listaAlumnos.add(alumno);
        }    
    }
    public double notaFinal(String nombreAlumno){
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombreAlumno)){
                List<Integer> notas = alumno.getNotas();
                double suma = 0;
                for (double nota : notas){
                    suma += nota;
                }
                return suma / notas.size();
            }
        }
        return -1;
    }
    public void ejecutarServicio(){
        crearAlumnos();
        
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese en nombre del alumno para calcular la nota ");
        String nombreAlumno = read.next();
        double notaFinal = notaFinal(nombreAlumno);
        if (notaFinal >= 0){
            System.out.println("La nota final de " + nombreAlumno + "es: " + notaFinal);
        }else {
            System.out.println("No se encontro el alumno en la lista");
        }
    }
}
