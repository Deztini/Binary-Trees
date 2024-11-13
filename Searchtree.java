/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.searchtree;

/**
 *
 * @author HP
 */
public class Searchtree {

     public static Binarytreeinsert root = null;

    public static void main(String[] args) {
        root = insert(root, 10);
        insert(root, 5);
        insert(root, 15);

        // Search for a node with data 5
        Binarytreeinsert result = search(root, 5);
        if (result != null) {
            System.out.println("\nNode found: " + result.data);
        } else {
            System.out.println("\nNode not found.");
        }
    }

    // Search method to find a node with specified data
    public static Binarytreeinsert search(Binarytreeinsert root, int data) {
        Binarytreeinsert current = root;  // Start from the root
        System.out.print("Visiting elements: ");

        // Traverse the tree until we find the data or reach a leaf
        while (current != null && current.data != data) {
            System.out.print(current.data + " ");  // Print the visited node

            // Go to the left subtree if the data is less than the current node's data
            if (data < current.data) {
                current = current.leftChild;
            }
            // Otherwise, go to the right subtree
            else {
                current = current.rightChild;
            }
        }

        // Return the found node or null if not found
        return current;
    }

}
