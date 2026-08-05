class Node{
    String url;
    Node next;
    Node prev;

    Node(String url){
        this.url = url;

    }
    Node(String url,Node next,Node prev){
        this.url = url;
        this.next = next;
        this.prev=prev;

    }
}
class BrowserHistory {


    Node head=null;
    public BrowserHistory(String homepage) {
         head = new Node(homepage);
    }
    
    public void visit(String url) {
        Node newNode = new Node(url);
        head.next = newNode;
        newNode.prev = head;
        head=head.next;
        
    }
    
    public String back(int steps) {
        while(steps!=0&&head.prev!=null){
            head=head.prev;
            steps--;
        }
       return head.url;
        
    }
    
    public String forward(int steps) {

        while(steps!=0&&head.next!=null){
            head=head.next;steps--;
        }
        return head.url;
        

    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */