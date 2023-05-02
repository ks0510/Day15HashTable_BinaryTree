/*
 * This java program search element in binary search tree
 */
package binarysearchtree;
/**
 * 
 * @author Kaif
 *
 */

class Node3 {
	int data;
	Node left, right;

	Node3(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

class BTS3 {
	/*
	 * root of a binary search tree
	 */
	Node root;

	BTS3() {
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

	public Node searchNode(Node root, int value) {
		if (root == null)
			return null;
		if (root.value == value) // return true if value is found in binary tree
			return root;
		else if (value < root.value)
			return searchNode(root.left, value); // traverse left subtree
		else
			return searchNode(root.right, value); // traverse right subtree
	}

	public void print(Node ptr) {
		if (ptr == null)
			return;
		print(ptr.left);
		System.out.print(ptr.value + " ");
		print(ptr.right);
	}

}

public class BinarySearchTree3 {

	public static void main(String[] args) {

		/*
		 * Adding Nodes to the binary tree
		 */
		BTS3 tree3 = new BTS3();

		/*
		 * To insert elements in tree
		 */
		tree3.insert(56);
		tree3.insert(30);
		tree3.insert(70);
		tree3.insert(22);
		tree3.insert(40);
		tree3.insert(11);
		tree3.insert(3);
		tree3.insert(16);
		tree3.insert(70);
		tree3.insert(60);
		tree3.insert(95);
		tree3.insert(65);
		tree3.insert(63);
		tree3.insert(67);

		Node node = tree3.searchNode(tree3.root, 63);
		if (node != null) {
			System.out.println("Element " + node.value + " is found in binary  tree");
		} else {
			System.out.println("Element is not found in binary tree");
		}
	}
}
