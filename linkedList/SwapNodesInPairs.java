package linkedList;

import java.awt.List;

public class SwapNodesInPairs {

	public ListNode swapPairs(ListNode head) {

		if (head == null || head.next == null)
			return head;

		ListNode trav = head;
		ListNode next = trav.next;
		ListNode prev = null;

		boolean swap = false;
		head = next;
		while (next != null) {

			swap = !swap;

			if (swap == true) {

				trav.next = next.next;
				next.next = trav;
				trav = next;
				next = next.next;

				if (prev != null) {
					prev.next = trav;
				}

			}

			prev = trav;
			trav = next;
			next = next.next;

		}
		return head;
	}

}
