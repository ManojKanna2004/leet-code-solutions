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
    public ListNode middleNode(ListNode head) {
      ListNode temp=head,t=head;
      while(temp!=null && temp.next!=null){
        t=t.next;
        temp=temp.next.next; 
     
              
        }
        return t;

    }
}