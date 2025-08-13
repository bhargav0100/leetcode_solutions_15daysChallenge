/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA=getLength(headA);
        int lenB=getLength(headB);
        while(lenA>lenB)
        {
            headA=headA.next;
            lenA--;
        }
        while(lenB>lenA)
        {
            headB=headB.next;
            lenB--;
        }
        while(headA!=null && headB!=null)
        {
            if(headA==headB)
            {
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
    public int getLength(ListNode head)
    {
        int length=0;
        ListNode curr=head;
        while(curr!=null)
        {
            curr=curr.next;
            length++;
        }
        return length;
    }
}