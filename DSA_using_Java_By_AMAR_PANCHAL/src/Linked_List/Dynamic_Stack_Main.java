package Linked_List;
import java.util.Scanner;

import stack.StackClass;

public class Dynamic_Stack_Main {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		Dynamic_Stack_Class obj = new Dynamic_Stack_Class();// object created System.out.println("Enter size of
															// stack:");
		System.out.println("Enter The Size of Element:");
		int size = in.nextInt();

		obj.create_stack();
		int ch, e;
		do {
			System.out.println("Stack Menu");
			System.out.println("-----------");
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("4.Print all elements");
			System.out.println("0.Exit");
			System.out.println("-----------");
			System.out.println("Choice:");
			ch = in.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter to push: ");
				int p = in.nextInt();
				obj.push(p);
				break;

			case 2:
				
				obj.pop();
				break;

			case 4:
			
				obj.print_stack();
				break;

			case 0:
				System.out.println("Thanks ");
				break;

			default:
				System.out.println("Wrong option selsected:");
				break;
			}

		} while (ch != 0);
	}
}
