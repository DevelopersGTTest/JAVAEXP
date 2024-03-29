/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hck.services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

import org.hck.helper.MathHelper;
/**
 *
 * @author hackobo
 */
@WebService(serviceName = "MathThingsWebService")
public class MathThingsWebService {

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
    @WebMethod(operationName = "mathOperation")
    public float mathOperation( 
            @WebParam(name = "numerOne") float numerOne, 
            @WebParam(name = "numberTwo") float numberTwo, 
            @WebParam(name = "typeOperation") String sign
    ) {
        //TODO write your implementation code here:
        MathHelper mathHelper = new MathHelper();  
        float resultOperation = mathHelper.operation(numerOne, numberTwo, sign);
        return resultOperation;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "factorial")
    public int factorial(@WebParam(name = "number") int number) {
        //TODO write your implementation code here:
        MathHelper mathHelper = new MathHelper();  
        int result = mathHelper.factorial(number);
        return result;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "multiploOfN")
    public String multiploOfN(
        @WebParam(name = "numberOne") int numberOne, 
        @WebParam(name = "numberTwo") int numberTwo
    ) {
        //TODO write your implementation code here:
        MathHelper mathHelper = new MathHelper();  
        String result = mathHelper.isMultiple(numberOne, numberTwo);
        return result;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "cuadraticFormula")
    public String cuadraticFormula(
        @WebParam(name = "a") int a, 
        @WebParam(name = "b") int b, 
        @WebParam(name = "c") int c
    ) {
        //TODO write your implementation code here:
        MathHelper mathHelper = new MathHelper();  
        String result =  mathHelper.cuadraticFormula(a, b, c);
        return  result;
    }
}
