/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.insertmainmethod;

/**
 *
 * @author HP
 */

    
   
public class Insertmainmethod {
    
    public static void main(String[] args) {
        Binarytreeinsert root = null;  // Initialize an empty tree

        // Insert nodes into the tree
        root = insert(root, 10);  // Insert node with data 10
        root = insert(root, 5);   // Insert node with data 5
        root = insert(root, 15);  // Insert node with data 15

        // Print root and its left and right children to verify
        System.out.println("Root Node: " + root.data);
        if (root.leftChild != null) {
            System.out.println("Root's Left Child: " + root.leftChild.data);
        }
        if (root.rightChild != null) {
            System.out.println("Root's Right Child: " + root.rightChild.data);
        }
    }

    // Insert method that takes a root and data and returns the new root
    public static Binarytreeinsert insert(Binarytreeinsert root, int data) {
        // Create a new node with the specified data
        Binarytreeinsert tempNode = new Binarytreeinsert(data);

        // If the tree is empty, set the new node as the root
        if (root == null) {
            return tempNode;
        } else {
            Binarytreeinsert current = root;  // Start traversal from the root
            Binarytreeinsert parent = null;   // Keep track of the parent node

            // Traverse the tree to find the correct insertion point
            while (true) {
                parent = current;

                // If data is less than the current node's data, go to the left child
                if (data < current.data) {
                    current = current.leftChild;

                    // If the left child is null, insert the new node here
                    if (current == null) {
                        parent.leftChild = tempNode;
                        return root;  // Return the original root
                    }
                } 
                // If data is greater than or equal to the current node's data, go to the right child
                else {
                    current = current.rightChild;

                    // If the right child is null, insert the new node here
                    if (current == null) {
                        parent.rightChild = tempNode;
                        return root;  // Return the original root
                    }
                }
            }
        }
    }
}
