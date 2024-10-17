package stackassignment1;

public class StackClassAss {
	private int stack[], Max_size,tos,n;
	
	
	void create_stack(int size) {
		tos=-1;
		stack=new int[size];
		Max_size=n=size;
	}
	
	void push(int e) {
		tos++;
		stack[tos]=e;
		System.out.println("Element "+e+" Pushed.");
	}
	void push1(int e) {
		Max_size--;
		stack[Max_size]=e;
		System.out.println("Element "+e+" Pushed.");
	}
	
	int pop() {
		int temp = stack[tos];
		tos--;
		return (temp);
	}
	int pop1() {
		return (stack[Max_size++]);
	}
	
	boolean is_Full() {
		if(tos == Max_size-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	boolean is_Full1() {
		if(tos-1 == Max_size) {
			return true;
		}
		else {
			return false;
		}
	}
	
	boolean is_Empty() {
		if(tos==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	boolean is_Empty1() {
		if(Max_size==n) {
			return true;
		}
		else {
			return false;
		}
	}
	
	int peek() {
		return (stack[tos]);
	}
	
	int peek1() {
		return (stack[Max_size]);
	}
	
	void print_stack() {
		System.out.println("\nStack is: ");
		for(int i=tos; i>=0; i--) {
			System.out.println(stack[i]);
		}
	}
	
	
	void print_stack1() {
		System.out.println("\nStack2 is: ");
		for(int i=Max_size; i<n; i++) {
			System.out.println(stack[i]);
		}
	}
	
	
}
