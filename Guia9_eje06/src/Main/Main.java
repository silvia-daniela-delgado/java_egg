
package Main;

import Entidad.Curso;
import Servicio.CursoServicio;

public class Main {

    public static void main(String[] args) {
       CursoServicio cs = new CursoServicio();
       Curso curso = cs.crearCurso();
        cs.mostrarAlumnos(curso);
        cs.calcularGananciaSemanal(curso);
    }
    
}
