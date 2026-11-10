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
     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode temp = dummy;
        while(temp1 != null && temp2 != null){
            if(temp1.val <= temp2.val){
                temp.next = temp1;
                temp1 = temp1.next;
            }
            else{
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
        if(temp1 != null) temp.next = temp1;
        else temp.next = temp2;
        return dummy.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        if(lists.length==1) return lists[0];
        ArrayList<ListNode> list = new ArrayList<>(Arrays.asList(lists));
        while(list.size()!=1){
            ListNode ans = mergeTwoLists(list.remove(list.size()-1),list.remove(list.size()-1));
            list.add(ans);
        }
        return list.get(0);
    }
}