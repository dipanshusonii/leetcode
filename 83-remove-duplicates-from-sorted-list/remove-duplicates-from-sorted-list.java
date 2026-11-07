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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev = head;
        ListNode curr = head;
        while(curr != null){
            if(prev.val != curr.val){
                prev.next = curr;
                prev = curr;
            }
            else {
                if(curr.next==null) prev.next=null;
                curr = curr.next;
            }
        }
        return head;
    }
}