/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import integrador.Estudiante;

public class EstudianteServicio {
    
    public Estudiante[] crearEstudiante(){
        
        Estudiante estudiante1 = new Estudiante("Juan", 7);
        Estudiante estudiante2 = new Estudiante("María", 9);
        Estudiante estudiante3 = new Estudiante("Pedro", 6);
        Estudiante estudiante4 = new Estudiante("Lucía", 8);
        Estudiante estudiante5 = new Estudiante("Roberto", 4);
        Estudiante estudiante6 = new Estudiante("Carla", 10);
        Estudiante estudiante7 = new Estudiante("Jorge", 5);
        Estudiante estudiante8 = new Estudiante("Ana", 9);
           
        Estudiante[] estudiantes = new Estudiante[]{estudiante1, estudiante2, estudiante3, estudiante4, estudiante5, estudiante6, estudiante7, estudiante8};          
        return estudiantes;        
    }
     public double calcularPromedio(Estudiante[] estudiantes) {
        double sumaNotas = 0;
        for (Estudiante estudiante : estudiantes) {
            sumaNotas += estudiante.getNota();
        }
        return sumaNotas / estudiantes.length;
    }
     public Estudiante[] obtenerEstudiantesPorEncimaDelPromedio(Estudiante[] estudiantes) {
        double promedio = calcularPromedio(estudiantes);
        int cantidadEstudiantesEncimaDelPromedio = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                cantidadEstudiantesEncimaDelPromedio++;
            }
        } 
        Estudiante[] estudiantesEncimaDelPromedio = new Estudiante[cantidadEstudiantesEncimaDelPromedio];
        int indice = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                estudiantesEncimaDelPromedio[indice] = estudiante;
                indice++;
            }
        }
        return estudiantesEncimaDelPromedio;
    }
     public void promedio(){
        Estudiante[] estudiantes = new Estudiante[8];
        estudiantes = crearEstudiante();
        double promedio = calcularPromedio(estudiantes);
        System.out.println("Promedio de notas del curso: " + promedio);

        Estudiante[] estudiantesEncimaDelPromedio = obtenerEstudiantesPorEncimaDelPromedio(estudiantes);
        System.out.println("Estudiantes con nota por encima del promedio:");
        for (Estudiante estudiante : estudiantesEncimaDelPromedio) {
            System.out.println(estudiante);
        }

        System.out.println("Todos los estudiantes con nota por encima del promedio:");
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                System.out.println(estudiante);
            }
        } 
     }
            
}

