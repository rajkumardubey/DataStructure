package self.learning.binarysearchtree;

import self.learning.binarysearchtree.bst.BinarySearchTree;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        /*
         * Let us create following BST
         *   50
         *   / \
         *  30 70
         * / \ / \
         *20 40 60 80
         */
        tree.insertNodeWithValue(50);
        tree.insertNodeWithValue(30);
        tree.insertNodeWithValue(20);
        tree.insertNodeWithValue(40);
        tree.insertNodeWithValue(70);
        tree.insertNodeWithValue(60);
        tree.insertNodeWithValue(80);

        // print inorder traversal of the BST
        tree.print();

        System.out.println("Parent of 40 : " + tree.searchParentNodeOf(40).getData());

        System.out.println("Vertical Sum of BST : " + tree.getVerticalSum().entrySet());

        System.out.print("Deleting 50 and then the BST will be : ");
        tree.deleteNodeWithValue(50);
        tree.print();

        System.out.println("70 Exists? : " + tree.isValueExists(70));
        System.out.println("10 Exists? : " + tree.isValueExists(10));

        final int[] sortedArray = {2, 4, 6, 8, 10, 12, 14, 16};

        BinarySearchTree treeFromArray = new BinarySearchTree(sortedArray);

        treeFromArray.print();

        // print pre-order traversal of the BST
        treeFromArray.printPreOrder();

        // print post-order traversal of the BST
        treeFromArray.printPostOrder();

    }

}
