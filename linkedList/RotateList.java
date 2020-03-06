package linkedList;

public class RotateList {

	public ListNode rotateRight(ListNode head, int k) {
		if (head == null || head.next == null)
			return head;
		int length = 1;
		ListNode end = head;
		while (end.next != null) {

			length++;
			end = end.next;
		}

		k = length - (k % length) - 1;
		ListNode part = head;
		for (int i = 0; i < k; i++)
			part = part.next;

		end.next = head;
		head = part.next;
		part.next = null;

		return head;
	}
}
