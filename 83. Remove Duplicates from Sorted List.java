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
        if(head == null){
            return null;
        }
        ListNode prev = head;
        ListNode c = head.next;
        while(c!= null){
            if(c.val == prev.val){
                prev.next = c.next;
                c= prev.next;
            }
            else{
                prev = prev.next;
                c= prev.next;
            }
            
           
        }
        return head;
    }
}