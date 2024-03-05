package BST;

public class mainBST {
	public static void main(String[] args) {
		BinaryTree<Integer> BST=new BinaryTree<Integer>();
		BST.root=BST.insert(60, BST.root);
		BST.root=BST.insert(20, BST.root);
		BST.root=BST.insert(70, BST.root);
		BST.root=BST.insert(10, BST.root);
		BST.root=BST.insert(40, BST.root);
		BST.root=BST.insert(30, BST.root);
		BST.root=BST.insert(50, BST.root);
		//BST.printTree(BST.root, 0);
		System.out.println(BST.summ(BST.root));
		
		/*Node<Integer> wanted=BST.find(10, BST.root);
		if(wanted!=null) {
			System.out.println("key is found, data is" +wanted.data);
		}
		else {
			System.out.println("key is not found");
		}
		wanted=BST.findMax(BST.root);
		System.out.println("max value " + wanted.data);
		wanted=BST.findMin(BST.root);
		System.out.println("min value " + wanted.data );
		BST.root=BST.remove(20, BST.root);
		BST.printTree(BST.root, 0);*/
	}
	
}
