package Queue;

public class Stack_Class {
	private int stack[], MaxSize, tos;

	public void create_Stack(int size) {

		tos = -1; // int tos

		stack = new int[size]; // create stack

		MaxSize = size; // init maxsize

	}

	public void push(int e) {

		tos++;

		stack[tos] = e; // push(10);

		System.out.println("Element" + e + "Pushed.");

	}

	public int pop() {

		int temp = stack[tos];

		tos--;

		return (temp);

		// return(stack[tos--]);

	}

	public boolean is_Empty() {

		if (tos == -1)

			return true;

		else

			return false;

	}

}
