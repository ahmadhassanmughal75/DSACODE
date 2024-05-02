package newLinkedList;

class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data=data;
		this.next=null;
		LinkedList.size++;
	}
}
class LinkedList{
	 static int size=0;
	Node head;
	Node tail;
	public boolean isHeadNull() {
		return head==null;
	}
	public void addFirst(int data) {
		Node node=new Node(data);
		if(isHeadNull()) {
		tail=head=node;
		}
		else {
			node.next=head;
			head=node;
		}
	}
	public void addLast(int data) {
		Node node=new Node(data);
		if(isHeadNull()) {
			head=tail=node;
		}
		else {
			tail.next=node;
			tail=node;
	}
	}
	public void display() {
		if(isHeadNull()) {
			System.out.println("Linked List is Empty");
		} 
		else {
			Node currNode=head;
			while(currNode!=null) {
				System.out.print(currNode.data + " ");
				currNode=currNode.next;
			}
		}
	}
	public Node find(int data) {
		Node currNode=head;
		while(currNode!=null) {
			if(currNode.data==data) {
				return currNode;
			}
			currNode=currNode.next;
		}
		return null;
	}
	public int getsize() {
		return size;
	}
	public void delete(int key) {
	    if (head == null) {
	        System.out.println("List is empty");
	        return;
	    }

	    if (head.data == key) {
	        head = head.next;
	        return;
	    }

	    Node prev = null;
	    Node current = head;

	    while (current != null && current.data != key) {
	        prev = current;
	        current = current.next;
	    }

	    if (current == null) {
	        System.out.println("Element not found");
	        return;
	    }

	    prev.next = current.next;
	}

}
public class DeleteMethod {
public static void main(String[] args) {
	LinkedList linkedList = new LinkedList();
	linkedList.addFirst(4);
	linkedList.addFirst(3);
	linkedList.addFirst(2);
	linkedList.addFirst(1);
	linkedList.addLast(7);
	linkedList.addLast(75);
	linkedList.addLast(84);
	linkedList.addFirst(1);
	linkedList.display();
	System.out.println();
	Node f = linkedList.find(82); // find item
	if( f != null) {
	System.out.println("Found link with key " + f.data);
	}
	else {
		System.out.println("Cannot find link");
	}
	linkedList.display();
	System.out.println();
	System.out.println("Size of array is "+ linkedList.getsize());
	linkedList.delete(84);
	linkedList.display();
	System.out.println("Developed by Ahmad Hassan");
}
}
