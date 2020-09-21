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
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode top = head;
        
        while (top!= null && top.val == val){
            top= top.next;
            head = head.next;
        }
        ListNode p = head;
       if(head!= null) head = head.next;
        while (head != null){
            if(head.val == val){
                p.next = head.next;
                head = head.next;
            }
            else{
                p = p.next;
                head = head.next;
            }
            
        }
        return top;
    }
}