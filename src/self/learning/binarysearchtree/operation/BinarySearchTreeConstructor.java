package self.learning.binarysearchtree.operation;

import self.learning.binarysearchtree.bst.Node;

public class BinarySearchTreeConstructor {

    public static Node fromSortedArray(final int[] sortedArray) {
        return fromSortedArray(sortedArray, 0, sortedArray.length - 1);
    }

    private static Node fromSortedArray(final int[] sortedArray,
                                        final int start, final int end) {
        /* base case */
        if (start > end) {
            return null;
        }

        int middle = (start + end) / 2;

        Node node = new Node(sortedArray[middle]);
        node.setLeft(fromSortedArray(sortedArray, start, middle - 1));
        node.setRight(fromSortedArray(sortedArray, middle + 1, end));

        return node;
    }

}
