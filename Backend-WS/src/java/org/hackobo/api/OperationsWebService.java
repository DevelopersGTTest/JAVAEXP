/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hackobo.api;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.hackobo.dao.OperationDao;

/**
 *
 * @author Pablo Jacobo
 */
@WebService(serviceName = "OperationsWebService")
public class OperationsWebService {
    //setting dao config
    private OperationDao operationDao = new OperationDao();
    private float resultDao; 
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "sumaNumbers")
    public float sumaNumbers(
        @WebParam(name = "n1") String n1, 
        @WebParam(name = "n2") String n2
    ){
        this.resultDao = this.operationDao
            .sumaNumbers( Float.parseFloat(n1) , Float.parseFloat(n2));
        return  this.resultDao;
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "restaNumbers")
    public float restaNumbers(
        @WebParam(name = "n1") String n1, 
        @WebParam(name = "n2") String n2
    ){
        this.resultDao = this.operationDao
            .restaNumbers(Float.parseFloat(n1) , Float.parseFloat(n2));
        return  this.resultDao;
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "divisionNumbers")
    public float divisionNumbers(
        @WebParam(name = "n1") String n1, 
        @WebParam(name = "n2") String n2
    ){
        this.resultDao = this.operationDao
            .divisionNumbers(Float.parseFloat(n1) , Float.parseFloat(n2));
        return  this.resultDao;
    }
    
     /**
     * Web service operation
     */
    @WebMethod(operationName = "multiNumbers")
    public float multiNumbers(
        @WebParam(name = "n1") String n1, 
        @WebParam(name = "n2") String n2
    ){
        this.resultDao = this.operationDao
            .multiNumbers(Float.parseFloat(n1) , Float.parseFloat(n2));
        return  this.resultDao;
    }

    
}
