package Queue;

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

	
	
}
