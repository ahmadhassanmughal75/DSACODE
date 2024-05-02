package treetraversal;
class Node{
	int data;
	Node left;
	Node right;
	public Node(int data) {
      this.data=data;
      this.left=null;
      this.right=null;
	}
}
public class TreeTraversal {
	static Node root;
	public static void insert(int data) {
		root=insertRec(root,data);
	}
	public static Node insertRec(Node root , int data) {
		Node node=new Node(data);
		if(root==null) {
			root=node;
			return root;
		}
		else if(data<=root.data) {
			root.left=insertRec(root.left, data);
		}
		else if(data>root.data) {
			root.right=insertRec(root.right, data);
		}
		return root;
	}
	public static void preorder() {
		preorderRec(root);
	}
	public static void preorderRec(Node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data +" ");
		preorderRec(root.left);
		preorderRec(root.right);
	}
//	public static void postorder() {
//		postorderRec(root);
//	}
	public static void postorderRec(Node root) {
		if(root==null) {
			return;
		}
		postorderRec(root.left);
		postorderRec(root.right);
		System.out.print(root.data +" ");
	}
//	public static void inorder() {
//		inorderRec(root);
//	}
	public static void inorderRec(Node root) {
		if(root==null) {
			return;
		}
		inorderRec(root.left);
		System.out.print(root.data +" ");
		inorderRec(root.right);
	}
	public static boolean search (Node root , int key) {
		if(root==null) {
			return false;
		}
		else if(root.data==key) {
			return true;
		}
		else if(root.data>key) {
			return search(root.left, key);
		}
		else  {
			return search(root.right, key);
		}
	}
	public static Node delete(Node root , int key) {
	if(root.data>key) {
		root.left=delete(root.left, key);
	}
		else if(root.data<key) {
			root.right=delete(root.right, key);
		}
//	case1
	if(root.left==null&&root.right==null) {
		return null;
	}
//	case2
	else if(root.left==null) {
		return root.right;
	}
	else if(root.right==null) {
		return root.left;
	}
//	case2
	Node is=inorderSuccseor(root);
	root.right=delete(root.right, is.data);
	return root;
	}
	public static Node inorderSuccseor(Node root) {
		while(root.left!=null) {
			root=root.left;
	}
	return root;
	}
public static void main(String[] args) {
	insert(3);
	insert(24);
	insert(59);
	insert(1);
	insert(24);
	insert(14);
	insert(4);
//	System.out.print("in preorder :");
//	preorder();
//	System.out.println("in postorder");
//	postorder();
	System.out.println("in inorder");
	inorderRec(root);
	System.out.println();
//	if(search(root, 567)) {
//		System.out.println("Found");
//	}
//	else {
//		System.out.println(" NOT found");
//	}
	delete(root, 24);
	System.out.println("in inorder");
	inorderRec(root);
	System.out.println();
	
}
}
