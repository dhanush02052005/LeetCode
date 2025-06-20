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
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode nextt = head;
        while(curr != null){
            nextt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextt;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secHalf = reverse(slow.next);
        slow.next = null;
        ListNode firHalf = head;
        while(secHalf!=null){
            ListNode temp1 = firHalf.next;
            ListNode temp2 = secHalf.next;
            firHalf.next = secHalf;
            secHalf.next = temp1;

            firHalf = temp1;
            secHalf = temp2;
        }

    }
}