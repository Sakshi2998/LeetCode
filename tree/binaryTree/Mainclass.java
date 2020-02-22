package tree.binaryTree;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode head = new TreeNode(1);
		head.left=null;
		head.right= new TreeNode(2);
		head.right.left =new TreeNode(3);
		
		PostorderIterative pit = new PostorderIterative();
		System.out.println(pit.postorderTraversal(head));
		
	}

}
