class MyLinkedList {
    Integer val;
    MyLinkedList next;
    MyLinkedList head=null;
    public MyLinkedList() {
        this.val=null;
        this.next=null;
        
    }
    public MyLinkedList(int val) {
        this.val=val;
        this.next=null;
        
    }
    
    public int get(int index) {

        int i=0;
        MyLinkedList temp = head;
        while(temp!=null&&i!=index){
            temp=temp.next;i++;

        }
     
        if(temp!=null) return temp.val; else return -1;
        
    }
    
    public void addAtHead(int val) {
        MyLinkedList newNode =new MyLinkedList(val);
        newNode.val=val;
        newNode.next=head;
        head= newNode;
    }
    
    public void addAtTail(int val) {
        if(head==null) {
        addAtHead(val);
        return;}
        MyLinkedList temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new MyLinkedList(val);
        
    }
    
    public void addAtIndex(int K, int val) {
        if (K == 0) {
        addAtHead(val);
        return;
    }
      MyLinkedList newNode = new MyLinkedList(val);
   
      MyLinkedList prev = new MyLinkedList(-1);
      prev.next=head;
      MyLinkedList temp = prev;
      MyLinkedList curr=head;
      int i=0;

      while(curr!=null&&i!=K){
        prev=curr;
        curr=curr.next;i++;

      }if (i != K) return;
      prev.next = newNode;
      newNode.next=curr;
        
    }
    
    public void deleteAtIndex(int k) {
        if (k == 0) {
            if(head==null) return;
            head= head.next; return;
        }
      
        int i=1;
        MyLinkedList temp = head;
        
        while(temp!=null && temp.next!=null && i<k){
            temp=temp.next;
            i++;
        }if (temp == null || temp.next == null)
        return;
        temp.next = temp.next.next;
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */