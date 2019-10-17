/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hackobo.beans;

/**
 *
 * @author Hackobo
 */
public class Foo {
    private String fname;
    private String lname;
    private int age;
    //Data type Object{}
    Foo next;

    public Foo(String fname, String lname, int age, Foo next) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.next = next;
    }
    
    public Foo(){}

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Foo getNext() {
        return next;
    }

    public void setNext(Foo next) {
        this.next = next;
    }
    
    
    
}
