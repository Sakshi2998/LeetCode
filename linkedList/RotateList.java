package linkedList;

public class RotateList {
	public ListNode rotateRight(ListNode head, int k) {

		int length=1;
		ListNode end = head;
		while(end.next!=null)
		{
			
			length++;
			end=end.next;
		}
		
		k=length-(k%length);
		System.out.println(k);
		
		ListNode part = head;
		for(int i=0;i<k;i++)
			part=part.next;
		
		end.next=head;
		head=part.next;
		part.next = null;
		
	
		
		System.out.println(part.val);
		return head;
			
	}
}
