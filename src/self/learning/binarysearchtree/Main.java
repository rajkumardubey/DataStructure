package self.learning.binarysearchtree;

import self.learning.binarysearchtree.bst.BinarySearchTree;
import self.learning.binarysearchtree.bst.Node;

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

//        System.out.println("Parent of 40 : " + tree.searchParentNodeOf(40).getData());
//
//        System.out.println("Vertical Sum of BST : " + tree.getVerticalSum().entrySet());
//        System.out.println("Horizontal Sum of BST : " + tree.getHorizontalSum().entrySet());

        System.out.print("Deleting 50 and then the BST will be : ");
        tree.deleteNodeWithValue(50);
        tree.print();

        System.out.println("70 Exists? : " + tree.isValueExists(70));
        System.out.println("50 Exists? : " + tree.isValueExists(50));
/*
        final int[] sortedArray = {1, 7, 9, 11, 12, 13, 15, 16};
        final BinarySearchTree treeFromArray = new BinarySearchTree(sortedArray);
        System.out.print("Tree from given Sorted Array [Inorder] : ");
        treeFromArray.print();

        // print pre-order traversal of the BST
        System.out.print("Tree from given Sorted Array [Pre-order] : ");
        treeFromArray.printPreOrder();

        // print post-order traversal of the BST
        System.out.print("Tree from given Sorted Array [Post-order] : ");
        treeFromArray.printPostOrder();


        /* Construct below binary tree
                  8
                /   \
               /     \
              3       5
             / \     / \
            /   \   /   \
           10    2 4     6
		*/
/*        final Node binaryTreeRoot = new Node(8);
        binaryTreeRoot.setLeft(new Node(3));
        binaryTreeRoot.setRight(new Node(5));
        binaryTreeRoot.getLeft().setLeft(new Node(10));
        binaryTreeRoot.getLeft().setRight(new Node(2));
        binaryTreeRoot.getRight().setLeft(new Node(4));
        binaryTreeRoot.getRight().setRight(new Node(6));

        final BinarySearchTree treeFromBT = new BinarySearchTree(binaryTreeRoot);
        System.out.print("Converted BST from BT : ");
        treeFromBT.print();

        System.out.print("Merging the above 2 BST : ");
        treeFromBT.mergedWith(treeFromArray);
        treeFromBT.print();
*/
    }

}
