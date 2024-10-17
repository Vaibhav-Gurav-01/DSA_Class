package stackassignment1;

import java.util.Scanner;

public class StackMainAss {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StackClassAss stack = new StackClassAss();

		System.out.println("Enter the stack size: ");
		int size = sc.nextInt();
		stack.create_stack(size);
		

		int choice;

		do {
			System.out.println("\nStack Menu");
			System.out.println("----------------------------");
			System.out.println("1. Push to stack1");
			System.out.println("2. Pop to stack1");
			System.out.println("3. Peek to stack1");
			System.out.println("4. Print all elememt of stack1");
			System.out.println("5. Push to stack2");
			System.out.println("6. Pop to stack2");
			System.out.println("7. Peek to stack2");
			System.out.println("8. Print all elememt of stack2");
			System.out.println("9. Exit");
			System.out.println("----------------------------");

			System.out.println("Enter the choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Pushing element...");
				if (!stack.is_Full()) {
					System.out.println("Enter the element: ");

					int e = sc.nextInt();
					stack.push(e);
				} else {
					System.out.println("Stack is full");
				}
				break;
			case 2:
				System.out.println("Pop element...");
				if (!stack.is_Empty()) {
					System.out.println(stack.pop());
				} else {
					System.out.println("Stack is Empty");
				}
				break;
			case 3:
				System.out.println("Peek element...");
				if (!stack.is_Empty()) {
					System.out.println(stack.peek());
				} else {
					System.out.println("Stack is Empty");
				}
				break;

			case 4:

				if (!stack.is_Empty()) {
					stack.print_stack();
				} else {
					System.out.println("Stack is Empty");
				}
				break;
			case 5:
				System.out.println("Pushing element...");
				if (!stack.is_Full1()) {
					System.out.println("Enter the element: ");

					int e = sc.nextInt();
					stack.push1(e);
				} else {
					System.out.println("Stack is full");
				}
				break;
			case 6:
				System.out.println("Pop element...");
				if (!stack.is_Empty1()) {
					System.out.println(stack.pop1());
				} else {
					System.out.println("Stack is Empty");
				}
				break;
			case 7:
				System.out.println("Peek element...");
				if (!stack.is_Empty1()) {
					System.out.println(stack.peek1());
				} else {
					System.out.println("Stack is Empty");
				}
				break;

			case 8:

				if (!stack.is_Empty1()) {
					stack.print_stack1();
				} else {
					System.out.println("Stack is Empty");
				}
				break;
			case 9:
				System.out.println("Thank you for using stack..");
				System.exit(0);
				break;
			default:
				System.out.println("Enter wrong choice: ");

			}

		} while (true);
	}
}
