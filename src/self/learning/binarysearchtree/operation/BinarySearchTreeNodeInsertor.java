package self.learning.binarysearchtree.operation;

import self.learning.binarysearchtree.bst.Node;

public class BinarySearchTreeNodeInsertor {

    /**
     * insert into the BST
     */
    public static Node insert(final int value, final Node root) {
        // return insertRecursion(root, value);
        return insertIteratively(root, value);
    }

    /**
     * insert into the BST recursively
     */
    private static Node insertRecursion(Node node, final int value) {
        // Base Case
        if (node == null) {
            return new Node(value);
        }

        if (node.getData() > value)
            node.setLeft(insertRecursion(node.getLeft(), value));
        else
            node.setRight(insertRecursion(node.getRight(), value));


        return node;
    }

    /**
     * insert into the BST iteratively
     */
    private static Node insertIteratively(final Node root, final int value) {
        final Node newNode = new Node(value);

        // If the root is null i.e the tree is empty the new node is the root node
        if (root == null) {
            return newNode;
        }

        // This pointer maintains the trailing pointer of `bstIterator`
        Node parentToBstIterator = null;

        // traverse BST from root to isExists where the new node to be inserted.
        Node bstIterator = root;
        while (bstIterator != null) {
            parentToBstIterator = bstIterator;
            bstIterator = bstIterator.getData() > value ? bstIterator.getLeft() : bstIterator.getRight();
        }

        if (value < parentToBstIterator.getData())
            parentToBstIterator.setLeft(newNode);
        else
            parentToBstIterator.setRight(newNode);

        return root;
    }


}
