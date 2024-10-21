package Stack;

public class Reverse_List {
	Node root;
	Stack_Class obj;

	void create_list() {
		root = null; // Preparing with empty root
	}

	void reverse() {
		if (root == null) {
			System.out.println("List Empty");
			return;
		}

		// First, find the length of the linked list
		Node t = root;
		int length = 0;
		while (t != null) {
			length++;
			t = t.next;
		}

		// Create stack with the size of the length of the linked list
		obj = new Stack_Class();
		obj.create_Stack(length);

		// Push all elements onto the stack
		t = root;
		while (t != null) {
			obj.push(t.data);
			t = t.next;
		}

		// Traverse the linked list again and write back the data
		t = root;
		while (t != null) {
			t.data = obj.pop();
			t = t.next;
		}
	}

	void insert(int data) {
		Node n = new Node(data);
		if (root == null) {
			root = n; // n becomes 1st, so root = n
		} else {
			Node t = root;
			while (t.next != null) {
				t = t.next;
			}
			t.next = n;
		}
		System.out.println(data + " inserted");
	}

	void print_list() {
		if (root == null) {
			System.out.println("List Empty");
		} else {
			Node t = root;
			while (t != null) {
				System.out.print("|" + t.data + "|->");
				t = t.next;
			}
			System.out.println("null");
		}
	}



public static void main(String args[]) {
    Reverse_List list1 = new Reverse_List();
    list1.create_list();
    list1.insert(10);
    list1.insert(15);
    list1.insert(20);
    list1.insert(25);
    System.out.println("List Has:");
    list1.print_list();

    // Reverse the linked list
    list1.reverse();
    System.out.println("Reversed List:");
    list1.print_list();
}
}
