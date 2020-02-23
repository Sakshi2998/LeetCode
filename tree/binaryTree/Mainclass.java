package tree.binaryTree;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode head = new TreeNode(1);
		
		head.left= new TreeNode(2);
		head.right =new TreeNode(3);
		head.left.right =new TreeNode(4);
		head.left.left =new TreeNode(5);


		
		LevelOrderTraversal pit = new LevelOrderTraversal();
		System.out.println(pit.levelOrder(head));
		
	}

}
