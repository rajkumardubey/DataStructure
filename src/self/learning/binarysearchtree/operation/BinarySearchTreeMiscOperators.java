package self.learning.binarysearchtree.operation;

import self.learning.binarysearchtree.bst.Node;

import java.util.HashMap;
import java.util.Map;

public class BinarySearchTreeMiscOperators {

    /**
     * find vertical sum of all node in a BST
     */
    public static Map<Integer, Integer> getVerticalSum(final Node root) {
        final Map<Integer, Integer> verticalSum = new HashMap<>();
        getVerticalSumRecursion(root, verticalSum, 0);
        return verticalSum;
    }

    /**
     * find vertical sum of all node in a BST
     */
    private static void getVerticalSumRecursion(final Node node,
                                                final Map<Integer, Integer> verticalSum,
                                                final int horizontalDistance) {
        if (node == null)
            return;

        getVerticalSumRecursion(node.getLeft(), verticalSum, horizontalDistance - 1);
        verticalSum.merge(horizontalDistance, node.getData(), (a, b) -> a + b);
        getVerticalSumRecursion(node.getRight(), verticalSum, horizontalDistance + 1);
    }

    /**
     * search a node in BST, if it does not exist return null
     */
    public static Node searchParent(final int value, final Node root) {
        return searchParentRecursion(value, root);
    }

    /**
     * A utility function to do BST search
     */
    private static Node searchParentRecursion(int value, Node node) {
        /*
         * if node is null or the data of the node is equal to the search amount
         * return the node
         */
        if (node == null || node.getData() == value) {
            return null;
        }

        if (node.getLeft() != null && node.getLeft().getData() == value) {
            return node;
        }

        if (node.getRight() != null && node.getRight().getData() == value) {
            return node;
        }

        /*
         * if the searched item is smaller than value of node, then search the
         * left side or else search right side
         */
        if (node.getData() > value) {
            return searchParentRecursion(value, node.getLeft());
        } else {
            return searchParentRecursion(value, node.getRight());
        }
    }

}
