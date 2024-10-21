package Queue;

import java.util.Stack;

public class QueueUsingStacks {
	private Stack st1;
	private Stack st2;

	public QueueUsingStacks(int size) {
		st1 = new Stack();
		st2 = new Stack();
	}

	public void enqueue(int value) {
		st1.push(value);
	}

	public int dequeue() {
		if (st2.isEmpty()) {
			while (!st1.isEmpty()) {
				st2.push(st1.pop());
			}
		}
		if (st2.isEmpty()) {
			System.out.println("Queue is Empty");
		}
		return (int) st2.pop();
	}

	public boolean isEmpty() {
		return st1.isEmpty() && st2.isEmpty();
	}

	public static void main(String[] args) {
		QueueUsingStacks queue = new QueueUsingStacks(5);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		
		
		
		System.out.println("Dequeued: " + queue.dequeue());
		System.out.println("Dequeued: " + queue.dequeue());
		System.out.println("Dequeued: " + queue.dequeue());

	}
}
