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
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            temp=temp.next;
            c++;
        }
        int arr[] =new int[c];
        int i=0;
         while(head!=null){
           arr[i++]= head.val;
            head=head.next;
        }
        int l=0,r=c-1;
        while(l<r){
            if(arr[l]!=arr[r]){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}