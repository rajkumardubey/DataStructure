/**
 * Copyright (©) 2017. All rights reserved.
 *
 * @author Raj Kumar Dubey
 */
package self.learning.linkedlist;

public class Main {

	public static void main(String[] args) {
		final Node firstMember = new Node("first");

		final SinglyLinkedList singlyLinkedList = new SinglyLinkedList(firstMember);

		final Node secondMember = new Node("second");
		final Node thirdMember = new Node("third");
		final Node forthMember = new Node("forth");
		singlyLinkedList.addAtTheEnd(secondMember);
		singlyLinkedList.addAtTheEnd(thirdMember);
		singlyLinkedList.addAtTheEnd(forthMember);

		singlyLinkedList.addAtTheEnd("sixth");
		singlyLinkedList.addAtTheStart("zeroth");

		singlyLinkedList.addAtGivenPosition(5, "fifth");
		singlyLinkedList.print();

		System.out.println(singlyLinkedList.getSubSinglyLinkedList(2, 4));

		System.out.println(singlyLinkedList.getNode(2));
		System.out.println(singlyLinkedList.getNodeValue(-2));
		System.out.println(singlyLinkedList.getNodeValue(20));
		System.out.println(singlyLinkedList.getNodeValue(4));

		System.out.println(singlyLinkedList.size());

		singlyLinkedList.print();

		SinglyLinkedList reversedLinkedList = singlyLinkedList.reverse();

		System.out.println();
		reversedLinkedList.print();

		singlyLinkedList.sort();

		System.out.println("Sorted List");
		singlyLinkedList.print();

	}

}
