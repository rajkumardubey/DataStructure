/**
 * Copyright (©) 2017. All rights reserved.
 *
 * @author Raj Kumar Dubey
 */
package self.learning.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * <b>Graph</b>
 * 
 * This represent an undirected graph.
 */
public class Graph {

	/* No of vertices in the Graph */
	int verticesCount;
	/* array of adjacency list */
	LinkedList<Integer> adjacencyList[];

	@SuppressWarnings("unchecked")
	public Graph(final int v) {
		this.verticesCount = v;

		adjacencyList = new LinkedList[v];

		/* creating empty linked list of all vertices */
		for (int count = 0; count < adjacencyList.length; count++) {
			adjacencyList[count] = new LinkedList<>();
		}
	}

	/* Add a new edge in the graph */
	public boolean addEdge(final int vertice1, final int vertice2) {
		boolean isAdded = false;

		try {

			adjacencyList[vertice1].add(vertice2);
			adjacencyList[vertice2].add(vertice1);
			isAdded = true;
		} catch (final Exception exception) {
			System.err.println("-----ERROR--------\n" + exception.getMessage());
		}

		return isAdded;
	}

	/* print the graph */
	public void print() {
		for (int count = 0; count < adjacencyList.length; count++) {
			LinkedList<Integer> edges = adjacencyList[count];
			System.out.println("Adjacency list for " + count);

			System.out.print("head");
			for (Integer edge : edges) {
				System.out.print(" -> " + edge);
			}

			System.out.println();
			System.out.println();
		}
	}

	/* perform Breadth First Traversal */
	public void breadthFirstTraversal(final int startPoint) {
		final boolean[] isVerticesVisited = new boolean[adjacencyList.length];
		final Queue<Integer> queue = new LinkedList<>();

		isVerticesVisited[startPoint] = true;
		queue.add(startPoint);

		int selectedVertice;
		int vertice;
		while (!queue.isEmpty()) {
			selectedVertice = queue.poll();

			System.out.print(selectedVertice + " ");

			Iterator<Integer> edgeIterator = adjacencyList[selectedVertice].listIterator();

			while (edgeIterator.hasNext()) {
				vertice = edgeIterator.next();
				if (!isVerticesVisited[vertice]) {
					queue.add(vertice);
					isVerticesVisited[vertice] = true;
				}
			}
		}
	}

	public void depthFirstTraversal(final int startPoint) {
		final boolean[] isVerticesVisited = new boolean[adjacencyList.length];

		depthFirstTraversalRecursion(startPoint, isVerticesVisited);
	}

	/* perform Depth First Traversal */
	public void depthFirstTraversalRecursion(final int startPoint, final boolean[] isVerticesVisited) {
		isVerticesVisited[startPoint] = true;
		System.out.print(startPoint + " ");
		Iterator<Integer> edgeIterator = adjacencyList[startPoint].listIterator();

		int vertice;
		while (edgeIterator.hasNext()) {
			vertice = edgeIterator.next();
			if (!isVerticesVisited[vertice]) {
				depthFirstTraversalRecursion(vertice, isVerticesVisited);
			}
		}
	}

}
