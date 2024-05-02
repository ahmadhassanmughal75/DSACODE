package tree;

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

class BinaryTree {
	Node root;

	public void insert(int data) {
		root = insertRec(root, data);
	}

	private Node insertRec(Node root, int data) {
		Node node=new Node(data);
		if (root == null) {
			root=node;
			//			root = new Node(data);
			return root;
		}
		else if (data <= root.data) {
			root.left = insertRec(root.left, data);
//			root.left = node;

		} else if (data > root.data) {
			root.right = insertRec(root.right, data);
//			root.right = node;

		}
		return root;
	}

	public void preorder() {
		preorderRec(root);
		return;
	}

	private void preorderRec(Node root) {
		if (root == null) {
			return;
		}
			System.out.println(root.data + " ");
			preorderRec(root.left);
			preorderRec(root.right);
		}
	}


public class Tree {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.insert(1);
		tree.insert(2);
		tree.insert(4);
		tree.insert(5);
		tree.insert(24);
		System.out.println("Preorder traversal of binary tree is :");
		tree.preorder();
	}
}
