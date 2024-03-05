package gue;
public class linkListQ<type> implements queu<type> {
private Node<type> head;
private Node<type> tail;
linkListQ(){
	head=null;
	tail=null;
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
	if(isEmpty()) {
		return null;
	}
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
	if(isEmpty()) {
		return null;
	}
	return head.data;
}
@Override
public boolean isEmpty() {
	// TODO Auto-generated method stub
	
	return head==null;
}
@Override

public void show() {
	// TODO Auto-generated method stub
	Node curr=head;
	System.out.print("-->");
	while(curr!=null) {
		System.out.print(curr.data.toString()+"-->");
		curr=curr.next;
	}
	System.out.println("null");
}
@Override
public int size() {
	// TODO Auto-generated method stub
	int size = 0; 
	Node curr=head;
	while(curr!=null) {
		size++;
		curr=curr.next;
	}
	return size;
}
/*public int getcount() {
				int count=0;
				node temp=head;
				while(temp!=null) {
					count++;
					temp=temp.next;
				}
				return count;
			}*/
public int getcount() {
	int count=0;
	Node curr=head;
	while(curr!=null) {
		count++;
		curr=curr.next;
	}
	return count;
	
}
public void middle() {
	int len=getcount();
	int mid=len/2;
	Node curr=head;
	while(mid>0) {
		curr=curr.next;
		mid--;
	}
	System.out.println("ortadaki eleman"+curr.data);
}
public boolean search(Node x) {
	Node curr=head;
	while(curr!=null) {
		if(curr.data==x.data) {
			return true;
		}
		curr=curr.next;
	}
	return false;
}

}
