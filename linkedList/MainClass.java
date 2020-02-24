package linkedList;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapNodesInPairs snp = new SwapNodesInPairs();
		ListNode head = new ListNode(0);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(3);

		head = snp.swapPairs(head);
		
		while(head!=null) {
			System.out.println(head.val+" -> ");
			head=head.next;
		}
		
		
	}

}
