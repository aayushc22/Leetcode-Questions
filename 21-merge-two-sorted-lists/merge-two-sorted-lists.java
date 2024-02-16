
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)
            return list2;
        else if(list2==null)
            return list1;
        
            ListNode f=list1,s =list2,pre=null;
            if(f.val<s.val){
                pre=f;
                f=f.next;
            }
            else{
                pre=s;
                s=s.next;
            }
            ListNode nh=pre;
            while(f!=null&&s!=null){
                if(f.val<s.val){
                    pre.next=f;
                    f=f.next;
                }else{
                    pre.next=s;
                    s=s.next;
                }
                pre=pre.next;
            }
            if(f==null){
               pre.next=s; 
            }
            else{
                pre.next=f;
            }
        
        return nh;
    }
}