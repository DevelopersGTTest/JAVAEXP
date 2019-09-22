/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pablojacobo.beans;

/**
 *
 * @author Hackobo
 */
public class Operations {
    private static Operations instance;
    private int resultado = 0;
    
    public static Operations getInstance(){
        if( instance == null ){
            instance = new Operations();
        }
        return instance;
    }
    
    
    //suma
    public int sumar(int a, int b ){
        this.resultado = a + b;
        return this.resultado;
    }
    //resta
    public int restar(int a, int b ){
        this.resultado = a - b;
        return this.resultado;
    }
    //multiplicacion
    public int multiplicar(int a, int b ){
        this.resultado = a * b;
        return this.resultado;
    }
    //division
    public int dividir(int a, int b ){
        this.resultado = a / b;
        return this.resultado;
    }
    
   
}

