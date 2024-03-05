package stack;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> mystack=new LinkListStack<Character>();
		String str ="abc{defg{ijk}{l{mn}}op}qr";
		for(int i = 0; i<str.length();i++) {
			if(str.charAt(i)=='{') {
				mystack.push(str.charAt(i));
				mystack.show();
			}
			else if(str.charAt(i)=='}') {
				mystack.pop();
				mystack.show();
			}
		}
		//if(mystack.top()==null)
		if(mystack.isEmpty()) {
			System.out.println("there are correct number of bracles");
		}
		else {
			System.out.println("there are not correct number of bracles");
		}
	}

}
