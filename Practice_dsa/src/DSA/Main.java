package DSA;

public class Main {

	    public static void main(String[] args) {
	    	LinearLinkedListBubbleSorting list = new LinearLinkedListBubbleSorting();
	        list.append(64);
	        list.append(34);
	        list.append(25);
	        list.append(12);
	        list.append(22);
	        list.append(11);
	        list.append(90);

	        System.out.println("Unsorted Linked List:");
	        list.printList();

	        list.bubbleSort();

	        System.out.println("Sorted Linked List:");
	        list.printList();
	    }
	}


