package stack;

import java.util.Scanner;

public class StackMain4 {

	public static void main(String[] args) {
		int x=0;
		Stack<Character> mystack = new LinkListStack<Character>();
		Stack<Character> mystack1 = new LinkListStack<Character>();
		String word="ali";
		for(int i = 0; i<word.length(); i++) {
			mystack.push(word.charAt(i));
			mystack1.enqueue(word.charAt(i));
			
		}
		while(mystack!=null && mystack1!=null) {
			if(!mystack1.dequeue().equals(mystack.pop())) {
				x+=1;
				
			}
			
		}
		if(x==0) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not");
		}
		/*mystack.push(1);
		mystack.push(4);
		mystack.push(2);
		mystack.push(3);
		mystack.push(5);
		mystack.push(6);
		mystack.push(9);
		mystack.show();
		
		System.out.println(mystack.top());
		mystack.pop();
		mystack.show();*/
	}
}