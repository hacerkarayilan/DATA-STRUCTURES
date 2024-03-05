package stack;

public class LinkListStack<type> implements Stack<type> {
	private Node<type> top;
	private Node<type> head;
	private Node<type> tail;
	public LinkListStack() {
		top=null;
		head=null;
		tail=null;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top==null;
	}

	@Override
	public void push(type item) {
		// TODO Auto-generated method stub
		Node<type> newNode = new Node<>(item,top);
		top=newNode;
	}

	@Override
	public type pop() {
		// TODO Auto-generated method stub
		if(top==null)
			return null;
		type retval=top.data;
		top=top.next;
		return retval;
		
	}

	@Override
	public type top() {
		// TODO Auto-generated method stub
		if(top==null)
			return null;
		return top.data;
	}

	@Override
	public type show() {
		// TODO Auto-generated method stub
		Node curr = top;
		System.out.println("-->");
		while(curr!=null) {
			System.out.print(curr.data.toString()+"-->");
			curr=curr.next;
		}
		System.out.println("null");
		return null;
	}
	@Override
	public void enqueue(type data) {
		// TODO Auto-generated method stub
		Node<type> node = new Node<>(data,null);
		if(isEmpty()) {
			head=node;
			tail=node;
		}
		else {
			tail.next=node;
			tail=node;
		}
	}
	@Override
	public type dequeue() {
		// TODO Auto-generated method stub
		if(head.next==null) {
			type value=head.data;
			head=null;
			tail=null;
			return value;
		}
		else {
			type value = head.data;
			head=head.next;
			return value;
		}
	}
	@Override
	public type front() {
		// TODO Auto-generated method stub
		return head.data;
	}

}
