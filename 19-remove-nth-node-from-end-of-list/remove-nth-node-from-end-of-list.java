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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null)return null;
     ListNode temp=head;
     int length=0;
     while(temp!=null){
     length++;
     temp=temp.next;
     }
     int index=length-n;
     if(index==0)return head.next;
     
     ListNode prev=null;
     ListNode curr=head;
     int i=0;
     while(i<index){
        prev=curr;
        curr=curr.next;
        i++;
     }
     prev.next=curr.next;
     curr.next=null;
     return head;
    }
}