package gue;

public class Qmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queu <Integer> myQ=new linkListQ<Integer>();
		myQ.enqueue(5);
		myQ.enqueue(4);
		myQ.enqueue(3);
		myQ.enqueue(2);
		myQ.enqueue(1);
		myQ.enqueue(6);
		myQ.enqueue(7);
		myQ.enqueue(8);
		myQ.show();
		myQ.dequeue();
		myQ.show();
		myQ.dequeue();
		myQ.show();
		//System.out.println(myQ.size());
		//System.out.println(myQ.getcount());
		myQ.middle();
		
		
	}

}
