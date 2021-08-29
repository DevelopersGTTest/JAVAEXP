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
    
    public  float operation(float numberOne, float numberTwo, String type ) {
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
}
