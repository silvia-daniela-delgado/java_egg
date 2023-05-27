/*
Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases. Nosotros nos encargaremos de almacenar esta información en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el nombre de cada alumno.
Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Curso. En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos
Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro.
 */
package Servicio;

import Entidad.Curso;
import java.util.Arrays;
import java.util.Scanner;

public class CursoServicio {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    public Curso crearCurso(){
       Curso curso = new Curso();
       System.out.println("Ingresa el nombre del curso");
       curso.setNombreCurso(read.next());
       System.out.println("Ingres la cantidad de horas por día de cursado");
       curso.setCantidadHorasPorDia(read.nextInt());
       System.out.println("Ingresa la cantidad de días que se va a dictar el cursado");
       curso.setCantidadDiasPorSemana(read.nextInt());
       System.out.println("Ingrese si es turno mañana o tarde");
       curso.setTurno(read.next());
       System.out.println("Ingresa el valor de la hora del cursado");
       curso.setPrecioPorHora(read.nextInt());
       
       curso.setAlumnos(cargarAlumnos(curso.getAlumnos().length));
       return curso;
    }

    private String[] cargarAlumnos(int longitudVector) {
        String[] alumnos = new String[longitudVector];
        for (int i = 0; i < alumnos.length; i++){
            System.out.println("ingrese el nombre del alumno " + (i + 1));
            alumnos[i] = read.next();
        }
        return alumnos;
    }
    public void mostrarAlumnos(Curso curso){
        System.out.println(Arrays.toString(curso.getAlumnos()));
    }
    public void calcularGananciaSemanal(Curso curso){
        System.out.println("la ganancia semanal es de " + (curso.getCantidadDiasPorSemana() * curso.getCantidadHorasPorDia() * curso.getPrecioPorHora() * curso.getAlumnos().length));
    }
    
}
