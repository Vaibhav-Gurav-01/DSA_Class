//check errors0
package queue;

import java.util.Scanner;

public class Circular_Queue_Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		Circular_Queue_Class obj = new Circular_Queue_Class();
		
		System.out.println("Enter The Size of Element:");
		int size = in.nextInt();

		obj.create_Queue(size);
		int ch, e;
		do {
			System.out.println("Circular Queue Menu");
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
				if (obj.is_full() != true)// not full
				{
					System.out.println("Enter a number:");
					e = in.nextInt();
					obj.Enqueue(e);
				} else {
					System.out.println("Queue Full");
				}
				break;

			case 2:
				if (obj.is_empty() != true)// not empty
				{
					System.out.println("Element Removed  is " + obj.Dequeue());
				} else {
					System.out.println("Stack Empty");
				}
				break;

			case 3:
				if (obj.is_empty() != true)// not empty
				{
					System.out.println("Elements in Queue are\n");
					obj.print_Queue();
				} else {
					System.out.println("Queue Empty");
				}
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
