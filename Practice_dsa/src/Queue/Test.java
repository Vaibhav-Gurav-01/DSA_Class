package Queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Test {



	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	 
	        System.out.print("Enter a binary number: ");
	        String binaryStr = scanner.nextLine();

	
	        Queue<Character> queue = new LinkedList<>();
	        for (char bit : binaryStr.toCharArray()) {
	            queue.add(bit);
	        }

	   
	        int decimalValue = 0;
	        int size = queue.size(); 

	        for (int power = 0; !queue.isEmpty(); power++) {
	            char bit = queue.poll();
	            
	      
	            if (bit == '1') {
	                decimalValue += 1 * Math.pow(2, size - power - 1);
	            }
	        }


	        System.out.println("Binary: " + binaryStr + ", Decimal: " + decimalValue);
	    }
	}



