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
		while(Q.size()>1) {//bir ki�i kalana kadar(kazanan) d�ng� d�ner
			for(int i =1; i<=k-1; i++) {// k-1 eleman� atlayarak gidiyor//1 de yazabilirsin k-1 de yazabilirsin
				Q.enqueue(Q.dequeue());//bastaki eleman� sona eklemek i�in
				
			}
			a++;
			int killed=Q.dequeue();
			System.out.println(a+".ci killed : "+ killed);
		}
		return Q.front();
	}
}
