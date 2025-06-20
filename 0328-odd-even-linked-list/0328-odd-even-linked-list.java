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
    
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return head;
        ListNode first = head;
        ListNode second = head.next;
        ListNode temp = second;
        while(second!=null && second.next !=null){
            first.next = second.next;
            first = first.next;
            second.next = first.next;
            second = second.next;
        }
        //System.out.println(second.val);
        first.next = temp;
        //ListNode rev = reverse(temp);
        //first.next = rev;
        return head;
    }
}