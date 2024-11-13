/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.traversal;

/**
 *
 * @author HP
 */
public class Traversal {

    public static void main(String[] args) {
          BinaryTree tree = new BinaryTree();
        int[] array = { 27, 14, 35, 10, 19, 31, 42 };

        for (int value : array) {
            tree.insert(value);
        }

        int searchValue1 = 31;
        Node result1 = tree.search(searchValue1);
        if (result1 != null) {
            System.out.println("\n[" + result1.data + "] Element found.");
        } else {
            System.out.println("\n[x] Element not found (" + searchValue1 + ").");
        }

        int searchValue2 = 15;
        Node result2 = tree.search(searchValue2);
        if (result2 != null) {
            System.out.println("[" + result2.data + "] Element found.");
        } else {
            System.out.println("[x] Element not found (" + searchValue2 + ").");
        }

        System.out.print("\nPreorder traversal: ");
        tree.preOrderTraversal(tree.root);

        System.out.print("\nInorder traversal: ");
        tree.inOrderTraversal(tree.root);

        System.out.print("\nPostorder traversal: ");
        tree.postOrderTraversal(tree.root);
    }

    }

