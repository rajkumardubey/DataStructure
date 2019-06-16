package self.learning.binarysearchtree.operation;

import self.learning.binarysearchtree.bst.Node;

public class BinarySearchTreeMerger {

    /**
     * This utility method will merge the 2 given binary search tree
     * and return a new merged binary search tree
     */
    public static Node merge(final Node bst1, final Node bst2) {
        final int[] bst1Inorder = BinarySearchTreeConverter.toInorderArray(bst1);
        final int[] bst2Inorder = BinarySearchTreeConverter.toInorderArray(bst2);

        return BinarySearchTreeConstructor
                .fromSortedArray(mergeTwoSortedArrayInSortedOrder(bst1Inorder, bst2Inorder));
    }

    /**
     * This utility method will merge the given sorted arrays in sorted order
     */
    private static int[] mergeTwoSortedArrayInSortedOrder(final int[] array1,
                                                          final int[] array2) {
        final int array1Size = array1.length;
        final int array2Size = array2.length;

        final int[] merged = new int[array1Size + array2Size];

        int i = 0, j = 0, k = 0;
        while (i < array1Size && j < array2Size)
            merged[k++] = array1[i] < array2[j] ? array1[i++] : array2[j++];

        while (i < array1Size)
            merged[k++] = array1[i++];

        while (j < array2Size)
            merged[k++] = array2[j++];

        return merged;
    }
}
