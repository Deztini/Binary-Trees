/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.binarysearchtreesearchop;

/**
 *
 * @author HP
 */
public class BSTsearch {
      public Node search(int data) {
        Node current = root;
        System.out.print("Visiting elements: ");

       
        while (current != null) {
            System.out.print(current.data + " ");  
            
            if (current.data == data) {
                return current; 
            
          
            if (data < current.data) {
                current = current.leftChild;  
            } else {
                current = current.rightChild; 
            }
        }

      
        return null;
    }

   
    public void insert(int data) {
        root = insertRec(root, data);
    }

    
    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);  
            return root;
        }

      
        if (data < root.data) {
            root.leftChild = insertRec(root.leftChild, data);  
        } else if (data > root.data) {
            root.rightChild = insertRec(root.rightChild, data);  
        }

        return root;
    }

}
