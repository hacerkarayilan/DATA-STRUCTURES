package stack;

public class Node<type> {
protected type data;
protected Node<type> next;
public Node(type data, Node<type>next) {
	this.data=data;
	this.next=next;
}
}
