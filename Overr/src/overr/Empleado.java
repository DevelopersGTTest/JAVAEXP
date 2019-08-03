/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overr;

/**
 *
 * @author Hackobo
 */
public class Empleado {
   
    private String nombre;
        
    @Override
    public String toString(){
        return "the value of this class is " + this.nombre;
    }
    
  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
