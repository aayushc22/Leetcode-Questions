
class Solution {
    public Node flatten(Node head) {

        Node temp = head;

        while(temp!=null){
            Node t = temp.next;

            if(temp.child!=null){
                Node c = flatten(temp.child);  
                temp.next = c;
                c.prev = temp;

                while(c.next!=null){
                    c = c.next; 
                } 
                c.next = t;
                if(t!=null) t.prev = c;
            }
                temp.child = null;  
                temp = t;  
            
        }
         return head;
        
        
    }
}