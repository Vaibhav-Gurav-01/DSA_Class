package queue;

public class Queue_Class {
	private int queue[], MaxSize,front ,rear;

	public void create_Queue(int size) {
		front =0;
		rear = -1;
		queue = new int[size]; // create stack
		MaxSize = size; // init maxsize
	}

	void Enque(int e) {
		rear++;		//increase rear
		queue[rear] = e; // insert  at rear
		System.out.println("Element" + e + " Inserted in queue.");
	}

	boolean is_full() {
		if (rear == MaxSize - 1) {
			return true;
		} else {
			return false;
		}
	}

	int Dequeue() {
		int temp = queue[front];
		front++;
		return (temp);

		// return(stack[tos--]);
	}

	boolean is_Empty() {

		if (front > rear)		//0 > -1
			return true;
		else
			return false;
	}


	void print_Queue() { 
		for (int i = front; i <= rear; i++) {
			System.out.println(queue[i]   + " -- ");
		}
	}
}
