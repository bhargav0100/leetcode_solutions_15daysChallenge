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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp=new ListNode(0);
        temp.next=head;
        ListNode pre=temp;
        ListNode first=head;
        for(int i=0;i<left-1;i++)
        {
            pre=pre.next;
            first=first.next;
        }
        ListNode prev=null;
        ListNode curr=first;
        for(int i=0;i<=right-left;i++)
        {
            ListNode temp1=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp1;
        }
        pre.next=prev;
        first.next=curr;
        return temp.next;
    }
}