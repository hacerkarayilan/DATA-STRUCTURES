package ex;
import data.node;

public class LinkList {
	Node head;
	public LinkList() {
		
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
	public void loop() {
		Node slow=head;
		Node fast=head;
		int flag=0;
		while(slow!=null && fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				flag=1;
				break;
			}
		}
		if (flag==1) {
			System.out.println("loop");
		}
		else {
			System.out.println("dont loop");
		}
	}
	}
