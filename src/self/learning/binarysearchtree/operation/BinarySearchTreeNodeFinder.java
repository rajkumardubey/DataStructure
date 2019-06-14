package self.learning.binarysearchtree.operation;

import self.learning.binarysearchtree.bst.Node;

public class BinarySearchTreeNodeFinder {
    /**
     * isExists a node in BST, if it does not exist return null
     */
    public static boolean isExists(final int value, final Node root) {
        // return searchRecursively(value, root) != null;
        return searchIteratively(value, root) != null;
    }

    /**
     * A utility function to do BST isExists
     */
    private static Node searchRecursively(final int value, final Node node) {
        /*
         * if node is null or the data of the node is equal to the isExists amount
         * return the node
         */
        if (node == null || node.getData() == value) {
            return node;
        }

        /*
         * if the searched item is smaller than value of node, then isExists the
         * left side or else isExists right side
         */
        if (node.getData() > value) {
            return searchRecursively(value, node.getLeft());
        } else {
            return searchRecursively(value, node.getRight());
        }
    }

    /**
     * A utility function to do BST isExists iteratively
     */
    private static Node searchIteratively(final int value, final Node root) {
        Node searchedNode = null;

        /*
         * if the searched item is smaller than value of node, then isExists the
         * left side or else isExists right side.
         *
         * And if the searched item is equal to value of the node then return that node
         */
        Node bstIterator = root;
        while (bstIterator != null) {
            if (bstIterator.getData() > value) {
                bstIterator = bstIterator.getLeft();
            } else if (bstIterator.getData() < value) {
                bstIterator = bstIterator.getRight();
            } else if (bstIterator.getData() == value) {
                searchedNode = bstIterator;
                break;
            }
        }

        return searchedNode;
    }
}
