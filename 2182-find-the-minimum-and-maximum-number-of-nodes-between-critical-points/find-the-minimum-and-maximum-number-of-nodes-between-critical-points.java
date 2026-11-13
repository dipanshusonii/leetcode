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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode left = head;
        ListNode mid = head.next;
        ListNode right = head.next.next;
        int first = -1;
        int last = -1;
        int idx = 1;
        int minDis = Integer.MAX_VALUE;
        int[] arr = {-1,-1};
        while(right != null){
            if((left.val < mid.val && mid.val>right.val) || (left.val > mid.val && mid.val<right.val)){
                if(first == -1) first = idx;
                if(last != -1){
                    int dis = idx - last;
                    minDis = Math.min(minDis,dis);
                }
                last = idx;     
            }
            idx++;
            left = left.next;
            mid = mid.next;
            right = right.next;
        }
        if(first == last) return arr;
        int maxDis = last- first;
        arr[0] = minDis;
        arr[1] = maxDis;
        return arr;
    }
}