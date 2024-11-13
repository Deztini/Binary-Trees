/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.copytree;

/**
 *
 * @author HP
 */
public class Binarycopytree<T> {
     
    T info;  
    Binarycopytree<T> llink; 
    Binarycopytree<T> rlink;  

   
    public Binarycopytree(T data) {
        this.info = data;
        this.llink = null;
        this.rlink = null;
    }

   
    public Binarycopytree(Binarycopytree<T> otherTreeRoot) {
        if (otherTreeRoot == null) {
            throw new IllegalArgumentException("Cannot copy from a null root node");
        }
        this.info = otherTreeRoot.info; 
      
        this.llink = copyTree(otherTreeRoot.llink);
        this.rlink = copyTree(otherTreeRoot.rlink);
    }

    // Recursive method to copy the tree
    private Binarycopytree<T> copyTree(Binarycopytree<T> otherTreeRoot) {
        if (otherTreeRoot == null) {
            return null;  
        } else {
            
            Binarycopytree<T> newNode = new Binarycopytree<>(otherTreeRoot.info);
            newNode.llink = copyTree(otherTreeRoot.llink);  
            newNode.rlink = copyTree(otherTreeRoot.rlink);  
            return newNode; 
        }
    }
}


