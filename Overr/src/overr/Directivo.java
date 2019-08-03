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
public class Directivo extends Empleado {
    
    Directivo direc = new Directivo();
    
    @Override
    public String toString(){
        return "this directivo";
    }
    
    public  void showDirectivo(){
        System.out.println(direc.toString()) ;
    }
    
}
