package linkedList;


public class RemoveNthFromEnd {

	public ListNode solution(ListNode head, int n) {

		if (head.next == null) {
			return null;
		}

		ListNode p1, p2;
		p1 = head;
		p2 = head;

		for (int i = 0; i < n; i++) {
			p2 = p2.next;
		}

		if (p2 == null) {
			head = head.next;
			return head;
		}

		while (p2.next != null) {
			p1 = p1.next;
			p2 = p2.next;
		}

		p1.next = p1.next.next;

		return head;

	}
}
