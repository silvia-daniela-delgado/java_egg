/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.List;

/**
 *
 * @author dani.delgado
 */
public class Voto {
    private Alumno alumno;
    private List<Alumno> votos;

    public Voto(Alumno alumno, List<Alumno> votos) {
        this.alumno = alumno;
        this.votos = votos;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public List<Alumno> getVotos() {
        return votos;
    }
}
