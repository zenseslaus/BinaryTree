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
        tree.insert(23);
        tree.insert(19);
        tree.insert(45);
        tree.insert(5);
        tree.insert(21);
        tree.insert(8);
        System.out.print("Preorder : ");
        tree.preOrder(tree.getRoot());
        System.out.println("\n");
        System.out.print("Inorder : ");
        tree.inOrder(tree.getRoot());
        System.out.println("\n");
        System.out.print("Postorder : ");
        tree.postOrder(tree.getRoot());
        System.out.println("\n");
    }
}
