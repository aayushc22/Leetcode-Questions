class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;
        
        ListNode temp = head;
        int length = 1;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }
        
        
        k = k % length;
        if (k == 0) 
            return head;
        
     
        ListNode current = head;
        for (int i = 1; i < length - k; i++) {
            current = current.next;
        }
        
       
        temp.next = head; 
        head = current.next; 
        current.next = null; 
        
        return head;
    }
}
