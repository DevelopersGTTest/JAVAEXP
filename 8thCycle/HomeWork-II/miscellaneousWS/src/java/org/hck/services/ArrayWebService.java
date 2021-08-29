/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hck.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

import org.hck.mock.ElementsMock;
/**
 *
 * @author 50241
 */
@WebService(serviceName = "ArrayWebService")
public class ArrayWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findElement")
    public String findElement(
        @WebParam(name = "elementName") String elementName
    ) {
        //TODO write your implementation code here:
        ElementsMock words = new ElementsMock();
        Optional<String> findWord = words.elements()
            .stream()
            .filter( e -> e.equals( elementName))
            .findFirst();
                
        return (findWord.isPresent()) 
            ? " elemento encontrado " 
            : "elemento NO encontrado";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "startAtLetter")
    public List<String> startAtLetter(
        @WebParam(name = "letter") String letter
    ) {
        //TODO write your implementation code here:
        ElementsMock words = new ElementsMock();
        List<String> matchedWordsStartAt = words.elements()
            .stream()
            .filter( e -> e.startsWith(letter))
            .collect(Collectors.toList());
        
        return  matchedWordsStartAt;
    }
    
    
    
}
