
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null)
        return l2;
        if(l2==null)
        return l1;
        int c=0;
        ListNode s=new ListNode();
     ListNode t=s;

        while(l1!=null||l2!=null||c!=0){
           int sum=0;
           if(l1!=null){
               sum+=l1.val;
               l1=l1.next;
           }
           if(l2!=null){
               sum+=l2.val;
               l2=l2.next;
           }
           sum+=c;
           c=sum/10;
           ListNode nxt=new ListNode(sum%10);
           t.next=nxt;
           t=t.next;
        }

        return s.next;
    }
}