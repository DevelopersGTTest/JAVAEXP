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

    public void generateAlg(){
       String encoded = Base64.getEncoder().encodeToString(this.data.getBytes());
        System.out.println(" hashh : " + encoded  );   // Outputs "SGVsbG8="
    }
    
}
