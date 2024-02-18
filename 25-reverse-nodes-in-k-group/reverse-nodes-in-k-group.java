class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null||k==1)
        return head;
        ListNode start= new ListNode();
        start.next=head;
        ListNode pre=start;
        ListNode temp=head;
        ListNode next=head.next;
        int c=0;
        while(temp!=null){
            c+=1;
            temp=temp.next;
        }
        temp=head;
        while(c>=k){
            
            for(int i=1;i<k;i++){
                temp.next=next.next;
                next.next=pre.next;
                pre.next=next;
                next=temp.next;
            }
            if(temp.next==null){
                break;
            }
            pre=temp;
            c=c-k;
            temp=pre.next;
            next=temp.next;
        }
        return start.next;
    }
}