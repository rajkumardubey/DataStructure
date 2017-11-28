/**
 * Copyright (©) 2017. All rights reserved.
 *
 * @author Raj Kumar Dubey
 */
package self.learning.binarysearchtree;

import java.util.HashMap;
import java.util.Map;

/**
 * <b>BinarySearchTree</b>
 */
public class BinarySearchTree {
	private Node root;

	public BinarySearchTree() {
		super();
		root = null;
	}

	/** insert into the BST */
	public boolean insert(final int value) {
		root = insertRecursion(this.root, value);
		return root != null;
	}

	/** insertion method for recursion */
	private Node insertRecursion(Node node, final int value) {
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

	/** print the BST in increasing Order */
	void inorder() {
		inorderRecursion(root);
	}

	/** A utility function to do inorder traversal of BST */
	private void inorderRecursion(final Node root) {
		if (root != null) {
			inorderRecursion(root.getLeft());
			System.out.println(root.getData());
			inorderRecursion(root.getRight());
		}
	}

	/** search a node in BST, if it does not exist return null */
	public Node search(final int value) {
		return searchRecursion(value, this.root);
	}

	/** A utility function to do BST search */
	private Node searchRecursion(int value, Node node) {
		/*
		 * if node is null or the data of the node is equal to the search amount return
		 * the node
		 */
		if (node == null || node.getData() == value) {
			return node;
		}

		/*
		 * if the searched item is smaller than value of node, then search the left side
		 * or else search right side
		 */
		if (node.getData() > value) {
			return searchRecursion(value, node.getLeft());
		} else {
			return searchRecursion(value, node.getRight());
		}
	}

	/** delete a node in BST, if it does not exist return null */
	public void delete(final int value) {
		this.root = deleteRecursion(value, this.root);
	}

	/** A utility function to do BST delete */
	private Node deleteRecursion(int value, Node node) {
		/*
		 * if node is null or the data of the node is equal to the search amount return
		 * the node
		 */
		if (node == null) {
			return node;
		} else if (node.getData() > value) {
			/*
			 * if the searched item is smaller than value of node, then search the left side
			 */
			node.setLeft(deleteRecursion(value, node.getLeft()));
		} else if (node.getData() < value) {
			/*
			 * if the searched item is smaller than value of node, then search the left side
			 */
			node.setRight(deleteRecursion(value, node.getRight()));
		} else {
			if (node.getLeft() == null) {
				return node.getRight();
			} else if (node.getRight() == null) {
				return node.getLeft();
			} else {
				node.setData(getMinimumValue(node.getRight()));
				node.setRight(deleteRecursion(node.getData(), node.getRight()));
			}
		}
		return node;
	}

	/** A utility function to find minimum value in the given BST */
	private int getMinimumValue(Node node) {
		while (node.getLeft() != null) {
			node = node.getLeft();
		}
		return node.getData();
	}

	/** find vertical sum of all node in a BST */
	public Map<Integer, Integer> getVerticalSum() {
		final Map<Integer, Integer> verticalSum = new HashMap<>();
		getVerticalSumRecursion(this.root, verticalSum, 0);
		return verticalSum;
	}

	/** find vertical sum of all node in a BST */
	private void getVerticalSumRecursion(final Node node, final Map<Integer, Integer> verticalSum,
			final int horizontalDistance) {
		if (node == null)
			return;

		getVerticalSumRecursion(node.getLeft(), verticalSum, horizontalDistance - 1);

		if (verticalSum.get(horizontalDistance) == null) {
			verticalSum.put(horizontalDistance, node.getData());
		} else {
			verticalSum.put(horizontalDistance, verticalSum.get(horizontalDistance) + node.getData());
		}
		getVerticalSumRecursion(node.getRight(), verticalSum, horizontalDistance + 1);
	}

	/** search a node in BST, if it does not exist return null */
	public Node searchParent(final int value) {
		return searchParentRecursion(value, this.root);
	}

	/** A utility function to do BST search */
	private Node searchParentRecursion(int value, Node node) {
		/*
		 * if node is null or the data of the node is equal to the search amount return
		 * the node
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
		 * if the searched item is smaller than value of node, then search the left side
		 * or else search right side
		 */
		if (node.getData() > value) {
			return searchParentRecursion(value, node.getLeft());
		} else {
			return searchParentRecursion(value, node.getRight());
		}
	}
}
