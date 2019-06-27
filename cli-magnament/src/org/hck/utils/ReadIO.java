/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hck.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hackobo
 */
public class ReadIO {
    private static ReadIO instance;
    
    public static ReadIO getInstance(){
        if( instance == null){
            instance = new ReadIO();
        }
        return instance;
    }
   
    public String IOData(){
        String term = null;
        
        BufferedReader _read = new BufferedReader
            (new InputStreamReader(System.in));
        
        try {
            term = _read.readLine();
        } catch (IOException ex) {
            Logger.getLogger(ReadIO.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        
        return term;   
    }
}
