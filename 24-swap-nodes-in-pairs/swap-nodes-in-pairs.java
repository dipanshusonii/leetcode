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
    public ListNode swapPairs(ListNode head) {
         if(head == null || head.next == null) return head;
        ListNode temp = head;
        ListNode d1 = new ListNode(-1);
        ListNode d2 = new ListNode(-1);
        ListNode t1 = d1;
        ListNode t2 = d2;
        int count = 1;
        while(temp != null){
            if(count%2 != 0){
                t1.next = temp;
                t1 = t1.next;
            }
            else{
                t2.next = temp;
                t2 = t2.next;
            }
            count++;
            temp=temp.next;
        }
        t1.next = null;
        t2.next = null;
        d1 = d1.next;
        d2 = d2.next;
        count = 2;
        t1 = d1;
        t2 = d2;
        head =  d2;
        temp = head;
        t2 = head.next;
        while(temp != null && temp.next != null){
            if(count%2 == 0){
                if(t1 != null){
                temp.next = t1;
                t1 = t1.next;
                }
            }else{
                if(t2 != null){
                temp.next = t2;
                t2 = t2.next;
                }
            }
            count++;
            temp = temp.next;
        }
        if(temp != null || temp.next == null ){
            if(t1 != null ){
                temp.next = t1;
            }
            if(t2 != null){
                temp.next = t2;
            }
        }
        // t1.next = d2;
        // if(d1 == null) return d2;

        return head;
    }
}