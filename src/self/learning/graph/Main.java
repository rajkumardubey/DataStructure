/**
 * Copyright (©) 2017. All rights reserved.
 *
 * @author Raj Kumar Dubey
 */
package self.learning.graph;

public class Main {

	public static void main(String[] args) {
		final Graph myGraph = new Graph(5);

		/*
		 * The graph is like this
		 * 
		 * 0---------1-----4 
		 * |		 |
		 * |		 |
		 * 2---------3
		 */

		myGraph.addEdge(0, 1);
		myGraph.addEdge(0, 2);
		myGraph.addEdge(1, 4);
		myGraph.addEdge(1, 3);
		myGraph.addEdge(2, 3);

		myGraph.print();

		final int searchedNumber = 1;

		System.out.println("\n\n------------------------------------------------------------------------------");
		System.out.println("BFS Search for " + searchedNumber);
		myGraph.breadthFirstTraversal(searchedNumber);

		System.out.println("\n\n------------------------------------------------------------------------------");
		System.out.println("DFS Search for " + searchedNumber);
		myGraph.depthFirstTraversal(searchedNumber);
	}

}
