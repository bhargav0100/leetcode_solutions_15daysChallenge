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
        Stack<ListNode>s=new Stack();
        int length=0;
        ListNode curr=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            s.push(curr);
            fast=fast.next.next;
            curr=curr.next;
            length++;
        }
        if(fast!=null)
        {
            curr=curr.next;
        }
        if(length==0)
        {
            return true;
        }
        for(int i=1;i<=length;i++)
        {
            ListNode temp=s.pop();
            if(temp.val!=curr.val)
            {
                return false;
            }
            curr=curr.next;
        }
        return true;
    }
}