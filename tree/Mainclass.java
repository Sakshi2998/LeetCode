package tree;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode head = new TreeNode(1);
		head.left=new TreeNode(2);
		head.right= new TreeNode(3);
		
		InorderIterative pit = new InorderIterative();
		System.out.println(pit.inorderTraversal(head));
		
	}

}
