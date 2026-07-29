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
        int c = 0;
        if(head==null) return null;
        ListNode temp=head;

        while(head!=null){
            head=head.next;c++;
        }
        int d = c - n +1;
        return deleteKthNode(temp,d);

        
    }
    public ListNode deleteKthNode(ListNode head, int k) {
        if(head==null) return null;
        if (k == 1) {
            return head.next;
        }
        int i=1;
        ListNode temp = head;
        while(temp!=null && temp.next!=null && i!=k-1){
            temp=temp.next;
            i++;
        }
        if (temp.next.next!=null)
        temp.next = temp.next.next;
        else temp.next=null;
        return head;
    }
}