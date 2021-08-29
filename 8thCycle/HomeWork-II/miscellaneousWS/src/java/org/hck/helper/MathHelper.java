/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hck.helper;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author hackobo
 */
public class MathHelper {
    
   /**
     * Process operation
     *
     * @param numberOne the entity to save
     * @param numberTwo the entity to save
     * @return value entity
     */
    public float operation(float numberOne, float numberTwo, String type ) {
        Map<String, Object> map = new HashMap<String, Object>();
        
        map.put("+", ( numberOne + numberTwo ));
        map.put("-", ( numberOne - numberTwo ));
        map.put("/", ( numberOne / numberTwo ));
        map.put("*", ( numberOne * numberTwo ));
       
        float result = Float.parseFloat( map.get(type).toString());
        return result;
    }
    
    /**
     * Factorial
     *
     * @param number to get factorial
     * @return factorial number
     */
    public int factorial(int number ) {
        int factorial = 1;
        for (int j = 1; j <= number; j++ ) {
            factorial *= j;
        }
        return factorial;
    }
    
    /**
     * multiple of n
     * @param numberOne selected
     * @param numberTwo selected
     * @return isMultiple
     */
    public String isMultiple(int numberOne, int numberTwo) {
        int remainder = numberOne % numberTwo;
        String response = "";
        if (remainder == 0){
            //numberOne is a multiple of numberTwo
            response =  numberOne + " es multiplo de " + numberTwo;
        } else {
            //numberOne is not a multiple of numberTwo
             response =  numberOne + " no es multiplo de " + numberTwo;
        }
        return response;
    }
    
    /**
     * multiple of n
     * @param a selected
     * @param b selected
     * @param c selected
     * @return result formula
     */
    public String cuadraticFormula(float a, float b, float c) {
        double x1, x2, vPown = 0 ;
         
        vPown = Math.pow(b,2) - (4 * a *c);
        x1 = (-b - Math.sqrt(vPown)/ 2*a);
	x2 = (-b + Math.sqrt(vPown)/ 2*a);
 
        return " resultado: " + " x1 = " + x1 + " x2 = " + x2;
    }
    
}
