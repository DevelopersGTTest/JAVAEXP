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
public class Overr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Call a methods
        Empleado emp = new Empleado();
        emp.setNombre("linus torvalds");
        System.out.println(emp);
        
        Directivo dir = new Directivo();
        System.out.println(dir);
        
    }
    
    
}
