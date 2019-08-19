/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignaciones;

/**
 *
 * @author Hackobo
 */
public class Cursos {
    private String nombreCurso;
    private boolean estatus;
            
    public Cursos(String nombreCurso) {
        this.nombreCurso = nombreCurso;
        this.estatus = true;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
    
       public boolean isEstatus() {
        if(estatus == true ){
            System.out.println("[---Activo---]");
        }else{
            System.out.println("[---Inactivo----]");
        }
        return estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }
    
    
}
