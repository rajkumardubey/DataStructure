# DataStructure

A data structure is a particular way of organizing data in a computer so that it can be used effectively. The idea is to reduce the space and time complexities of different tasks.

Below is an overview of some popular linear data structures.

1. Array
2. Linked List
3. Stack
4. Queue
5. Binary Tree
6. Binary Search Tree
7. Graph

## Array

Array is a data structure used to store homogeneous elements at contiguous locations. Size of an array must be provided before storing data.


Let size of array be n.

**Accessing Time**	:	O(1) [This is possible because elements are stored at contiguous locations]   

**Search Time**		: 	O(n) for Sequential Search; O(log n) for Binary Search [If Array is sorted]

**Insertion Time**	:	O(n) [The worst case occurs when insertion happens at the Beginning of an array and requires shifting all of the elements]

**Deletion Time**	:	O(n) [The worst case occurs when deletion happens at the Beginning of an array and requires shifting all of the elements]

## Linked List

A linked list is a linear data structure (like arrays) where each element is a separate object. Each element (that is node) of a list is comprising of two items – the data and a reference to the next node.


### Types of Linked List

- **Singly Linked List** : In this type of linked list, every node stores address or reference of next node in list and the last node has next address or reference as NULL. For example 1->2->3->4->NULL

- **Doubly Linked List** : In this type of Linked list, there are two references associated with each node, One of the reference points to the next node and one to the previous node. Advantage of this data structure is that we can traverse in both the directions and for deletion we don’t need to have explicit access to previous node. Eg. NULL<-1<->2<->3->NULL

- **Circular Linked List** : Circular linked list is a linked list where all nodes are connected to form a circle. There is no NULL at the end. A circular linked list can be a singly circular linked list or doubly circular linked list. Advantage of this data structure is that any node can be made as starting node. This is useful in implementation of circular queue in linked list. Eg. 1->2->3->1 [The next pointer of last node is pointing to the first]

### Linked List Properties

**Accessing Time**	:	O(n) 

**Search Time**		: 	O(n) 

**Insertion Time**	:	O(1) [If we are at the position where we have to insert an element] 

**Deletion Time**	:	O(1) [If we know address of node previous the node to be deleted] 


## Stack

A stack or LIFO (last in, first out) is an abstract data type that serves as a collection of elements, with two principal operations: push, which adds an element to the collection, and pop, which removes the last element that was added. In stack both the operations of push and pop takes place at the same end that is top of the stack. It can be implemented by using both array and linked list.


**Insertion Time**	:	O(1) 

**Deletion Time**	:	O(1) 

**Access Time** 	:	O(n) [Worst Case]

Note: Insertion and Deletion are allowed on one end.

## Queue

A queue or FIFO (first in, first out) is an abstract data type that serves as a collection of elements, with two principal operations: enqueue, the process of adding an element to the collection.(The element is added from the rear side) and dequeue, the process of removing the first element that was added. (The element is removed from the front side). It can be implemented by using both array and linked list. 

**Insertion Time**	:	O(1) 

**Deletion Time**	:	O(1) 

**Access Time** 	:	O(n) [Worst Case]

	
Note: **Circular Queue**:- The advantage of this data structure is that it reduces wastage of space in case of array implementation, As the insertion of the (n+1)’th element is done at the 0’th index if it is empty.

## Binary Tree

Unlike Arrays, Linked Lists, Stack and queues, which are linear data structures, trees are hierarchical data structures. A binary tree is a tree data structure in which each node has at most two children, which are referred to as the left child and the right child. It is implemented mainly using Links.

### Binary Tree Representation

A tree is represented by a pointer to the topmost node in tree. If the tree is empty, then value of root is NULL. A Binary Tree node contains following parts.

1. Data
2. Pointer to left child
3. Pointer to right child

A Binary Tree can be traversed in two ways:

- Depth First Traversal: Inorder (Left-Root-Right), Preorder (Root-Left-Right) and Postorder (Left-Right-Root)
- Breadth First Traversal: Level Order Traversal

### Binary Tree Properties

**The maximum number of nodes at level ‘l’** = 2l-1.

**Maximum number of nodes** = 2h – 1. [Here h is height of a tree. Height is considered  as is maximum number of nodes on root to leaf path]

**Minimum possible height** =  ceil(Log2(n+1))   

In Binary tree, number of leaf nodes is always one more than nodes with two children.

**Time Complexity of Tree Traversal** = O(n)

## Binary Search Tree

In Binary Search Tree is a Binary Tree with following additional properties:

- The left subtree of a node contains only nodes with keys less than the node’s key.
- The right subtree of a node contains only nodes with keys greater than the node’s key.
- The left and right subtree each must also be a binary search tree.

### BST Properties

Search :  O(h)

Insertion : O(h)

Deletion : O(h)

Extra Space : O(n) for pointers

Note:
	
	**h**: Height of BST
	
	**n**: Number of nodes in BST

BST provide moderate access/search (quicker than Linked List and slower than arrays).

BST provide moderate insertion/deletion (quicker than Arrays and slower than Linked Lists).

## Graph

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

{blank}
{blank}

- 1: **Adjacency Matrix**
{blank}
{blank}

<img align="left" src="http://www.geeksforgeeks.org/wp-content/uploads/adjacency_matrix_representation.png">
{blank}
{blank}

- 2: **Adjacency List**

{blank}
{blank}
<img align="left" src="http://www.geeksforgeeks.org/wp-content/uploads/adjacency_list_representation.png">
{blank}
{blank}


### Graph Properties

Time Complexities in case of Adjacency Matrix :
	

**Traversal**	:	By BFS or DFS) O(V^2)

**Space**		:	O(V^2)
	
Time Complexities in case of Adjacency List :
	

**Traversal**	:	(By BFS or DFS) O(ElogV)

**Space**		:	O(V+E)
