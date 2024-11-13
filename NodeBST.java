/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.binarysearchtree;

/**
 *
 * @author HP
 */

    public class NodeBST {
    int data;          // The data stored in the node
    NodeBST leftChild;    // Points to the left child node
    NodeBST rightChild;   // Points to the right child node

    // Constructor to initialize the node with data
    public NodeBST(int data) {
        this.data = data;
        this.leftChild = null;  // Initially, the left child is null
        this.rightChild = null; // Initially, the right child is null
    }
}

