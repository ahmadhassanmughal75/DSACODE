package queue;

class Queue {
    private int maxsize;
    private int[] queue;
    private int front;
    private int rear;

    public Queue(int maxsize) {
        this.maxsize = maxsize;
        this.queue = new int[maxsize];
        this.front = 0;
        this.rear = -1;
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public boolean isFull() {
        return rear == maxsize - 1;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full ");
        } else {
            rear++;
            queue[rear] = data;
        }
    }

    public int deque() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int temp = queue[front];
            front++;
            return temp;
        }
    }

}

public class QueueClass {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(45);
        q.enqueue(46);
        q.enqueue(65);
        q.enqueue(67);
        q.enqueue(98);
        q.enqueue(84);
        System.out.println("deques items :" + q.deque());
        System.out.println("deques items :" + q.deque());
        System.out.println("deques items :" + q.deque());
        System.out.println("deques items :" + q.deque());
        System.out.println("deques items :" + q.deque());
        System.out.println("Developed by :" + "Ahmad Hassan ");
    }
}
