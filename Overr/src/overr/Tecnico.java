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
public class Tecnico extends Operario {
    
    Tecnico tecnico = new Tecnico();
    
    @Override
    public String toString(){
        return "this is tecnico";
    }
    
    public void showTecnico(){
        System.out.println( tecnico.toString() );
    }
    
}
