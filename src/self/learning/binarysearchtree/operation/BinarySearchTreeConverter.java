package self.learning.binarysearchtree.operation;

import self.learning.binarysearchtree.bst.Node;

import java.util.*;

public class BinarySearchTreeConverter {

    /**
     * A utility function to save inorder traversal of BST in an array
     */
    public static int[] toInorderArray(final Node binarySearchTreeRoot) {
        return toInorderList(binarySearchTreeRoot)
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    /**
     * A utility function to save inorder traversal of BST in a list
     */
    public static Set<Integer> toInorderSet(final Node binaryTreeRoot) {
        final Set<Integer> inorder = new TreeSet<>();
        inorderRecursively(binaryTreeRoot, inorder);

        return inorder;
    }

    /**
     * A utility function to save inorder traversal of BST in a list
     */
    private static List<Integer> toInorderList(final Node binarySearchTreeRoot) {
        final List<Integer> inorder = new ArrayList<>();
        inorderRecursively(binarySearchTreeRoot, inorder);

        return inorder;
    }

    /**
     * A recursive function to save inorder traversal of BST in the given list
     */
    private static void inorderRecursively(final Node node,
                                           final Collection<Integer> inorder) {
        if (node != null) {
            inorderRecursively(node.getLeft(), inorder);
            inorder.add(node.getData());
            inorderRecursively(node.getRight(), inorder);
        }
    }

}
