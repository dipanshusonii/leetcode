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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode ans = new ListNode(-1);
        ListNode head = ans;
        ListNode temp = head;
        while(t1 != null && t2 != null){
            ListNode dummy = new ListNode(-1);
            temp.next = dummy;
            temp = temp.next;
            temp.val = (t1.val+t2.val+carry)%10;
            carry = (t1.val+t2.val+carry)/10;
            t1 = t1.next;
            t2 = t2.next;
        }
        while(t1 != null){
            ListNode dummy = new ListNode(-1);
            temp.next = dummy;
            temp = temp.next;
            temp.val = (t1.val+carry)%10;
            carry = (t1.val+carry)/10;
            t1 = t1.next;
        }
         while(t2 != null){
            ListNode dummy = new ListNode(-1);
            temp.next = dummy;
            temp = temp.next;
            temp.val = (t2.val+carry)%10;
            carry = (t2.val+carry)/10;
            t2 = t2.next;
        }
        if(carry != 0){
            ListNode dummy = new ListNode(-1);
            temp.next = dummy;
            temp = temp.next;
            temp.val = (carry % 10);
        }
        return head.next;
    }
}