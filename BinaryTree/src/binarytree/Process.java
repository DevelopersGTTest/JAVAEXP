/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author Hackobo
 */
public class Process {
    private static Process instance;
    private static final int typeSearch = 2;
    private int numberToFind = 0;
    private int nodeCenter = 0;
    private int nodeInf = 0;
    private int nodeSup =0;
    
    
    public static Process getInstance(){
        if( instance == null ){
            instance = new Process();
        }
        return instance;
    }
    
    /*
    *@param array[<T>]
    *@param number
    *
    */
    
    public int BST(int array[], int number ){
        //Initializer Values
        this.numberToFind = array.length;
        this.nodeCenter = 0;
        this.nodeInf = 0;
        this.nodeSup = this.numberToFind -1;
        while( this.nodeInf <= this.nodeSup  ){
            this.nodeCenter = ( this.nodeSup + this.nodeInf ) / typeSearch;
            if( array[this.nodeCenter] == number ){
                return this.nodeCenter;
            }else{
                if( number <  array[this.nodeCenter]){
                    this.nodeSup = this.nodeCenter - 1;
                }else{
                    this.nodeInf = this.nodeCenter  + 1;
                }
            }
        }
        return -1;
    }
    
    /*
    *@param array[<T>]
    *@param number
    *
    */
    
    public int notBST(int array[], int number ){
        int tempKey = 0;
        this.numberToFind = array.length;
        for(int i=0; i < this.numberToFind; i++ ){
            if( i == number  ){
                tempKey = i;
            }
        }
        return tempKey;
    }
    
}
