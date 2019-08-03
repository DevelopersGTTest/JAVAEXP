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
public class Operario extends Empleado {
    
    Operario operario = new Operario();
    
    @Override
    public String toString(){
        return "this operario";
    }
    
    public void showOperario(){
        System.out.println( operario.toString() );
    }
    
    
}
