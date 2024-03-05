package TREES;

public class TreeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode mark=new TreeNode("marks",5,null,null);
		
			TreeNode book=new TreeNode("book",6,null,null);
			TreeNode courses=new TreeNode("courses",7,null,null);
		
				TreeNode data_struc=new TreeNode("data_struc",11,null,null);
		
			TreeNode login = new TreeNode("login",8,null,null);
		
				TreeNode session=new TreeNode("session",9,null,null);
					TreeNode user_name=new TreeNode("user_name",10,null,null);
		TreeOperation myTree=new TreeOperation();
		myTree.root=mark;
		mark.firstChild=book;
		book.nextSibling=courses;
		courses.firstChild=data_struc;
		courses.nextSibling=login;
		
		login.firstChild=session;
		session.nextSibling=user_name;
		myTree.listAll(myTree.root, 0);
		int total_sizes=myTree.ListAllSizes(myTree.root);
		System.out.println("total size " + total_sizes);
	}

}
