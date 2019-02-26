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
public class Node {

    private int iData;
    private Node left;
    private Node right;
    private Node parent;

    public Node(int value) {
        this.iData = value;
        left = null;
        right = null;
    }

    public int getiData() {
        return iData;
    }

    public void setiData(int iData) {
        this.iData = iData;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }
}
