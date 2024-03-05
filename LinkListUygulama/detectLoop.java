package GEEKS;

import GEEKS.LinkedList.Node;

public class detectLoop {
	Node head;
	class Node {
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	void loop() {
		Node slow=head, fast=head;
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
	public static void main(String[] args)
	{
		detectLoop list = new detectLoop();
		list.head=new Node(2);
		Node second = new Node(2);
		Node third = new Node(3);
		Node four =new Node(5);

		
		list.head.next = second; 
		second.next= third;
		third.next=four;
		four.next=list.head;
		list.loop();
		
		
	}
}
