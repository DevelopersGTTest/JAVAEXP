/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hackobo.dao;
import org.hackobo.interfaces.OperationInterface;

/**
 *
 * @author Pablo Jacobo
 */
public class OperationDao implements  OperationInterface {
    
    private float resultOperation;
    
    @Override
    public float sumaNumbers(float n1, float n2) {
        this.resultOperation = n1 + n2;
        return this.resultOperation;
    }

    @Override
    public float restaNumbers(float n1, float n2) {
        this.resultOperation = n1 - n2;
        return this.resultOperation;
    }

    @Override
    public float divisionNumbers(float n1, float n2) {
        this.resultOperation = n1 / n2;
        return this.resultOperation;
    }

    @Override
    public float multiNumbers(float n1, float n2) {
        this.resultOperation = n1 * n2;
        return this.resultOperation;
    }
    
    
    
}
