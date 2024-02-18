/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        

        ListNode slow=head,fast=head;
        ListNode ans=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast) {
                while(ans!=slow){
                    slow=slow.next;
                    ans=ans.next;
                }
return ans;
            }
            
        }
      return null;
    }
}