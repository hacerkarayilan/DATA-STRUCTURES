package SQ;

public class List<type> implements StQu{
	private Node<type> head;
	private Node<type> tail;
	List(){
		head=null;
		tail=null;
	}
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

	
	public type dequeue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public type front() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void push(Object item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public type pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public type top() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}


