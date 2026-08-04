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
        int i=1;
        ListNode dummy = new ListNode (-1);dummy.next = head;
        ListNode pre =dummy;

        ListNode temp = head;

        while(i<left){
            pre= pre.next;
            temp=temp.next;i++;
        }

        ListNode s= temp;
        ListNode cp =pre;
        pre=null;

        while(i<=right){
            ListNode next = temp.next;
            temp.next = pre;
            pre = temp;
            temp=next;i++;


        }
        cp.next = pre;
        
        s.next=temp;

        return dummy.next;
        
    }
}