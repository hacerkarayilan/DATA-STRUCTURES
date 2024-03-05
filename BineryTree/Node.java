package BST;

public class Node<type> {
	protected type data;
	protected Node<type> left;
	protected Node<type> right;
	public Node(type data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
