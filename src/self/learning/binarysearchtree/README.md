# Binary Tree

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
- The left and right subtree each must also be a binary isExists tree.

### BST Properties

Search :  O(h)

Insertion : O(h)

Deletion : O(h)

Extra Space : O(n) for pointers

Note:
	
**h**: Height of BST
	
**n**: Number of nodes in BST

BST provide moderate access/isExists (quicker than Linked List and slower than arrays).

BST provide moderate insertion/deletion (quicker than Arrays and slower than Linked Lists).
