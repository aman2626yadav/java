public class reverse{
    public static class node{
        int data;
        node next;

         node(int data) {
            this.data=data;
        }
        public static node rev(node head){
            if(head.next==null) return head;
            node newhead = rev(head.next);
            head.next.next = head;
            head.next = null;
            return newhead;

        }
        public static void display(node head){
            if(head==null) return;
            System.out.println(head.data);
             display(head.next);
        }
    }

    public static void main(String[] args) {
       node a  = new node(3);
        node b = new node(4);
        node c = new node(5);
        node d = new node(6);
        a.next = b; // directly assign, no casting
        b.next=c;
        c.next=d;
        node.display(a);
         node newHead = node.rev(a);
        node.display(newHead);

    
        
    }
}

