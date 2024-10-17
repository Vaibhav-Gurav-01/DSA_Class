package queue;

public class Priority_Queue_Class {
	private int queue[], MaxSize,front ,rear;

	public void create_Queue(int size) {
		front =0;
		rear = -1;
		queue = new int[size]; // create stack
		MaxSize = size; 
	}

	void Enque(int e) {
		rear++;		//increase rear
		queue[rear] = e; // insert  at rear
		System.out.println("Element" + e + " Inserted in queue.");
		
		for(int i=front;i<rear;i++)
        {
            for(int j=front;j<rear;j++)
            {
                if(queue[j]>queue[j+1])
                
                {
                    int temp=queue[j];
                    queue[j]=queue[j+1];
                    queue[j+1]=temp;
                }
            }
        }
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
