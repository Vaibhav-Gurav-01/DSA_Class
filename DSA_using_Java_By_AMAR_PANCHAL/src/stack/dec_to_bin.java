package stack;

import java.util.Scanner;

public class dec_to_bin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		StackClass obj = new StackClass();// object created System.out.println("Enter size of stack:");
		
		System.out.println("Enter The Size of stack:");
		int size = sc.nextInt();

		obj.create_Stack(size);//create stack
		
		System.out.println("Enter The numbers:");
		int num = sc.nextInt();
		
		
		while(num != 0) {
			int rem = num % 2;
			num = num /2;
			
			obj.push(rem);
		}
		
		System.out.println
		("Binary: ");
//		obj.print_Stack();
		
		while(obj.is_Empty()!= true)
			System.out.print(obj.pop());

	}

}
