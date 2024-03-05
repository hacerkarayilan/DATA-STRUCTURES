package stack;

public class Stackmain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> mystack=new LinkListStack<Character>();
		Stack<Character> mystack1=new LinkListStack<Character>();
		String str ="abc$cca";
		for(int i= 0; i<str.length()-1; i++) {
			if(str.charAt(i)!='$') {
				mystack.push(str.charAt(i));
				mystack.show();
			}
		}
		for(int i =str.length()-1; i>0; i--) {
			if(str.charAt(i)!='$') {
				mystack1.push(str.charAt(i));
				mystack.show();
			}
		}
		if(mystack==mystack1) {
			System.out.println("your string is in the language");
		}
		else {
			System.out.println("your string is not in the language");
		}
		
		
		//boolean flag=false;
		//for(int i = 0; i<str.length(); i++) {
			//if(str.charAt(i)!='$' && flag==false) {
				//mystack.push(str.charAt(i));
				//mystack.show();
			//}
			//else if(str.charAt(i)=='$'){
				//flag=true;
				
			//}
			//else if(flag==true) {
				//if(!mystack.isEmpty()&&mystack.top()==str.charAt(i))
					//mystack.pop();
					//mystack.show();
			//}
		//}
		//if(mystack.top()==null) {
			//System.out.println("your string is in the language");
		//}
		//else {
			//System.out.println("your string is not in the language");
		//}
	//}

}
}
