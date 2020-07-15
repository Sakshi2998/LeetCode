package linkedList;

public class RemoveDuplicatesfromSortedListII {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode newHead = null;
		ListNode trav = head;
		ListNode newTrav = newHead;
		while (trav != null) {
			if (trav.next != null && trav.next.val == trav.val) {
				int temp = trav.val;
				while (trav != null && trav.val == temp)
					trav = trav.next;
			} else {
				if (newTrav == null) {
					newHead = trav;
					newTrav = trav;
				} else {
					newTrav.next = trav;
					newTrav = newTrav.next;
				}
				trav = trav.next;
			}
		}
		if (newTrav != null)
			newTrav.next = null;
		return newHead;
	}
}
