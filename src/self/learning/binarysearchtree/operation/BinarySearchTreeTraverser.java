package self.learning.binarysearchtree.operation;

import self.learning.binarysearchtree.bst.Node;

public class BinarySearchTreeTraverser {

    /**
     * print the BST in increasing Order
     */
    public static void inorder(final Node root) {
        inorderRecursion(root);
    }

    /**
     * A utility function to do inorder traversal of BST
     */
    private static void inorderRecursion(final Node root) {
        if (root == null) return;

        inorderRecursion(root.getLeft());
        System.out.print(root.getData() + " ");
        inorderRecursion(root.getRight());
    }

    /**
     * print the BST in pre Order
     */
    public static void preorder(final Node root) {
        preorderRecursion(root);
    }

    /**
     * A utility function to do pre-order traversal of BST
     */
    private static void preorderRecursion(final Node root) {
        if (root == null) return;

        System.out.print(root.getData() + " ");
        preorderRecursion(root.getLeft());
        preorderRecursion(root.getRight());

    }

    /**
     * print the BST in post Order
     */
    public static void postorder(final Node root) {
        postorderRecursion(root);
    }

    /**
     * A utility function to do post-order traversal of BST
     */
    private static void postorderRecursion(final Node root) {
        if (root == null) return;

        postorderRecursion(root.getLeft());
        postorderRecursion(root.getRight());
        System.out.print(root.getData() + " ");
    }
}
