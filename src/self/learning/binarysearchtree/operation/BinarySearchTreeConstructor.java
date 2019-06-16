package self.learning.binarysearchtree.operation;

import self.learning.binarysearchtree.bst.Node;

import java.util.Iterator;
import java.util.Set;

public class BinarySearchTreeConstructor {

    public static Node fromSortedArray(final int[] sortedArray) {
        return fromSortedArrayRecursively(sortedArray, 0, sortedArray.length - 1);
    }

    private static Node fromSortedArrayRecursively(final int[] sortedArray,
                                                   final int start, final int end) {
        /* base case */
        if (start > end) return null;

        int middle = (start + end) / 2;

        final Node node = new Node(sortedArray[middle]);
        node.setLeft(fromSortedArrayRecursively(sortedArray, start, middle - 1));
        node.setRight(fromSortedArrayRecursively(sortedArray, middle + 1, end));

        return node;
    }

    public static Node fromBinaryTree(final Node binaryTreeRoot) {
        final Set<Integer> inorder = BinarySearchTreeConverter
                .toInorderSet(binaryTreeRoot);

        updateToBinarySearchTree(binaryTreeRoot, inorder.iterator());
        return binaryTreeRoot;
    }


    private static void updateToBinarySearchTree(final Node binaryTreeNode,
                                                 final Iterator<Integer> inorderBst) {
        if (binaryTreeNode == null) return;

        updateToBinarySearchTree(binaryTreeNode.getLeft(), inorderBst);
        binaryTreeNode.setData(inorderBst.next());
        updateToBinarySearchTree(binaryTreeNode.getRight(), inorderBst);
    }

}
