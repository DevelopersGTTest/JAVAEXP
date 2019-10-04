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
public class BinaryTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[]values ={1,4,7,8,10,20,21};
        int valueToFind = 1;
        int tempVlueBST = Process.getInstance().BST(values, valueToFind);
        int tempNotVluBST = Process.getInstance().notBST(values, tempVlueBST);
        System.out.println("::: BST-Using :::" + tempVlueBST );
        System.out.println("::: Not-BST-Using :::" + tempNotVluBST );
    }
    
}
