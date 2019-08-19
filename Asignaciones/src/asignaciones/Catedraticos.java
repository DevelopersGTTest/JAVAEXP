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
public class Catedraticos {
    private String nombreCatedratico;
    private String dpiCatedratico;

    public Catedraticos(String nombreCatedratico, String dpiCatedratico) {
        this.nombreCatedratico = nombreCatedratico;
        this.dpiCatedratico = dpiCatedratico;
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

   
    
}
