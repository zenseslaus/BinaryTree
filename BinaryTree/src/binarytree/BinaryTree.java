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
public class BinaryTree {

    private Node root;

    public BinaryTree() {
        root = null;
    }

    public void insert(int value) {
        Node newNode = new Node(value); // make new node
        if (getRoot() == null) // no node in root
        {
            root = newNode;

        } else // root occupied
        {
            Node current = getRoot(); // start at root

            while (current != null) {
                if (value < current.getiData()) // go left?
                {
                    if (current.getLeft() == null) // if end of the line,
                    { // insert on left
                        current.setLeft(newNode);
                        newNode.setParent(current);
                        current = null;
                    } else // end if go left
                    {
                        current = current.getLeft();
                    } // end else not
                } else // or go right?
                {
                    if (current.getRight() == null) // if end of the line
                    { // insert on right
                        current.setRight(newNode);
                        newNode.setParent(current);
                        current = null;
                    } else // end else go right
                    {
                        current = current.getRight();
                    } // end while
                }// end insert
            }
        }
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
