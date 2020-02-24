package linkedList;

public class SwapNodesInPairsRecursive {
	public ListNode swapPairs(ListNode head) {

		if (head == null || head.next == null)
			return head;

		ListNode temp = head.next;
		head.next = temp.next;
		temp.next = head;
		temp.next.next = swapPairs(temp.next.next);
		return temp;

	}

}
