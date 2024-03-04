import java.util.Scanner;

public class BinarySearchTree  {
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}


public class BST {
	class Node {
		int data;
		Node left;
		Node right;
		
		Node() {
			data = 0;
			left = null;
			right = null;
		}
	}
	
	node root = null;

	void insert (int item) {
		node newNode = new node();
		newNode.data = item;

		if (root == null) {
			root = newNode;
		}
		else {
			Node q = root;
			
			while (q != null) {				
				if (item < q.data) {
					q = q.left;
				}
				else if (item >= q.data) {
					q = q.right;
				}
			}			
			q = newNode;				
		}
	}

	void printBST(Node node) {
		System.out.println(node.data);
		
		printBST(node.left);
		printBST(node.right);
	}
}