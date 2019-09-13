/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokenizer;

/**
 *
 * @author Hackobo
 */
public class Tokenizer {
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Outputs "SGVsbG8="
        KeyGen k = new KeyGen();
        k.generateAlg();
    }
    
}
