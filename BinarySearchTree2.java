/*
 * This java program implements binary search tree 
 */
package binarysearchtree;
/**
 * 
 * @author Kaif
 *
 */

/*
 * Representing a Node of a binary tree 
 */
class Node2 {
	int data;
	Node left, right;

	Node2(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

class BTS2 {
	/*
	 * root of a binary search tree
	 */
	Node root;

	BTS2() {
		root = null;
	}

	public void insert(int item) {
		root = insertNode(root, item); // calling inserNode() method
	}

	public Node insertNode(Node root, int item) {
		if (root == null) // if root is null create a new Node
		{
			root = new Node(item);
			return root;
		}
		if (item < root.value) // if item is less than the current value then traverse left subtree
			root.left = insertNode(root.left, item);
		else if (item > root.value) // if item is greater than the cureent value then traverse the right subtree
			root.right = insertNode(root.right, item);
		return root;
	}

	public void print(Node ptr) {
		if (ptr == null)
			return;
		print(ptr.left);
		System.out.print(ptr.value + " ");
		print(ptr.right);
	}
}

public class BinarySearchTree2 {

	public static void main(String[] args) {

		/*
		 * Adding Nodes to the binary tree
		 */
		BTS tree = new BTS();
		
		/*
		 * To insert elements in tree
		 */
		tree.insert(56);
		tree.insert(30);
		tree.insert(70);
		tree.insert(22);
		tree.insert(40);
		tree.insert(11);
		tree.insert(3);
		tree.insert(16);
		tree.insert(70);
		tree.insert(60);
		tree.insert(95);
		tree.insert(65);
		tree.insert(63);
		tree.insert(67);

		tree.print(tree.root);
		System.out.println();
	}
}
