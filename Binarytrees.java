/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.binarytrees;

/**
 *
 * @author HP
 */
public class Binarytrees {
    public static <T> int height(BinaryTreeNode<T> p) {
    if (p == null) {
        return 0; 
    } else {
        
        return 1 + Math.max(height(p.llink), height(p.rlink));
    }
}

    public static void main(String[] args) {
        Binarytreesnode<Integer> node1 = new Binarytreesnode<>(5);
        Binarytreesnode<Integer> node2 = new Binarytreesnode<>(6);  
        Binarytreesnode<Integer> node3 = new Binarytreesnode<>(7);  
        Binarytreesnode<Integer> node4 = new Binarytreesnode<>(10); 

        // Link the nodes to form a binary tree
        node1.llink = node2;  // Left child of node1 is node2
        node1.rlink = node3;  // Right child of node1 is node3
        node2.llink = node4;  // Left child of node2 is node4

       
        System.out.println("Node 1 data: " + node1.info);
        System.out.println("Node 2 data: " + node2.info);
        System.out.println("Node 3 data: " + node3.info);
        System.out.println("Node 4 data: " + node4.info);

        
        System.out.println("Height of the tree: " + height(node1));
    }
   
}
