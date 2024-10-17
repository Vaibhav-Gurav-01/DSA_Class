package stack;

import java.util.Scanner;

public class String_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		Stack_Char_Class obj = new Stack_Char_Class();// object created System.out.println("Enter size of stack:");
		
		//read word from user
		System.out.println("Enter The string:");
		String word = in.next();
		obj.create_Stack(word.length());
		//character by character copy element to stack till all char is over:
		
		for(int i =0;i<word.length();i++)
			obj.push(word.charAt(i));
		
			String r_word=" ";
			while(obj.is_Empty()) 
				r_word +=obj.pop();
			
			
			System.out.println("reversed : "+ r_word);
	}
}
