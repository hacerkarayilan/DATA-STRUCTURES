package gue;

public class Jmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queu <Integer> myQ=new linkListQ<Integer>();
		for(int i = 1; i<=7; i++) {
			myQ.enqueue(i);
		}
		myQ.show();
		int k = 3;
		System.out.println("winner is: " + Josephus(myQ, k));
	}
	public static int Josephus(queu<Integer> Q, int k ) {
		int a = 0;
		while(Q.size()>1) {//bir kiþi kalana kadar(kazanan) döngü döner
			for(int i =1; i<=k-1; i++) {// k-1 elemaný atlayarak gidiyor//1 de yazabilirsin k-1 de yazabilirsin
				Q.enqueue(Q.dequeue());//bastaki elemaný sona eklemek için
				
			}
			a++;
			int killed=Q.dequeue();
			System.out.println(a+".ci killed : "+ killed);
		}
		return Q.front();
	}
}
