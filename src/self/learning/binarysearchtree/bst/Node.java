/**
 * Copyright (©) 2017. All rights reserved.
 *
 * @author Raj Kumar Dubey
 */
package self.learning.binarysearchtree.bst;

/**
 * <b>Node</b>
 * 
 * This represent each node of binary search tree.
 */
public class Node {
	private int data;
	
	/** pointer to left node */
	private Node left;

	/** pointer to right node */
	private Node right;

	/** initialize a node with given data */
	public Node(final int data) {
		super();
		this.data = data;
		this.left = null;
		this.right = null;
	}

	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}

	/**
	 * @return the left
	 */
	public Node getLeft() {
		return left;
	}

	/**
	 * @param left
	 *            the left to set
	 */
	public void setLeft(Node next) {
		this.left = next;
	}

	/**
	 * @return the right
	 */
	public Node getRight() {
		return right;
	}

	/**
	 * @param right the right to set
	 */
	public void setRight(Node right) {
		this.right = right;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
	}
}
