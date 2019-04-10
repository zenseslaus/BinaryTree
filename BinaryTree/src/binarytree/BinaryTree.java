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
            getRoot().Insert(value);
//            Node test = new Node(value);
//            Node current = getRoot(); // start at root
//
//            while (current != null) {
//                if (value < current.getiData()) // go left?
//                {
//                    if (current.getLeft() == null) // if end of the line,
//                    { // insert on left
//                        current.setLeft(newNode);
//                        newNode.setParent(current);
//                        current = null;
//                    } else // end if go left
//                    {
//                        current = current.getLeft();
//                    } // end else not
//                } else // or go right?
//                {
//                    if (current.getRight() == null) // if end of the line
//                    { // insert on right
//                        current.setRight(newNode);
//                        newNode.setParent(current);
//                        current = null;
//                    } else // end else go right
//                    {
//                        current = current.getRight();
//                    } // end while
//                }// end insert
//            }
        }
    }

    public Node find(int value) {
        Node current = getRoot();

        while (current != null) {
            if (value < current.getiData()) {
                if (current.getLeft() == null) {
                    return null;
                } else {
                    current = current.getLeft();
                }
            } else if (value > current.getiData()) {
                if (current.getRight() == null) {
                    return null;
                } else {
                    current = current.getRight();
                }
            } else if (value == current.getiData()) {
                return current;
            }
        }
        return null;
    }

//    public void delete(int value) {
//        Node current = find(value);
//        if (current != null) {
//            if (current.getRight() == null && current.getLeft() == null) {
//                if (current.getiData() < current.getParent().getiData()) { //tangkai kiri
//                    current.getParent().setLeft(null);
//                } else {
//                    current.getParent().setRight(null);
//                }
//            } else if (current.getRight() == null && current.getLeft() != null) { //hapus anak 1 kiri
//
//                if (current.getiData() < current.getParent().getiData()) {
//                    current.getParent().setLeft(current.getLeft());
//                    current.getLeft().setParent(current.getParent());
//                } else {
//                    current.getParent().setRight(current.getLeft());
//                    current.getLeft().setParent(current.getParent());
//                }
//            } else if (current.getRight() != null && current.getLeft() == null) { //hapus anak 1 kanan
//                if (current.getiData() < current.getParent().getiData()) {
//                    current.getParent().setLeft(current.getRight());
//                    current.getRight().setParent(current.getParent());
//                } else {
//                    current.getParent().setRight(current.getRight());
//                    current.getRight().setParent(current.getParent());
//                }
//            }
//        }
//    }
    public Node getParent(int key) {
        Node bantu = root;
        Node parent = null;

        while (bantu != null) {
            if (key == bantu.getiData()) {
                return parent;
            } else if (key < bantu.getiData()) {
                parent = bantu;
                bantu = bantu.getLeft();
            } else {
                parent = bantu;
                bantu = bantu.getRight();
            }
        }
        return bantu;
    }

    public boolean delete(int key) {
        Node bantu = find(key);
        Node parent;
//        Node predecessor;
//        Node parentPredecessor;

//        getNodeParent(key, bantu, parent);
        if (bantu != null) {
            if (bantu.getiData() == root.getiData()) { //hapus root
                // jika yang di hapus leaf
                if (bantu.isLeaf()) {
                    root = null;
                } // jika yang dihapus hanya punya cabang kiri
                else if (bantu.getRight() == null) {
                    root = bantu.getLeft();
                } // jika yang dihapus hanya punya cabang kanan
                else if (bantu.getLeft() == null) {
                    root = bantu.getRight();
                    // jika yang dihapus punya cabang kiri dan kanan
                }
            } else {
                parent = getParent(key);
//                parent = bantu.parent;
                if (key < parent.getiData()) {

                    // jika yang di hapus leaf
                    if (bantu.isLeaf()) {
                        parent.setLeft(null);
                    } // jika yang dihapus hanya punya cabang kiri
                    else if (bantu.getRight() == null) {
                        parent.setLeft(bantu.getLeft());
                    } // jika yang dihapus hanya punya cabang kanan
                    else if (bantu.getLeft() == null) {
                        parent.setLeft(bantu.getRight());
                        // jika yang dihapus punya cabang kiri dan kanan
                    }
                } else {
                    // jika yang di hapus leaf
                    if (bantu.isLeaf()) {
                        parent.setRight(null);
                    } // jika yang dihapus hanya punya cabang kiri
                    else if (bantu.getRight() == null) {
                        parent.setRight(bantu.getLeft()); 
                    } // jika yang dihapus hanya punya cabang kanan
                    else if (bantu.getLeft() == null) {
                        parent.setRight(bantu.getRight());
                        // jika yang dihapus punya cabang kiri dan kanan
                    }
                }
            }
        }
        return false;
    }

    public void preOrder(Node localRoot) {
        if (localRoot != null) {
            System.out.print(localRoot.getiData() + " ");
            preOrder(localRoot.getLeft());
            preOrder(localRoot.getRight());
        }
    }

    public void inOrder(Node localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.getLeft());
            System.out.print(localRoot.getiData() + " ");
            inOrder(localRoot.getRight());
        }
    }

    public void postOrder(Node localRoot) {
        if (localRoot != null) {
            postOrder(localRoot.getLeft());
            postOrder(localRoot.getRight());
            System.out.print(localRoot.getiData() + " ");

        }
    }

    public void depth(int value) {
        Node current = getRoot();
        int x = 0;
        while (current != null) {
            if (value < current.getiData()) {
                if (current.getLeft() == null) {
                } else {
                    current = current.getLeft();
                    x++;
                }
            } else if (value > current.getiData()) {
                if (current.getRight() == null) {
                } else {
                    current = current.getRight();
                    x++;
                }
            } else if (value == current.getiData()) {
                System.out.println("hasil depth : " + x);
                current = null;
            }
        }
    }

    public void height(int value) {
        Node current = getRoot();
        int x = 1;
        while (current != null) {
            if (value < current.getiData()) {
                if (current.getLeft() == null) {
                } else {
                    current = current.getLeft();
                    x++;
                }
            } else if (value > current.getiData()) {
                if (current.getRight() == null) {
                } else {
                    current = current.getRight();
                    x++;
                }
            } else if (value == current.getiData()) {
                System.out.println("hasil height : " + x);
                current = null;
            }
        }
    }

    public void leafHelper(Node localRoot) {
        if (localRoot != null) {
            if (localRoot.getLeft() == null && localRoot.getRight() == null) {
                System.out.println(localRoot.getiData());
            }
//            System.out.print(localRoot.getiData() + " ");
            leafHelper(localRoot.getLeft());
            leafHelper(localRoot.getRight());
        }
    }

    public void leaf() {
        leafHelper(getRoot());
    }

    public void descendant(int value) {
        Node cari = find(value);
        descendantHelper(cari.getLeft());
        descendantHelper(cari.getRight());
    }

    public void descendantHelper(Node localRoot) {
        if (localRoot != null) {
            System.out.print(localRoot.getiData() + " ");
            descendantHelper(localRoot.getLeft());
            descendantHelper(localRoot.getRight());
        }
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
