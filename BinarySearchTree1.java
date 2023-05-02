/*
 * This java program implements binary search tree
 */
package binarysearchtree;

import java.util.*;

/*Representing a Node of a binary tree */
class Node {
	int value;
	Node left, right;

	Node(int value) {
		this.value = value;
		left = null;
		right = null;
	}
}

class BTS {
	Node root; // root of a binary search tree

	BTS() {
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

public class BinarySearchTree1 {

	public static void main(String[] args) {

		BTS tree = new BTS();
		tree.insert(56);
		tree.insert(30);
		tree.insert(70);

		tree.print(tree.root);
	}
}
