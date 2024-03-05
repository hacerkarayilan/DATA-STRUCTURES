package ex;

public class main1 {
	public static void main(String []args) {

	linklist1 list =new linklist1();
	list.head.data=30;
	list.insertAfter(25, list.head);
	list.insertAfter(20, list.head.next);
	list.insertAfter(15, list.head.next.next);
	list.insertAfter(10, list.head.next.next.next);
	list.insertAfter(5, list.head.next.next.next.next);
	
	System.out.println(list.head.data);
	System.out.println(list.head.next.data);
	System.out.println(list.head.next.next.data);
	System.out.println(list.head.next.next.next.data);
	System.out.println(list.head.next.next.next.next.data);
	System.out.println(list.head.next.next.next.next.next.data);
	System.out.println("-----------------------");
	
	list.reverse();
	System.out.println(list.head.data);
	System.out.println(list.head.next.data);
	System.out.println(list.head.next.next.data);
	System.out.println(list.head.next.next.next.data);
	System.out.println(list.head.next.next.next.next.data);
	System.out.println(list.head.next.next.next.next.next.data);
	
}
}