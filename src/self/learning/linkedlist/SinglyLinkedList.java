/**
 * Copyright (©) 2017. All rights reserved.
 *
 * @author Raj Kumar Dubey
 */
package self.learning.linkedlist;

public class SinglyLinkedList {
	private Node head;

	/** Initialize singly linked list with no member */
	public SinglyLinkedList() {
		super();
		head = null;
	}

	/** Initialize singly linked list with one member */
	public SinglyLinkedList(final Node node) {
		super();
		head = node;
	}

	/** get the size of the linked list */
	public int size() {

		int count = 0;
		Node link = this.head;

		while (true) {
			if (link == null) {
				break;
			}
			count++;
			link = link.getNextMember();
		}

		return count;
	}

	/**
	 * get value of the node given position (return null if position < 0 or position
	 * >= linkedlist.size
	 */
	public String getNodeValue(final int position) {
		final Node node = getNode(position);

		if (node == null) {
			return null;
		} else {
			return node.getData();
		}
	}

	/**
	 * get a node given position (return null if position < 0 or position >=
	 * linkedlist.size
	 */
	public Node getNode(final int position) {
		return getSubSinglyLinkedList(position, position);
	}

	/** add member at the beginning */
	public boolean addAtTheStart(final String newVal) {
		final Node newMember = new Node(newVal);
		return addAtTheStart(newMember);
	}

	/** add member at the end */
	public boolean addAtTheStart(final Node newMember) {
		return addAtGivenPosition(0, newMember);
	}

	/** add member at the end */
	public boolean addAtTheEnd(final String newVal) {
		final Node newMember = new Node(newVal);
		return addAtTheEnd(newMember);
	}

	/** add member at the end */
	public boolean addAtTheEnd(final Node newMember) {
		boolean success = false;
		try {
			if (this.head == null) {
				this.head = newMember;
			} else {
				Node link = this.head;
				while (true) {
					if (link.getNextMember() == null) {
						link.setNextMember(newMember);
						break;
					}

					link = link.getNextMember();
				}
			}
			success = true;
		} catch (final Exception exception) {
			success = false;
		}

		return success;
	}

	/** add member at the end */
	public boolean addAtGivenPosition(final int position, final String newVal) {
		final Node newMember = new Node(newVal);
		return addAtGivenPosition(position, newMember);
	}

	/** add member at the end */
	public boolean addAtGivenPosition(final int position, final Node newMember) {
		boolean success = false;
		try {

			if (position < 0) {
				success = false;
			} else if (position > 0 && this.head == null) {
				success = false;
			} else if (position == 0) {
				newMember.setNextMember(this.head);
				this.head = newMember;
				success = true;
			} else {
				int count = 0;
				Node link = this.head;

				while (count < position - 1 && link != null) {
					link = link.getNextMember();
					count++;
				}

				if (link == null) {
					success = false;
				} else {
					newMember.setNextMember(link.getNextMember());
					link.setNextMember(newMember);
					success = true;
				}
			}

		} catch (final Exception exception) {
			success = false;
		}

		return success;
	}

	/** This method will reverse a singly linked list */
	public SinglyLinkedList reverse() {
		return new SinglyLinkedList(this.reverse(this.head));
	}

	/** This method will reverse a singly linked list */
	public Node reverse(Node tempHead) {
		Node reversedLinkedList = null;

		Node tempNode;
		while (tempHead != null) {
			tempNode = new Node(tempHead.getData());
			tempNode.setNextMember(reversedLinkedList);
			reversedLinkedList = tempNode;
			tempHead = tempHead.getNextMember();
		}

		return reversedLinkedList;
	}

	/** This method will reverse a singly linked list */
	public SinglyLinkedList reverseTillGivenLimit(final int limit) {
		final Node firstHalf = this.getSubSinglyLinkedList(0, limit - 1);
		final Node reversedFirstHalf = this.reverse(firstHalf);

		Node iteratorLinkForFirstHalf = reversedFirstHalf;
		Node iteratorLinkForSecondHalf = this.head;

		while (iteratorLinkForFirstHalf.getNextMember() != null) {
			iteratorLinkForFirstHalf = iteratorLinkForFirstHalf.getNextMember();
			iteratorLinkForSecondHalf = iteratorLinkForFirstHalf.getNextMember();
		}
		
		iteratorLinkForFirstHalf.setNextMember(iteratorLinkForSecondHalf);
		return new SinglyLinkedList(iteratorLinkForFirstHalf);
	}

	/**
	 * get a sublist for given start to end position (return null if start < 0 or
	 * end >= linkedlist.size
	 */
	public Node getSubSinglyLinkedList(final int start, final int end) {
		Node tempLinkedList = this.head;
		int count = 0;
		Node subLinkedList = null;

		Node tempSubLinkedList = null;
		Node tempNode = null;
		while (tempLinkedList != null && count <= end) {
			if (count >= start) {
				tempNode = new Node(tempLinkedList.getData());
				if (count == start) {
					subLinkedList = tempNode;
					tempSubLinkedList = subLinkedList;
				} else if (tempSubLinkedList != null) {
					tempSubLinkedList.setNextMember(tempNode);
					tempSubLinkedList = tempSubLinkedList.getNextMember();
				}
			}
			tempLinkedList = tempLinkedList.getNextMember();
			count++;
		}

		return subLinkedList;
	}

	/** sort the current linked list */
	public void sort() {
		Node tempHead = this.head;
		final Node newhead = mergeSort(tempHead);
		this.head = newhead;
	}

	/** recursive functions for merge sort */
	private Node mergeSort(final Node head) {
		if (head == null || head.getNextMember() == null) {
			return head;
		} else {
			final Node middleNode = getMiddleNode(head);
			final Node nextToMiddleNode = middleNode.getNextMember();
			middleNode.setNextMember(null);

			return sortAndMerge(mergeSort(head), mergeSort(nextToMiddleNode));
		}

	}

	/** sort & merge 2 linked list */
	private Node sortAndMerge(Node firstSortedHalf, Node secondSortedHalf) {
		final Node link = new Node();

		Node sortedLinkedList = link;

		while ((firstSortedHalf != null) && (secondSortedHalf != null)) {
			if (firstSortedHalf.getData().compareTo(secondSortedHalf.getData()) <= 0) {
				sortedLinkedList.setNextMember(firstSortedHalf);
				sortedLinkedList = firstSortedHalf;
				firstSortedHalf = firstSortedHalf.getNextMember();
			} else {
				sortedLinkedList.setNextMember(secondSortedHalf);
				sortedLinkedList = secondSortedHalf;
				secondSortedHalf = secondSortedHalf.getNextMember();
			}
		}

		sortedLinkedList.setNextMember(firstSortedHalf == null ? secondSortedHalf : firstSortedHalf);
		return link.getNextMember();
	}

	/** get middle member of the linked list */
	private Node getMiddleNode(final Node head) {
		if (head == null) {
			return head;
		}

		Node fastPointer = head.getNextMember();
		Node slowPointer = head;

		while (fastPointer != null) {
			fastPointer = fastPointer.getNextMember();

			if (fastPointer != null) {
				fastPointer = fastPointer.getNextMember();
				slowPointer = slowPointer.getNextMember();
			}
		}

		return slowPointer;
	}

	/** print the linked list */
	public void print() {
		Node link = this.head;

		while (true) {
			if (link == null) {
				System.out.print("null");
				break;
			}
			System.out.print(link.getData() + " --> ");
			link = link.getNextMember();
		}

		System.out.println();

	}
}
