public class printrecuresly{
    public static void display(node head){
        // print using method function
        while (head!=null) { 
            System.out.println(head.next);
            head=head.next;
            
        }
        // using recursion
    }
        public static void  rec(node head){
            if(head==null){
                return;
            }
            System.out.println(head.data);
            rec(head.next);


        }


    public static class node{
        int data;
       node next;

         node(int data) {
            this.data = data;
            
        }
       
        
    }
    public static void main(String[] args) {
        node a = new node(2);
        node b = new node(4);
        node c = new node(5);
        node d = new node(6);
        a.next=b;
        b.next=c;
        c.next=d;
        display(a);
        // using method
        rec(a);
        // using recurision
        
    }


}