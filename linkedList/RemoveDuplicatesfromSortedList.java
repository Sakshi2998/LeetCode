package linkedList;

public class RemoveDuplicatesfromSortedList {
	public ListNode deleteDuplicates(ListNode head) {

		ListNode trav = head;

		while (trav != null && trav.next != null) {

			if (trav.val == trav.next.val)
				trav.next = trav.next.next;
			else
				trav = trav.next;
		}

		return head;
	}
}
