/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioprueba;

/**
 *
 * @author Hackobo
 */
public class Alumno extends Persona {
   private String carnet;

   public Alumno(){}
   
    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    @Override
    public String toString() {
        return "Alumno{" + "carnet=" + carnet + '}';
    }
       
}
