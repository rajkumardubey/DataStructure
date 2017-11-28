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

<br></br>

<img src="http://www.geeksforgeeks.org/wp-content/uploads/graph_representation12.png">

<br></br>
<br></br>

- 1: **Adjacency Matrix**

<br></br>

<img src="http://www.geeksforgeeks.org/wp-content/uploads/adjacency_matrix_representation.png">

<br></br>
<br></br>

- 2: **Adjacency List**

<br></br>

<img align="left" src="http://www.geeksforgeeks.org/wp-content/uploads/adjacency_list_representation.png">

<br></br>
<br></br>


### Graph Properties

Time Complexities in case of Adjacency Matrix :
	

**Traversal**	:	By BFS or DFS) O(V^2)

**Space**		:	O(V^2)
	
Time Complexities in case of Adjacency List :
	

**Traversal**	:	(By BFS or DFS) O(ElogV)

**Space**		:	O(V+E)


### Depth First Search

The DFS algorithm is a recursive algorithm that uses the idea of backtracking. It involves exhaustive searches of all the nodes by going ahead, if possible, else by backtracking.

Here, the word backtrack means that when you are moving forward and there are no more nodes along the current path, you move backwards on the same path to find nodes to traverse. All the nodes will be visited on the current path till all the unvisited nodes have been traversed after which the next path will be selected.

This recursive nature of DFS can be implemented using stacks. The basic idea is as follows:
- Pick a starting node and push all its adjacent nodes into a stack.
- Pop a node from stack to select the next node to visit and push all its adjacent nodes into a stack.
- Repeat this process until the stack is empty. However, ensure that the nodes that are visited are marked. This will prevent you from visiting the same node more than once. If you do not mark the nodes that are visited and you visit the same node more than once, you may end up in an infinite loop.

<br></br>

The following image shows how BFS works.

<br></br>
<br></br>

<img src="https://he-s3.s3.amazonaws.com/media/uploads/9fa1119.jpg">

#### Pseudocode

```
    DFS-iterative (G, s):                                   //Where G is graph and s is source vertex
      let S be stack
      S.push( s )            //Inserting s in stack 
      mark s as visited.
      while ( S is not empty):
          //Pop a vertex from stack to visit next
          v  =  S.top( )
         S.pop( )
         //Push all the neighbours of v in stack that are not visited   
        for all neighbours w of v in Graph G:
            if w is not visited :
                     S.push( w )         
                    mark w as visited


    DFS-recursive(G, s):
        mark s as visited
        for all neighbours w of s in Graph G:
            if w is not visited:
                DFS-recursive(G, w)
```


#### Time complexity

O(V + E), when implemented using an adjacency list.


<br></br>

### Breadth First Search

BFS is a traversing algorithm where you should start traversing from a selected node (source or starting node) and traverse the graph layer-wise thus exploring the neighbour nodes (nodes which are directly connected to source node). You must then move towards the next-level neighbour nodes.

As the name BFS suggests, you are required to traverse the graph breadth-wise as follows:

- First move horizontally and visit all the nodes of the current layer
- Move to the next layer

Consider the following diagram:
<br></br>
<br></br>
<img src="https://he-s3.s3.amazonaws.com/media/uploads/fdec3c2.jpg">
<br></br>
<br></br>

The distance between the nodes in layer 1 is comparitively lesser than the distance between the nodes in layer 2. Therefore, in BFS, you must traverse all the nodes in layer 1 before you move to the nodes in layer 2.

#### Traversing child nodes

A graph can contain cycles, which may bring you to the same node again while traversing the graph. To avoid processing of same node again, use a boolean array which marks the node after it is processed. While visiting the nodes in the layer of a graph, store them in a manner such that you can traverse the corresponding child nodes in a similar order.

In the earlier diagram, start traversing from 0 and visit its child nodes 1, 2, and 3. Store them in the order in which they are visited. This will allow you to visit the child nodes of 1 first (i.e. 4 and 5), then of 2 (i.e. 6 and 7), and then of 3 (i.e. 7) etc.

To make this process easy, use a queue to store the node and mark it as 'visited' until all its neighbours (vertices that are directly connected to it) are marked. The queue follows the First In First Out (FIFO) queuing method, and therefore, the neigbors of the node will be visited in the order in which they were inserted in the node i.e. the node that was inserted first will be visited first, and so on.

<br></br>

The following image shows how BFS works.

<br></br>
<br></br>

<img src="https://he-s3.s3.amazonaws.com/media/uploads/0dbec9e.jpg">

#### Pseudocode

```
BFS (G, s)                   //Where G is the graph and s is the source node
      let Q be queue.
      Q.enqueue( s ) //Inserting s in queue until all its neighbour vertices are marked.

      mark s as visited.
      while ( Q is not empty)
           //Removing that vertex from queue,whose neighbour will be visited now
           v  =  Q.dequeue( )

          //processing all the neighbours of v  
          for all neighbours w of v in Graph G
               if w is not visited 
                        Q.enqueue( w )             //Stores w in Q to further visit its neighbour
                        mark w as visited.
```

#### Complexity

The time complexity of BFS is O(V + E), where V is the number of nodes and E is the number of edges.