/**
 * Copyright (©) 2017. All rights reserved.
 *
 * @author Raj Kumar Dubey
 */
package self.learning.linkedlist;

/**
 * <b>Node</b>
 * <p>
 * This represent each node of linked list.
 */
public class Node {
    private String data;
    private Node nextMember;

    /**
     * initialize a empty node
     */
    public Node() {
        super();
        this.data = "";
        this.nextMember = null;
    }

    /**
     * initialize a node with given data
     */
    public Node(final String data) {
        super();
        this.data = data;
        this.nextMember = null;
    }

    /**
     * initialize a node with given nextMember node
     */
    public Node(final Node next) {
        super();
        this.nextMember = next;
    }

    /**
     * initialize a node with given data & nextMember node
     */
    public Node(final String data, final Node next) {
        super();
        this.data = data;
        this.nextMember = next;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the nextMember
     */
    public Node getNextMember() {
        return nextMember;
    }

    /**
     * @param nextMember the nextMember to set
     */
    public void setNextMember(Node next) {
        this.nextMember = next;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Node [data=" + data + ", nextMember=" + nextMember + "]";
    }

}
