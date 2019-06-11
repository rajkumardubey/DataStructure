package self.learning.binarysearchtree.operation;

import self.learning.binarysearchtree.bst.Node;

public class BinarySearchTreeNodeInsertor {

    /**
     * insert into the BST
     */
    public static Node insert(final int value, final Node root) {
        return insertRecursion(root, value);
    }

    /**
     * insertion method for recursion
     */
    private static Node insertRecursion(Node node, final int value) {
        if (node == null) {
            return new Node(value);
        }

        if (node.getData() > value) {
            node.setLeft(insertRecursion(node.getLeft(), value));
        } else {
            node.setRight(insertRecursion(node.getRight(), value));
        }

        return node;
    }


}
