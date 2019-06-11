package self.learning.binarysearchtree.operation;

import self.learning.binarysearchtree.bst.Node;

public class BinarySearchTreeNodeFinder {
    /**
     * search a node in BST, if it does not exist return null
     */
    public static Node search(final int value, final Node root) {
        return searchRecursion(value, root);
    }

    /**
     * A utility function to do BST search
     */
    private static Node searchRecursion(int value, Node node) {
        /*
         * if node is null or the data of the node is equal to the search amount
         * return the node
         */
        if (node == null || node.getData() == value) {
            return node;
        }

        /*
         * if the searched item is smaller than value of node, then search the
         * left side or else search right side
         */
        if (node.getData() > value) {
            return searchRecursion(value, node.getLeft());
        } else {
            return searchRecursion(value, node.getRight());
        }
    }


}
