/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1pablojacobo;

/**
 *
 * @author Hackobo
 */
public class TipoA extends Electrodomestico {
    private String nombreTipo;

    public TipoA(String nombre, int cantidad, int precio) {
        super(nombre, cantidad, precio);
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }
      
}
