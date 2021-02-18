/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

    if (headA == null || headB == null) return null;

    int len1 = 1;
    int len2 = 1;

    ListNode trav1 = headA;
    ListNode trav2 = headB;

    while (trav1.next != null) {
      len1++;
      trav1 = trav1.next;
    }
    while (trav2.next != null) {
      len2++;
      trav2 = trav2.next;
    }

    if (trav1 != trav2) return null;

    if (len1 > len2) {
      while (len1 != len2) {
        headA = headA.next;
        len1--;
      }
    }
    if (len2 > len1) {
      while (len2 != len1) {
        headB = headB.next;
        len2--;
      }
    }

    while (headA != null) {
      if (headA == headB) {
        return headA;
      }
      headA = headA.next;
      headB = headB.next;
    }

    return null;

  }
}
