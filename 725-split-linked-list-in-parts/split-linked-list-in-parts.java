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
    public int getLength(ListNode head){
        int n = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            n++;
        }
        return n;
    }
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n = getLength(head);
        int size = n/k;
        int extra = n%k;
        ListNode[] ans = new ListNode[k];
        int idx = 0;
        ListNode temp = head;
        int len = 1;
        while(temp != null){
            int s = size;
            if(extra > 0) s++;
            if(len == 1) ans[idx++]=temp;
            if(len == s){
                ListNode a = temp.next;
                temp.next = null;
                temp = a;
                len = 1;
                extra--;
            }else{
                len++;
                temp = temp.next;
            }
        }
        return ans;
    }
}