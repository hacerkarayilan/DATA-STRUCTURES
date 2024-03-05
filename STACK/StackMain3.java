package stack;

import java.util.Scanner;

public class StackMain3 {

	public static void main(String[] args) {
		Stack<Character> mystack=new LinkListStack<Character>();
		Scanner scan = new Scanner(System.in);
		System.out.println("bir kelime girin ");
		String kelime = scan.nextLine();
		for(int i = 0; i<kelime.length(); i++) {
			mystack.push(kelime.charAt(i));
			
		}
		String bos = "";
		while(!mystack.isEmpty()) {
			bos=bos+mystack.pop();
			
		}
		if(bos.equals(kelime)) {
			System.out.println("palindrom");
		}
		else {
			System.out.println("palindrom degil");
		}
	}

}
