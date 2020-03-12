/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hackobo.utils;

/**
 *
 * @author Hackobo
 */
public class Foo {
    private int idFoo;
    private String nameFoo;

    public Foo(int idFoo, String nameFoo) {
        this.idFoo = idFoo;
        this.nameFoo = nameFoo;
    }

    Foo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdFoo() {
        return idFoo;
    }

    public void setIdFoo(int idFoo) {
        this.idFoo = idFoo;
    }

    public String getNameFoo() {
        return nameFoo;
    }

    public void setNameFoo(String nameFoo) {
        this.nameFoo = nameFoo;
    }
    
    
}
