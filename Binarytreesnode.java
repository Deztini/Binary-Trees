/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.binarytrees;

/**
 *
 * @author HP
 */
public class Binarytreesnode<T> {
     T info;  // Stores the data of the node
    Binarytreesnode<T> llink;  // Points to the left child node
    Binarytreesnode<T> rlink;  // Points to the right child node

    // Constructor to create a new node
    Binarytreesnode(T data) {
        this.info = data;
        this.llink = null;
        this.rlink = null;
    }
}
