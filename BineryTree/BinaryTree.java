package BST;

public class BinaryTree<type extends Comparable<? super type>> {
		public Node<type> root;
		BinaryTree(){
			root=null;
		}
		Node<type> insert(type x, Node<type> n){
			if(n==null) {
				return new Node<type>(x);
			}
			int comparison = x.compareTo(n.data);
			if(comparison<0) {
				n.left=insert(x,n.left);
			}
			else if(comparison>0) {
				n.right=insert(x,n.right);
			}
			else {
				;//duplicate, do nothing
			
			}
			return n;
		}
		Node<type> remove(type x, Node<type> n){
			if(n==null) { 
				return null;
			}
			int comparison = x.compareTo(n.data);
			if(comparison<0)
				n.left=remove(x,n.left);
			else if(comparison>0)
				n.right=remove(x,n.right);
			else {
				if(n.left!=null&&n.right!=null) {
					n.data=findMin(n.right).data;
					n.right=remove(n.data,n.right);
				}
				else {
					n=(n.left!=null)?n.left:n.right;
				}
			}
			return n;
		}
		Node<type> findMin(Node <type> n){
			if(n==null)
				return null;
			if(n.left==null)
				return n;
			return findMin(n.left);
		}
		Node<type> findMax(Node <type> n){
			if(n==null)
				return null;
			if(n.right==null)
				return n;
			return findMax(n.right);
		}
		Node<type> find(type x, Node<type> n){
			if(n==null)
				return null;
			int comparison=x.compareTo(n.data);
			if(comparison<0)
				return find(x,n.left);
			else if(comparison>0)
				return find(x,n.right);
			return n;
		}
		void printTree(Node <type>n, int level) {
			if(n!=null) {
				/*for(int i=0;i<level; i++) {
					System.out.println("\t");
					
				}*/
				System.out.println(n.data);
				printTree(n.left,level+1);
				printTree(n.right,level+1);
		}
		
		}
		public static Integer count=0;
		public static Integer toplam=0;
		public int coun(Node <Integer>x) {
			if(x!=null) {
				coun(x.left);
				coun(x.right);
				count++;
				}
			return count;
		}
		int summ(Node <Integer>n) {
			if(n!=null) {
				summ(n.left);
				summ(n.right);
				toplam+=n.data;
				
			}
			int a = coun(n);
			return toplam/a;
			
			
		}
		
}
