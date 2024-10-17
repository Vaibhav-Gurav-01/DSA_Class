package Linked_List;

import java.util.Scanner;

import queue.Queue_Class;

public class Dynamic_Queue_Main {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		Dynamic_Queue_Class obj = new Dynamic_Queue_Class();// object created System.out.println("Enter size of
															// stack:");

		obj.create_Queue();
		int ch, e;
		do {
			System.out.println("Queue Menu");
			System.out.println("-----------");
			System.out.println("1.Enqueue");
			System.out.println("2.Dequeue");
			System.out.println("3.Print all elements");
			System.out.println("0.Exit");
			System.out.println("-----------");
			System.out.println("Choice:");
			ch = in.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter Element to insert :");
				int ins = in.nextInt();
				obj.Enqueue(ins);
				break;

			case 2:
				obj.Dequeue();
				System.out.println("Deleted Elements");
				break;

			case 3:
				obj.print_queue();
				break;

			case 0:
				System.out.println("Thanks  ");
				break;

			default:
				System.out.println("Wrong option selsected:");
				break;
			}

		} while (ch != 0);
	}
}
