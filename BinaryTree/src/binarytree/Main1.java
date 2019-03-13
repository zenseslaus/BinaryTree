/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author Wewen
 */
public class Main1 {
    
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(42);
        tree.insert(21);
        tree.insert(38);
        tree.insert(27);
        tree.insert(71);
        tree.insert(82);
        tree.insert(55);
        tree.insert(63);
        tree.insert(6);
        tree.insert(2);
        tree.insert(40);
        tree.insert(12);
//        tree.insert(23);
//        tree.insert(19);
//        tree.insert(45);
//        tree.insert(5);
//        tree.insert(21);
//        tree.insert(8);
        System.out.print("Preorder : ");
        tree.preOrder(tree.getRoot());
        System.out.println("\n");
        System.out.print("Inorder : ");
        tree.inOrder(tree.getRoot());
        System.out.println("\n");
        System.out.print("Postorder : ");
        tree.postOrder(tree.getRoot());
        System.out.println("\n");
//        tree.depth(5);
//        tree.height(5);
        tree.depth(12);
        tree.height(12);
        tree.leaf();
        tree.descendant(6);
    }
}
