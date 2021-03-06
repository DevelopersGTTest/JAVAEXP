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
public class Catedraticos implements Serializable {
    private String nombreCatedratico;
    private String dpiCatedratico;
    private boolean estatus;

    public Catedraticos(String nombreCatedratico, String dpiCatedratico) {
        this.nombreCatedratico = nombreCatedratico;
        this.dpiCatedratico = dpiCatedratico;
        this.estatus = true;
    }

    public String getNombreCatedratico() {
        return nombreCatedratico;
    }

    public void setNombreCatedratico(String nombreCatedratico) {
        this.nombreCatedratico = nombreCatedratico;
    }

    public String getDpiCatedratico() {
        return dpiCatedratico;
    }

    public void setDpiCatedratico(String dpiCatedratico) {
        this.dpiCatedratico = dpiCatedratico;
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
