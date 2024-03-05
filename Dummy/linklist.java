package Dummy;

public class linklist {
	node head;
public linklist() {
	// TODO Auto-generated constructor stub
	head=new node(null,null);
}
public void insertAfter(int data, node p) {
	node newNode=new node(data,p.next);
	p.next=newNode;
}
public node zeroth() {
	return head;
}
public node first() {
	return head.next;
}
public boolean isEmpty() {
	 return head.next==null;
}

public node find(int data) {
	node curr= first();
	while(curr!=null) {
	if(curr.data.equals(data)) {
		return curr;
	}
	curr=curr.next;
	}
	return null;
}
public node findPrew(int data) {
	node curr=zeroth();
	while(curr!=null) {
		if(curr.next.equals(data)) {
			return curr;
		}
		curr=curr.next;
	}
	return null;
}

public void remove(int data) {
node n = findPrew(data);
if(n!=null) {
	n.next=n.next.next;
}
}
public void print() {
	node curr=first();
	
	System.out.println();
while(curr!=null) {
	System.out.println(curr.data.toString());
	curr=curr.next;
}
System.out.println("null");	
	
	
	
}
public void makeEmpty() {
	head=new node(null,null);
}
public void add(node n) {
	if(head==null) {
		head=n;
	}
	else {
		node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
				
			}
		temp.next=n;
		}
	
}
public int KaçEleman() {
	node curr1=zeroth();
	int sayaç=0;
	while(curr1!=null) {
		sayaç++;
		curr1=curr1.next;
	}
	return sayaç;
}
public node nThFromLast(int n) {
	node curr1=head;
	int length=KaçEleman();
	int konum=length-n+1;
	if(konum==1) {
		curr1= head;
	}
	else {
		for(int i=1;i<konum;i++) {
				curr1=curr1.next;
			}
		}
	return curr1;
}



}
