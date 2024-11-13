/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.binarysearchtreeinsert;

/**
 *
 * @author HP
 */
public class BSTinsert {
     public void insert(int data) {
        Node tempNode = new Node(data);  // Create a new node with the given data
        Node current;  // Current node for traversal
        Node parent = null;  // Parent node to keep track of the parent

        // If the tree is empty, set the new node as the root
        if (root == null) {
            root = tempNode;
        } else {
            current = root;  // Start at the root node

            // Traverse the tree to find the correct position for the new node
            while (true) {
                parent = current;  // Store the current node as the parent

                // If the data is smaller, move to the left child
                if (data < current.data) {
                    current = current.leftChild;

                    // If the left child is null, insert the new node here
                    if (current == null) {
                        parent.leftChild = tempNode;
                        return;
                    }
                } 
                // If the data is larger, move to the right child
                else {
                    current = current.rightChild;

                    // If the right child is null, insert the new node here
                    if (current == null) {
                        parent.rightChild = tempNode;
                        return;
                    }
                }
            }
        }
    }
}
