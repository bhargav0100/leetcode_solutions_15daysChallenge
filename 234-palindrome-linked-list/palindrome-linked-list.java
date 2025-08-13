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
        while(curr!=null)
        {
            curr=curr.next;
            length++;
        }
        if(length==1)
        {
            return true;
        }
        int n=length/2;
        curr=head;
        for(int i=1;i<=length;i++)
        {
            if(length%2!=0 && i==n+1)
            {
                curr=curr.next;
            }
            else if(i<=n)
            {
                s.push(curr);
                curr=curr.next;
            }
            else
            {
                ListNode temp=s.pop();
                if(temp.val!=curr.val)
                {
                    return false;
                }
                curr=curr.next;
            }
        }
        return true;
    }
}