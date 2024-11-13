/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.insertmainmethod;

/**
 *
 * @author HP
 */
public class Binarytreeinsert {
   
    int data;  // Data of the node
    Binarytreeinsert leftChild;  // Points to the left child node
    Binarytreeinsert rightChild;  // Points to the right child node

    // Constructor to create a new node with given data
    public Binarytreeinsert(int data) {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }
}
}
