package TREES;

public class TreeOperation {
	TreeNode root;
	public TreeOperation() {
		root=null;
	}
	public void listAll(TreeNode eleman, int depth) {
		TreeNode temp=eleman;
		for(int i = 0; i<depth; i++) System.out.print("\t");
		System.out.println(temp.directory_name);
		if(eleman.firstChild!=null) {
			temp=eleman.firstChild;
			while(temp!=null) {
				listAll(temp,depth+1);
				temp=temp.nextSibling;
			}
		}
	}
	int total_sizes=0;
	public int ListAllSizes(TreeNode eleman) {
		int size = eleman.directory_size;
		
		System.out.println(eleman.directory_name + ": "+size);
		
		if(eleman.firstChild!=null) {
			TreeNode temp = eleman.firstChild;
			
			while(temp!=null) {
				ListAllSizes(temp);
				temp=temp.nextSibling;
				
			}
		}
		total_sizes=total_sizes+size;
		return total_sizes;
	}
}
