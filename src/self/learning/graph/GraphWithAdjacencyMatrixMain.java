/**
 * Copyright (©) 2017. All rights reserved.
 *
 * @author Raj Kumar Dubey
 */
package self.learning.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class GraphWithAdjacencyMatrix {

	/* No of vertices in the Graph */
	int verticesCount;
	/* array of adjacency list */
	int[][] adjacencyMatrix;

	public GraphWithAdjacencyMatrix(final int v) {
		this.verticesCount = v;

		adjacencyMatrix = new int[v][v];

		/* creating empty matrix of all vertices */
		for (int row = 0; row < v; row++) {
			for (int column = 0; column < v; column++) {
				adjacencyMatrix[row][column] = 0;
			}
		}
	}

	/* Add a new edge in the undirected graph */
	public boolean addEdge(final int vertice1, final int vertice2) {
		boolean isAdded = false;

		try {
			adjacencyMatrix[vertice1][vertice2] = 1;
			adjacencyMatrix[vertice2][vertice1] = 1;
			isAdded = true;
		} catch (final Exception exception) {
			System.err.println("-----ERROR--------\n" + exception.getMessage());
		}

		return isAdded;
	}

	/* Add a new edge in the undirected graph */
	public boolean addEdge(final int vertice1, final int vertice2, final int weight) {
		boolean isAdded = false;

		try {
			adjacencyMatrix[vertice1][vertice2] = weight;
			adjacencyMatrix[vertice2][vertice1] = weight;
			isAdded = true;
		} catch (final Exception exception) {
			System.err.println("-----ERROR--------\n" + exception.getMessage());
		}

		return isAdded;
	}

	/* print the graph */
	public void print() {
		/* creating empty matrix of all vertices */
		System.out.println("---------------------------------Adjacency Matrix---------------------------------");
		System.out.println();

		for (int row = 0; row < this.verticesCount; row++) {
			System.out.println();
			for (int column = 0; column < this.verticesCount; column++) {
				System.out.print(adjacencyMatrix[row][column] + " ");
			}
		}

		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------");

		for (int row = 0; row < this.verticesCount; row++) {
			System.out.println("Adjacency list for " + row);

			System.out.print("head");
			for (int column = 0; column < this.verticesCount; column++) {
				if (adjacencyMatrix[row][column] != 0)
					System.out.print(" -> " + column);
			}
			System.out.println();
			System.out.println();
		}
	}

	/* perform Breadth First Traversal */
	public void breadthFirstTraversal(final int startPoint) {
		final boolean[] isVerticesVisited = new boolean[this.adjacencyMatrix[startPoint].length];
		final Queue<Integer> queue = new LinkedList<>();

		isVerticesVisited[startPoint] = true;
		queue.add(startPoint);

		int selectedVertice;
		while (!queue.isEmpty()) {
			selectedVertice = queue.poll();

			System.out.print(selectedVertice + " ");

			for (int coulmn = 0; coulmn < this.adjacencyMatrix[selectedVertice].length; coulmn++) {
				if (!isVerticesVisited[coulmn] && this.adjacencyMatrix[selectedVertice][coulmn] != 0) {
					queue.add(coulmn);
					isVerticesVisited[coulmn] = true;
				}
			}
		}
	}

	/* perform depth First Traversal */
	public void depthFirstTraversal(final int startPoint) {
		final boolean[] isVerticesVisited = new boolean[this.adjacencyMatrix[startPoint].length];

		final Stack<Integer> stack = new Stack<>();

		stack.push(startPoint);

		int selectedVertice;
		while (!stack.isEmpty()) {
			selectedVertice = stack.peek();
			stack.pop();

			if (!isVerticesVisited[selectedVertice]) {
				System.out.print(selectedVertice + " ");
				isVerticesVisited[selectedVertice] = true;
			}

			for (int coulmn = 0; coulmn < this.adjacencyMatrix[selectedVertice].length; coulmn++) {
				if (!isVerticesVisited[coulmn] && this.adjacencyMatrix[selectedVertice][coulmn] != 0) {
					stack.push(coulmn);
				}
			}
		}
	}

	/* check is cyclic */
	public boolean isCyclic(final int startPoint) {
		// TODO

		return false;
	}
}

public class GraphWithAdjacencyMatrixMain {

	/**
	 * <b>Graph</b>
	 * 
	 * This represent an undirected weighted graph.
	 */
	public static void main(String[] args) {
		final GraphWithAdjacencyMatrix myGraph = new GraphWithAdjacencyMatrix(5);

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

		System.out.println("\n\n------------------------------------------------------------------------------");
		System.out.println("\n\nGraph has a cylce starting from " + searchedNumber + " : " + myGraph.isCyclic(4));
		System.exit(0);
	}

}
