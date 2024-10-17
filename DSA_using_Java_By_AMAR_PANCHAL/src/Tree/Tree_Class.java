package Tree;

public class Tree_Class {

	private Node root;

//------------creating a node ------------------
	void create_Tree() {
		root = null;
	}
//----------Insertion at right and left node---------------

	void insert(Node r, Node n)// in bst manner
	// r is root , n is new node
	{
		if (root == null)
			root = n;
		else {
			if (n.data < r.data)// if less to left
			{
				if (r.left == null)// empty left
				{
					r.left = n;
					System.out.println(n.data + " inserted");
				} else
					insert(r.left, n);// recursion call
			} else// if equal or greater than to right
			{
				if (r.right == null)// empty left
				{
					r.right = n;
					System.out.println(n.data + " inserted");
				} else

					insert(r.right, n);// recursion call
			}

		}

	}

//--------------------Pre ,post,In order----------------------
	void inorder(Node r) {
		if (r != null) {// LPR
			inorder(r.left);// L
			System.out.print(r.data + ",");// P
			inorder(r.right);// L
		}
	}

	void preorder(Node r) {
		if (r != null) {// PLR
			System.out.print(r.data + ",");// P
			preorder(r.left);// L
			preorder(r.right);// L
		}
	}

	void postorder(Node r) {
		if (r != null) {// LRP
			postorder(r.left);// L
			postorder(r.right);// R
			System.out.print(r.data + ",");// P

		}
	}

	// --------------Searching Element in tree--------------------

	boolean search(int key) {
		if (root == null) {
			System.out.println("Empty Tree");

			return false;
		} else {
			Node r = root;
			while (r != null) {
				if (key == r.data)
					return true;
				else {
					if (key < r.data)
						r = r.left;
					else
						r = r.right;
				}
			}
			return false;

		}

	}

	// ------------------Find Depth of tree----------------------
	int depth(Node r) {
		if (r == null)
			return 0;
		else {
			int left = depth(r.left);
			int right = depth(r.right);
			return Math.max(left, right) + 1;
		}
	}

	// -----------------use getter to access private Node ----------------------
	Node get_Root() {
		return root;
	}
//---------------------------------------

	public static void main(String args[]) {

		Tree_Class obj = new Tree_Class();
		obj.create_Tree();

		Node x = new Node(10);

		obj.insert(obj.get_Root(), new Node(50));
		obj.insert(obj.get_Root(), new Node(30));
		obj.insert(obj.get_Root(), new Node(100));
		obj.insert(obj.get_Root(), new Node(5));
		obj.insert(obj.get_Root(), new Node(45));
		obj.insert(obj.get_Root(), new Node(200));

		System.out.print("\nInorder: ");
		obj.inorder(obj.get_Root());
		System.out.print("\nPreOrder: ");
		obj.preorder(obj.get_Root());
		System.out.print("\nPostorder: ");
		obj.postorder(obj.get_Root());

		System.out.print("\n\nElement 30 in tree" + obj.search(30));
		System.out.print("\nElement 12 in tree: " + obj.search(12));
		System.out.print("\nElement 200 in tree: " + obj.search(200));

		System.out.println("\n\nDepth is: " + (obj.depth(obj.get_Root()) - 1));

	}

}
