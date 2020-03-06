package linkedList;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateList snp = new RotateList();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);


		head = snp.rotateRight(head, 1);

		while (head != null) {
			System.out.print(head.val + " -> ");

			head = head.next;
		}
		System.out.print("null");

	}

}
