package stack;

public class StackClass {
	private int stack[], MaxSize, tos;

	public void create_Stack(int size) {
		tos = -1; // int tos
		stack = new int[size]; // create stack
		MaxSize = size; // init maxsize
	}

	void push(int e) {
		tos++;
		stack[tos] = e; // push(10);
		System.out.println("Element" + e + "Pushed.");
	}

	boolean is_full() {
		if (tos == MaxSize - 1) {
			return true;
		} else {
			return false;
		}
	}

	int pop() {
		int temp = stack[tos];
		tos--;
		return (temp);

		// return(stack[tos--]);
	}

	boolean is_Empty() {

		if (tos == -1)
			return true;
		else
			return false;
	}

	int peek() {
		return (stack[tos]);
	}

	void print_Stack() {
		for (int i = tos; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}
}
