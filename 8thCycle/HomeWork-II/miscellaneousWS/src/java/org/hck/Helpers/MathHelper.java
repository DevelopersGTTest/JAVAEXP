/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hck.Helpers;

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
        float result = 0;
        
        switch( type ) {
            case "+":
                result = numberOne + numberTwo;
            break;
            case "-":
                result = numberOne - numberTwo;
            break;
            case "/":
                result = numberOne / numberTwo;
            break;
            case "*":
                result = numberOne * numberTwo;
            default:
                System.out.println("bad operation");
        }
        
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
    
}
