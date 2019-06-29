package self.learning.binarysearchtree.operation;

import self.learning.binarysearchtree.bst.Node;

public class BinarySearchTreeNodeRemover {

    /**
     * delete a node in the given BST
     */
    public static Node delete(final int value, final Node root) {
        return deleteRecursion(value, root);
    }

    /**
     * A utility function to do BST delete
     */
    private static Node deleteRecursion(int value, Node node) {
        /*
         * if node is null or the data of the node is equal to the isExists amount
         * return the node
         */
        if (node == null) return null;

        if (node.getData() > value) {
            /*
             * if the searched item is smaller than value of node, then isExists
             * the left side
             */
            node.setLeft(deleteRecursion(value, node.getLeft()));
        } else if (node.getData() < value) {
            /*
             * if the searched item is smaller than value of node, then isExists
             * the left side
             */
            node.setRight(deleteRecursion(value, node.getRight()));
        } else {
            if (node.getLeft() == null) {
                return node.getRight();
            } else if (node.getRight() == null) {
                return node.getLeft();
            } else {
                node.setData(getMinimumValue(node.getRight()));
                node.setRight(deleteRecursion(node.getData(), node.getRight()));
            }
        }
        return node;
    }

    /**
     * A utility function to find minimum value in the given BST
     */
    private static int getMinimumValue(Node node) {
        while (node.getLeft() != null) {
            node = node.getLeft();
        }
        return node.getData();
    }
}
