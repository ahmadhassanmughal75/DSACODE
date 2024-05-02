package stack;

class StackClass {
	private int size;
	private int[] array;
	private int top;

	public StackClass(int size) {
		this.size = size;
		array = new int[size];
		top = -1;
	}

	public boolean isFull() {
		return (top == size - 1);
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public void push(int value) {
		if (isFull()) {
			System.out.println("Stack is full");
		} else {
			top++;
			array[top] = value;
		}
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		} else {
			return array[top];
		}
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("stack is empty");
			return -1;
		} else {
			int value = array[top];
			top--;
			return value;
		}
	}
}

public class Stack {
	public static void main(String[] args) {
		StackClass stack = new StackClass(5);
//		push
		stack.push(5);
		stack.push(8);
		stack.push(9);
		stack.push(4);
		stack.push(6);
//		peek
		System.out.println("First element of stack: " + stack.peek());
//        pop
		System.out.println("Popped value:" + stack.pop());
		System.out.println("Popped value:" + stack.pop());
		System.out.println("Popped value:" + stack.pop());
		System.out.println("Popped value:" + stack.pop());
		System.out.println("Popped value:" + stack.pop());
		System.out.println("Program by :" + "Ahmad Hassan");
		System.out.println("Developed this program by "+ "Ahmad HASSAN ");
	}
}
