/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val)
            head = head.next;
        if (head == null)
            return head;
        ListNode prev = head, trav = head.next;
        while (trav != null) {
            if (trav.val == val) {
                prev.next = trav.next;
            } else {
                prev = trav;
            }
            trav = trav.next;
        }
        return head;
    }
}
