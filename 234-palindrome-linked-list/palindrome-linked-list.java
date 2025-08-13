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
        ListNode fast=head;
        ListNode curr=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            curr=curr.next;
        }
        if(fast!=null)
        {
            curr=curr.next;
        }
        fast=head;
        curr=reverse(curr);
        while(curr!=null && fast!=null)
        {
            if(curr.val!=fast.val)
            {
                return false;
            }
            curr=curr.next;
            fast=fast.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head)
    {
        ListNode curr=head;
        ListNode next=null;
        while(curr!=null)
        {
            ListNode temp=curr.next;
            curr.next=next;
            next=curr;
            curr=temp;
        }
        return next;
    }
}