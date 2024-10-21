package DSA;

public class LinearLinkedListBubbleSorting{
    Node head;

    // Method to add a new node at the end
    public void append(int data) {
      
    	if (head == null) {
            head = new Node(data);
            return;
        }
    	
    	
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        
        
        current.next = new Node(data);
    }

    // Bubble sort function
    public void bubbleSort() {
    	
        if (head == null) return;

        boolean swapped;
        do {
            Node current = head;
            swapped = false;

            
            while (current.next != null) {
                if (current.data > current.next.data) {
                    // Swap the nodes' data
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}