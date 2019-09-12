/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokenizer;

import java.util.Base64;

/**
 *
 * @author Hackobo
 */
public class KeyGen {
    
    private String data = "fe7U3Z8H" + "88801078" + "464748" + "ORD_33301233_1568118146745" + "000000000100" + "320"; 
    
    public void generateAlg(){
       String encoded = Base64.getEncoder().encodeToString(this.data.getBytes());
        System.out.println("el codigo es : " + encoded  );   // Outputs "SGVsbG8="
    }
    
}
