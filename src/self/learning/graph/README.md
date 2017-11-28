# Graph

Graph is a data structure that consists of following two components:

- A finite set of vertices also called as nodes.
- A finite set of ordered pair of the form (u, v) called as edge. The pair is ordered because (u, v) is not same as (v, u) in case of directed graph(di-graph). The pair of form (u, v) indicates that there is an edge from vertex u to vertex v. The edges may contain weight/value/cost.

	V -> Number of Vertices.
	E -> Number of Edges.

Graph can be classified on the basis of many things, below are the two most common classifications :

- Direction
	
**Undirected Graph** : The graph in which all the edges are bidirectional.

**Directed Graph** : The graph in which all the edges are unidirectional.

- Weight

**Weighted Graph** : The Graph in which weight is associated with the edges.
	
**Unweighted Graph** : The Graph in which their is no weight associated to the edges.


Graph can be represented in many ways, below are the two most common representations :

<img align="left" src="http://www.geeksforgeeks.org/wp-content/uploads/graph_representation12.png">

</br>
</br>

- 1: **Adjacency Matrix**
</br>

<img align="left" src="http://www.geeksforgeeks.org/wp-content/uploads/adjacency_matrix_representation.png">
</br>
</br>

- 2: **Adjacency List**

</br>
<img align="left" src="http://www.geeksforgeeks.org/wp-content/uploads/adjacency_list_representation.png">
</br>
</br>


### Graph Properties

Time Complexities in case of Adjacency Matrix :
	

**Traversal**	:	By BFS or DFS) O(V^2)
**Space**		:	O(V^2)
	
Time Complexities in case of Adjacency List :
	

**Traversal**	:	(By BFS or DFS) O(ElogV)
**Space**		:	O(V+E)
