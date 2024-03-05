package ex;

public class linklist1 {
	
		Node head;
		public linklist1() {
			
			head=new Node(null,null);
		}
		
		public void insertAfter(int data,Node p) {
			if(p!=null) {
				Node newNode = new Node(data,p.next);
				p.next=newNode;
			}
			else {
				Node newNode = new Node(data,head);
				head=newNode;
			}
		}

public void reverse() {

	Node currNode=head;
	Node nextNode=null;
	Node prevNode=null;
	while(currNode!=null) {
		nextNode=currNode.next;
		currNode.next=prevNode;
		prevNode=currNode;
		currNode=nextNode;
	}
	head=prevNode;
	
	
}
	
	
	
	}
