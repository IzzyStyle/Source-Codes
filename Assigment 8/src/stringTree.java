
public class stringTree {

	Node root;

	public class Node {

		String value;
		Node left;
		Node right;

		Node(String array) {
			this.value = array;
			this.left = null;
			this.right = null;
		}
	}

	public Node insert(String[] array, Node root, int i) {
// adding values for the entirety of the array as long as i is not is less than the length
//and also sort it alphabetically		

		if (i < array.length) {
			Node a = new Node(array[i]);
			root = a;

// insert left child 
			root.left = insert(array, root.left, 2 * i + 1);

// insert right child 
			root.right = insert(array, root.right, 2 * i + 2);
		}
		return root;
	}

	public void inOrder(Node root) { // prints tree nodes in order
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.value + " ");
			inOrder(root.right);
		}
	}

}