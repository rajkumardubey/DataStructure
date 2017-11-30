package self.learning.binarysearchtree;

public class Main {

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();

		/*
		 * Let us create following BST
		 *   50
		 *   / \
		 *  30 70
		 * / \ / \
		 *20 40 60 80
		 */
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		// print inorder traversal of the BST
		tree.inorder();

		System.out.println(tree.searchParent(50));

		System.out.println(tree.getVerticalSum().entrySet());

		System.out.println(tree.search(1000));

		tree.delete(50);

		tree.inorder();

		final int[] sortedArray = { 2, 4, 6, 8, 10, 12, 14, 16 };

		BinarySearchTree treeFromArray = new BinarySearchTree(sortedArray);

		treeFromArray.inorder();
	}

}
