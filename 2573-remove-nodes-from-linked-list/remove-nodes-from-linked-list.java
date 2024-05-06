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
    public ListNode removeNodes(ListNode head) {
       head=reverseList(head);
        ListNode temp=head;
        Stack<Integer> st=new Stack<>();
        ListNode ans=new ListNode(0);
        ListNode pre=ans;
        while(temp!=null){
            while(!st.isEmpty() && temp.val>=st.peek()){
                st.pop();
            }
            
            if(st.isEmpty()){
                ListNode data=new ListNode(temp.val);
                pre.next=data;
                pre=pre.next;
                
            }
            st.push(temp.val);
            temp=temp.next;
        }
        return reverseList(ans.next);
        
    }
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode pre=null;
        while( curr!=null){
            ListNode Next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=Next;
        }
        return pre;
        
    }
}