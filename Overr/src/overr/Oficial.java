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
public class Oficial extends Operario {
    
    Oficial oficial = new Oficial();
   
    @Override
    public String toString(){
        return " this is oficial toString ";
    }
    
    public void showOficial(){
        System.out.println( oficial.toString() );
    }
    
}
