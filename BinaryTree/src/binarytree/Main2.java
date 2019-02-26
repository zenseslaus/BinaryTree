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
public class Main2 {

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
        System.out.println("");
        System.out.print("Mencari data 45 : ");
        System.out.println(tree.find(45).getiData());
        System.out.print("Mencari data 1 : ");
        System.out.println(tree.find(1));
        tree.delete(5);
        System.out.print("Hasil setelah menghapus data 5 Preorder : ");
        tree.preOrder(tree.getRoot());
    }
}
