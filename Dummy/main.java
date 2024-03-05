package Dummy;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linklist l=new linklist();
		node n1=new node(1);
		node n2=new node(2); 
		node n3=new node(3); 
		node n4=new node(4); 
		
		l.add(n1);
		l.add(n2);
		l.add(n3);
		l.add(n4);
		node deneme=l.nThFromLast(2); 
		System.out.println(deneme.data);
	}

}
