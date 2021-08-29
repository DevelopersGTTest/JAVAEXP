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
        return "epic...";
    }
    
}
