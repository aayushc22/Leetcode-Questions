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
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
     if(fast!=null){ 
        slow=slow.next;
        }
    slow=reversed(slow);
    fast=head;
         
        ListNode rev =slow;
        while(rev!=null){
            if(head.val!=rev.val){
                return false;
            }
            head=head.next;
            rev=rev.next;
        }
        return true;
    }
    public ListNode reversed(ListNode head) {
        if(head==null||head.next==null)
        return head;
        ListNode pre =head;
        ListNode curr=head.next;
        pre.next=null;
        while(curr!=null){
            ListNode next =curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
return pre;
    }
}