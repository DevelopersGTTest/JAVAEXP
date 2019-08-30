/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignaciones;

import java.io.Serializable;

/**
 *
 * @author Hackobo
 */
public class Asign implements Serializable  {
    private Alumnos alumnos;
    private Catedraticos catedraticos;
    private Cursos cursos;
    private  int idAlgo;

    public Asign(Alumnos alumnos, Catedraticos catedraticos, Cursos cursos) {
        this.alumnos = alumnos;
        this.catedraticos = catedraticos;
        this.cursos = cursos;
    }
    
    public Asign(int id){
        this.idAlgo = id;
    }
    
    
    public int getIdAlgo() {
        return idAlgo;
    }

    public void setIdAlgo(int idAlgo) {
        this.idAlgo = idAlgo;
    }

    public Alumnos getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumnos alumnos) {
        this.alumnos = alumnos;
    }

    public Catedraticos getCatedraticos() {
        return catedraticos;
    }

    public void setCatedraticos(Catedraticos catedraticos) {
        this.catedraticos = catedraticos;
    }

    public Cursos getCursos() {
        return cursos;
    }

    public void setCursos(Cursos cursos) {
        this.cursos = cursos;
    }
 
}
