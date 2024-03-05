package stack;

import java.util.Scanner;

public class StackMain2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("onluk sistemde bir sayý gir");
		int dec_number = scan.nextInt();
		Stack<Integer> rem_stack=new LinkListStack<Integer>();
		while(dec_number>0) {
			int nem=dec_number%2;
			rem_stack.push(nem);
			dec_number=dec_number/2;
			
		}
		String bin_string="";
		while(!rem_stack.isEmpty()) {
			bin_string=bin_string+rem_stack.pop();
		}
		System.out.println(bin_string);
	}

}
