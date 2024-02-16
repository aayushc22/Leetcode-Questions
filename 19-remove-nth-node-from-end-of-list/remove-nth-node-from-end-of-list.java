
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
     ListNode start=new ListNode(0);
     start.next=head;
     ListNode slow=start;
     ListNode fast=start;
     for(int i=1;i<=n+1;i++){
         fast=fast.next;
     }
     while(fast!=null){
        fast=fast.next;
        slow=slow.next;
     }
     slow.next=slow.next.next;
     return start.next;
    }
}
        
        