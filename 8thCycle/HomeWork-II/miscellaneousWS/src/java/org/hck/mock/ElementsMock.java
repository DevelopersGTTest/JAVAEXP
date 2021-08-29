/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hck.mock;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author 50241
 */
public class ElementsMock {
    
    public List<String> elements() {
        List<String> items = Arrays
            .asList("arbol", "semaforo", "lima", "persona", 
            "gato", "perro", "java", "celular", "macbook m1", "iphone", 
            "bateria", "carro", "avion", "jet", "kubernetes", 
            "docker", "jenkins",  "verano", "invierno" 
        );
        return items;
    }
    
}
