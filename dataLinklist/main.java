package ex;

public class main {
public static void main(String[] args) {
	LinkList list = new LinkList();
	list.head.data=0;
	list.insertAfter(1, list.head);
	list.insertAfter(2, list.head.next);
	System.out.println(list.head.data);
	System.out.println(list.head.next.data);
	System.out.println(list.head.next.next.data);
	list.loop();
}

}
