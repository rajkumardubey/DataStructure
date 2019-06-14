/**
 * Copyright (©) 2017. All rights reserved.
 *
 * @author Raj Kumar Dubey
 */
package self.learning.binarysearchtree.bst;

import self.learning.binarysearchtree.operation.*;

import java.util.Map;

/**
 * <b>BinarySearchTree</b>
 */
public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        super();
        this.root = null;
    }

    public BinarySearchTree(final int[] sortedArray) {
        this.root = BinarySearchTreeConstructor.fromSortedArray(sortedArray);
    }

    /**
     * print BST in sorted order
     */
    public void print() {
        BinarySearchTreeTraverser.inorder(this.root);
        System.out.println("null");
    }

    /**
     * print BST in pre-order
     */
    public void printPreOrder() {
        BinarySearchTreeTraverser.preorder(this.root);
        System.out.println("null");
    }

    /**
     * print BST in post-order
     */
    public void printPostOrder() {
        BinarySearchTreeTraverser.postorder(this.root);
        System.out.println("null");
    }

    /**
     * delete from the BST
     */
    public void deleteNodeWithValue(final int value) {
        this.root = BinarySearchTreeNodeRemover.delete(value, this.root);
    }

    /**
     * insert into the BST
     */
    public void insertNodeWithValue(final int value) {
        this.root = BinarySearchTreeNodeInsertor.insert(value, this.root);
    }

    /**
     * isExists a node in BST, if it does not exist return null
     */
    public Boolean isValueExists(final int value) {
        return BinarySearchTreeNodeFinder.isExists(value, this.root);
    }

    /**
     * isExists a node in BST, if it does not exist return null
     */
    public Node searchParentNodeOf(final int value) {
        return BinarySearchTreeMiscOperators.searchParent(value, this.root);
    }

    /**
     * find vertical sum of all node in a BST
     */
    public Map<Integer, Integer> getVerticalSum() {
        return BinarySearchTreeMiscOperators.getVerticalSum(this.root);
    }
}
