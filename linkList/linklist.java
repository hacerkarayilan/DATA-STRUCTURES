package data;

public class linklist {
node head;
public linklist() {
	this.head=null;
}
public boolean isEmpty(){
	return head==null;
}
public node first() {
	return head;
}
public void insertAfter(int data,node p) {
if(p!=null) {
	node newNode = new node(data,p.next);
	p.next=newNode;
}
else {
	node newNode = new node(data,head);
	head=newNode;
}
}

}
